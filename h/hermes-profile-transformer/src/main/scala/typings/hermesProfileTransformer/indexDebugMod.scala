package typings.hermesProfileTransformer

import typings.hermesProfileTransformer.eventInterfacesMod.DurationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexDebugMod {
  
  @JSImport("hermes-profile-transformer/dist/index.debug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This transformer can take in the path of the profile, the source map (optional) and the bundle file name (optional)
    * and return a promise which resolves to Chrome Dev Tools compatible events
    * @param profilePath string
    * @param sourceMapPath string
    * @param bundleFileName string
    * @return Promise<DurationEvent[]>
    */
  inline def default(profilePath: String): js.Promise[js.Array[DurationEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(profilePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[DurationEvent]]]
  inline def default(profilePath: String, sourceMapPath: String): js.Promise[js.Array[DurationEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(profilePath.asInstanceOf[js.Any], sourceMapPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[DurationEvent]]]
  inline def default(profilePath: String, sourceMapPath: String, bundleFileName: String): js.Promise[js.Array[DurationEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(profilePath.asInstanceOf[js.Any], sourceMapPath.asInstanceOf[js.Any], bundleFileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[DurationEvent]]]
  inline def default(profilePath: String, sourceMapPath: Unit, bundleFileName: String): js.Promise[js.Array[DurationEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(profilePath.asInstanceOf[js.Any], sourceMapPath.asInstanceOf[js.Any], bundleFileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[DurationEvent]]]
}
