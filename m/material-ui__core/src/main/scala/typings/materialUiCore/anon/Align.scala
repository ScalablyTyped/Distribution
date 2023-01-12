package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreStrings.`inline`
import typings.materialUiCore.materialUiCoreStrings.block
import typings.materialUiCore.materialUiCoreStrings.error
import typings.materialUiCore.materialUiCoreStrings.inherit
import typings.materialUiCore.materialUiCoreStrings.initial
import typings.materialUiCore.materialUiCoreStrings.primary
import typings.materialUiCore.materialUiCoreStrings.secondary
import typings.materialUiCore.materialUiCoreStrings.textPrimary
import typings.materialUiCore.materialUiCoreStrings.textSecondary
import typings.materialUiCore.mod.PropTypes.Alignment
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Align extends StObject {
  
  var align: js.UndefOr[Alignment] = js.undefined
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var color: js.UndefOr[initial | inherit | primary | secondary | textPrimary | textSecondary | error] = js.undefined
  
  var display: js.UndefOr[initial | block | `inline`] = js.undefined
  
  var gutterBottom: js.UndefOr[Boolean] = js.undefined
  
  var noWrap: js.UndefOr[Boolean] = js.undefined
  
  var paragraph: js.UndefOr[Boolean] = js.undefined
  
  var variant: js.UndefOr[typings.materialUiCore.typographyTypographyMod.Variant | inherit] = js.undefined
  
  var variantMapping: js.UndefOr[PartialRecordVariantstrin] = js.undefined
}
object Align {
  
  inline def apply(): Align = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Align]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: Alignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: initial | inherit | primary | secondary | textPrimary | textSecondary | error): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisplay(value: initial | block | `inline`): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setGutterBottom(value: Boolean): Self = StObject.set(x, "gutterBottom", value.asInstanceOf[js.Any])
    
    inline def setGutterBottomUndefined: Self = StObject.set(x, "gutterBottom", js.undefined)
    
    inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
    
    inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
    
    inline def setParagraph(value: Boolean): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    inline def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
    
    inline def setVariant(value: typings.materialUiCore.typographyTypographyMod.Variant | inherit): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantMapping(value: PartialRecordVariantstrin): Self = StObject.set(x, "variantMapping", value.asInstanceOf[js.Any])
    
    inline def setVariantMappingUndefined: Self = StObject.set(x, "variantMapping", js.undefined)
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
