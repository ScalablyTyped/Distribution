package typings
package atIonicCliDashFrameworkLib.utilsIpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/utils/ipc", "RPCHost")
@js.native
class RPCHost protected () extends js.Object {
  def this(modulePath: java.lang.String, args: js.Array[java.lang.String]) = this()
  val args: js.Array[java.lang.String] = js.native
  val modulePath: java.lang.String = js.native
  var rpc: RPCProcess = js.native
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
  def start(): scala.Unit = js.native
}

