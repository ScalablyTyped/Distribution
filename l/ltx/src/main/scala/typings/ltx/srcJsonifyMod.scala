package typings.ltx

import org.scalablytyped.runtime.StringDictionary
import typings.ltx.srcElementMod.Element
import typings.ltx.srcElementMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcJsonifyMod {
  
  @JSImport("ltx/src/JSONify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(el: String): String | ElementJson = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any]).asInstanceOf[String | ElementJson]
  inline def default(el: Element): Element | ElementJson = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any]).asInstanceOf[Element | ElementJson]
  
  trait ElementJson extends StObject {
    
    var attrs: StringDictionary[Any]
    
    var children: js.Array[ElementJson | Node]
    
    var name: String
  }
  object ElementJson {
    
    inline def apply(attrs: StringDictionary[Any], children: js.Array[ElementJson | Node], name: String): ElementJson = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementJson]
    }
    
    extension [Self <: ElementJson](x: Self) {
      
      inline def setAttrs(value: StringDictionary[Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[ElementJson | Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (ElementJson | Node)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
