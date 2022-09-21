package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaYoutubeUserProto extends StObject {
  
  var youtubeUserId: js.UndefOr[String | Null] = js.undefined
}
object SchemaYoutubeUserProto {
  
  inline def apply(): SchemaYoutubeUserProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaYoutubeUserProto]
  }
  
  extension [Self <: SchemaYoutubeUserProto](x: Self) {
    
    inline def setYoutubeUserId(value: String): Self = StObject.set(x, "youtubeUserId", value.asInstanceOf[js.Any])
    
    inline def setYoutubeUserIdNull: Self = StObject.set(x, "youtubeUserId", null)
    
    inline def setYoutubeUserIdUndefined: Self = StObject.set(x, "youtubeUserId", js.undefined)
  }
}
