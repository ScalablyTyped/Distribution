package typings.ipfsCoreTypes.distSrcConfigMod

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait API[OptionExtension] extends StObject {
  
  /**
    * Returns a value from the currently being used config. If the daemon
    * is off, it returns the value from the stored config.
    */
  def get(key: String): js.Promise[String | js.Object] = js.native
  def get(key: String, options: AbortOptions & OptionExtension): js.Promise[String | js.Object] = js.native
  
  /**
    * Returns the full config been used. If the daemon is off, it returns the
    * stored config
    */
  def getAll(): js.Promise[Config] = js.native
  def getAll(options: AbortOptions & OptionExtension): js.Promise[Config] = js.native
  
  var profiles: typings.ipfsCoreTypes.distSrcConfigProfilesMod.API[js.Object] = js.native
  
  /**
    * Replaces the full config. Note that restarting the node will be
    * necessary for any change to take effect.
    */
  def replace(config: Config): js.Promise[Unit] = js.native
  def replace(config: Config, options: AbortOptions & OptionExtension): js.Promise[Unit] = js.native
  
  /**
    * Adds or replaces a config value. Note that restarting the node will be
    * necessary for any change to take effect.
    */
  def set(key: String, value: Any): js.Promise[Unit] = js.native
  def set(key: String, value: Any, options: AbortOptions & OptionExtension): js.Promise[Unit] = js.native
}
