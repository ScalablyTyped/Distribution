package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertSheet extends StObject {
  
  var `insert-after-page-number`: js.UndefOr[Double] = js.undefined
  
  var `insert-count`: js.UndefOr[Double] = js.undefined
  
  var media: js.UndefOr[Media] = js.undefined
  
  var `media-col`: js.UndefOr[MediaInterface] = js.undefined
}
object InsertSheet {
  
  @scala.inline
  def apply(): InsertSheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertSheet]
  }
  
  @scala.inline
  implicit class InsertSheetMutableBuilder[Self <: InsertSheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setInsert-after-page-number`(value: Double): Self = StObject.set(x, "insert-after-page-number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInsert-after-page-numberUndefined`: Self = StObject.set(x, "insert-after-page-number", js.undefined)
    
    @scala.inline
    def `setInsert-count`(value: Double): Self = StObject.set(x, "insert-count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInsert-countUndefined`: Self = StObject.set(x, "insert-count", js.undefined)
    
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
