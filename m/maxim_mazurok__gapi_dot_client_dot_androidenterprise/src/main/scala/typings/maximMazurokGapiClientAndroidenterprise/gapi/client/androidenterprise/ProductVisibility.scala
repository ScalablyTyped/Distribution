package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductVisibility extends StObject {
  
  /** The product ID to make visible to the user. Required for each item in the productVisibility list. */
  var productId: js.UndefOr[String] = js.undefined
  
  /** Grants the user visibility to the specified product track(s), identified by trackIds. */
  var trackIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Deprecated. Use trackIds instead. */
  var tracks: js.UndefOr[js.Array[String]] = js.undefined
}
object ProductVisibility {
  
  inline def apply(): ProductVisibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductVisibility]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductVisibility] (val x: Self) extends AnyVal {
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setTrackIds(value: js.Array[String]): Self = StObject.set(x, "trackIds", value.asInstanceOf[js.Any])
    
    inline def setTrackIdsUndefined: Self = StObject.set(x, "trackIds", js.undefined)
    
    inline def setTrackIdsVarargs(value: String*): Self = StObject.set(x, "trackIds", js.Array(value*))
    
    inline def setTracks(value: js.Array[String]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: String*): Self = StObject.set(x, "tracks", js.Array(value*))
  }
}
