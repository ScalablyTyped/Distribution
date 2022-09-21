package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMembershipslevelsList
  extends StObject
     with StandardParameters {
  
  /**
    * The *part* parameter specifies the membershipsLevel resource parts that the API response will include. Supported values are id and snippet.
    */
  var part: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceMembershipslevelsList {
  
  inline def apply(): ParamsResourceMembershipslevelsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMembershipslevelsList]
  }
  
  extension [Self <: ParamsResourceMembershipslevelsList](x: Self) {
    
    inline def setPart(value: js.Array[String]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setPartVarargs(value: String*): Self = StObject.set(x, "part", js.Array(value*))
  }
}
