package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobSaveDisposition extends StObject {
  
  var `save-disposition`: js.UndefOr[SaveDisposition] = js.undefined
  
  var `save-info`: js.UndefOr[js.Array[SaveInfo]] = js.undefined
}
object JobSaveDisposition {
  
  inline def apply(): JobSaveDisposition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobSaveDisposition]
  }
  
  extension [Self <: JobSaveDisposition](x: Self) {
    
    inline def `setSave-disposition`(value: SaveDisposition): Self = StObject.set(x, "save-disposition", value.asInstanceOf[js.Any])
    
    inline def `setSave-dispositionUndefined`: Self = StObject.set(x, "save-disposition", js.undefined)
    
    inline def `setSave-info`(value: js.Array[SaveInfo]): Self = StObject.set(x, "save-info", value.asInstanceOf[js.Any])
    
    inline def `setSave-infoUndefined`: Self = StObject.set(x, "save-info", js.undefined)
    
    inline def `setSave-infoVarargs`(value: SaveInfo*): Self = StObject.set(x, "save-info", js.Array(value :_*))
  }
}
