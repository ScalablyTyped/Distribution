package typings.kurentoClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfferOptions extends StObject {
  
  var offerToReceiveAudio: js.UndefOr[Boolean] = js.undefined
  
  var offerToReceiveVideo: js.UndefOr[Boolean] = js.undefined
}
object OfferOptions {
  
  inline def apply(): OfferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfferOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OfferOptions] (val x: Self) extends AnyVal {
    
    inline def setOfferToReceiveAudio(value: Boolean): Self = StObject.set(x, "offerToReceiveAudio", value.asInstanceOf[js.Any])
    
    inline def setOfferToReceiveAudioUndefined: Self = StObject.set(x, "offerToReceiveAudio", js.undefined)
    
    inline def setOfferToReceiveVideo(value: Boolean): Self = StObject.set(x, "offerToReceiveVideo", value.asInstanceOf[js.Any])
    
    inline def setOfferToReceiveVideoUndefined: Self = StObject.set(x, "offerToReceiveVideo", js.undefined)
  }
}
