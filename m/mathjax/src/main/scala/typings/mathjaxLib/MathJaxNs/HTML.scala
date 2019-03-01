package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTML extends js.Object {
  var Cookie: js.UndefOr[Cookie] = js.undefined
  /*Creates a DOM element of the given type. If attributes is non-null, it is an object that contains key:value
    * pairs of attributes to set for the newly created element. If contents is non-null, it is an HTML snippet that
    * describes the contents to create for the element.
    */
  def Element(`type`: java.lang.String, attributes: js.Any, contents: js.Any): js.Any
  /*Creates a DOM text node with the given text as its content.*/
  def TextNode(text: java.lang.String): js.Any
  /*Creates a DOM element and appends it to the parent node provided. It is equivalent to:
    * parent.appendChild(MathJax.HTML.Element(type,attributes,content))
    */
  def addElement(parent: js.Any, `type`: java.lang.String, attributes: js.Any, content: js.Any): js.Any
  /*Creates a DOM text node with the given text and appends it to the parent node.*/
  def addText(parent: js.Any, text: java.lang.String): js.Any
  /*Gets the contents of the script element, properly taking into account the browser limitations and bugs.*/
  def getScript(script: java.lang.String): java.lang.String
  /*Sets the contents of the script element to be the given text, properly taking into account the browser
    * limitations and bugs.
    */
  def setScript(script: java.lang.String, text: java.lang.String): scala.Unit
}

object HTML {
  @scala.inline
  def apply(
    Element: js.Function3[java.lang.String, js.Any, js.Any, js.Any],
    TextNode: js.Function1[java.lang.String, js.Any],
    addElement: js.Function4[js.Any, java.lang.String, js.Any, js.Any, js.Any],
    addText: js.Function2[js.Any, java.lang.String, js.Any],
    getScript: js.Function1[java.lang.String, java.lang.String],
    setScript: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    Cookie: Cookie = null
  ): HTML = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Element")(Element)
    __obj.updateDynamic("TextNode")(TextNode)
    __obj.updateDynamic("addElement")(addElement)
    __obj.updateDynamic("addText")(addText)
    __obj.updateDynamic("getScript")(getScript)
    __obj.updateDynamic("setScript")(setScript)
    if (Cookie != null) __obj.updateDynamic("Cookie")(Cookie)
    __obj.asInstanceOf[HTML]
  }
}

