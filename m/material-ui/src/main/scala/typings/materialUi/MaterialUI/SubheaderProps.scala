package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubheaderProps extends StObject {
  
  var inset: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object SubheaderProps {
  
  @scala.inline
  def apply(): SubheaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubheaderProps]
  }
  
  @scala.inline
  implicit class SubheaderPropsMutableBuilder[Self <: SubheaderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInset(value: Boolean): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
