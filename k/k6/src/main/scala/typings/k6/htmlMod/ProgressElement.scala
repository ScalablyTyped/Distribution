package typings.k6.htmlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("k6/html", "ProgressElement")
@js.native
open class ProgressElement () extends Element {
  
  /** Associated <label> elements. */
  def labels(): js.Array[LabelElement] = js.native
  
  /** Work required. */
  def max(): Double = js.native
  
  /** Progress bar position. `value/max` */
  def position(): Double = js.native
  
  /** Work completed. */
  def value(): Double = js.native
}
