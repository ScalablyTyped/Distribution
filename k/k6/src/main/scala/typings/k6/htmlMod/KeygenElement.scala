package typings.k6.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("k6/html", "KeygenElement")
@js.native
abstract class KeygenElement () extends Element {
  
  /** Owning <form> element. */
  def form(): js.UndefOr[FormElement] = js.native
  
  /** Associated <label> elements. */
  def labels(): js.Array[LabelElement] = js.native
}
