package typings.lottieWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLRendererConfig
  extends StObject
     with BaseRendererConfig {
  
  var hideOnTransparent: js.UndefOr[Boolean] = js.undefined
}
object HTMLRendererConfig {
  
  inline def apply(): HTMLRendererConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLRendererConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTMLRendererConfig] (val x: Self) extends AnyVal {
    
    inline def setHideOnTransparent(value: Boolean): Self = StObject.set(x, "hideOnTransparent", value.asInstanceOf[js.Any])
    
    inline def setHideOnTransparentUndefined: Self = StObject.set(x, "hideOnTransparent", js.undefined)
  }
}
