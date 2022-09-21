package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCssesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the CSS domain to return.
    */
  var cssDomainId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the managing account. If this parameter is not the same as [cssDomainId](#cssDomainId), then this ID must be a CSS group ID and `cssDomainId` must be the ID of a CSS domain affiliated with this group.
    */
  var cssGroupId: js.UndefOr[String] = js.undefined
}
object ParamsResourceCssesGet {
  
  inline def apply(): ParamsResourceCssesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCssesGet]
  }
  
  extension [Self <: ParamsResourceCssesGet](x: Self) {
    
    inline def setCssDomainId(value: String): Self = StObject.set(x, "cssDomainId", value.asInstanceOf[js.Any])
    
    inline def setCssDomainIdUndefined: Self = StObject.set(x, "cssDomainId", js.undefined)
    
    inline def setCssGroupId(value: String): Self = StObject.set(x, "cssGroupId", value.asInstanceOf[js.Any])
    
    inline def setCssGroupIdUndefined: Self = StObject.set(x, "cssGroupId", js.undefined)
  }
}
