package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Appends rows or columns to the end of a sheet.
  */
trait SchemaAppendDimensionRequest extends StObject {
  
  /**
    * Whether rows or columns should be appended.
    */
  var dimension: js.UndefOr[String] = js.undefined
  
  /**
    * The number of rows or columns to append.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * The sheet to append rows or columns to.
    */
  var sheetId: js.UndefOr[Double] = js.undefined
}
object SchemaAppendDimensionRequest {
  
  @scala.inline
  def apply(): SchemaAppendDimensionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppendDimensionRequest]
  }
  
  @scala.inline
  implicit class SchemaAppendDimensionRequestMutableBuilder[Self <: SchemaAppendDimensionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
