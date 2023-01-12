package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreStrings.action
import typings.materialUiCore.materialUiCoreStrings.default
import typings.materialUiCore.materialUiCoreStrings.disabled
import typings.materialUiCore.materialUiCoreStrings.error
import typings.materialUiCore.materialUiCoreStrings.inherit
import typings.materialUiCore.materialUiCoreStrings.large
import typings.materialUiCore.materialUiCoreStrings.medium
import typings.materialUiCore.materialUiCoreStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSize extends StObject {
  
  var color: js.UndefOr[typings.materialUiCore.mod.PropTypes.Color | action | disabled | error] = js.undefined
  
  var fontSize: js.UndefOr[default | inherit | large | medium | small] = js.undefined
}
object FontSize {
  
  inline def apply(): FontSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontSize] (val x: Self) extends AnyVal {
    
    inline def setColor(value: typings.materialUiCore.mod.PropTypes.Color | action | disabled | error): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontSize(value: default | inherit | large | medium | small): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
  }
}
