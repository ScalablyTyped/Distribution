package typings.k6.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("k6/html", "FormFieldElement")
@js.native
abstract class FormFieldElement () extends Element {
  
  /** Owning <form> element. */
  def form(): js.UndefOr[FormElement] = js.native
  
  /** Form submission action URI. */
  def formAction(): String = js.native
  
  /** Form submission encoding. */
  def formEnctype(): String = js.native
  
  /** Form submission HTTP method. */
  def formMethod(): String = js.native
  
  /** Whether form submits without validation. */
  def formNoValidate(): Boolean = js.native
  
  /** Form submission response display location. */
  def formTarget(): String = js.native
  
  /** Associated <label> elements. */
  def labels(): js.Array[LabelElement] = js.native
  
  /** Form field name. */
  def name(): String = js.native
}
