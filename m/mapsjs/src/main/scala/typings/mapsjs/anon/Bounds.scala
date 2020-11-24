package typings.mapsjs.anon

import typings.mapsjs.mod.envelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bounds extends js.Object {
  
  var Bounds: js.Array[envelope] = js.native
  
  var Shapes: js.Array[_] = js.native
  
  var Values: js.Array[_] = js.native
}
object Bounds {
  
  @scala.inline
  def apply(Bounds: js.Array[envelope], Shapes: js.Array[_], Values: js.Array[_]): Bounds = {
    val __obj = js.Dynamic.literal(Bounds = Bounds.asInstanceOf[js.Any], Shapes = Shapes.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
  
  @scala.inline
  implicit class BoundsOps[Self <: Bounds] (val x: Self) extends AnyVal {
    
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
    def setBoundsVarargs(value: envelope*): Self = this.set("Bounds", js.Array(value :_*))
    
    @scala.inline
    def setBounds(value: js.Array[envelope]): Self = this.set("Bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapesVarargs(value: js.Any*): Self = this.set("Shapes", js.Array(value :_*))
    
    @scala.inline
    def setShapes(value: js.Array[_]): Self = this.set("Shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("Values", value.asInstanceOf[js.Any])
  }
}
