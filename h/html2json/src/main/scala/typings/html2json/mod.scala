package typings.html2json

import org.scalablytyped.runtime.StringDictionary
import typings.html2json.html2jsonStrings.comment
import typings.html2json.html2jsonStrings.element
import typings.html2json.html2jsonStrings.root
import typings.html2json.html2jsonStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html2json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def html2json(html: String): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("html2json")(html.asInstanceOf[js.Any]).asInstanceOf[Node]
  
  inline def json2html(json: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("json2html")(json.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Node extends StObject {
    
    var attr: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
    
    var child: js.UndefOr[js.Array[Node] | Node] = js.undefined
    
    var node: root | element | text | comment
    
    var tag: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Node {
    
    inline def apply(node: root | element | text | comment): Node = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setAttr(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      inline def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
      
      inline def setChild(value: js.Array[Node] | Node): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      inline def setChildVarargs(value: Node*): Self = StObject.set(x, "child", js.Array(value*))
      
      inline def setNode(value: root | element | text | comment): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
