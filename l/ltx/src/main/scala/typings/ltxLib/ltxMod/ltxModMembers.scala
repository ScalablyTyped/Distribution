package typings
package ltxLib.ltxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ltx", JSImport.Namespace)
@js.native
object ltxModMembers extends js.Object {
  def attrsEqual(a: ltxLib.libElementMod.Element, b: ltxLib.libElementMod.Element): scala.Boolean = js.native
  def childrenEqual(a: ltxLib.libElementMod.Element, b: ltxLib.libElementMod.Element): scala.Boolean = js.native
  def clone[T /* <: ltxLib.libElementMod.Element */](el: T): T = js.native
  def createElement(name: java.lang.String): ltxLib.libElementMod.Element = js.native
  def createElement(name: java.lang.String, attrs: java.lang.String, children: ltxLib.libElementMod.Node*): ltxLib.libElementMod.Element = js.native
  def createElement(
    name: java.lang.String,
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    children: ltxLib.libElementMod.Node*
  ): ltxLib.libElementMod.Element = js.native
  def equal(a: ltxLib.libElementMod.Element, b: ltxLib.libElementMod.Element): scala.Boolean = js.native
  def escapeXML(s: java.lang.String): java.lang.String = js.native
  def escapeXMLText(s: java.lang.String): java.lang.String = js.native
  def isElement(el: js.Any): /* is ltx.ltx/lib/Element.Element */ scala.Boolean = js.native
  def isNode(el: js.Any): /* is ltx.ltx/lib/Element.Node */ scala.Boolean = js.native
  def isText(el: js.Any): /* is string */ scala.Boolean = js.native
  def nameEqual(a: ltxLib.libElementMod.Element, b: ltxLib.libElementMod.Element): scala.Boolean = js.native
  def parse(data: java.lang.String): ltxLib.libElementMod.Element = js.native
  def parse(data: java.lang.String, options: ltxLib.libParserMod.Parser): ltxLib.libElementMod.Element = js.native
  def parse(data: java.lang.String, options: ltxLib.libParserMod.ParserOptions): ltxLib.libElementMod.Element = js.native
  def stringify(el: ltxLib.libElementMod.Element): java.lang.String = js.native
  def stringify(el: ltxLib.libElementMod.Element, indent: scala.Double): java.lang.String = js.native
  def stringify(el: ltxLib.libElementMod.Element, indent: scala.Double, level: scala.Double): java.lang.String = js.native
  def tag(literals: js.Array[java.lang.String], substitutions: java.lang.String*): ltxLib.libElementMod.Element = js.native
  def tagString(literals: js.Array[java.lang.String], substitutions: java.lang.String*): java.lang.String = js.native
  def unescapeXML(s: java.lang.String): java.lang.String = js.native
  def unescapeXMLText(s: java.lang.String): java.lang.String = js.native
}

