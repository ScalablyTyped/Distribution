package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanoProviderOptions extends StObject {
  
  /**
    * If set, the renderer will use technologies (like webgl) that only work when cors headers are appropiately set on the provided images.
    * It is the developer's task to serve the images correctly in combination with this flag, which might otherwise lead to SecurityErrors.
    */
  var cors: js.UndefOr[Boolean] = js.native
}
object PanoProviderOptions {
  
  @scala.inline
  def apply(): PanoProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanoProviderOptions]
  }
  
  @scala.inline
  implicit class PanoProviderOptionsMutableBuilder[Self <: PanoProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCors(value: Boolean): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
  }
}
