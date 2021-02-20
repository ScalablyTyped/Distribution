package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobSheetsInterface extends StObject {
  
  var `job-sheets`: js.UndefOr[JobSheets] = js.native
  
  var media: js.UndefOr[Media] = js.native
  
  var `media-col`: js.UndefOr[MediaInterface] = js.native
}
object JobSheetsInterface {
  
  @scala.inline
  def apply(): JobSheetsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobSheetsInterface]
  }
  
  @scala.inline
  implicit class JobSheetsInterfaceMutableBuilder[Self <: JobSheetsInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setJob-sheets`(value: JobSheets): Self = StObject.set(x, "job-sheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-sheetsUndefined`: Self = StObject.set(x, "job-sheets", js.undefined)
    
    @scala.inline
    def setMedia(value: Media): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMedia-col`(value: MediaInterface): Self = StObject.set(x, "media-col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMedia-colUndefined`: Self = StObject.set(x, "media-col", js.undefined)
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
  }
}
