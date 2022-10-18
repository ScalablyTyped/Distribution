package typings.ltx

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.ltx.anon.TypeofParser
import typings.ltx.anon.TypeofParserInstantiable
import typings.ltx.srcElementMod.Node
import typings.ltx.srcElementMod.default
import typings.ltx.srcParserMod.ParserOptions
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLtxMod {
  
  @JSImport("ltx/lib/ltx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ltx/lib/ltx", "Element")
  @js.native
  open class Element protected ()
    extends typings.ltx.libElementMod.^ {
    def this(name: String) = this()
    def this(name: String, attrs: String) = this()
    def this(name: String, attrs: StringDictionary[Any]) = this()
  }
  
  inline def JSONify(el: String): /* import warning: importer.ImportType#apply Failed type conversion: string extends ltx.ltx/src/Element.default ? ltx.ltx/src/JSONify.ElementJson : string */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("JSONify")(el.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: string extends ltx.ltx/src/Element.default ? ltx.ltx/src/JSONify.ElementJson : string */ js.Any]
  inline def JSONify(el: typings.ltx.srcElementMod.Element): /* import warning: importer.ImportType#apply Failed type conversion: ltx.ltx/src/Element.Element extends ltx.ltx/src/Element.default ? ltx.ltx/src/JSONify.ElementJson : ltx.ltx/src/Element.Element */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("JSONify")(el.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: ltx.ltx/src/Element.Element extends ltx.ltx/src/Element.default ? ltx.ltx/src/JSONify.ElementJson : ltx.ltx/src/Element.Element */ js.Any]
  
  @JSImport("ltx/lib/ltx", "Parser")
  @js.native
  open class Parser ()
    extends typings.ltx.libParserMod.^ {
    def this(options: ParserOptions) = this()
  }
  /* static members */
  object Parser {
    
    @JSImport("ltx/lib/ltx", "Parser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ltx/lib/ltx", "Parser.DefaultElement")
    @js.native
    def DefaultElement: Instantiable2[/* name */ String, /* attrs */ js.UndefOr[String | StringDictionary[Any]], default] = js.native
    inline def DefaultElement_=(
      x: Instantiable2[/* name */ String, /* attrs */ js.UndefOr[String | StringDictionary[Any]], default]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultElement")(x.asInstanceOf[js.Any])
    
    @JSImport("ltx/lib/ltx", "Parser.DefaultParser")
    @js.native
    def DefaultParser: TypeofParser = js.native
    inline def DefaultParser_=(x: TypeofParser): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultParser")(x.asInstanceOf[js.Any])
  }
  
  inline def attrsEqual(a: default, b: default): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("attrsEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def childrenEqual(a: default, b: default): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def clone_(el: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(el.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def clone_(el: typings.ltx.srcElementMod.Element): typings.ltx.srcElementMod.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(el.asInstanceOf[js.Any]).asInstanceOf[typings.ltx.srcElementMod.Element]
  
  inline def createElement(name: String, attrs: String, children: Node*): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[default]
  inline def createElement(name: String, attrs: StringDictionary[Any], children: Node*): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[default]
  inline def createElement(name: String, attrs: Unit, children: Node*): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[default]
  
  inline def equal(a: default, b: default): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def escapeXML(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeXML")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeXMLText(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeXMLText")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isElement(el: Any): /* is ltx.ltx/src/Element.default */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is ltx.ltx/src/Element.default */ Boolean]
  
  inline def isNode(el: Any): /* is ltx.ltx/src/Element.Node */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")(el.asInstanceOf[js.Any]).asInstanceOf[/* is ltx.ltx/src/Element.Node */ Boolean]
  
  inline def isText(el: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isText")(el.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def nameEqual(a: default, b: default): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("nameEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parse(data: String): default = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[default]
  inline def parse(data: String, options: TypeofParserInstantiable): default = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def parse(data: String, options: ParserOptions): default = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[default]
  
  inline def stringify(el: default): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(el.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(el: default, indent: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(el.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(el: default, indent: Double, level: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(el.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(el: default, indent: Unit, level: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(el.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def tag(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof tagString> is not an array type */ args: Parameters[js.Function2[/* literals */ js.Array[String], /* repeated */ String, String]]
  ): default = ^.asInstanceOf[js.Dynamic].applyDynamic("tag")(args.asInstanceOf[js.Any]).asInstanceOf[default]
  
  inline def tagString(literals: js.Array[String], substitutions: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tagString")(scala.List(literals.asInstanceOf[js.Any]).`++`(substitutions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def unescapeXML(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeXML")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unescapeXMLText(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeXMLText")(s.asInstanceOf[js.Any]).asInstanceOf[String]
}
