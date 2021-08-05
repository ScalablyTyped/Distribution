package typings.materialUiCore

import typings.materialUiCore.anon.MuiName
import typings.materialUiCore.anon.StandardPropsnevernever
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactHelpersMod {
  
  @JSImport("@material-ui/core/utils/reactHelpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cloneChildrenWithClassName[T](children: ReactNode, className: String): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneChildrenWithClassName")(children.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def isMuiElement(element: js.Any, muiNames: js.Array[String]): /* is @material-ui/core.@material-ui/core/utils/reactHelpers.NamedMuiElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMuiElement")(element.asInstanceOf[js.Any], muiNames.asInstanceOf[js.Any])).asInstanceOf[/* is @material-ui/core.@material-ui/core/utils/reactHelpers.NamedMuiElement */ Boolean]
  
  inline def setRef[T](): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRef")().asInstanceOf[Unit]
  inline def setRef[T](ref: js.Function1[/* instance */ T | Null, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setRef[T](ref: js.Function1[/* instance */ T | Null, Unit], value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setRef[T](ref: Null, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setRef[T](ref: Unit, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setRef[T](ref: RefObject[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setRef[T](ref: RefObject[T], value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type NamedMuiComponent = ComponentType[js.Object] & MuiName
  
  trait NamedMuiElement extends StObject {
    
    var key: String | Double | Null
    
    var props: StandardPropsnevernever
    
    var `type`: NamedMuiComponent
  }
  object NamedMuiElement {
    
    inline def apply(props: StandardPropsnevernever, `type`: NamedMuiComponent): NamedMuiElement = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedMuiElement]
    }
    
    extension [Self <: NamedMuiElement](x: Self) {
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setProps(value: StandardPropsnevernever): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setType(value: NamedMuiComponent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
