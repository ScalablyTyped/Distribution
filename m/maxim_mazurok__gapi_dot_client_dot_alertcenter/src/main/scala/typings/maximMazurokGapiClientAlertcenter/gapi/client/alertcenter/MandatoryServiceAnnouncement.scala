package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MandatoryServiceAnnouncement extends StObject {
  
  /** Detailed, freeform text describing the announcement */
  var description: js.UndefOr[String] = js.undefined
  
  /** One line summary of the announcement */
  var title: js.UndefOr[String] = js.undefined
}
object MandatoryServiceAnnouncement {
  
  inline def apply(): MandatoryServiceAnnouncement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MandatoryServiceAnnouncement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MandatoryServiceAnnouncement] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
