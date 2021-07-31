package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssetResponse extends StObject {
  
  /** The uploaded asset, if successful. */
  var asset: js.UndefOr[Asset] = js.undefined
}
object CreateAssetResponse {
  
  @scala.inline
  def apply(): CreateAssetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAssetResponse]
  }
  
  @scala.inline
  implicit class CreateAssetResponseMutableBuilder[Self <: CreateAssetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsset(value: Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
  }
}
