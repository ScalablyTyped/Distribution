package typings
package ionicLib.libServeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/serve", "ServeCLI")
@js.native
abstract class ServeCLI[T /* <: ServeCLIOptions */] protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(e: ServeRunnerDeps) = this()
  var _resolvedProgram: js.UndefOr[js.Any] = js.native
  val e: ServeRunnerDeps = js.native
  /**
       * The pretty name of this Serve CLI.
       */
  val name: java.lang.String = js.native
  /**
       * The npm package of this Serve CLI.
       */
  val pkg: java.lang.String = js.native
  /**
       * The prefix to use for log statements.
       */
  val prefix: java.lang.String = js.native
  /**
       * The bin program to use for this Serve CLI.
       */
  val program: java.lang.String = js.native
  val resolvedProgram: java.lang.String = js.native
  /**
       * If specified, `package.json` is inspected for this script to use instead
       * of `program`.
       */
  val script: js.UndefOr[java.lang.String] = js.native
  /**
       * Build the arguments for starting this Serve CLI. Called by `this.start()`.
       */
  /* protected */ def buildArgs(options: T): js.Promise[js.Array[java.lang.String]] = js.native
  /* protected */ def createLoggerStream(): nodeLib.NodeJSNs.WritableStream = js.native
  /* protected */ def createStreamFilter(filter: js.Function1[/* line */ java.lang.String, scala.Boolean]): nodeLib.streamMod.Transform = js.native
  @JSName("emit")
  def emit_ready(event: ionicLib.ionicLibStrings.ready): scala.Boolean = js.native
  @JSName("on")
  def on_ready(event: ionicLib.ionicLibStrings.ready, handler: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_ready(event: ionicLib.ionicLibStrings.ready, handler: js.Function0[scala.Unit]): this.type = js.native
  /* protected */ def promptToInstall(): js.Promise[scala.Boolean] = js.native
  /* protected */ def resolveProgram(): js.Promise[java.lang.String] = js.native
  def serve(options: T): js.Promise[scala.Unit] = js.native
  /* protected */ def spawn(options: T): js.Promise[scala.Unit] = js.native
  /* protected */ def spawnWrapper(options: T): js.Promise[scala.Unit] = js.native
  /**
       * Called whenever a line of stderr is received.
       *
       * If `false` is returned, the line is not emitted to the log.
       */
  /* protected */ def stderrFilter(line: java.lang.String): scala.Boolean = js.native
  /**
       * Called whenever a line of stdout is received.
       *
       * If `false` is returned, the line is not emitted to the log.
       *
       * By default, the CLI is considered ready whenever stdout is emitted. This
       * method should be overridden to more accurately portray readiness.
       *
       * @param line A line of stdout.
       */
  /* protected */ def stdoutFilter(line: java.lang.String): scala.Boolean = js.native
}

