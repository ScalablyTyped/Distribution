package typings.ionicCliFramework.ipcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/utils/ipc", "RPCHost")
@js.native
class RPCHost protected () extends js.Object {
  def this(modulePath: String, args: js.Array[String]) = this()
  val args: js.Array[String] = js.native
  val modulePath: String = js.native
  var rpc: RPCProcess = js.native
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
  def start(): Unit = js.native
}

