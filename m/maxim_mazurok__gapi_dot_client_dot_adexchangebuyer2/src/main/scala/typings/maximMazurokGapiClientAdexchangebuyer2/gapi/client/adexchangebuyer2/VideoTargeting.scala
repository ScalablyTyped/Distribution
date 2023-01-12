package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoTargeting extends StObject {
  
  /** A list of video positions to be excluded. Position types can either be included or excluded (XOR). */
  var excludedPositionTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of video positions to be included. When the included list is present, the excluded list must be empty. When the excluded list is present, the included list must be empty. */
  var targetedPositionTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object VideoTargeting {
  
  inline def apply(): VideoTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoTargeting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoTargeting] (val x: Self) extends AnyVal {
    
    inline def setExcludedPositionTypes(value: js.Array[String]): Self = StObject.set(x, "excludedPositionTypes", value.asInstanceOf[js.Any])
    
    inline def setExcludedPositionTypesUndefined: Self = StObject.set(x, "excludedPositionTypes", js.undefined)
    
    inline def setExcludedPositionTypesVarargs(value: String*): Self = StObject.set(x, "excludedPositionTypes", js.Array(value*))
    
    inline def setTargetedPositionTypes(value: js.Array[String]): Self = StObject.set(x, "targetedPositionTypes", value.asInstanceOf[js.Any])
    
    inline def setTargetedPositionTypesUndefined: Self = StObject.set(x, "targetedPositionTypes", js.undefined)
    
    inline def setTargetedPositionTypesVarargs(value: String*): Self = StObject.set(x, "targetedPositionTypes", js.Array(value*))
  }
}
