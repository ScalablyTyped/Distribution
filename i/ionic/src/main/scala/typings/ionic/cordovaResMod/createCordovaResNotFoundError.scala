package typings.ionic.cordovaResMod

import typings.ionic.definitionsMod.NpmClient
import typings.ionic.errorsMod.FatalException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/cordova-res", "createCordovaResNotFoundError")
@js.native
object createCordovaResNotFoundError extends js.Object {
  def apply(npmClient: NpmClient): js.Promise[FatalException] = js.native
}

