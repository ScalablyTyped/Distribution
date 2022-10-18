package typings.k6.htmlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("k6/html", "OptionElement")
@js.native
open class OptionElement () extends Element {
  
  /** Whether disabled. */
  def disabled(): Boolean = js.native
  
  /** Owning <form> element. */
  def form(): js.UndefOr[FormElement] = js.native
  
  /** Index in containing options list. */
  def index(): Double = js.native
  
  /** `label` attribute value. */
  def label(): String = js.native
  
  /** Text content. */
  def text(): String = js.native
  
  /** `value` attribute value. */
  def value(): String = js.native
}
