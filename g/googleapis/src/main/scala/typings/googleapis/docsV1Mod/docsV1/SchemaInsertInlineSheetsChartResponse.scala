package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of inserting an embedded Google Sheets chart.
  */
trait SchemaInsertInlineSheetsChartResponse extends StObject {
  
  /**
    * The object ID of the inserted chart.
    */
  var objectId: js.UndefOr[String] = js.undefined
}
object SchemaInsertInlineSheetsChartResponse {
  
  @scala.inline
  def apply(): SchemaInsertInlineSheetsChartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsertInlineSheetsChartResponse]
  }
  
  @scala.inline
  implicit class SchemaInsertInlineSheetsChartResponseMutableBuilder[Self <: SchemaInsertInlineSheetsChartResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
