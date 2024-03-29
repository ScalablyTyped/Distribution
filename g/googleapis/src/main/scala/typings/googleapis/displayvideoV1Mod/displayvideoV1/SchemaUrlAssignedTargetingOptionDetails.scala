package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUrlAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Indicates if this option is being negatively targeted.
    */
  var negative: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The URL, for example `example.com`. DV360 supports two levels of subdirectory targeting, for example `www.example.com/one-subdirectory-level/second-level`, and five levels of subdomain targeting, for example `five.four.three.two.one.example.com`.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaUrlAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaUrlAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaUrlAssignedTargetingOptionDetails](x: Self) {
    
    inline def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setNegativeNull: Self = StObject.set(x, "negative", null)
    
    inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
