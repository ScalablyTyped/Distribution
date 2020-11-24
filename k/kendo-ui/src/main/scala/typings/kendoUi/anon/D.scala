package typings.kendoUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait D extends js.Object {
  
  var D: String = js.native
  
  var F: String = js.native
  
  var G: String = js.native
  
  var M: String = js.native
  
  var T: String = js.native
  
  var Y: String = js.native
  
  var d: String = js.native
  
  var g: String = js.native
  
  var m: String = js.native
  
  var s: String = js.native
  
  var t: String = js.native
  
  var u: String = js.native
  
  var y: String = js.native
}
object D {
  
  @scala.inline
  def apply(
    D: String,
    F: String,
    G: String,
    M: String,
    T: String,
    Y: String,
    d: String,
    g: String,
    m: String,
    s: String,
    t: String,
    u: String,
    y: String
  ): D = {
    val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], F = F.asInstanceOf[js.Any], G = G.asInstanceOf[js.Any], M = M.asInstanceOf[js.Any], T = T.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[D]
  }
  
  @scala.inline
  implicit class DOps[Self <: D] (val x: Self) extends AnyVal {
    
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
    def setD(value: String): Self = this.set("D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF(value: String): Self = this.set("F", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG(value: String): Self = this.set("G", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM(value: String): Self = this.set("M", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: String): Self = this.set("T", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: String): Self = this.set("Y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: String): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setU(value: String): Self = this.set("u", value.asInstanceOf[js.Any])
  }
}
