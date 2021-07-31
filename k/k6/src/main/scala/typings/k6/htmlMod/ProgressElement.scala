package typings.k6.htmlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("k6/html", "ProgressElement")
@js.native
abstract class ProgressElement () extends Element {
  
  /** Associated <label> elements. */
  def labels(): js.Array[LabelElement] = js.native
  
  /** Work required. */
  def max(): Double = js.native
  
  /** Progress bar position. `value/max` */
  def position(): Double = js.native
  
  /** Work completed. */
  def value(): Double = js.native
}
