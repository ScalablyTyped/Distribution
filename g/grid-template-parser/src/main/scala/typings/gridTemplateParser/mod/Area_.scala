package typings.gridTemplateParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Area_ extends js.Object {
  
  var column: Track = js.native
  
  var row: Track = js.native
}
object Area_ {
  
  @scala.inline
  def apply(column: Track, row: Track): Area_ = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Area_]
  }
  
  @scala.inline
  implicit class Area_Ops[Self <: Area_] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: Track): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Track): Self = this.set("row", value.asInstanceOf[js.Any])
  }
}
