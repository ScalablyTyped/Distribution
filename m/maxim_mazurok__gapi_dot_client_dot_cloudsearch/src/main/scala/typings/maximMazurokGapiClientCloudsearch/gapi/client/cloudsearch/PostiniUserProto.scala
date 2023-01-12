package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostiniUserProto extends StObject {
  
  var postiniUserId: js.UndefOr[String] = js.undefined
}
object PostiniUserProto {
  
  inline def apply(): PostiniUserProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostiniUserProto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostiniUserProto] (val x: Self) extends AnyVal {
    
    inline def setPostiniUserId(value: String): Self = StObject.set(x, "postiniUserId", value.asInstanceOf[js.Any])
    
    inline def setPostiniUserIdUndefined: Self = StObject.set(x, "postiniUserId", js.undefined)
  }
}
