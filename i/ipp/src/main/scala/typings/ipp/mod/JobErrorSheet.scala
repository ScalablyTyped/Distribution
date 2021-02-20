package typings.ipp.mod

import typings.ipp.ippStrings.`on-error`
import typings.ipp.ippStrings.always
import typings.ipp.ippStrings.none
import typings.ipp.ippStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobErrorSheet extends StObject {
  
  var `job-error-sheet-type`: js.UndefOr[none | standard] = js.native
  
  var `job-error-sheet-when`: js.UndefOr[always | `on-error`] = js.native
  
  var media: js.UndefOr[Media] = js.native
  
  var `media-col`: js.UndefOr[MediaInterface] = js.native
}
object JobErrorSheet {
  
  @scala.inline
  def apply(): JobErrorSheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobErrorSheet]
  }
  
  @scala.inline
  implicit class JobErrorSheetMutableBuilder[Self <: JobErrorSheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setJob-error-sheet-type`(value: none | standard): Self = StObject.set(x, "job-error-sheet-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-error-sheet-typeUndefined`: Self = StObject.set(x, "job-error-sheet-type", js.undefined)
    
    @scala.inline
    def `setJob-error-sheet-when`(value: always | `on-error`): Self = StObject.set(x, "job-error-sheet-when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-error-sheet-whenUndefined`: Self = StObject.set(x, "job-error-sheet-when", js.undefined)
    
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
