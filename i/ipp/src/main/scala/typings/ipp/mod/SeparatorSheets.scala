package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeparatorSheets extends StObject {
  
  var media: js.UndefOr[Media] = js.native
  
  var `media-col`: js.UndefOr[MediaInterface] = js.native
  
  var `separator-sheets-type`: js.UndefOr[js.Array[SeparatorSheetsType]] = js.native
}
object SeparatorSheets {
  
  @scala.inline
  def apply(): SeparatorSheets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeparatorSheets]
  }
  
  @scala.inline
  implicit class SeparatorSheetsMutableBuilder[Self <: SeparatorSheets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedia(value: Media): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMedia-col`(value: MediaInterface): Self = StObject.set(x, "media-col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMedia-colUndefined`: Self = StObject.set(x, "media-col", js.undefined)
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def `setSeparator-sheets-type`(value: js.Array[SeparatorSheetsType]): Self = StObject.set(x, "separator-sheets-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSeparator-sheets-typeUndefined`: Self = StObject.set(x, "separator-sheets-type", js.undefined)
    
    @scala.inline
    def `setSeparator-sheets-typeVarargs`(value: SeparatorSheetsType*): Self = StObject.set(x, "separator-sheets-type", js.Array(value :_*))
  }
}
