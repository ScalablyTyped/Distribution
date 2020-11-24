package typings.gotResume.mod

import typings.got.mod.GotOptions
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("got-resume", "Transfer")
@js.native
class Transfer protected () extends js.Object {
  def this(options: TransferOptions) = this()
  
  var attempt: Double = js.native
  
  var attemptNumber: Double = js.native
  
  def cancel(): Unit = js.native
  
  var cancelled: Boolean = js.native
  
  /** Error occurred during transfer. */
  var err: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error */ js.Any
  ] = js.native
  
  var etag: js.UndefOr[String] = js.native
  
  def failed(
    err: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error */ js.Any,
    empty: Boolean
  ): Unit = js.native
  
  def fatal(): Unit = js.native
  
  def get(): Unit = js.native
  
  var gotOptions: GotOptions[String | Null] = js.native
  
  var lastMod: js.UndefOr[String] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  /** Length of options passed to constructor. */
  def log(args: js.Any*): Unit = js.native
  
  /** Options passed to constructor. */
  var options: TransferOptions = js.native
  
  var position: js.UndefOr[Double] = js.native
  
  /** Promise returned from `options.pre`. */
  var prePromise: js.UndefOr[js.Promise[Unit]] = js.native
  
  /** `got` stream request. */
  var req: js.UndefOr[ClientRequest] = js.native
  
  /** `got` stream response. */
  var res: js.UndefOr[IncomingMessage] = js.native
  
  def start(): Unit = js.native
  
  /** Output stream. */
  var stream: TransferStream = js.native
  
  var total: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  /** Timeout. */
  var waitTimer: js.UndefOr[Double] = js.native
}
