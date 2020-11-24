package typings.ionic.libServeMod

import typings.ionic.anon.PartialCommandMetadata
import typings.ionic.definitionsMod.DevAppDetails
import typings.ionic.definitionsMod.LabServeDetails
import typings.ionic.definitionsMod.Runner
import typings.ionic.definitionsMod.ServeDetails
import typings.ionic.definitionsMod.ServeOptions
import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import typings.ionicUtilsNetwork.mod.NetworkInterface
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/serve", "ServeRunner")
@js.native
abstract class ServeRunner[T /* <: ServeOptions */] () extends Runner[T, ServeDetails] {
  
  def afterServe(options: T, details: ServeDetails): js.Promise[Unit] = js.native
  
  def beforeServe(options: T): js.Promise[Unit] = js.native
  
  def createOptionsFromCommandLine(inputs: CommandLineInputs, options: CommandLineOptions): ServeOptions = js.native
  
  def determineEngineFromCommandLine(options: CommandLineOptions): String = js.native
  
  var devAppConnectionMade: Boolean = js.native
  
  def displayDevAppMessage(options: T): js.Promise[Unit] = js.native
  
  val e: ServeRunnerDeps = js.native
  
  def gatherDevAppDetails(options: T, details: ServeDetails): js.Promise[js.UndefOr[DevAppDetails]] = js.native
  
  def getCommandMetadata(): js.Promise[PartialCommandMetadata] = js.native
  
  def getPkgManagerServeCLI(): PkgManagerServeCLI = js.native
  
  def getSupportedDevAppPlugins(): js.Promise[Set[String]] = js.native
  
  def getUsedPorts(options: T, details: ServeDetails): js.Array[Double] = js.native
  
  def modifyOpenUrl(url: String, options: T): String = js.native
  
  def publishDevApp(options: T, details: DevAppDetails): js.Promise[js.UndefOr[String]] = js.native
  
  def runLab(options: T, serveDetails: ServeDetails): js.Promise[LabServeDetails] = js.native
  
  def scheduleAfterServe(options: T, details: ServeDetails): Unit = js.native
  
  def selectExternalIP(options: T): js.Promise[js.Tuple2[String, js.Array[NetworkInterface]]] = js.native
  
  def serveProject(options: T): js.Promise[ServeDetails] = js.native
}
