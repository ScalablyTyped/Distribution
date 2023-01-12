package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Align
import typings.materialUiCore.materialUiCoreStrings.root
import typings.materialUiCore.materialUiCoreStrings.span
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogContentTextDialogContentTextMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Dialogs](https://mui.com/components/dialogs/)
    *
    * API:
    *
    * - [DialogContentText API](https://mui.com/api/dialog-content-text/)
    * - inherits [Typography API](https://mui.com/api/typography/)
    */
  @JSImport("@material-ui/core/DialogContentText/DialogContentText", JSImport.Default)
  @js.native
  val default: OverridableComponent[DialogContentTextTypeMap[js.Object, span]] = js.native
  
  type DialogContentTextClassKey = root
  
  type DialogContentTextProps[D /* <: ElementType[Any] */, P] = OverrideProps[DialogContentTextTypeMap[P, D], D]
  
  trait DialogContentTextTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: DialogContentTextClassKey
    
    var defaultComponent: D
    
    var props: P & Align
  }
  object DialogContentTextTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: DialogContentTextClassKey, defaultComponent: D, props: P & Align): DialogContentTextTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogContentTextTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogContentTextTypeMap[?, ?], P, D /* <: ElementType[Any] */] (val x: Self & (DialogContentTextTypeMap[P, D])) extends AnyVal {
      
      inline def setClassKey(value: DialogContentTextClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Align): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[DialogContentTextTypeMap[js.Object, span]]
  
  /* This means you don't have to write `default`, but can instead just say `dialogContentTextDialogContentTextMod.foo` */
  override def _to: OverridableComponent[DialogContentTextTypeMap[js.Object, span]] = default
}
