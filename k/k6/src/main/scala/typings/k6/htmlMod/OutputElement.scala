package typings.k6.htmlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("k6/html", "OutputElement")
@js.native
abstract class OutputElement () extends Element {
  
  /** Default value. */
  def defaultValue(): String = js.native
  
  /** Owning <form> element. */
  def form(): js.UndefOr[FormElement] = js.native
  
  /** Associated <label> elements. */
  def labels(): js.Array[LabelElement] = js.native
  
  /** Text content. */
  def value(): String = js.native
}
