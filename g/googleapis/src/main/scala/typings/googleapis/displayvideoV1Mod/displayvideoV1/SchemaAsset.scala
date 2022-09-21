package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAsset extends StObject {
  
  /**
    * The asset content. For uploaded assets, the content is the serving path.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Media ID of the uploaded asset. This is a unique identifier for the asset. This ID can be passed to other API calls, e.g. CreateCreative to associate the asset with a creative.
    */
  var mediaId: js.UndefOr[String | Null] = js.undefined
}
object SchemaAsset {
  
  inline def apply(): SchemaAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsset]
  }
  
  extension [Self <: SchemaAsset](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setMediaId(value: String): Self = StObject.set(x, "mediaId", value.asInstanceOf[js.Any])
    
    inline def setMediaIdNull: Self = StObject.set(x, "mediaId", null)
    
    inline def setMediaIdUndefined: Self = StObject.set(x, "mediaId", js.undefined)
  }
}
