package typings.materialUiCore

import typings.materialUiCore.anon.MuiName
import typings.materialUiCore.anon.StandardPropsnevernever
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isMuiElementMod {
  
  @JSImport("@material-ui/core/utils/isMuiElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: Any, muiNames: js.Array[String]): /* is @material-ui/core.@material-ui/core/utils/isMuiElement.NamedMuiElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], muiNames.asInstanceOf[js.Any])).asInstanceOf[/* is @material-ui/core.@material-ui/core/utils/isMuiElement.NamedMuiElement */ Boolean]
  
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
