package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YoutubeUserProto extends StObject {
  
  var youtubeUserId: js.UndefOr[String] = js.undefined
}
object YoutubeUserProto {
  
  inline def apply(): YoutubeUserProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YoutubeUserProto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: YoutubeUserProto] (val x: Self) extends AnyVal {
    
    inline def setYoutubeUserId(value: String): Self = StObject.set(x, "youtubeUserId", value.asInstanceOf[js.Any])
    
    inline def setYoutubeUserIdUndefined: Self = StObject.set(x, "youtubeUserId", js.undefined)
  }
}
