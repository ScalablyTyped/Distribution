package typings.grpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelCredentials extends StObject {
  
  /**
    * Returns a copy of this object with the included set of per-call credentials
    * expanded to include callCredentials.
    * @param callCredentials A CallCredentials object to associate with this
    * instance.
    */
  def compose(callCredentials: CallCredentials): ChannelCredentials
}
object ChannelCredentials {
  
  inline def apply(compose: CallCredentials => ChannelCredentials): ChannelCredentials = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose))
    __obj.asInstanceOf[ChannelCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelCredentials] (val x: Self) extends AnyVal {
    
    inline def setCompose(value: CallCredentials => ChannelCredentials): Self = StObject.set(x, "compose", js.Any.fromFunction1(value))
  }
}
