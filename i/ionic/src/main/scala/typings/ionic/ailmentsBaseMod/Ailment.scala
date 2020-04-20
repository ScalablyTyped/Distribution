package typings.ionic.ailmentsBaseMod

import typings.debug.mod.Debugger
import typings.ionic.definitionsMod.IAilment
import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.ISession
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.PatientTreatmentStep
import typings.ionicCliFramework.definitionsMod.PackageJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/doctor/ailments/base", "Ailment")
@js.native
abstract class Ailment protected () extends IAilment {
  def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  var _debug: js.UndefOr[js.Any] = js.native
  val client: IClient = js.native
  val config: IConfig = js.native
  /* CompleteClass */
  override val id: String = js.native
  /* CompleteClass */
  override var `implicit`: Boolean = js.native
  val log: ILogger = js.native
  val project: IProject = js.native
  val session: ISession = js.native
  val shell: IShell = js.native
  def debug: Debugger = js.native
  /* CompleteClass */
  override def detected(): js.Promise[Boolean] = js.native
  def getLocalPackageJson(pkgName: String): js.Promise[js.UndefOr[PackageJson]] = js.native
  /* CompleteClass */
  override def getMessage(): js.Promise[String] = js.native
  /* CompleteClass */
  override def getTreatmentSteps(): js.Promise[js.Array[PatientTreatmentStep]] = js.native
}

