package typings.ionicCliFramework.ipcMod

import typings.node.childProcessMod.ChildProcess
import typings.node.processMod.global.NodeJS.Process
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/utils/ipc", "RPCProcess")
@js.native
class RPCProcess () extends js.Object {
  def this(hasNameTimeout: RPCProcessOptions) = this()
  val name: String = js.native
  var proc: js.UndefOr[ChildProcess] = js.native
  var responseProcedures: Map[String, js.Function1[/* args */ js.Array[_], js.Promise[_]]] = js.native
  val timeout: Double = js.native
  def call[R /* <: RPCResponse[_, js.Object] */](
    procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any,
    args: /* import warning: importer.ImportType#apply Failed type conversion: R['request']['args'] */ js.Any
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: R['data'] */ js.Any
  ] = js.native
  def end(): Unit = js.native
  def register[R /* <: RPCResponse[_, js.Object] */](
    procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any,
    fn: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: R['request']['args'] */ /* args */ js.Any, 
      js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: R['data'] */ js.Any
      ]
    ]
  ): Unit = js.native
  def start(proc: ChildProcess): Unit = js.native
  def start(proc: Process): Unit = js.native
}

