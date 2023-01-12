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
  
  inline def default(el: String): /* import warning: importer.ImportType#apply Failed type conversion: string extends ltx.ltx/src/Element.default ? ltx.ltx/src/JSONify.ElementJson : string */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: string extends ltx.ltx/src/Element.default ? ltx.ltx/src/JSONify.ElementJson : string */ js.Any]
  inline def default(el: Element): /* import warning: importer.ImportType#apply Failed type conversion: ltx.ltx/src/Element.Element extends ltx.ltx/src/Element.default ? ltx.ltx/src/JSONify.ElementJson : ltx.ltx/src/Element.Element */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(el.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: ltx.ltx/src/Element.Element extends ltx.ltx/src/Element.default ? ltx.ltx/src/JSONify.ElementJson : ltx.ltx/src/Element.Element */ js.Any]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ElementJson] (val x: Self) extends AnyVal {
      
      inline def setAttrs(value: StringDictionary[Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[ElementJson | Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (ElementJson | Node)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
