package typings.googleapis.reportsV1Mod.adminReportsV1

import typings.googleapis.anon.CustomerId
import typings.googleapis.anon.DatetimeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a usage report.
  */
@js.native
trait SchemaUsageReport extends js.Object {
  
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
  implicit class SchemaUsageReportOps[Self <: SchemaUsageReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setEntity(value: CustomerId): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: DatetimeValue*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[DatetimeValue]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
}
