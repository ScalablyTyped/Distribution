package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Key used to identify a report.
  */
trait SchemaReportKey extends StObject {
  
  /**
    * Query ID.
    */
  var queryId: js.UndefOr[String] = js.undefined
  
  /**
    * Report ID.
    */
  var reportId: js.UndefOr[String] = js.undefined
}
object SchemaReportKey {
  
  @scala.inline
  def apply(): SchemaReportKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportKey]
  }
  
  @scala.inline
  implicit class SchemaReportKeyMutableBuilder[Self <: SchemaReportKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryId(value: String): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryIdUndefined: Self = StObject.set(x, "queryId", js.undefined)
    
    @scala.inline
    def setReportId(value: String): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
  }
}
