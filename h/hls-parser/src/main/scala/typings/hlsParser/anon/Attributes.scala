package typings.hlsParser.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attributes extends js.Object {
  
  var attributes: js.UndefOr[js.Object] = js.native
  
  var classId: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var end: js.UndefOr[Date] = js.native
  
  var endOnNext: js.UndefOr[Boolean] = js.native
  
  var id: String = js.native
  
  var plannedDuration: js.UndefOr[Double] = js.native
  
  var start: Date = js.native
}
object Attributes {
  
  @scala.inline
  def apply(id: String, start: Date): Attributes = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Date): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: js.Object): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setClassId(value: String): Self = this.set("classId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassId: Self = this.set("classId", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEnd(value: Date): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setEndOnNext(value: Boolean): Self = this.set("endOnNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndOnNext: Self = this.set("endOnNext", js.undefined)
    
    @scala.inline
    def setPlannedDuration(value: Double): Self = this.set("plannedDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlannedDuration: Self = this.set("plannedDuration", js.undefined)
  }
}
