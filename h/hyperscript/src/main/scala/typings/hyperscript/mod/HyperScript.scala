package typings.hyperscript.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HyperScript extends js.Object {
  
  def apply[T /* <: /* keyof hyperscript.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */](tagName: T, attrs: js.UndefOr[scala.Nothing], children: js.Any*): /* import warning: importer.ImportType#apply Failed type conversion: hyperscript.anon.ElementTagNameMap[T] */ js.Any = js.native
  /** Creates an Element */
  def apply[T /* <: /* keyof hyperscript.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */](tagName: T, attrs: js.Object, children: js.Any*): /* import warning: importer.ImportType#apply Failed type conversion: hyperscript.anon.ElementTagNameMap[T] */ js.Any = js.native
  def apply[T /* <: Element */](tagName: String, attrs: js.UndefOr[scala.Nothing], children: js.Any*): T = js.native
  def apply[T /* <: Element */](tagName: String, attrs: js.Object, children: js.Any*): T = js.native
  
  /** Cleans up any event handlers created by this hyperscript context */
  def cleanup(): Unit = js.native
  
  /** Creates a new hyperscript context */
  def context(): HyperScript = js.native
}
