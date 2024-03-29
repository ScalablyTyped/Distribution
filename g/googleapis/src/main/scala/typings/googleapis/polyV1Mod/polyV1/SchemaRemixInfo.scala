package typings.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRemixInfo extends StObject {
  
  /**
    * Resource ids for the sources of this remix, of the form: `assets/{ASSET_ID\}`
    */
  var sourceAsset: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaRemixInfo {
  
  inline def apply(): SchemaRemixInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemixInfo]
  }
  
  extension [Self <: SchemaRemixInfo](x: Self) {
    
    inline def setSourceAsset(value: js.Array[String]): Self = StObject.set(x, "sourceAsset", value.asInstanceOf[js.Any])
    
    inline def setSourceAssetNull: Self = StObject.set(x, "sourceAsset", null)
    
    inline def setSourceAssetUndefined: Self = StObject.set(x, "sourceAsset", js.undefined)
    
    inline def setSourceAssetVarargs(value: String*): Self = StObject.set(x, "sourceAsset", js.Array(value*))
  }
}
