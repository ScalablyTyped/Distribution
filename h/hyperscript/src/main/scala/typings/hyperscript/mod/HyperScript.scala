package typings.hyperscript.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperScript extends js.Object {
  /** Creates an Element */
  def apply[T /* <: String */](tagName: T): /* import warning: importer.ImportType#apply Failed type conversion: hyperscript.ElementTagNameMap[T] */ js.Any = js.native
  def apply[T /* <: String */](tagName: T, attrs: js.Object, children: js.Any*): /* import warning: importer.ImportType#apply Failed type conversion: hyperscript.ElementTagNameMap[T] */ js.Any = js.native
  def apply[T /* <: Element */](tagName: String): T = js.native
  def apply[T /* <: Element */](tagName: String, attrs: js.Object, children: js.Any*): T = js.native
  /** Cleans up any event handlers created by this hyperscript context */
  def cleanup(): Unit = js.native
  /** Creates a new hyperscript context */
  def context(): HyperScript = js.native
}

