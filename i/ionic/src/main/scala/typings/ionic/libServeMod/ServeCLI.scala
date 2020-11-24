package typings.ionic.libServeMod

import typings.ionic.ionicStrings.compile
import typings.ionic.ionicStrings.ready
import typings.node.NodeJS.WritableStream
import typings.node.eventsMod.EventEmitter
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/serve", "ServeCLI")
@js.native
abstract class ServeCLI[T /* <: ServeCLIOptions */] protected () extends EventEmitter {
  def this(e: ServeRunnerDeps) = this()
  
  var _resolvedProgram: js.Any = js.native
  
  /**
    * Build the arguments for starting this Serve CLI. Called by `this.start()`.
    */
  /* protected */ def buildArgs(options: T): js.Promise[js.Array[String]] = js.native
  
  /**
    * Build the environment variables to be passed to the Serve CLI. Called by `this.start()`;
    */
  /* protected */ def buildEnvVars(options: T): js.Promise[ProcessEnv] = js.native
  
  /* protected */ def createLoggerStream(): WritableStream = js.native
  
  /* protected */ def createStreamFilter(filter: js.Function1[/* line */ String, Boolean]): Transform = js.native
  
  val e: ServeRunnerDeps = js.native
  
  @JSName("emit")
  def emit_compile(event: compile, chunks: Double): Boolean = js.native
  @JSName("emit")
  def emit_ready(event: ready): Boolean = js.native
  
  /**
    * If true, the Serve CLI will not prompt to be installed.
    */
  val global: Boolean = js.native
  
  /**
    * The pretty name of this Serve CLI.
    */
  val name: String = js.native
  
  @JSName("on")
  def on_compile(event: compile, handler: js.Function1[/* chunks */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, handler: js.Function0[Unit]): this.type = js.native
  
  @JSName("once")
  def once_compile(event: compile, handler: js.Function1[/* chunks */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_ready(event: ready, handler: js.Function0[Unit]): this.type = js.native
  
  /**
    * The npm package of this Serve CLI.
    */
  val pkg: String = js.native
  
  /**
    * The prefix to use for log statements.
    */
  val prefix: String = js.native
  
  /**
    * The bin program to use for this Serve CLI.
    */
  val program: String = js.native
  
  /* protected */ def promptToInstall(): js.Promise[Boolean] = js.native
  
  /* protected */ def resolveProgram(): js.Promise[String] = js.native
  
  def resolveScript(): js.Promise[js.UndefOr[String]] = js.native
  
  def resolvedProgram: String = js.native
  
  /**
    * If specified, `package.json` is inspected for this script to use instead
    * of `program`.
    */
  val script: js.UndefOr[String] = js.native
  
  def serve(options: T): js.Promise[Unit] = js.native
  
  /* protected */ def spawn(options: T): js.Promise[Unit] = js.native
  
  /* protected */ def spawnWrapper(options: T): js.Promise[Unit] = js.native
  
  /**
    * Called whenever a line of stderr is received.
    *
    * If `false` is returned, the line is not emitted to the log.
    */
  /* protected */ def stderrFilter(line: String): Boolean = js.native
  
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
  /* protected */ def stdoutFilter(line: String): Boolean = js.native
}
