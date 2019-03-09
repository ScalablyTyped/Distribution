package typings
package atIonicCliDashFrameworkLib.utilsIpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/utils/ipc", "RPCProcess")
@js.native
class RPCProcess () extends js.Object {
  def this(hasNameTimeout: RPCProcessOptions) = this()
  val name: java.lang.String = js.native
  var proc: js.UndefOr[nodeLib.childUnderscoreProcessMod.ChildProcess] = js.native
  var responseProcedures: nodeLib.Map[java.lang.String, js.Function1[/* args */ js.Array[_], js.Promise[_]]] = js.native
  val timeout: scala.Double = js.native
  def call[R /* <: RPCResponse[_, js.Object] */](
    procedure: /* import warning: ImportType.apply Failed type conversion: R['procedure'] */ js.Any,
    args: /* import warning: ImportType.apply Failed type conversion: R['request']['args'] */ js.Any
  ): js.Promise[/* import warning: ImportType.apply Failed type conversion: R['data'] */ js.Any] = js.native
  def end(): scala.Unit = js.native
  def register[R /* <: RPCResponse[_, js.Object] */](
    procedure: /* import warning: ImportType.apply Failed type conversion: R['procedure'] */ js.Any,
    fn: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: R['request']['args'] */ /* args */ js.Any, 
      js.Promise[/* import warning: ImportType.apply Failed type conversion: R['data'] */ js.Any]
    ]
  ): scala.Unit = js.native
  def start(proc: nodeLib.NodeJSNs.Process): scala.Unit = js.native
  def start(proc: nodeLib.childUnderscoreProcessMod.ChildProcess): scala.Unit = js.native
}

