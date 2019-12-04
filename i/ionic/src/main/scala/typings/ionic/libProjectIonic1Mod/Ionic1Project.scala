package typings.ionic.libProjectIonic1Mod

import typings.ionic.ionicStrings.ionic1
import typings.ionic.libProjectMod.Project
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/ionic1", "Ionic1Project")
@js.native
class Ionic1Project () extends Project {
  var bowerJsonFile: js.UndefOr[BowerJson] = js.native
  @JSName("type")
  val type_Ionic1Project: ionic1 = js.native
  def getFrameworkVersion(): js.Promise[js.UndefOr[String]] = js.native
  def loadBowerJson(): js.Promise[BowerJson] = js.native
}

