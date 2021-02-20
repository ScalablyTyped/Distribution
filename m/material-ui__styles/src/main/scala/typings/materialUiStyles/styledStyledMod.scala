package typings.materialUiStyles

import typings.materialUiStyles.anon.ClassName
import typings.materialUiStyles.anon.ThemeTheme
import typings.materialUiStyles.defaultThemeMod.DefaultTheme
import typings.materialUiStyles.materialUiStylesStrings.className
import typings.materialUiStyles.materialUiStylesStrings.classes
import typings.materialUiStyles.materialUiStylesStrings.root
import typings.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typings.materialUiStyles.withStylesWithStylesMod.WithStylesOptions
import typings.materialUiTypes.mod.Omit
import typings.materialUiTypes.mod.Overwrite
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentPropsWithoutRef
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.LibraryManagedAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styledStyledMod {
  
  @JSImport("@material-ui/styles/styled/styled", JSImport.Default)
  @js.native
  def default[Component /* <: ElementType[_] */](Component: Component): ComponentCreator[Component] = js.native
  
  type ComponentCreator[Component /* <: ElementType[_] */] = js.Function2[
    /* styles */ CreateCSSProperties[ComponentPropsWithoutRef[Component]] | (js.Function1[
      /* props */ ThemeTheme[DefaultTheme] with ComponentPropsWithoutRef[Component], 
      CreateCSSProperties[ComponentPropsWithoutRef[Component]]
    ]), 
    /* options */ js.UndefOr[WithStylesOptions[DefaultTheme]], 
    StyledComponent[
      (Omit[
        LibraryManagedAttributes[Component, ComponentProps[Component]], 
        classes | className
      ]) with StyledComponentProps[root] with (Overwrite[ComponentPropsWithoutRef[Component], ClassName[DefaultTheme]])
    ]
  ]
  
  type StyledComponent[P /* <: js.Object */] = js.Function1[/* props */ P, ReactElement | Null]
  
  @js.native
  trait StyledProps extends StObject {
    
    var className: String = js.native
  }
  object StyledProps {
    
    @scala.inline
    def apply(className: String): StyledProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyledProps]
    }
    
    @scala.inline
    implicit class StyledPropsMutableBuilder[Self <: StyledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    }
  }
}
