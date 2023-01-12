package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeparatorSheets extends StObject {
  
  var media: js.UndefOr[Media] = js.undefined
  
  var `media-col`: js.UndefOr[MediaInterface] = js.undefined
  
  var `separator-sheets-type`: js.UndefOr[js.Array[SeparatorSheetsType]] = js.undefined
}
object SeparatorSheets {
  
  inline def apply(): SeparatorSheets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeparatorSheets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeparatorSheets] (val x: Self) extends AnyVal {
    
    inline def setMedia(value: Media): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def `setMedia-col`(value: MediaInterface): Self = StObject.set(x, "media-col", value.asInstanceOf[js.Any])
    
    inline def `setMedia-colUndefined`: Self = StObject.set(x, "media-col", js.undefined)
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def `setSeparator-sheets-type`(value: js.Array[SeparatorSheetsType]): Self = StObject.set(x, "separator-sheets-type", value.asInstanceOf[js.Any])
    
    inline def `setSeparator-sheets-typeUndefined`: Self = StObject.set(x, "separator-sheets-type", js.undefined)
    
    inline def `setSeparator-sheets-typeVarargs`(value: SeparatorSheetsType*): Self = StObject.set(x, "separator-sheets-type", js.Array(value*))
  }
}
