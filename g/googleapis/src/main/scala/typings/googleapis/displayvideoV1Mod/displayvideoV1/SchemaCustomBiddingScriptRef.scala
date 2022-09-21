package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomBiddingScriptRef extends StObject {
  
  /**
    * A resource name to be used in media.download to Download the script files. Or media.upload to Upload the script files. Resource names have the format `customBiddingAlgorithms/{custom_bidding_algorithm_id\}/scriptRef/{ref_id\}`.
    */
  var resourceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomBiddingScriptRef {
  
  inline def apply(): SchemaCustomBiddingScriptRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomBiddingScriptRef]
  }
  
  extension [Self <: SchemaCustomBiddingScriptRef](x: Self) {
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
