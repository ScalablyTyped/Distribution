package typings.ltx

import org.scalablytyped.runtime.StringDictionary
import typings.ltx.elementMod.Node
import typings.ltx.parserMod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ltx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ltx", "Element")
  @js.native
  class Element protected ()
    extends typings.ltx.elementMod.Element {
    def this(name: String) = this()
    def this(name: String, attrs: String) = this()
    def this(name: String, attrs: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("ltx", "Parser")
  @js.native
  class Parser ()
    extends typings.ltx.parserMod.Parser {
    def this(options: ParserOptions) = this()
  }
  
  inline def attrsEqual(a: typings.ltx.elementMod.Element, b: typings.ltx.elementMod.Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("attrsEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def childrenEqual(a: typings.ltx.elementMod.Element, b: typings.ltx.elementMod.Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def clone_[T /* <: typings.ltx.elementMod.Element */](el: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(el.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def createElement(name: String, attrs: String, children: Node*): typings.ltx.elementMod.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.ltx.elementMod.Element]
  inline def createElement(name: String, attrs: StringDictionary[js.Any], children: Node*): typings.ltx.elementMod.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.ltx.elementMod.Element]
  inline def createElement(name: String, attrs: Unit, children: Node*): typings.ltx.elementMod.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.ltx.elementMod.Element]
  
  inline def equal(a: typings.ltx.elementMod.Element, b: typings.ltx.elementMod.Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def escapeXML(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeXML")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeXMLText(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeXMLText")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isElement(el: js.Any): /* is ltx.ltx/lib/Element.Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is ltx.ltx/lib/Element.Element */ Boolean]
  
  inline def isNode(el: js.Any): /* is ltx.ltx/lib/Element.Node */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")(el.asInstanceOf[js.Any]).asInstanceOf[/* is ltx.ltx/lib/Element.Node */ Boolean]
  
  inline def isText(el: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isText")(el.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def nameEqual(a: typings.ltx.elementMod.Element, b: typings.ltx.elementMod.Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("nameEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parse(data: String): typings.ltx.elementMod.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[typings.ltx.elementMod.Element]
  inline def parse(data: String, options: typings.ltx.parserMod.Parser): typings.ltx.elementMod.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ltx.elementMod.Element]
  inline def parse(data: String, options: ParserOptions): typings.ltx.elementMod.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ltx.elementMod.Element]
  
  inline def stringify(el: typings.ltx.elementMod.Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(el.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(el: typings.ltx.elementMod.Element, indent: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(el.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(el: typings.ltx.elementMod.Element, indent: Double, level: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(el.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(el: typings.ltx.elementMod.Element, indent: Unit, level: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(el.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def tag(literals: js.Array[String], substitutions: String*): typings.ltx.elementMod.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("tag")(literals.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any])).asInstanceOf[typings.ltx.elementMod.Element]
  
  inline def tagString(literals: js.Array[String], substitutions: String*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("tagString")(literals.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def unescapeXML(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeXML")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unescapeXMLText(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeXMLText")(s.asInstanceOf[js.Any]).asInstanceOf[String]
}
