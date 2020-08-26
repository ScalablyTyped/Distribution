package typings.gotResume.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("got-resume", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: TransferOptions): TransferStream = js.native
  /**
    * Fetch URL with retries if failure.
    * Returns stream of transfer contents.
    *
    * @param url URL (optional).
    * @param options Options object.
    */
  def apply(url: String): TransferStream = js.native
  def apply(url: String, options: TransferOptions): TransferStream = js.native
}

