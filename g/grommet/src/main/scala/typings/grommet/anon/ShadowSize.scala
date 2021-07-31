package typings.grommet.anon

import typings.grommet.utilsMod.BackgroundType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowSize extends StObject {
  
  var background: js.UndefOr[BackgroundType] = js.undefined
  
  var border: js.UndefOr[Width] = js.undefined
  
  var shadowSize: js.UndefOr[String] = js.undefined
  
  var zIndex: js.UndefOr[String] = js.undefined
}
object ShadowSize {
  
  @scala.inline
  def apply(): ShadowSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowSize]
  }
  
  @scala.inline
  implicit class ShadowSizeMutableBuilder[Self <: ShadowSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: Width): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setShadowSize(value: String): Self = StObject.set(x, "shadowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowSizeUndefined: Self = StObject.set(x, "shadowSize", js.undefined)
    
    @scala.inline
    def setZIndex(value: String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
