package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import typings.maximMazurokGapiClientAdsense.anon.AdsAppearOn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomChannel extends StObject {
  
  /** Code of this custom channel, not necessarily unique across ad clients. */
  var code: js.UndefOr[String] = js.undefined
  
  /** Unique identifier of this custom channel. This should be considered an opaque identifier; it is not safe to rely on it being in any particular format. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Kind of resource this is, in this case adsense#customChannel. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Name of this custom channel. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The targeting information of this custom channel, if activated. */
  var targetingInfo: js.UndefOr[AdsAppearOn] = js.undefined
}
object CustomChannel {
  
  @scala.inline
  def apply(): CustomChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomChannel]
  }
  
  @scala.inline
  implicit class CustomChannelMutableBuilder[Self <: CustomChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTargetingInfo(value: AdsAppearOn): Self = StObject.set(x, "targetingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingInfoUndefined: Self = StObject.set(x, "targetingInfo", js.undefined)
  }
}
