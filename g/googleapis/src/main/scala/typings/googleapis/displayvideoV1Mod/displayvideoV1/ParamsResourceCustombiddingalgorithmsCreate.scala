package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustombiddingalgorithmsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCustomBiddingAlgorithm] = js.undefined
}
object ParamsResourceCustombiddingalgorithmsCreate {
  
  inline def apply(): ParamsResourceCustombiddingalgorithmsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustombiddingalgorithmsCreate]
  }
  
  extension [Self <: ParamsResourceCustombiddingalgorithmsCreate](x: Self) {
    
    inline def setRequestBody(value: SchemaCustomBiddingAlgorithm): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
