package typings.materialUiCore

import typings.materialUiCore.anon.Ref
import typings.materialUiCore.internalSwitchBaseMod.SwitchBaseProps
import typings.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchSwitchMod {
  
  @JSImport("@material-ui/core/Switch/Switch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: SwitchProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object SwitchClassKey {
    
    inline def checked: "checked" = "checked".asInstanceOf["checked"]
    
    inline def colorPrimary: "colorPrimary" = "colorPrimary".asInstanceOf["colorPrimary"]
    
    inline def colorSecondary: "colorSecondary" = "colorSecondary".asInstanceOf["colorSecondary"]
    
    inline def disabled: "disabled" = "disabled".asInstanceOf["disabled"]
    
    inline def input: "input" = "input".asInstanceOf["input"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def sizeSmall: "sizeSmall" = "sizeSmall".asInstanceOf["sizeSmall"]
    
    inline def switchBase: "switchBase" = "switchBase".asInstanceOf["switchBase"]
    
    inline def thumb: "thumb" = "thumb".asInstanceOf["thumb"]
    
    inline def track: "track" = "track".asInstanceOf["track"]
  }
  type SwitchClassKey = "switchBase" | "colorPrimary" | "colorSecondary" | "sizeSmall" | "thumb" | "track" | "root" | "checked" | "disabled" | "input"
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped @material-ui/core.@material-ui/core/internal/SwitchBase.SwitchBaseProps extends any ? std.Pick<@material-ui/core.@material-ui/core/internal/SwitchBase.SwitchBaseProps, std.Exclude<keyof @material-ui/core.@material-ui/core/internal/SwitchBase.SwitchBaseProps, 'classes' | 'checkedIcon' | 'color' | 'icon'>> : never */ trait SwitchProps
    extends StObject
       with StyledComponentProps[SwitchClassKey]
       with Ref[SwitchBaseProps] {
    
    /**
      * The icon to display when the component is checked.
      */
    var checkedIcon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The color of the component. It supports those theme colors that make sense for this component.
      */
    var color: js.UndefOr["primary" | "secondary" | "default"] = js.undefined
    
    /**
      * If `true`, the switch will be disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The icon to display when the component is unchecked.
      */
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The size of the switch.
      * `small` is equivalent to the dense switch styling.
      */
    var size: js.UndefOr["small" | "medium"] = js.undefined
    
    /**
      * The value of the component. The DOM API casts this to a string.
      * The browser uses "on" as the default value.
      */
    var value: js.UndefOr[Any] = js.undefined
  }
  object SwitchProps {
    
    inline def apply(): SwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchProps]
    }
    
    extension [Self <: SwitchProps](x: Self) {
      
      inline def setCheckedIcon(value: ReactNode): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
      
      inline def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
      
      inline def setColor(value: "primary" | "secondary" | "default"): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setSize(value: "small" | "medium"): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
