package typings.googleapis.v13Mod.adexchangebuyerV13

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration data for an Ad Exchange performance report list.
  */
@js.native
trait SchemaPerformanceReportList extends StObject {
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * A list of performance reports relevant for the account.
    */
  var performanceReport: js.UndefOr[js.Array[SchemaPerformanceReport]] = js.native
}
object SchemaPerformanceReportList {
  
  @scala.inline
  def apply(): SchemaPerformanceReportList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerformanceReportList]
  }
  
  @scala.inline
  implicit class SchemaPerformanceReportListMutableBuilder[Self <: SchemaPerformanceReportList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPerformanceReport(value: js.Array[SchemaPerformanceReport]): Self = StObject.set(x, "performanceReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceReportUndefined: Self = StObject.set(x, "performanceReport", js.undefined)
    
    @scala.inline
    def setPerformanceReportVarargs(value: SchemaPerformanceReport*): Self = StObject.set(x, "performanceReport", js.Array(value :_*))
  }
}
