package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseTwoByTwoItem extends StObject {
  
  var channel: js.UndefOr[TopicalExploreFeedResponseChannel] = js.undefined
  
  var igtv: js.UndefOr[TopicalExploreFeedResponseIgtv] = js.undefined
}
object TopicalExploreFeedResponseTwoByTwoItem {
  
  inline def apply(): TopicalExploreFeedResponseTwoByTwoItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicalExploreFeedResponseTwoByTwoItem]
  }
  
  extension [Self <: TopicalExploreFeedResponseTwoByTwoItem](x: Self) {
    
    inline def setChannel(value: TopicalExploreFeedResponseChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setIgtv(value: TopicalExploreFeedResponseIgtv): Self = StObject.set(x, "igtv", value.asInstanceOf[js.Any])
    
    inline def setIgtvUndefined: Self = StObject.set(x, "igtv", js.undefined)
  }
}
