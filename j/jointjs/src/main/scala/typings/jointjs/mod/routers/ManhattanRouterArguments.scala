package typings.jointjs.mod.routers

import typings.jointjs.mod.dia.LinkEnd
import typings.jointjs.mod.dia.OrthogonalDirection
import typings.jointjs.mod.dia.Sides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManhattanRouterArguments extends js.Object {
  
  var endDirections: js.UndefOr[js.Array[OrthogonalDirection]] = js.native
  
  var excludeEnds: js.UndefOr[js.Array[LinkEnd]] = js.native
  
  var excludeTypes: js.UndefOr[js.Array[String]] = js.native
  
  var maxAllowedDirectionChange: js.UndefOr[Double] = js.native
  
  var maximumLoops: js.UndefOr[Double] = js.native
  
  var padding: js.UndefOr[Sides] = js.native
  
  var perpendicular: js.UndefOr[Boolean] = js.native
  
  var startDirections: js.UndefOr[js.Array[OrthogonalDirection]] = js.native
  
  var step: js.UndefOr[Double] = js.native
}
object ManhattanRouterArguments {
  
  @scala.inline
  def apply(): ManhattanRouterArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManhattanRouterArguments]
  }
  
  @scala.inline
  implicit class ManhattanRouterArgumentsOps[Self <: ManhattanRouterArguments] (val x: Self) extends AnyVal {
    
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
    def setEndDirectionsVarargs(value: OrthogonalDirection*): Self = this.set("endDirections", js.Array(value :_*))
    
    @scala.inline
    def setEndDirections(value: js.Array[OrthogonalDirection]): Self = this.set("endDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDirections: Self = this.set("endDirections", js.undefined)
    
    @scala.inline
    def setExcludeEndsVarargs(value: LinkEnd*): Self = this.set("excludeEnds", js.Array(value :_*))
    
    @scala.inline
    def setExcludeEnds(value: js.Array[LinkEnd]): Self = this.set("excludeEnds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeEnds: Self = this.set("excludeEnds", js.undefined)
    
    @scala.inline
    def setExcludeTypesVarargs(value: String*): Self = this.set("excludeTypes", js.Array(value :_*))
    
    @scala.inline
    def setExcludeTypes(value: js.Array[String]): Self = this.set("excludeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeTypes: Self = this.set("excludeTypes", js.undefined)
    
    @scala.inline
    def setMaxAllowedDirectionChange(value: Double): Self = this.set("maxAllowedDirectionChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAllowedDirectionChange: Self = this.set("maxAllowedDirectionChange", js.undefined)
    
    @scala.inline
    def setMaximumLoops(value: Double): Self = this.set("maximumLoops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumLoops: Self = this.set("maximumLoops", js.undefined)
    
    @scala.inline
    def setPadding(value: Sides): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPerpendicular(value: Boolean): Self = this.set("perpendicular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerpendicular: Self = this.set("perpendicular", js.undefined)
    
    @scala.inline
    def setStartDirectionsVarargs(value: OrthogonalDirection*): Self = this.set("startDirections", js.Array(value :_*))
    
    @scala.inline
    def setStartDirections(value: js.Array[OrthogonalDirection]): Self = this.set("startDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDirections: Self = this.set("startDirections", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}
