package typings.ionic.ionicAngularAilmentsMod

import typings.ionic.ionicStrings.`ionic-angular-update-available`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/ionic-angular/ailments", "IonicAngularUpdateAvailable")
@js.native
class IonicAngularUpdateAvailable () extends IonicAngularAilment {
  var currentVersion: js.UndefOr[String] = js.native
  @JSName("id")
  val id_IonicAngularUpdateAvailable: `ionic-angular-update-available` = js.native
  var latestVersion: js.UndefOr[String] = js.native
  def getVersionPair(): js.Promise[js.Tuple2[String, String]] = js.native
}

