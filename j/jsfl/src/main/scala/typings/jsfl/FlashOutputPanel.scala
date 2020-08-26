package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashOutputPanel extends js.Object {
  /** Method; clears the contents of the Output panel. You can use this method in a batch processing application to clear a list of errors, or to save them incrementally by using this method withoutputPanel.save(). */
  def clear(): Unit = js.native
  def save(fileURI: String): Unit = js.native
  def save(fileURI: String, bAppendToFile: js.UndefOr[scala.Nothing], bUseSystemEncoding: Boolean): Unit = js.native
  def save(fileURI: String, bAppendToFile: Boolean): Unit = js.native
  def save(fileURI: String, bAppendToFile: Boolean, bUseSystemEncoding: Boolean): Unit = js.native
  def trace(message: String): Unit = js.native
}

