package typings.maximMazurokGapiClientAdexchangebuyer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AspectRatio extends StObject {
  
  /** The type of aspect ratio. Leave this field blank to match all aspect ratios. */
  var aspectRatio: js.UndefOr[String] = js.undefined
  
  /** The minimum player height in pixels. Leave this field blank to match any player height. */
  var minHeight: js.UndefOr[String] = js.undefined
  
  /** The minimum player width in pixels. Leave this field blank to match any player width. */
  var minWidth: js.UndefOr[String] = js.undefined
}
object AspectRatio {
  
  @scala.inline
  def apply(): AspectRatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AspectRatio]
  }
  
  @scala.inline
  implicit class AspectRatioMutableBuilder[Self <: AspectRatio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspectRatio(value: String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    @scala.inline
    def setMinHeight(value: String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
  }
}
