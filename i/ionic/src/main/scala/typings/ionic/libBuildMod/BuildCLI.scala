package typings.ionic.libBuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/build", "BuildCLI")
@js.native
abstract class BuildCLI[T /* <: js.Object */] protected () extends js.Object {
  def this(e: BuildRunnerDeps) = this()
  var _resolvedProgram: js.UndefOr[js.Any] = js.native
  val e: BuildRunnerDeps = js.native
  /**
    * If true, the Build CLI will not prompt to be installed.
    */
  val global: Boolean = js.native
  /**
    * The pretty name of this Build CLI.
    */
  val name: String = js.native
  /**
    * The npm package of this Build CLI.
    */
  val pkg: String = js.native
  /**
    * The bin program to use for this Build CLI.
    */
  val program: String = js.native
  val resolvedProgram: String = js.native
  /**
    * If specified, `package.json` is inspected for this script to use instead
    * of `program`.
    */
  val script: js.UndefOr[String] = js.native
  def build(options: T): js.Promise[Unit] = js.native
  /**
    * Build the arguments for starting this Build CLI. Called by `this.run()`.
    */
  /* protected */ def buildArgs(options: T): js.Promise[js.Array[String]] = js.native
  /* protected */ def promptToInstall(): js.Promise[Boolean] = js.native
  /* protected */ def resolveProgram(): js.Promise[String] = js.native
  def resolveScript(): js.Promise[js.UndefOr[String]] = js.native
  /* protected */ def run(options: T): js.Promise[Unit] = js.native
  /* protected */ def runWrapper(options: T): js.Promise[Unit] = js.native
}

