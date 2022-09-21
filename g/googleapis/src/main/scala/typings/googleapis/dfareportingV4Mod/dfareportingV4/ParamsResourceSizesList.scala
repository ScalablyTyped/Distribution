package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSizesList
  extends StObject
     with StandardParameters {
  
  /**
    * Select only sizes with this height.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Select only IAB standard sizes.
    */
  var iabStandard: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Select only sizes with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * Select only sizes with this width.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ParamsResourceSizesList {
  
  inline def apply(): ParamsResourceSizesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSizesList]
  }
  
  extension [Self <: ParamsResourceSizesList](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIabStandard(value: Boolean): Self = StObject.set(x, "iabStandard", value.asInstanceOf[js.Any])
    
    inline def setIabStandardUndefined: Self = StObject.set(x, "iabStandard", js.undefined)
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
