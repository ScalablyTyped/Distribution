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
  
  @scala.inline
  def apply(): DriveFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveFolder]
  }
  
  @scala.inline
  implicit class DriveFolderMutableBuilder[Self <: DriveFolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
