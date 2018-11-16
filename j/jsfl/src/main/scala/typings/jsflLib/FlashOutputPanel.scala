package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashOutputPanel extends js.Object {
  /** Method; clears the contents of the Output panel. You can use this method in a batch processing application to clear a list of errors, or to save them incrementally by using this method withoutputPanel.save(). */
  def clear(): scala.Unit = js.native
  def save(fileURI: java.lang.String): scala.Unit = js.native
  def save(fileURI: java.lang.String, bAppendToFile: scala.Boolean): scala.Unit = js.native
  def save(fileURI: java.lang.String, bAppendToFile: scala.Boolean, bUseSystemEncoding: scala.Boolean): scala.Unit = js.native
  def trace(message: java.lang.String): scala.Unit = js.native
}

