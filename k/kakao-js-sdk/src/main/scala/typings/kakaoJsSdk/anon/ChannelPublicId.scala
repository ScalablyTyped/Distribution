package typings.kakaoJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelPublicId extends StObject {
  
  var channelPublicId: String
}
object ChannelPublicId {
  
  inline def apply(channelPublicId: String): ChannelPublicId = {
    val __obj = js.Dynamic.literal(channelPublicId = channelPublicId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelPublicId]
  }
  
  extension [Self <: ChannelPublicId](x: Self) {
    
    inline def setChannelPublicId(value: String): Self = StObject.set(x, "channelPublicId", value.asInstanceOf[js.Any])
  }
}
