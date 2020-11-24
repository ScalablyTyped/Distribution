package typings.jqueryColorpicker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait A extends js.Object {
  
  var A: Double = js.native
  
  var B: Double = js.native
  
  var L: Double = js.native
  
  var a: Double = js.native
  
  var b: Double = js.native
  
  var c: Double = js.native
  
  var g: Double = js.native
  
  var h: Double = js.native
  
  var k: Double = js.native
  
  var m: Double = js.native
  
  var r: Double = js.native
  
  var s: Double = js.native
  
  var v: Double = js.native
  
  var y: Double = js.native
}
object A {
  
  @scala.inline
  def apply(
    A: Double,
    B: Double,
    L: Double,
    a: Double,
    b: Double,
    c: Double,
    g: Double,
    h: Double,
    k: Double,
    m: Double,
    r: Double,
    s: Double,
    v: Double,
    y: Double
  ): A = {
    val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], B = B.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any], a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[A]
  }
  
  @scala.inline
  implicit class AOps[Self <: A] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setA(value: Double): Self = this.set("A", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: Double): Self = this.set("B", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: Double): Self = this.set("L", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC(value: Double): Self = this.set("c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG(value: Double): Self = this.set("g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK(value: Double): Self = this.set("k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM(value: Double): Self = this.set("m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: Double): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: Double): Self = this.set("v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
