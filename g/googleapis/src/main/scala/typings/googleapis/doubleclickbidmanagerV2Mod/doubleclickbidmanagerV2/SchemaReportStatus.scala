package typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportStatus extends StObject {
  
  /**
    * Output only. The time when this report either completed successfully or failed.
    */
  var finishTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The file type of the report.
    */
  var format: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The state of the report.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaReportStatus {
  
  inline def apply(): SchemaReportStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportStatus]
  }
  
  extension [Self <: SchemaReportStatus](x: Self) {
    
    inline def setFinishTime(value: String): Self = StObject.set(x, "finishTime", value.asInstanceOf[js.Any])
    
    inline def setFinishTimeNull: Self = StObject.set(x, "finishTime", null)
    
    inline def setFinishTimeUndefined: Self = StObject.set(x, "finishTime", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
