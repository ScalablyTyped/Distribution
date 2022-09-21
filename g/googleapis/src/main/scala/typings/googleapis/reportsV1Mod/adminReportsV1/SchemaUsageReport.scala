package typings.googleapis.reportsV1Mod.adminReportsV1

import typings.googleapis.anon.CustomerId
import typings.googleapis.anon.DatetimeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUsageReport extends StObject {
  
  /**
    * Output only. The date of the report request.
    */
  var date: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Information about the type of the item.
    */
  var entity: js.UndefOr[CustomerId | Null] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of API resource. For a usage report, the value is `admin#reports#usageReport`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Parameter value pairs for various applications. For the Entity Usage Report parameters and values, see [the Entity Usage parameters reference](/admin-sdk/reports/v1/reference/usage-ref-appendix-a/entities).
    */
  var parameters: js.UndefOr[js.Array[DatetimeValue] | Null] = js.undefined
}
object SchemaUsageReport {
  
  inline def apply(): SchemaUsageReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsageReport]
  }
  
  extension [Self <: SchemaUsageReport](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateNull: Self = StObject.set(x, "date", null)
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setEntity(value: CustomerId): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityNull: Self = StObject.set(x, "entity", null)
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setParameters(value: js.Array[DatetimeValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: DatetimeValue*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
