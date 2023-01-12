package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceInfo extends StObject {
  
  /** Drive file ID. */
  var documentId: js.UndefOr[String] = js.undefined
  
  /** Title of the resource, for example email subject, or document title. */
  var resourceTitle: js.UndefOr[String] = js.undefined
}
object ResourceInfo {
  
  inline def apply(): ResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceInfo] (val x: Self) extends AnyVal {
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    inline def setResourceTitle(value: String): Self = StObject.set(x, "resourceTitle", value.asInstanceOf[js.Any])
    
    inline def setResourceTitleUndefined: Self = StObject.set(x, "resourceTitle", js.undefined)
  }
}
