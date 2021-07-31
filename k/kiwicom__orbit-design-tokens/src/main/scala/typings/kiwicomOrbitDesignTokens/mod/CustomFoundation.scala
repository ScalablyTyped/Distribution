package typings.kiwicomOrbitDesignTokens.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  palette :@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.CustomPalette,   base :@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.CustomBase}> */
trait CustomFoundation extends StObject {
  
  var base: js.UndefOr[CustomBase] = js.undefined
  
  var palette: js.UndefOr[CustomPalette] = js.undefined
}
object CustomFoundation {
  
  @scala.inline
  def apply(): CustomFoundation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFoundation]
  }
  
  @scala.inline
  implicit class CustomFoundationMutableBuilder[Self <: CustomFoundation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: CustomBase): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    @scala.inline
    def setPalette(value: CustomPalette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
  }
}
