package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Ref
import typings.materialUiCore.iconButtonIconButtonMod.IconButtonProps
import typings.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typings.react.mod.ChangeEvent
import typings.react.mod.ComponentType
import typings.react.mod.HTMLInputTypeAttribute
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalSwitchBaseMod extends Shortcut {
  
  @JSImport("@material-ui/core/internal/SwitchBase", JSImport.Default)
  @js.native
  val default: ComponentType[SwitchBaseProps] = js.native
  
  object SwitchBaseClassKey {
    
    inline def checked: "checked" = "checked".asInstanceOf["checked"]
    
    inline def disabled: "disabled" = "disabled".asInstanceOf["disabled"]
    
    inline def input: "input" = "input".asInstanceOf["input"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
  }
  type SwitchBaseClassKey = "root" | "checked" | "disabled" | "input"
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped @material-ui/core.@material-ui/core/IconButton/IconButton.IconButtonProps<@material-ui/core.anon.DefaultComponent['defaultComponent'], {}> extends any ? std.Pick<@material-ui/core.@material-ui/core/IconButton/IconButton.IconButtonProps<@material-ui/core.anon.DefaultComponent['defaultComponent'], {}>, std.Exclude<keyof @material-ui/core.@material-ui/core/IconButton/IconButton.IconButtonProps<@material-ui/core.anon.DefaultComponent['defaultComponent'], {}>, 'classes' | 'children' | 'onChange' | 'type' | 'value'>> : never */ trait SwitchBaseProps
    extends StObject
       with StyledComponentProps[SwitchBaseClassKey]
       with Ref[
          IconButtonProps[
            /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.anon.DefaultComponent['defaultComponent'] */ js.Any, 
            js.Object
          ]
        ] {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the component is checked.
      */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var checkedIcon: ReactNode
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the ripple effect will be disabled.
      */
    var disableRipple: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var icon: ReactNode
    
    /**
      * The id of the `input` element.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * [Attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Attributes) applied to the `input` element.
      */
    var inputProps: js.UndefOr[InputHTMLAttributes[HTMLInputElement]] = js.undefined
    
    /**
      * Pass a ref to the `input` element.
      */
    var inputRef: js.UndefOr[typings.react.mod.Ref[Any]] = js.undefined
    
    /**
      * Name attribute of the `input` element.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Callback fired when the state is changed.
      *
      * @param {object} event The event source of the callback.
      * You can pull out the new value by accessing `event.target.value` (string).
      * You can pull out the new checked state by accessing `event.target.checked` (boolean).
      */
    var onChange: js.UndefOr[
        js.Function2[/* event */ ChangeEvent[HTMLInputElement], /* checked */ Boolean, Unit]
      ] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the `input` element will be required.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[HTMLInputTypeAttribute] = js.undefined
    
    /**
      * The value of the component. The DOM API casts this to a string.
      */
    var value: js.UndefOr[Any] = js.undefined
  }
  object SwitchBaseProps {
    
    inline def apply(): SwitchBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchBaseProps]
    }
    
    extension [Self <: SwitchBaseProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedIcon(value: ReactNode): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
      
      inline def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
      
      inline def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputProps(value: InputHTMLAttributes[HTMLInputElement]): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setInputRef(value: typings.react.mod.Ref[Any]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: (/* event */ ChangeEvent[HTMLInputElement], /* checked */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setType(value: HTMLInputTypeAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ComponentType[SwitchBaseProps]
  
  /* This means you don't have to write `default`, but can instead just say `internalSwitchBaseMod.foo` */
  override def _to: ComponentType[SwitchBaseProps] = default
}
