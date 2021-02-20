package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List reports response.
  */
@js.native
trait SchemaListReportsResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;doubleclickbidmanager#listReportsResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Retrieved reports.
    */
  var reports: js.UndefOr[js.Array[SchemaReport]] = js.native
}
object SchemaListReportsResponse {
  
  @scala.inline
  def apply(): SchemaListReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListReportsResponse]
  }
  
  @scala.inline
  implicit class SchemaListReportsResponseMutableBuilder[Self <: SchemaListReportsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setReports(value: js.Array[SchemaReport]): Self = StObject.set(x, "reports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportsUndefined: Self = StObject.set(x, "reports", js.undefined)
    
    @scala.inline
    def setReportsVarargs(value: SchemaReport*): Self = StObject.set(x, "reports", js.Array(value :_*))
  }
}
