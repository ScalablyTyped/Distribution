package typings
package hyperscriptLib.hyperscriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperScript extends js.Object {
  /** Creates an Element */
  def apply[T /* <: java.lang.String */](tagName: T): /* import warning: ImportType.apply Failed type conversion: std.ElementTagNameMap[T] */ js.Any = js.native
  def apply[T /* <: java.lang.String */](tagName: T, attrs: js.Object, children: js.Any*): /* import warning: ImportType.apply Failed type conversion: std.ElementTagNameMap[T] */ js.Any = js.native
  def apply[T /* <: stdLib.Element */](tagName: java.lang.String): T = js.native
  def apply[T /* <: stdLib.Element */](tagName: java.lang.String, attrs: js.Object, children: js.Any*): T = js.native
  /** Cleans up any event handlers created by this hyperscript context */
  def cleanup(): scala.Unit = js.native
  /** Creates a new hyperscript context */
  def context(): HyperScript = js.native
}

