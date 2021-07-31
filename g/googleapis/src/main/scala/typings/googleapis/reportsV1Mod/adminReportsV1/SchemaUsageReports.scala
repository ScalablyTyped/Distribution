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
  
  @scala.inline
  def apply(): SchemaUsageReports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsageReports]
  }
  
  @scala.inline
  implicit class SchemaUsageReportsMutableBuilder[Self <: SchemaUsageReports] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUsageReports(value: js.Array[SchemaUsageReport]): Self = StObject.set(x, "usageReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageReportsUndefined: Self = StObject.set(x, "usageReports", js.undefined)
    
    @scala.inline
    def setUsageReportsVarargs(value: SchemaUsageReport*): Self = StObject.set(x, "usageReports", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[Code]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: Code*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
