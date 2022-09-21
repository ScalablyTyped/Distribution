package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTML extends StObject {
  
  var Cookie: js.UndefOr[typings.mathjax.MathJax.Cookie] = js.undefined
  
  /*Creates a DOM element of the given type. If attributes is non-null, it is an object that contains key:value
    * pairs of attributes to set for the newly created element. If contents is non-null, it is an HTML snippet that
    * describes the contents to create for the element.
    */
  def Element(`type`: String, attributes: Any, contents: Any): Any
  
  /*Creates a DOM text node with the given text as its content.*/
  def TextNode(text: String): Any
  
  /*Creates a DOM element and appends it to the parent node provided. It is equivalent to:
    * parent.appendChild(MathJax.HTML.Element(type,attributes,content))
    */
  def addElement(parent: Any, `type`: String, attributes: Any, content: Any): Any
  
  /*Creates a DOM text node with the given text and appends it to the parent node.*/
  def addText(parent: Any, text: String): Any
  
  /*Gets the contents of the script element, properly taking into account the browser limitations and bugs.*/
  def getScript(script: String): String
  
  /*Sets the contents of the script element to be the given text, properly taking into account the browser
    * limitations and bugs.
    */
  def setScript(script: String, text: String): Unit
}
object HTML {
  
  inline def apply(
    Element: (String, Any, Any) => Any,
    TextNode: String => Any,
    addElement: (Any, String, Any, Any) => Any,
    addText: (Any, String) => Any,
    getScript: String => String,
    setScript: (String, String) => Unit
  ): HTML = {
    val __obj = js.Dynamic.literal(Element = js.Any.fromFunction3(Element), TextNode = js.Any.fromFunction1(TextNode), addElement = js.Any.fromFunction4(addElement), addText = js.Any.fromFunction2(addText), getScript = js.Any.fromFunction1(getScript), setScript = js.Any.fromFunction2(setScript))
    __obj.asInstanceOf[HTML]
  }
  
  extension [Self <: HTML](x: Self) {
    
    inline def setAddElement(value: (Any, String, Any, Any) => Any): Self = StObject.set(x, "addElement", js.Any.fromFunction4(value))
    
    inline def setAddText(value: (Any, String) => Any): Self = StObject.set(x, "addText", js.Any.fromFunction2(value))
    
    inline def setCookie(value: Cookie): Self = StObject.set(x, "Cookie", value.asInstanceOf[js.Any])
    
    inline def setCookieUndefined: Self = StObject.set(x, "Cookie", js.undefined)
    
    inline def setElement(value: (String, Any, Any) => Any): Self = StObject.set(x, "Element", js.Any.fromFunction3(value))
    
    inline def setGetScript(value: String => String): Self = StObject.set(x, "getScript", js.Any.fromFunction1(value))
    
    inline def setSetScript(value: (String, String) => Unit): Self = StObject.set(x, "setScript", js.Any.fromFunction2(value))
    
    inline def setTextNode(value: String => Any): Self = StObject.set(x, "TextNode", js.Any.fromFunction1(value))
  }
}
