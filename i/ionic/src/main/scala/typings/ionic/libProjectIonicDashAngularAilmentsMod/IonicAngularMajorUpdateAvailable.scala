package typings.ionic.libProjectIonicDashAngularAilmentsMod

import typings.ionic.ionicStrings.`ionic-angular-major-update-available`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/ionic-angular/ailments", "IonicAngularMajorUpdateAvailable")
@js.native
class IonicAngularMajorUpdateAvailable () extends IonicAngularAilment {
  var currentVersion: js.UndefOr[String] = js.native
  @JSName("id")
  val id_IonicAngularMajorUpdateAvailable: `ionic-angular-major-update-available` = js.native
  var latestVersion: js.UndefOr[String] = js.native
  def getVersionPair(): js.Promise[js.Tuple2[String, String]] = js.native
}

