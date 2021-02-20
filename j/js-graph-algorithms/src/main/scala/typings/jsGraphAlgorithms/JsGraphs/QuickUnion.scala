package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickUnion extends StObject {
  
  def connected(v: Double, w: Double): Boolean = js.native
  
  var id: js.Any = js.native
  
  def root(q: Double): Double = js.native
  
  def union(v: Double, w: Double): Unit = js.native
}
object QuickUnion {
  
  @scala.inline
  def apply(
    connected: (Double, Double) => Boolean,
    id: js.Any,
    root: Double => Double,
    union: (Double, Double) => Unit
  ): QuickUnion = {
    val __obj = js.Dynamic.literal(connected = js.Any.fromFunction2(connected), id = id.asInstanceOf[js.Any], root = js.Any.fromFunction1(root), union = js.Any.fromFunction2(union))
    __obj.asInstanceOf[QuickUnion]
  }
  
  @scala.inline
  implicit class QuickUnionMutableBuilder[Self <: QuickUnion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnected(value: (Double, Double) => Boolean): Self = StObject.set(x, "connected", js.Any.fromFunction2(value))
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: Double => Double): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnion(value: (Double, Double) => Unit): Self = StObject.set(x, "union", js.Any.fromFunction2(value))
  }
}
