package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriveFolder extends StObject {
  
  /** URL that can be used to access the Drive folder. Read-only. */
  var alternateLink: js.UndefOr[String] = js.undefined
  
  /** Drive API resource ID. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Title of the Drive folder. Read-only. */
  var title: js.UndefOr[String] = js.undefined
}
object DriveFolder {
  
  inline def apply(): DriveFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveFolder]
  }
  
  extension [Self <: DriveFolder](x: Self) {
    
    inline def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
    
    inline def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
