package typings
package ionicLib.libBuildMod

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
       * The pretty name of this Build CLI.
       */
  val name: java.lang.String = js.native
  /**
       * The npm package of this Build CLI.
       */
  val pkg: java.lang.String = js.native
  /**
       * The bin program to use for this Build CLI.
       */
  val program: java.lang.String = js.native
  val resolvedProgram: java.lang.String = js.native
  /**
       * If specified, `package.json` is inspected for this script to use instead
       * of `program`.
       */
  val script: js.UndefOr[java.lang.String] = js.native
  def build(options: T): js.Promise[scala.Unit] = js.native
  /**
       * Build the arguments for starting this Build CLI. Called by `this.run()`.
       */
  /* protected */ def buildArgs(options: T): js.Promise[js.Array[java.lang.String]] = js.native
  /* protected */ def promptToInstall(): js.Promise[scala.Boolean] = js.native
  /* protected */ def resolveProgram(): js.Promise[java.lang.String] = js.native
  /* protected */ def run(options: T): js.Promise[scala.Unit] = js.native
  /* protected */ def runWrapper(options: T): js.Promise[scala.Unit] = js.native
}

