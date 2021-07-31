package typings.heremaps.H.service

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options which are used to initialize the tile provider.
  * @property crossOrigin {boolean=} - The string to be set for the crossOrigin attribute for loaded images
  */
trait TileProviderOptions extends StObject {
  
  var crossOrigin: js.UndefOr[Boolean] = js.undefined
}
object TileProviderOptions {
  
  @scala.inline
  def apply(): TileProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileProviderOptions]
  }
  
  @scala.inline
  implicit class TileProviderOptionsMutableBuilder[Self <: TileProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossOrigin(value: Boolean): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
  }
}
