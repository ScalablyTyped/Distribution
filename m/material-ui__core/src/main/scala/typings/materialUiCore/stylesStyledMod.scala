package typings.materialUiCore

import typings.materialUiCore.anon.ThemeTheme
import typings.materialUiCore.anon.`12`
import typings.materialUiCore.materialUiCoreStrings.className
import typings.materialUiCore.materialUiCoreStrings.classes
import typings.materialUiCore.materialUiCoreStrings.root
import typings.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typings.materialUiStyles.withStylesWithStylesMod.WithStylesOptions
import typings.materialUiTypes.mod.Omit
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.ElementType
import typings.react.mod.global.JSX.LibraryManagedAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesStyledMod {
  
  @JSImport("@material-ui/core/styles/styled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Component /* <: ElementType[Any] */](Component: Component): ComponentCreator[Component] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentCreator[Component]]
  
  type ComponentCreator[Component /* <: ElementType[Any] */] = js.Function2[
    /* styles */ CreateCSSProperties[js.Object] | (js.Function1[/* props */ ThemeTheme[Any], CreateCSSProperties[js.Object]]), 
    /* options */ js.UndefOr[WithStylesOptions[Any]], 
    ComponentType[
      (Omit[
        LibraryManagedAttributes[Component, ComponentProps[Component]], 
        classes | className
      ]) & StyledComponentProps[root] & `12` & (/* import warning: importer.ImportType#apply Failed type conversion: {} extends {  theme :any} ? @material-ui/types.@material-ui/types.Omit<{}, 'theme'> & {  theme :any | undefined} : {} */ js.Any)
    ]
  ]
  
  trait StyledProps extends StObject {
    
    var className: String
  }
  object StyledProps {
    
    inline def apply(className: String): StyledProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyledProps]
    }
    
    extension [Self <: StyledProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    }
  }
}
