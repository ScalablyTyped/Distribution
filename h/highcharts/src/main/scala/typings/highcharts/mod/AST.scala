package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("highcharts", "AST")
@js.native
open class AST protected () extends StObject {
  /**
    * The AST class represents an abstract syntax tree of HTML or SVG content.
    * It can take HTML as an argument, parse it, optionally transform it to
    * SVG, then perform sanitation before inserting it into the DOM.
    *
    * @param source
    *        Either an HTML string or an ASTNode list to populate the tree.
    */
  def this(source: String) = this()
  def this(source: js.Array[ASTNode]) = this()
  
  /**
    * Add the tree defined as a hierarchical JS structure to the DOM
    *
    * @param parent
    *        The node where it should be added
    *
    * @return The inserted node.
    */
  def addToDOM(parent: HTMLDOMElement): HTMLDOMElement | SVGDOMElement = js.native
  def addToDOM(parent: SVGDOMElement): HTMLDOMElement | SVGDOMElement = js.native
  
  /**
    * Filter an object of SVG or HTML attributes against the allow list.
    *
    * @param attributes
    *        The attributes to filter
    *
    * @return The filtered attributes
    */
  def filterUserAttributes(attributes: SVGAttributes): SVGAttributes = js.native
  
  /**
    * Utility function to set html content for an element by passing in a
    * markup string. The markup is safely parsed by the AST class to avoid XSS
    * vulnerabilities. This function should be used instead of setting
    * `innerHTML` in all cases where the content is not fully trusted.
    *
    * @param el
    *        Node to set content of.
    *
    * @param html
    *        Markup string
    */
  def setElementHTML(el: HTMLDOMElement, html: String): Unit = js.native
  def setElementHTML(el: SVGDOMElement, html: String): Unit = js.native
}
/* static members */
object AST {
  
  @JSImport("highcharts", "AST")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The list of allowed SVG or HTML attributes, used for sanitizing
    * potentially harmful content from the chart configuration before adding to
    * the DOM.
    */
  @JSImport("highcharts", "AST.allowedAttributes")
  @js.native
  def allowedAttributes: js.Array[String] = js.native
  inline def allowedAttributes_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowedAttributes")(x.asInstanceOf[js.Any])
  
  /**
    * The list of allowed references for referring attributes like `href` and
    * `src`. Attribute values will only be allowed if they start with one of
    * these strings.
    */
  @JSImport("highcharts", "AST.allowedReferences")
  @js.native
  def allowedReferences: js.Array[String] = js.native
  inline def allowedReferences_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowedReferences")(x.asInstanceOf[js.Any])
  
  /**
    * The list of allowed SVG or HTML tags, used for sanitizing potentially
    * harmful content from the chart configuration before adding to the DOM.
    */
  @JSImport("highcharts", "AST.allowedTags")
  @js.native
  def allowedTags: js.Array[String] = js.native
  inline def allowedTags_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowedTags")(x.asInstanceOf[js.Any])
  
  /**
    * Allow all custom SVG and HTML attributes, references and tags (together
    * with potentially harmful ones) to be added to the DOM from the chart
    * configuration. In other words, disable the the allow-listing which is the
    * primary functionality of the AST.
    *
    * WARNING: Setting this property to `true` while allowing untrusted user
    * data in the chart configuration will expose your application to XSS
    * security risks!
    *
    * Note that in case you want to allow a known set of tags or attributes,
    * you should allow-list them instead of disabling the filtering totally.
    * See allowedAttributes, allowedReferences and allowedTags. The
    * `bypassHTMLFiltering` setting is intended only for those cases where
    * allow-listing is not practical, and the chart configuration already comes
    * from a secure source.
    */
  @JSImport("highcharts", "AST.bypassHTMLFiltering")
  @js.native
  def bypassHTMLFiltering: Any = js.native
  inline def bypassHTMLFiltering_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bypassHTMLFiltering")(x.asInstanceOf[js.Any])
}
