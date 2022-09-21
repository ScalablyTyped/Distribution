package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreStrings.default
import typings.materialUiCore.materialUiCoreStrings.inherit
import typings.materialUiCore.materialUiCoreStrings.primary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableSticky extends StObject {
  
  var color: js.UndefOr[default | primary | inherit] = js.undefined
  
  var disableGutters: js.UndefOr[Boolean] = js.undefined
  
  var disableSticky: js.UndefOr[Boolean] = js.undefined
  
  var inset: js.UndefOr[Boolean] = js.undefined
}
object DisableSticky {
  
  inline def apply(): DisableSticky = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableSticky]
  }
  
  extension [Self <: DisableSticky](x: Self) {
    
    inline def setColor(value: default | primary | inherit): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisableGutters(value: Boolean): Self = StObject.set(x, "disableGutters", value.asInstanceOf[js.Any])
    
    inline def setDisableGuttersUndefined: Self = StObject.set(x, "disableGutters", js.undefined)
    
    inline def setDisableSticky(value: Boolean): Self = StObject.set(x, "disableSticky", value.asInstanceOf[js.Any])
    
    inline def setDisableStickyUndefined: Self = StObject.set(x, "disableSticky", js.undefined)
    
    inline def setInset(value: Boolean): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
  }
}
