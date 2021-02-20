package typings.googleapis.reportsV1Mod.adminReportsV1

import typings.googleapis.anon.CustomerId
import typings.googleapis.anon.DatetimeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a usage report.
  */
@js.native
trait SchemaUsageReport extends StObject {
  
  /**
    * The date to which the record belongs.
    */
  var date: js.UndefOr[String] = js.native
  
  /**
    * Information about the type of the item.
    */
  var entity: js.UndefOr[CustomerId] = js.native
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The kind of object.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Parameter value pairs for various applications.
    */
  var parameters: js.UndefOr[js.Array[DatetimeValue]] = js.native
}
object SchemaUsageReport {
  
  @scala.inline
  def apply(): SchemaUsageReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsageReport]
  }
  
  @scala.inline
  implicit class SchemaUsageReportMutableBuilder[Self <: SchemaUsageReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setEntity(value: CustomerId): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Array[DatetimeValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: DatetimeValue*): Self = StObject.set(x, "parameters", js.Array(value :_*))
  }
}
