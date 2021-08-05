package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemapksResource extends StObject {
  
  var variants: VariantsResource
}
object SystemapksResource {
  
  inline def apply(variants: VariantsResource): SystemapksResource = {
    val __obj = js.Dynamic.literal(variants = variants.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemapksResource]
  }
  
  extension [Self <: SystemapksResource](x: Self) {
    
    inline def setVariants(value: VariantsResource): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
  }
}
