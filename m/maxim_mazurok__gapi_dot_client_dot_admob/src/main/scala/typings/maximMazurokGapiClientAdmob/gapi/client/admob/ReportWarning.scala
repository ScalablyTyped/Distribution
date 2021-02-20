package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportWarning extends StObject {
  
  /** Describes the details of the warning message, in English. */
  var description: js.UndefOr[String] = js.native
  
  /** Type of the warning. */
  var `type`: js.UndefOr[String] = js.native
}
object ReportWarning {
  
  @scala.inline
  def apply(): ReportWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportWarning]
  }
  
  @scala.inline
  implicit class ReportWarningMutableBuilder[Self <: ReportWarning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
