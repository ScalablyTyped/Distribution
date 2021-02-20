package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of creating an embedded Google Sheets chart.
  */
@js.native
trait SchemaCreateSheetsChartResponse extends StObject {
  
  /**
    * The object ID of the created chart.
    */
  var objectId: js.UndefOr[String] = js.native
}
object SchemaCreateSheetsChartResponse {
  
  @scala.inline
  def apply(): SchemaCreateSheetsChartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateSheetsChartResponse]
  }
  
  @scala.inline
  implicit class SchemaCreateSheetsChartResponseMutableBuilder[Self <: SchemaCreateSheetsChartResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
