package typings.ipp.mod

import typings.ipp.ippStrings.none
import typings.ipp.ippStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobAccontingSheets extends StObject {
  
  var `job-accounting-output-bin`: js.UndefOr[OutputBin] = js.native
  
  var `job-accounting-sheets-type`: js.UndefOr[none | standard] = js.native
  
  var media: js.UndefOr[Media] = js.native
  
  var `media-col`: js.UndefOr[MediaInterface] = js.native
}
object JobAccontingSheets {
  
  @scala.inline
  def apply(): JobAccontingSheets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobAccontingSheets]
  }
  
  @scala.inline
  implicit class JobAccontingSheetsMutableBuilder[Self <: JobAccontingSheets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setJob-accounting-output-bin`(value: OutputBin): Self = StObject.set(x, "job-accounting-output-bin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-accounting-output-binUndefined`: Self = StObject.set(x, "job-accounting-output-bin", js.undefined)
    
    @scala.inline
    def `setJob-accounting-sheets-type`(value: none | standard): Self = StObject.set(x, "job-accounting-sheets-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-accounting-sheets-typeUndefined`: Self = StObject.set(x, "job-accounting-sheets-type", js.undefined)
    
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
