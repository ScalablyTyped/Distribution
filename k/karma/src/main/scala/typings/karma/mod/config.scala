package typings.karma.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object config {
  
  @JSImport("karma", "config")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parseConfig(configFilePath: String, cliOptions: ConfigOptions): Config_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConfig")(configFilePath.asInstanceOf[js.Any], cliOptions.asInstanceOf[js.Any])).asInstanceOf[Config_]
}
