package typings.kurentoClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseDataChannels extends StObject {
  
  var useDataChannels: js.UndefOr[Boolean] = js.native
}
object UseDataChannels {
  
  @scala.inline
  def apply(): UseDataChannels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseDataChannels]
  }
  
  @scala.inline
  implicit class UseDataChannelsMutableBuilder[Self <: UseDataChannels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseDataChannels(value: Boolean): Self = StObject.set(x, "useDataChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDataChannelsUndefined: Self = StObject.set(x, "useDataChannels", js.undefined)
  }
}
