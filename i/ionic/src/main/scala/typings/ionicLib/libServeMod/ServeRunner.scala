package typings
package ionicLib.libServeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/serve", "ServeRunner")
@js.native
abstract class ServeRunner[T /* <: ionicLib.definitionsMod.ServeOptions */] ()
  extends ionicLib.definitionsMod.Runner[T, ionicLib.definitionsMod.ServeDetails] {
  var devAppConnectionMade: scala.Boolean = js.native
  val e: ServeRunnerDeps = js.native
  def afterServe(options: T, details: ionicLib.definitionsMod.ServeDetails): stdLib.Promise[scala.Unit] = js.native
  def beforeServe(options: T): stdLib.Promise[scala.Unit] = js.native
  def createOptionsFromCommandLine(
    inputs: atIonicCliDashFrameworkLib.definitionsMod.CommandLineInputs,
    options: atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions
  ): ionicLib.definitionsMod.ServeOptions = js.native
  def determineEngineFromCommandLine(options: atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions): java.lang.String = js.native
  def displayDevAppMessage(options: T): stdLib.Promise[scala.Unit] = js.native
  def gatherDevAppDetails(options: T, details: ionicLib.definitionsMod.ServeDetails): stdLib.Promise[js.UndefOr[ionicLib.definitionsMod.DevAppDetails]] = js.native
  def getCommandMetadata(): stdLib.Promise[stdLib.Partial[ionicLib.definitionsMod.CommandMetadata]] = js.native
  def getSupportedDevAppPlugins(): stdLib.Promise[nodeLib.Set[java.lang.String]] = js.native
  def modifyOpenURL(url: java.lang.String, options: T): java.lang.String = js.native
  def publishDevApp(options: T, details: ionicLib.definitionsMod.DevAppDetails): stdLib.Promise[js.UndefOr[java.lang.String]] = js.native
  /* CompleteClass */
  override def run(options: T): stdLib.Promise[ionicLib.definitionsMod.ServeDetails] = js.native
  def runLab(options: T, serveDetails: ionicLib.definitionsMod.ServeDetails): stdLib.Promise[ionicLib.definitionsMod.LabServeDetails] = js.native
  def scheduleAfterServe(options: T, details: ionicLib.definitionsMod.ServeDetails): scala.Unit = js.native
  def selectExternalIP(options: T): stdLib.Promise[
    js.Tuple2[
      java.lang.String, 
      js.Array[atIonicUtilsDashNetworkLib.utilsDashNetworkMod.NetworkInterface]
    ]
  ] = js.native
  def serveProject(options: T): stdLib.Promise[ionicLib.definitionsMod.ServeDetails] = js.native
}

