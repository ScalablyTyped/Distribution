package typings.ipp.mod

import typings.ipp.ippStrings.`on-error`
import typings.ipp.ippStrings.always
import typings.ipp.ippStrings.none
import typings.ipp.ippStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobErrorSheet extends StObject {
  
  var `job-error-sheet-type`: js.UndefOr[none | standard] = js.undefined
  
  var `job-error-sheet-when`: js.UndefOr[always | `on-error`] = js.undefined
  
  var media: js.UndefOr[Media] = js.undefined
  
  var `media-col`: js.UndefOr[MediaInterface] = js.undefined
}
object JobErrorSheet {
  
  inline def apply(): JobErrorSheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobErrorSheet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobErrorSheet] (val x: Self) extends AnyVal {
    
    inline def `setJob-error-sheet-type`(value: none | standard): Self = StObject.set(x, "job-error-sheet-type", value.asInstanceOf[js.Any])
    
    inline def `setJob-error-sheet-typeUndefined`: Self = StObject.set(x, "job-error-sheet-type", js.undefined)
    
    inline def `setJob-error-sheet-when`(value: always | `on-error`): Self = StObject.set(x, "job-error-sheet-when", value.asInstanceOf[js.Any])
    
    inline def `setJob-error-sheet-whenUndefined`: Self = StObject.set(x, "job-error-sheet-when", js.undefined)
    
    inline def setMedia(value: Media): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def `setMedia-col`(value: MediaInterface): Self = StObject.set(x, "media-col", value.asInstanceOf[js.Any])
    
    inline def `setMedia-colUndefined`: Self = StObject.set(x, "media-col", js.undefined)
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
  }
}
