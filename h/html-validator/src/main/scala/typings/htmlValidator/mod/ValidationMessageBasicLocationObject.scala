package typings.htmlValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationMessageBasicLocationObject extends js.Object {
  
  var extract: String = js.native
  
  var firstColumn: Double = js.native
  
  var hiliteLength: Double = js.native
  
  var hiliteStart: Double = js.native
  
  var lastColumn: Double = js.native
  
  var lastLine: Double = js.native
}
object ValidationMessageBasicLocationObject {
  
  @scala.inline
  def apply(
    extract: String,
    firstColumn: Double,
    hiliteLength: Double,
    hiliteStart: Double,
    lastColumn: Double,
    lastLine: Double
  ): ValidationMessageBasicLocationObject = {
    val __obj = js.Dynamic.literal(extract = extract.asInstanceOf[js.Any], firstColumn = firstColumn.asInstanceOf[js.Any], hiliteLength = hiliteLength.asInstanceOf[js.Any], hiliteStart = hiliteStart.asInstanceOf[js.Any], lastColumn = lastColumn.asInstanceOf[js.Any], lastLine = lastLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationMessageBasicLocationObject]
  }
  
  @scala.inline
  implicit class ValidationMessageBasicLocationObjectOps[Self <: ValidationMessageBasicLocationObject] (val x: Self) extends AnyVal {
    
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
    def setExtract(value: String): Self = this.set("extract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstColumn(value: Double): Self = this.set("firstColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiliteLength(value: Double): Self = this.set("hiliteLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiliteStart(value: Double): Self = this.set("hiliteStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastColumn(value: Double): Self = this.set("lastColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastLine(value: Double): Self = this.set("lastLine", value.asInstanceOf[js.Any])
  }
}
