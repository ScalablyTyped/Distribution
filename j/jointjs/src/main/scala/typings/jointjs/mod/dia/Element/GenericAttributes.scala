package typings.jointjs.mod.dia.Element

import typings.jointjs.anon.Groups
import typings.jointjs.mod.dia.MarkupJSON
import typings.jointjs.mod.dia.Point
import typings.jointjs.mod.dia.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericAttributes[T]
  extends typings.jointjs.mod.dia.Cell.GenericAttributes[T] {
  
  var angle: js.UndefOr[Double] = js.native
  
  var markup: js.UndefOr[String | MarkupJSON] = js.native
  
  var ports: js.UndefOr[Groups] = js.native
  
  var position: js.UndefOr[Point] = js.native
  
  var size: js.UndefOr[Size] = js.native
}
object GenericAttributes {
  
  @scala.inline
  def apply[T](): GenericAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericAttributes[T]]
  }
  
  @scala.inline
  implicit class GenericAttributesOps[Self <: GenericAttributes[_], T] (val x: Self with GenericAttributes[T]) extends AnyVal {
    
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setMarkup(value: String | MarkupJSON): Self = this.set("markup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkup: Self = this.set("markup", js.undefined)
    
    @scala.inline
    def setPorts(value: Groups): Self = this.set("ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePorts: Self = this.set("ports", js.undefined)
    
    @scala.inline
    def setPosition(value: Point): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
