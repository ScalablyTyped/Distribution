package typings.htmlValidator.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationMessageBasicLocationObject extends StObject {
  
  var extract: String
  
  var firstColumn: Double
  
  var hiliteLength: Double
  
  var hiliteStart: Double
  
  var lastColumn: Double
  
  var lastLine: Double
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
  implicit class ValidationMessageBasicLocationObjectMutableBuilder[Self <: ValidationMessageBasicLocationObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtract(value: String): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstColumn(value: Double): Self = StObject.set(x, "firstColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiliteLength(value: Double): Self = StObject.set(x, "hiliteLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiliteStart(value: Double): Self = StObject.set(x, "hiliteStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastColumn(value: Double): Self = StObject.set(x, "lastColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastLine(value: Double): Self = StObject.set(x, "lastLine", value.asInstanceOf[js.Any])
  }
}
