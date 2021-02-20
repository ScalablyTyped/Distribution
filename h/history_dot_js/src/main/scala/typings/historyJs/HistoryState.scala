package typings.historyJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryState extends StObject {
  
  var cleanUrl: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var hashedUrl: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var url: String = js.native
}
object HistoryState {
  
  @scala.inline
  def apply(url: String): HistoryState = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryState]
  }
  
  @scala.inline
  implicit class HistoryStateMutableBuilder[Self <: HistoryState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCleanUrl(value: String): Self = StObject.set(x, "cleanUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCleanUrlUndefined: Self = StObject.set(x, "cleanUrl", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setHashedUrl(value: String): Self = StObject.set(x, "hashedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashedUrlUndefined: Self = StObject.set(x, "hashedUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
