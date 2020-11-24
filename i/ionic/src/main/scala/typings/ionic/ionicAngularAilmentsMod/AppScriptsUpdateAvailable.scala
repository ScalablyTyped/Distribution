package typings.ionic.ionicAngularAilmentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.ionic.definitionsMod.IAilment because Already inherited
- typings.ionic.definitionsMod.TreatableAilment because var conflicts: `implicit`, projects. Inlined treatable */ @JSImport("ionic/lib/project/ionic-angular/ailments", "AppScriptsUpdateAvailable")
@js.native
class AppScriptsUpdateAvailable () extends IonicAngularAilment {
  
  var currentVersion: js.UndefOr[String] = js.native
  
  def getVersionPair(): js.Promise[js.Tuple2[String, String]] = js.native
  
  var latestVersion: js.UndefOr[String] = js.native
  
  val treatable: /* true */ Boolean = js.native
}
