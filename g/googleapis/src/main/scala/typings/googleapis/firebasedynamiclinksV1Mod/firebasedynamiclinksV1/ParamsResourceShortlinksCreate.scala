package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceShortlinksCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCreateShortDynamicLinkRequest] = js.undefined
}
object ParamsResourceShortlinksCreate {
  
  inline def apply(): ParamsResourceShortlinksCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceShortlinksCreate]
  }
  
  extension [Self <: ParamsResourceShortlinksCreate](x: Self) {
    
    inline def setRequestBody(value: SchemaCreateShortDynamicLinkRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
