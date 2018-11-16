package typings
package markoLib.srcRuntimeHtmlAsyncStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncStream
  extends markoLib.srcRuntimeAsyncMod.Async {
  var DEFAULT_TIMEOUT: scala.Double = js.native
  var INCLUDE_STACK: scala.Boolean = js.native
  def apply(global: js.Any): this.type = js.native
  def apply(global: js.Any, writer: js.Any): this.type = js.native
  def apply(global: js.Any, writer: js.Any, parentOut: js.Any): this.type = js.native
  def apply(global: js.Any, writer: js.Any, parentOut: js.Any, shouldBuffer: scala.Boolean): this.type = js.native
  def beginElement(name: java.lang.String, elementAttrs: js.Any): scala.Unit = js.native
  def element(tagName: java.lang.String, elementAttrs: js.Any, openTagOnly: scala.Boolean): scala.Unit = js.native
  def enableAsyncStackTrace(): scala.Unit = js.native
  def end(): this.type = js.native
  def end(data: js.Any): this.type = js.native
  /** @deprecated */
  def getOutput(): java.lang.String = js.native
  def text(str: js.Any): scala.Unit = js.native
}

