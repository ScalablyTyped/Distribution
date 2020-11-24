package typings.hermesProfileTransformer

import typings.hermesProfileTransformer.eventInterfacesMod.DurationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hermes-profile-transformer/dist/index.debug", JSImport.Namespace)
@js.native
object indexDebugMod extends js.Object {
  
  /**
    * This transformer can take in the path of the profile, the source map (optional) and the bundle file name (optional)
    * and return a promise which resolves to Chrome Dev Tools compatible events
    * @param profilePath string
    * @param sourceMapPath string
    * @param bundleFileName string
    * @return Promise<DurationEvent[]>
    */
  def default(profilePath: String): js.Promise[js.Array[DurationEvent]] = js.native
  def default(profilePath: String, sourceMapPath: js.UndefOr[scala.Nothing], bundleFileName: String): js.Promise[js.Array[DurationEvent]] = js.native
  def default(profilePath: String, sourceMapPath: String): js.Promise[js.Array[DurationEvent]] = js.native
  def default(profilePath: String, sourceMapPath: String, bundleFileName: String): js.Promise[js.Array[DurationEvent]] = js.native
}
