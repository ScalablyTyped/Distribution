package typings.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CirclesDur extends js.Object {
  
  var circles: Double = js.native
  
  var dur: Double = js.native
  
  def fn(_underscore: Double, index: Double): RStyle = js.native
}
object CirclesDur {
  
  @scala.inline
  def apply(circles: Double, dur: Double, fn: (Double, Double) => RStyle): CirclesDur = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction2(fn))
    __obj.asInstanceOf[CirclesDur]
  }
  
  @scala.inline
  implicit class CirclesDurOps[Self <: CirclesDur] (val x: Self) extends AnyVal {
    
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
    def setCircles(value: Double): Self = this.set("circles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDur(value: Double): Self = this.set("dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFn(value: (Double, Double) => RStyle): Self = this.set("fn", js.Any.fromFunction2(value))
  }
}
