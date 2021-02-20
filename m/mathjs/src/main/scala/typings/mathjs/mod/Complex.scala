package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Complex extends _MathType {
  
  def compare(a: Complex, b: Complex): Double = js.native
  
  def equals(other: Complex): Boolean = js.native
  
  def format(): String = js.native
  def format(precision: Double): String = js.native
  
  def fromJSON(json: js.Object): Complex = js.native
  
  def fromPolar(polar: js.Object): Complex = js.native
  def fromPolar(r: Double, phi: Double): Complex = js.native
  
  var im: Double = js.native
  
  var re: Double = js.native
  
  def toJSON(): js.Object = js.native
  
  def toPolar(): PolarCoordinates = js.native
}
