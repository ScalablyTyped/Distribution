package typings.jupyterlabUiComponents

import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.button
import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.reset
import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.submit
import typings.react.mod.DOMAttributes
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blueprintMod {
  
  @JSImport("@jupyterlab/ui-components/lib/blueprint", "Button")
  @js.native
  def Button(props: IButtonProps with CommonProps[_]): Element = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/blueprint", "Checkbox")
  @js.native
  def Checkbox(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ICheckboxProps */ js.Any) with CommonProps[_]
  ): Element = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/blueprint", "Collapse")
  @js.native
  def Collapse(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ICollapseProps */ js.Any) with CommonProps[_]
  ): Element = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/blueprint", "InputGroup")
  @js.native
  def InputGroup(props: IInputGroupProps with CommonProps[_]): Element = js.native
  
  @JSImport("@jupyterlab/ui-components/lib/blueprint", "Select")
  @js.native
  def Select(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISelectProps<any> */ js.Any) with CommonProps[_]
  ): Element = js.native
  
  type CommonProps[T] = DOMAttributes[T]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IBPButtonProps * / any */ @js.native
  trait IButtonProps extends StObject {
    
    var title: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[button | submit | reset] = js.native
  }
  object IButtonProps {
    
    @scala.inline
    def apply(): IButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IButtonProps]
    }
    
    @scala.inline
    implicit class IButtonPropsMutableBuilder[Self <: IButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: button | submit | reset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IBPInputGroupProps * / any */ @js.native
  trait IInputGroupProps extends StObject {
    
    var rightIcon: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IIconProps * / any['icon'] */ js.Any
      ] = js.native
  }
  object IInputGroupProps {
    
    @scala.inline
    def apply(): IInputGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInputGroupProps]
    }
    
    @scala.inline
    implicit class IInputGroupPropsMutableBuilder[Self <: IInputGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRightIcon(
        value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IIconProps * / any['icon'] */ js.Any
      ): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
    }
  }
}
