package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagedshortlinksCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCreateManagedShortLinkRequest] = js.undefined
}
object ParamsResourceManagedshortlinksCreate {
  
  inline def apply(): ParamsResourceManagedshortlinksCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagedshortlinksCreate]
  }
  
  extension [Self <: ParamsResourceManagedshortlinksCreate](x: Self) {
    
    inline def setRequestBody(value: SchemaCreateManagedShortLinkRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
