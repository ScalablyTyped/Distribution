package typings.jupyterlabUiComponents

import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.button
import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.reset
import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.submit
import typings.react.mod.DOMAttributes
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBlueprintMod {
  
  @JSImport("@jupyterlab/ui-components/lib/blueprint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Button(props: IButtonProps & CommonProps[Any]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Button")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Checkbox(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ICheckboxProps */ Any) & CommonProps[Any]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Checkbox")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Collapse(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ICollapseProps */ Any) & CommonProps[Any]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Collapse")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InputGroup(props: IInputGroupProps & CommonProps[Any]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InputGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Select(
    props: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISelectProps<any> */ Any) & CommonProps[Any]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Select")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type CommonProps[T] = DOMAttributes[T]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IBPButtonProps * / any */ trait IButtonProps extends StObject {
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[button | submit | reset] = js.undefined
  }
  object IButtonProps {
    
    inline def apply(): IButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IButtonProps]
    }
    
    extension [Self <: IButtonProps](x: Self) {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: button | submit | reset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IBPInputGroupProps * / any */ trait IInputGroupProps extends StObject {
    
    var rightIcon: js.UndefOr[String] = js.undefined
  }
  object IInputGroupProps {
    
    inline def apply(): IInputGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInputGroupProps]
    }
    
    extension [Self <: IInputGroupProps](x: Self) {
      
      inline def setRightIcon(value: String): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
      
      inline def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
    }
  }
}
