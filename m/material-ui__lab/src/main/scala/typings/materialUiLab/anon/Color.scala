package typings.materialUiLab.anon

import typings.materialUiLab.materialUiLabStrings.`end-ellipsis`
import typings.materialUiLab.materialUiLabStrings.`start-ellipsis`
import typings.materialUiLab.materialUiLabStrings.first
import typings.materialUiLab.materialUiLabStrings.large
import typings.materialUiLab.materialUiLabStrings.last
import typings.materialUiLab.materialUiLabStrings.medium
import typings.materialUiLab.materialUiLabStrings.next
import typings.materialUiLab.materialUiLabStrings.outlined
import typings.materialUiLab.materialUiLabStrings.page
import typings.materialUiLab.materialUiLabStrings.previous
import typings.materialUiLab.materialUiLabStrings.primary
import typings.materialUiLab.materialUiLabStrings.round
import typings.materialUiLab.materialUiLabStrings.rounded
import typings.materialUiLab.materialUiLabStrings.secondary
import typings.materialUiLab.materialUiLabStrings.small
import typings.materialUiLab.materialUiLabStrings.standard
import typings.materialUiLab.materialUiLabStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends StObject {
  
  /**
    * The active color.
    */
  var color: js.UndefOr[standard | primary | secondary] = js.native
  
  /**
    * If `true`, the item will be disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The current page number.
    */
  var page: js.UndefOr[Double] = js.native
  
  /**
    * If `true` the pagination item is selected.
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /**
    * The shape of the pagination item.
    */
  var shape: js.UndefOr[round | rounded] = js.native
  
  /**
    * The size of the pagination item.
    */
  var size: js.UndefOr[small | medium | large] = js.native
  
  /**
    * The type of pagination item.
    */
  var `type`: js.UndefOr[page | first | last | next | previous | `start-ellipsis` | `end-ellipsis`] = js.native
  
  /**
    * The pagination item variant.
    */
  var variant: js.UndefOr[text | outlined] = js.native
}
object Color {
  
  @scala.inline
  def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: standard | primary | secondary): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setShape(value: round | rounded): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: page | first | last | next | previous | `start-ellipsis` | `end-ellipsis`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVariant(value: text | outlined): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
