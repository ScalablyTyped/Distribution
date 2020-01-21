package typings.ltx

import org.scalablytyped.runtime.StringDictionary
import typings.ltx.elementMod.Node
import typings.ltx.parserMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ltx", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Element protected ()
    extends typings.ltx.elementMod.Element {
    def this(name: String) = this()
    def this(name: String, attrs: String) = this()
    def this(name: String, attrs: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class Parser ()
    extends typings.ltx.parserMod.Parser {
    def this(options: ParserOptions) = this()
  }
  
  def attrsEqual(a: typings.ltx.elementMod.Element, b: typings.ltx.elementMod.Element): Boolean = js.native
  def childrenEqual(a: typings.ltx.elementMod.Element, b: typings.ltx.elementMod.Element): Boolean = js.native
  def clone[T /* <: typings.ltx.elementMod.Element */](el: T): T = js.native
  def createElement(name: String): typings.ltx.elementMod.Element = js.native
  def createElement(name: String, attrs: String, children: Node*): typings.ltx.elementMod.Element = js.native
  def createElement(name: String, attrs: StringDictionary[js.Any], children: Node*): typings.ltx.elementMod.Element = js.native
  def equal(a: typings.ltx.elementMod.Element, b: typings.ltx.elementMod.Element): Boolean = js.native
  def escapeXML(s: String): String = js.native
  def escapeXMLText(s: String): String = js.native
  def isElement(el: js.Any): /* is ltx.ltx/lib/Element.Element */ Boolean = js.native
  def isNode(el: js.Any): /* is ltx.ltx/lib/Element.Node */ Boolean = js.native
  def isText(el: js.Any): /* is string */ Boolean = js.native
  def nameEqual(a: typings.ltx.elementMod.Element, b: typings.ltx.elementMod.Element): Boolean = js.native
  def parse(data: String): typings.ltx.elementMod.Element = js.native
  def parse(data: String, options: typings.ltx.parserMod.Parser): typings.ltx.elementMod.Element = js.native
  def parse(data: String, options: ParserOptions): typings.ltx.elementMod.Element = js.native
  def stringify(el: typings.ltx.elementMod.Element): String = js.native
  def stringify(el: typings.ltx.elementMod.Element, indent: Double): String = js.native
  def stringify(el: typings.ltx.elementMod.Element, indent: Double, level: Double): String = js.native
  def tag(literals: js.Array[String], substitutions: String*): typings.ltx.elementMod.Element = js.native
  def tagString(literals: js.Array[String], substitutions: String*): String = js.native
  def unescapeXML(s: String): String = js.native
  def unescapeXMLText(s: String): String = js.native
}

