package typings.historyJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryState extends StObject {
  
  var cleanUrl: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  var hashedUrl: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var url: String
}
object HistoryState {
  
  inline def apply(url: String): HistoryState = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HistoryState] (val x: Self) extends AnyVal {
    
    inline def setCleanUrl(value: String): Self = StObject.set(x, "cleanUrl", value.asInstanceOf[js.Any])
    
    inline def setCleanUrlUndefined: Self = StObject.set(x, "cleanUrl", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHashedUrl(value: String): Self = StObject.set(x, "hashedUrl", value.asInstanceOf[js.Any])
    
    inline def setHashedUrlUndefined: Self = StObject.set(x, "hashedUrl", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
