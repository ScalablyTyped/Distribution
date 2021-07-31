package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-line no-empty-interface
trait Fraction
  extends StObject
     with _MathType {
  
  var d: Double
  
  var n: Double
  
  var s: Double
}
object Fraction {
  
  @scala.inline
  def apply(d: Double, n: Double, s: Double): Fraction = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fraction]
  }
  
  @scala.inline
  implicit class FractionMutableBuilder[Self <: Fraction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
