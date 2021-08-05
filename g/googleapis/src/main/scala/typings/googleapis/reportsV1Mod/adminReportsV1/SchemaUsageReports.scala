package typings.googleapis.reportsV1Mod.adminReportsV1

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a collection of usage reports.
  */
trait SchemaUsageReports extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of object.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Token for retrieving the next page
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Various application parameter records.
    */
  var usageReports: js.UndefOr[js.Array[SchemaUsageReport]] = js.undefined
  
  /**
    * Warnings if any.
    */
  var warnings: js.UndefOr[js.Array[Code]] = js.undefined
}
object SchemaUsageReports {
  
  inline def apply(): SchemaUsageReports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsageReports]
  }
  
  extension [Self <: SchemaUsageReports](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUsageReports(value: js.Array[SchemaUsageReport]): Self = StObject.set(x, "usageReports", value.asInstanceOf[js.Any])
    
    inline def setUsageReportsUndefined: Self = StObject.set(x, "usageReports", js.undefined)
    
    inline def setUsageReportsVarargs(value: SchemaUsageReport*): Self = StObject.set(x, "usageReports", js.Array(value :_*))
    
    inline def setWarnings(value: js.Array[Code]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: Code*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
