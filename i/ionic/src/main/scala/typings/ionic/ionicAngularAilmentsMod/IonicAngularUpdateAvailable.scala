package typings.ionic.ionicAngularAilmentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/project/ionic-angular/ailments", "IonicAngularUpdateAvailable")
@js.native
class IonicAngularUpdateAvailable () extends IonicAngularAilment {
  
  var currentVersion: js.UndefOr[String] = js.native
  
  def getVersionPair(): js.Promise[js.Tuple2[String, String]] = js.native
  
  var latestVersion: js.UndefOr[String] = js.native
}
