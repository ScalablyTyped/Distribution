package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CourseMaterial extends StObject {
  
  /** Google Drive file attachment. */
  var driveFile: js.UndefOr[DriveFile] = js.undefined
  
  /** Google Forms attachment. */
  var form: js.UndefOr[Form] = js.undefined
  
  /** Link atatchment. */
  var link: js.UndefOr[Link] = js.undefined
  
  /** Youtube video attachment. */
  var youTubeVideo: js.UndefOr[YouTubeVideo] = js.undefined
}
object CourseMaterial {
  
  inline def apply(): CourseMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CourseMaterial]
  }
  
  extension [Self <: CourseMaterial](x: Self) {
    
    inline def setDriveFile(value: DriveFile): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
    
    inline def setDriveFileUndefined: Self = StObject.set(x, "driveFile", js.undefined)
    
    inline def setForm(value: Form): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setLink(value: Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setYouTubeVideo(value: YouTubeVideo): Self = StObject.set(x, "youTubeVideo", value.asInstanceOf[js.Any])
    
    inline def setYouTubeVideoUndefined: Self = StObject.set(x, "youTubeVideo", js.undefined)
  }
}
