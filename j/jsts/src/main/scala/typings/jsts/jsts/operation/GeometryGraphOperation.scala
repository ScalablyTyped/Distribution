package typings.jsts.jsts.operation

import typings.jsts.jsts.geom.Geometry
import typings.jsts.jsts.geom.PrecisionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeometryGraphOperation extends js.Object {
  
  def getArgGeometry(i: Double): Geometry = js.native
  
  def setComputationPrecision(pm: PrecisionModel): Unit = js.native
}
object GeometryGraphOperation {
  
  @scala.inline
  def apply(getArgGeometry: Double => Geometry, setComputationPrecision: PrecisionModel => Unit): GeometryGraphOperation = {
    val __obj = js.Dynamic.literal(getArgGeometry = js.Any.fromFunction1(getArgGeometry), setComputationPrecision = js.Any.fromFunction1(setComputationPrecision))
    __obj.asInstanceOf[GeometryGraphOperation]
  }
  
  @scala.inline
  implicit class GeometryGraphOperationOps[Self <: GeometryGraphOperation] (val x: Self) extends AnyVal {
    
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
    def setGetArgGeometry(value: Double => Geometry): Self = this.set("getArgGeometry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetComputationPrecision(value: PrecisionModel => Unit): Self = this.set("setComputationPrecision", js.Any.fromFunction1(value))
  }
}
