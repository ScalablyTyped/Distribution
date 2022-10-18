package typings.k6.htmlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("k6/html", "SelectElement")
@js.native
open class SelectElement () extends Element {
  
  /** Owning <form> element. */
  def form(): js.UndefOr[FormElement] = js.native
  
  /** Associated <label> elements. */
  def labels(): js.Array[LabelElement] = js.native
  
  /** Number of contained <option> elements. */
  def length(): Double = js.native
  
  /** Contained <option> elements. */
  def options(): js.Array[OptionElement] = js.native
  
  /** First selected <option> element index. */
  def selectedIndex(): Double = js.native
  
  /** Selected <option> elements. */
  def selectedOptions(): js.Array[OptionElement] = js.native
  
  /** Number of visible rows. */
  def size(): Double = js.native
  
  /** Select type. `select-one` or `select-multiple`. */
  def `type`(): String = js.native
  
  /** First selected <option> element value. */
  def value(): String = js.native
}
