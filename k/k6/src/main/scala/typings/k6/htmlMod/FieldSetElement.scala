package typings.k6.htmlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("k6/html", "FieldSetElement")
@js.native
open class FieldSetElement () extends Element {
  
  /** Grouped elements. */
  def elements(): js.Array[Element] = js.native
  
  /** Containing <form> element. */
  def form(): js.UndefOr[FormElement] = js.native
  
  /** Field set type. Always `fieldset`. */
  def `type`(): String = js.native
  
  /** Validity states. Unimplemented. Always `undefined`. */
  def validity(): Unit = js.native
}
