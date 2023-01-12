package typings.grpcGrpcJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channelz extends StObject {
  
  var channelz: V1
}
object Channelz {
  
  inline def apply(channelz: V1): Channelz = {
    val __obj = js.Dynamic.literal(channelz = channelz.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channelz]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Channelz] (val x: Self) extends AnyVal {
    
    inline def setChannelz(value: V1): Self = StObject.set(x, "channelz", value.asInstanceOf[js.Any])
  }
}
