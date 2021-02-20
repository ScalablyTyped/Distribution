package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemapksResource extends StObject {
  
  var variants: VariantsResource = js.native
}
object SystemapksResource {
  
  @scala.inline
  def apply(variants: VariantsResource): SystemapksResource = {
    val __obj = js.Dynamic.literal(variants = variants.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemapksResource]
  }
  
  @scala.inline
  implicit class SystemapksResourceMutableBuilder[Self <: SystemapksResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVariants(value: VariantsResource): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
  }
}
