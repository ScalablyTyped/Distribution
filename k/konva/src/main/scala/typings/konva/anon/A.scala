package typings.konva.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait A extends js.Object {
  
  var a: Double = js.native
  
  var b: js.Any = js.native
  
  var g: js.Any = js.native
  
  var r: js.Any = js.native
}
object A {
  
  @scala.inline
  def apply(a: Double, b: js.Any, g: js.Any, r: js.Any): A = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
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
    def setA(value: Double): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: js.Any): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG(value: js.Any): Self = this.set("g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: js.Any): Self = this.set("r", value.asInstanceOf[js.Any])
  }
}
