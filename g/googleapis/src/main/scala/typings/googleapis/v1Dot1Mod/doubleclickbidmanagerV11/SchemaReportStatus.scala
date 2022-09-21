package typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportStatus extends StObject {
  
  /**
    * If the report failed, this records the cause.
    */
  var failure: js.UndefOr[SchemaReportFailure] = js.undefined
  
  /**
    * The time when this report either completed successfully or failed.
    */
  var finishTimeMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The file type of the report.
    */
  var format: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The state of the report.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaReportStatus {
  
  inline def apply(): SchemaReportStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportStatus]
  }
  
  extension [Self <: SchemaReportStatus](x: Self) {
    
    inline def setFailure(value: SchemaReportFailure): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
    
    inline def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    inline def setFinishTimeMs(value: String): Self = StObject.set(x, "finishTimeMs", value.asInstanceOf[js.Any])
    
    inline def setFinishTimeMsNull: Self = StObject.set(x, "finishTimeMs", null)
    
    inline def setFinishTimeMsUndefined: Self = StObject.set(x, "finishTimeMs", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
