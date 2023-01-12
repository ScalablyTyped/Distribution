package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobSheetsInterface extends StObject {
  
  var `job-sheets`: js.UndefOr[JobSheets] = js.undefined
  
  var media: js.UndefOr[Media] = js.undefined
  
  var `media-col`: js.UndefOr[MediaInterface] = js.undefined
}
object JobSheetsInterface {
  
  inline def apply(): JobSheetsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobSheetsInterface]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobSheetsInterface] (val x: Self) extends AnyVal {
    
    inline def `setJob-sheets`(value: JobSheets): Self = StObject.set(x, "job-sheets", value.asInstanceOf[js.Any])
    
    inline def `setJob-sheetsUndefined`: Self = StObject.set(x, "job-sheets", js.undefined)
    
    inline def setMedia(value: Media): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def `setMedia-col`(value: MediaInterface): Self = StObject.set(x, "media-col", value.asInstanceOf[js.Any])
    
    inline def `setMedia-colUndefined`: Self = StObject.set(x, "media-col", js.undefined)
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
  }
}
