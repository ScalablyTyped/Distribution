package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreStrings.default
import typings.materialUiCore.materialUiCoreStrings.inherit
import typings.materialUiCore.materialUiCoreStrings.medium
import typings.materialUiCore.materialUiCoreStrings.outlined
import typings.materialUiCore.materialUiCoreStrings.small
import typings.react.mod.EventHandler
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clickable extends StObject {
  
  /**
    * Avatar element.
    */
  var avatar: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * This prop isn't supported.
    * Use the `component` prop if you need to change the children structure.
    */
  var children: js.UndefOr[Null] = js.undefined
  
  /**
    * If `true`, the chip will appear clickable, and will raise when pressed,
    * even if the onClick prop is not defined.
    * If false, the chip will not be clickable, even if onClick prop is defined.
    * This can be used, for example,
    * along with the component prop to indicate an anchor Chip is clickable.
    */
  var clickable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    */
  var color: js.UndefOr[Exclude[typings.materialUiCore.mod.PropTypes.Color, inherit]] = js.undefined
  
  /**
    * Override the default delete icon element. Shown only if `onDelete` is set.
    */
  var deleteIcon: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * If `true`, the chip should be displayed in a disabled state.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Icon element.
    */
  var icon: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The content of the label.
    */
  var label: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * Callback function fired when the delete icon is clicked.
    * If set, the delete icon will be shown.
    */
  var onDelete: js.UndefOr[EventHandler[Any]] = js.undefined
  
  /**
    * The size of the chip.
    */
  var size: js.UndefOr[small | medium] = js.undefined
  
  /**
    * The variant to use.
    */
  var variant: js.UndefOr[default | outlined] = js.undefined
}
object Clickable {
  
  inline def apply(): Clickable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clickable]
  }
  
  extension [Self <: Clickable](x: Self) {
    
    inline def setAvatar(value: ReactElement): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    inline def setColor(value: Exclude[typings.materialUiCore.mod.PropTypes.Color, inherit]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDeleteIcon(value: ReactElement): Self = StObject.set(x, "deleteIcon", value.asInstanceOf[js.Any])
    
    inline def setDeleteIconUndefined: Self = StObject.set(x, "deleteIcon", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOnDelete(value: Any => Unit): Self = StObject.set(x, "onDelete", js.Any.fromFunction1(value))
    
    inline def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
    
    inline def setSize(value: small | medium): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setVariant(value: default | outlined): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
