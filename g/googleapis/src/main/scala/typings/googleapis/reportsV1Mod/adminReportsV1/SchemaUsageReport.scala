package typings.googleapis.reportsV1Mod.adminReportsV1

import typings.googleapis.anon.CustomerId
import typings.googleapis.anon.DatetimeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a usage report.
  */
trait SchemaUsageReport extends StObject {
  
  /**
    * The date to which the record belongs.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the type of the item.
    */
  var entity: js.UndefOr[CustomerId] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of object.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Parameter value pairs for various applications.
    */
  var parameters: js.UndefOr[js.Array[DatetimeValue]] = js.undefined
}
object SchemaUsageReport {
  
  inline def apply(): SchemaUsageReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsageReport]
  }
  
  extension [Self <: SchemaUsageReport](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setEntity(value: CustomerId): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setParameters(value: js.Array[DatetimeValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: DatetimeValue*): Self = StObject.set(x, "parameters", js.Array(value :_*))
  }
}
