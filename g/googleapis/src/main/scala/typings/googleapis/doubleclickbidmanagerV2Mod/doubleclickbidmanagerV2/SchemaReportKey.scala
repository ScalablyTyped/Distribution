package typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportKey extends StObject {
  
  /**
    * Output only. Query ID.
    */
  var queryId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Report ID.
    */
  var reportId: js.UndefOr[String | Null] = js.undefined
}
object SchemaReportKey {
  
  inline def apply(): SchemaReportKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportKey]
  }
  
  extension [Self <: SchemaReportKey](x: Self) {
    
    inline def setQueryId(value: String): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
    
    inline def setQueryIdNull: Self = StObject.set(x, "queryId", null)
    
    inline def setQueryIdUndefined: Self = StObject.set(x, "queryId", js.undefined)
    
    inline def setReportId(value: String): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    inline def setReportIdNull: Self = StObject.set(x, "reportId", null)
    
    inline def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
  }
}
