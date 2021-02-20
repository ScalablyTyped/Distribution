package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTML extends StObject {
  
  var Cookie: js.UndefOr[typings.mathjax.MathJax.Cookie] = js.native
  
  /*Creates a DOM element of the given type. If attributes is non-null, it is an object that contains key:value
    * pairs of attributes to set for the newly created element. If contents is non-null, it is an HTML snippet that
    * describes the contents to create for the element.
    */
  def Element(`type`: String, attributes: js.Any, contents: js.Any): js.Any = js.native
  
  /*Creates a DOM text node with the given text as its content.*/
  def TextNode(text: String): js.Any = js.native
  
  /*Creates a DOM element and appends it to the parent node provided. It is equivalent to:
    * parent.appendChild(MathJax.HTML.Element(type,attributes,content))
    */
  def addElement(parent: js.Any, `type`: String, attributes: js.Any, content: js.Any): js.Any = js.native
  
  /*Creates a DOM text node with the given text and appends it to the parent node.*/
  def addText(parent: js.Any, text: String): js.Any = js.native
  
  /*Gets the contents of the script element, properly taking into account the browser limitations and bugs.*/
  def getScript(script: String): String = js.native
  
  /*Sets the contents of the script element to be the given text, properly taking into account the browser
    * limitations and bugs.
    */
  def setScript(script: String, text: String): Unit = js.native
}
object HTML {
  
  @scala.inline
  def apply(
    Element: (String, js.Any, js.Any) => js.Any,
    TextNode: String => js.Any,
    addElement: (js.Any, String, js.Any, js.Any) => js.Any,
    addText: (js.Any, String) => js.Any,
    getScript: String => String,
    setScript: (String, String) => Unit
  ): HTML = {
    val __obj = js.Dynamic.literal(Element = js.Any.fromFunction3(Element), TextNode = js.Any.fromFunction1(TextNode), addElement = js.Any.fromFunction4(addElement), addText = js.Any.fromFunction2(addText), getScript = js.Any.fromFunction1(getScript), setScript = js.Any.fromFunction2(setScript))
    __obj.asInstanceOf[HTML]
  }
  
  @scala.inline
  implicit class HTMLMutableBuilder[Self <: HTML] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddElement(value: (js.Any, String, js.Any, js.Any) => js.Any): Self = StObject.set(x, "addElement", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAddText(value: (js.Any, String) => js.Any): Self = StObject.set(x, "addText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCookie(value: Cookie): Self = StObject.set(x, "Cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieUndefined: Self = StObject.set(x, "Cookie", js.undefined)
    
    @scala.inline
    def setElement(value: (String, js.Any, js.Any) => js.Any): Self = StObject.set(x, "Element", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetScript(value: String => String): Self = StObject.set(x, "getScript", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetScript(value: (String, String) => Unit): Self = StObject.set(x, "setScript", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTextNode(value: String => js.Any): Self = StObject.set(x, "TextNode", js.Any.fromFunction1(value))
  }
}
