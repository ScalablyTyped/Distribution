package typings.materialUiCore

import typings.materialUiCore.anon.MuiName
import typings.materialUiCore.anon.StandardPropsnevernever
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactHelpersMod {
  
  @JSImport("@material-ui/core/utils/reactHelpers", "cloneChildrenWithClassName")
  @js.native
  def cloneChildrenWithClassName[T](children: ReactNode, className: String): js.Array[T] = js.native
  
  @JSImport("@material-ui/core/utils/reactHelpers", "isMuiElement")
  @js.native
  def isMuiElement(element: js.Any, muiNames: js.Array[String]): /* is @material-ui/core.@material-ui/core/utils/reactHelpers.NamedMuiElement */ Boolean = js.native
  
  @JSImport("@material-ui/core/utils/reactHelpers", "setRef")
  @js.native
  def setRef[T](): Unit = js.native
  @JSImport("@material-ui/core/utils/reactHelpers", "setRef")
  @js.native
  def setRef[T](ref: js.UndefOr[scala.Nothing], value: T): Unit = js.native
  @JSImport("@material-ui/core/utils/reactHelpers", "setRef")
  @js.native
  def setRef[T](ref: js.Function1[/* instance */ T | Null, Unit]): Unit = js.native
  @JSImport("@material-ui/core/utils/reactHelpers", "setRef")
  @js.native
  def setRef[T](ref: js.Function1[/* instance */ T | Null, Unit], value: T): Unit = js.native
  @JSImport("@material-ui/core/utils/reactHelpers", "setRef")
  @js.native
  def setRef[T](ref: Null, value: T): Unit = js.native
  @JSImport("@material-ui/core/utils/reactHelpers", "setRef")
  @js.native
  def setRef[T](ref: RefObject[T]): Unit = js.native
  @JSImport("@material-ui/core/utils/reactHelpers", "setRef")
  @js.native
  def setRef[T](ref: RefObject[T], value: T): Unit = js.native
  
  type NamedMuiComponent = ComponentType[js.Object] with MuiName
  
  @js.native
  trait NamedMuiElement extends StObject {
    
    var key: String | Double | Null = js.native
    
    var props: StandardPropsnevernever = js.native
    
    var `type`: NamedMuiComponent = js.native
  }
  object NamedMuiElement {
    
    @scala.inline
    def apply(props: StandardPropsnevernever, `type`: NamedMuiComponent): NamedMuiElement = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedMuiElement]
    }
    
    @scala.inline
    implicit class NamedMuiElementMutableBuilder[Self <: NamedMuiElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setProps(value: StandardPropsnevernever): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: NamedMuiComponent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
