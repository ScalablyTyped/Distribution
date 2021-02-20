package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceInfo extends StObject {
  
  /** Drive file ID. */
  var documentId: js.UndefOr[String] = js.native
  
  /** Title of the resource, for example email subject, or document title. */
  var resourceTitle: js.UndefOr[String] = js.native
}
object ResourceInfo {
  
  @scala.inline
  def apply(): ResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceInfo]
  }
  
  @scala.inline
  implicit class ResourceInfoMutableBuilder[Self <: ResourceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    @scala.inline
    def setResourceTitle(value: String): Self = StObject.set(x, "resourceTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTitleUndefined: Self = StObject.set(x, "resourceTitle", js.undefined)
  }
}
