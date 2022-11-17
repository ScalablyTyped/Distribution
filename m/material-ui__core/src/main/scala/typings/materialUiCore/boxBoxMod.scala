package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiSystem.mod.ComposedStyleFunction
import typings.materialUiSystem.mod.PropsFor
import typings.materialUiSystem.mod.SimpleStyleFunction
import typings.materialUiTypes.mod.Omit
import typings.react.mod.ComponentType
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxBoxMod extends Shortcut {
  
  @JSImport("@material-ui/core/Box/Box", JSImport.Default)
  @js.native
  val default: ComponentType[BoxProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped react.react.HTMLAttributes<std.HTMLElement> extends any ? std.Pick<react.react.HTMLAttributes<std.HTMLElement>, std.Exclude<keyof react.react.HTMLAttributes<std.HTMLElement>, keyof @material-ui/core.@material-ui/core/Box/Box.SystemProps>> : never
  - Dropped @material-ui/core.@material-ui/core/Box/Box.BoxStyleFunction extends @material-ui/system.@material-ui/system.StyleFunction<infer Props> ? Props : never */ trait BoxProps extends StObject {
    
    @JSName("clone")
    var clone_FBoxProps: js.UndefOr[Boolean] = js.undefined
    
    // styled API
    var component: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * @deprecated
      * Use the `sx` prop instead
      */
    var css: js.UndefOr[SystemProps] = js.undefined
    
    // workaround for https://github.com/mui-org/material-ui/pull/15611
    var sx: js.UndefOr[SystemProps] = js.undefined
  }
  object BoxProps {
    
    inline def apply(): BoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxProps]
    }
    
    extension [Self <: BoxProps](x: Self) {
      
      inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setComponent(value: ElementType[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setCss(value: SystemProps): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setSx(value: SystemProps): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    }
  }
  
  type BoxStyleFunction = ComposedStyleFunction[
    js.Tuple10[
      SimpleStyleFunction[
        "border" | "borderTop" | "borderRight" | "borderBottom" | "borderLeft" | "borderColor" | "borderRadius"
      ], 
      SimpleStyleFunction[
        "display" | "displayPrint" | "overflow" | "textOverflow" | "visibility" | "whiteSpace"
      ], 
      SimpleStyleFunction[
        "flexBasis" | "flexDirection" | "flexWrap" | "justifyContent" | "alignItems" | "alignContent" | "order" | "flex" | "flexGrow" | "flexShrink" | "alignSelf" | "justifyItems" | "justifySelf"
      ], 
      SimpleStyleFunction[
        "gridGap" | "gridColumnGap" | "gridRowGap" | "gridColumn" | "gridRow" | "gridAutoFlow" | "gridAutoColumns" | "gridAutoRows" | "gridTemplateColumns" | "gridTemplateRows" | "gridTemplateAreas" | "gridArea"
      ], 
      SimpleStyleFunction["bgcolor" | "color"], 
      SimpleStyleFunction["zIndex" | "position" | "top" | "right" | "bottom" | "left"], 
      SimpleStyleFunction["boxShadow"], 
      SimpleStyleFunction[
        "width" | "maxWidth" | "minWidth" | "height" | "maxHeight" | "minHeight" | "sizeWidth" | "sizeHeight" | "boxSizing"
      ], 
      SimpleStyleFunction[
        "m" | "mt" | "mr" | "mb" | "ml" | "mx" | "my" | "p" | "pt" | "pr" | "pb" | "pl" | "px" | "py" | "margin" | "marginTop" | "marginRight" | "marginBottom" | "marginLeft" | "marginX" | "marginY" | "padding" | "paddingTop" | "paddingRight" | "paddingBottom" | "paddingLeft" | "paddingX" | "paddingY"
      ], 
      SimpleStyleFunction[
        "fontFamily" | "fontSize" | "fontStyle" | "fontWeight" | "letterSpacing" | "lineHeight" | "textAlign"
      ]
    ]
  ]
  
  type ElementProps = Omit[
    HTMLAttributes[HTMLElement], 
    /* keyof @material-ui/core.@material-ui/core/Box/Box.SystemProps */ String
  ]
  
  type SystemProps = PropsFor[BoxStyleFunction]
  
  type _To = ComponentType[BoxProps]
  
  /* This means you don't have to write `default`, but can instead just say `boxBoxMod.foo` */
  override def _to: ComponentType[BoxProps] = default
}
