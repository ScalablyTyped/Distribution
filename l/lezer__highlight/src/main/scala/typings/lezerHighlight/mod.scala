package typings.lezerHighlight

import org.scalablytyped.runtime.StringDictionary
import typings.lezerCommon.mod.NodeType
import typings.lezerCommon.mod.Tree
import typings.lezerCommon.treeMod.NodePropSource
import typings.lezerCommon.treeMod.SyntaxNodeRef
import typings.lezerHighlight.anon.All
import typings.lezerHighlight.anon.Class
import typings.lezerHighlight.anon.Inherit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lezer/highlight", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lezer/highlight", "Tag")
  @js.native
  open class Tag () extends StObject {
    
    val set: js.Array[Tag] = js.native
  }
  /* static members */
  object Tag {
    
    @JSImport("@lezer/highlight", "Tag")
    @js.native
    val ^ : js.Any = js.native
    
    inline def define(): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("define")().asInstanceOf[Tag]
    inline def define(parent: Tag): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(parent.asInstanceOf[js.Any]).asInstanceOf[Tag]
    
    inline def defineModifier(): js.Function1[/* tag */ this.type, this.type] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineModifier")().asInstanceOf[js.Function1[/* tag */ this.type, this.type]]
  }
  
  @JSImport("@lezer/highlight", "classHighlighter")
  @js.native
  val classHighlighter: Highlighter = js.native
  
  inline def getStyleTags(node: SyntaxNodeRef): Inherit | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyleTags")(node.asInstanceOf[js.Any]).asInstanceOf[Inherit | Null]
  
  inline def highlightTree(
    tree: Tree,
    highlighter: js.Array[Highlighter],
    putStyle: js.Function3[/* from */ Double, /* to */ Double, /* classes */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightTree")(tree.asInstanceOf[js.Any], highlighter.asInstanceOf[js.Any], putStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def highlightTree(
    tree: Tree,
    highlighter: js.Array[Highlighter],
    putStyle: js.Function3[/* from */ Double, /* to */ Double, /* classes */ String, Unit],
    from: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightTree")(tree.asInstanceOf[js.Any], highlighter.asInstanceOf[js.Any], putStyle.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def highlightTree(
    tree: Tree,
    highlighter: js.Array[Highlighter],
    putStyle: js.Function3[/* from */ Double, /* to */ Double, /* classes */ String, Unit],
    from: Double,
    to: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightTree")(tree.asInstanceOf[js.Any], highlighter.asInstanceOf[js.Any], putStyle.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def highlightTree(
    tree: Tree,
    highlighter: js.Array[Highlighter],
    putStyle: js.Function3[/* from */ Double, /* to */ Double, /* classes */ String, Unit],
    from: Unit,
    to: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightTree")(tree.asInstanceOf[js.Any], highlighter.asInstanceOf[js.Any], putStyle.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def highlightTree(
    tree: Tree,
    highlighter: Highlighter,
    putStyle: js.Function3[/* from */ Double, /* to */ Double, /* classes */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightTree")(tree.asInstanceOf[js.Any], highlighter.asInstanceOf[js.Any], putStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def highlightTree(
    tree: Tree,
    highlighter: Highlighter,
    putStyle: js.Function3[/* from */ Double, /* to */ Double, /* classes */ String, Unit],
    from: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightTree")(tree.asInstanceOf[js.Any], highlighter.asInstanceOf[js.Any], putStyle.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def highlightTree(
    tree: Tree,
    highlighter: Highlighter,
    putStyle: js.Function3[/* from */ Double, /* to */ Double, /* classes */ String, Unit],
    from: Double,
    to: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightTree")(tree.asInstanceOf[js.Any], highlighter.asInstanceOf[js.Any], putStyle.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def highlightTree(
    tree: Tree,
    highlighter: Highlighter,
    putStyle: js.Function3[/* from */ Double, /* to */ Double, /* classes */ String, Unit],
    from: Unit,
    to: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightTree")(tree.asInstanceOf[js.Any], highlighter.asInstanceOf[js.Any], putStyle.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def styleTags(spec: StringDictionary[Tag | js.Array[Tag]]): NodePropSource = ^.asInstanceOf[js.Dynamic].applyDynamic("styleTags")(spec.asInstanceOf[js.Any]).asInstanceOf[NodePropSource]
  
  inline def tagHighlighter(tags: js.Array[Class]): Highlighter = ^.asInstanceOf[js.Dynamic].applyDynamic("tagHighlighter")(tags.asInstanceOf[js.Any]).asInstanceOf[Highlighter]
  inline def tagHighlighter(tags: js.Array[Class], options: All): Highlighter = (^.asInstanceOf[js.Dynamic].applyDynamic("tagHighlighter")(tags.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Highlighter]
  
  object tags {
    
    @JSImport("@lezer/highlight", "tags")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@lezer/highlight", "tags.angleBracket")
    @js.native
    def angleBracket: Tag = js.native
    inline def angleBracket_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("angleBracket")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.annotation")
    @js.native
    def annotation: Tag = js.native
    inline def annotation_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotation")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.arithmeticOperator")
    @js.native
    def arithmeticOperator: Tag = js.native
    inline def arithmeticOperator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arithmeticOperator")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.atom")
    @js.native
    def atom: Tag = js.native
    inline def atom_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atom")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.attributeName")
    @js.native
    def attributeName: Tag = js.native
    inline def attributeName_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attributeName")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.attributeValue")
    @js.native
    def attributeValue: Tag = js.native
    inline def attributeValue_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attributeValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.bitwiseOperator")
    @js.native
    def bitwiseOperator: Tag = js.native
    inline def bitwiseOperator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitwiseOperator")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.blockComment")
    @js.native
    def blockComment: Tag = js.native
    inline def blockComment_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockComment")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.bool")
    @js.native
    def bool: Tag = js.native
    inline def bool_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bool")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.brace")
    @js.native
    def brace: Tag = js.native
    inline def brace_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brace")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.bracket")
    @js.native
    def bracket: Tag = js.native
    inline def bracket_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bracket")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.changed")
    @js.native
    def changed: Tag = js.native
    inline def changed_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("changed")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.character")
    @js.native
    def character: Tag = js.native
    inline def character_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("character")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.className")
    @js.native
    def className: Tag = js.native
    inline def className_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.color")
    @js.native
    def color: Tag = js.native
    inline def color_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.comment")
    @js.native
    def comment: Tag = js.native
    inline def comment_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comment")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.compareOperator")
    @js.native
    def compareOperator: Tag = js.native
    inline def compareOperator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareOperator")(x.asInstanceOf[js.Any])
    
    inline def constant(tag: Tag): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("constant")(tag.asInstanceOf[js.Any]).asInstanceOf[Tag]
    
    @JSImport("@lezer/highlight", "tags.content")
    @js.native
    def content: Tag = js.native
    
    @JSImport("@lezer/highlight", "tags.contentSeparator")
    @js.native
    def contentSeparator: Tag = js.native
    inline def contentSeparator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contentSeparator")(x.asInstanceOf[js.Any])
    
    inline def content_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("content")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.controlKeyword")
    @js.native
    def controlKeyword: Tag = js.native
    inline def controlKeyword_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.controlOperator")
    @js.native
    def controlOperator: Tag = js.native
    inline def controlOperator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlOperator")(x.asInstanceOf[js.Any])
    
    inline def definition(tag: Tag): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("definition")(tag.asInstanceOf[js.Any]).asInstanceOf[Tag]
    
    @JSImport("@lezer/highlight", "tags.definitionKeyword")
    @js.native
    def definitionKeyword: Tag = js.native
    inline def definitionKeyword_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("definitionKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.definitionOperator")
    @js.native
    def definitionOperator: Tag = js.native
    inline def definitionOperator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("definitionOperator")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.deleted")
    @js.native
    def deleted: Tag = js.native
    inline def deleted_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deleted")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.derefOperator")
    @js.native
    def derefOperator: Tag = js.native
    inline def derefOperator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("derefOperator")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.docComment")
    @js.native
    def docComment: Tag = js.native
    inline def docComment_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("docComment")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.docString")
    @js.native
    def docString: Tag = js.native
    inline def docString_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("docString")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.documentMeta")
    @js.native
    def documentMeta: Tag = js.native
    inline def documentMeta_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("documentMeta")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.emphasis")
    @js.native
    def emphasis: Tag = js.native
    inline def emphasis_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emphasis")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.escape")
    @js.native
    def escape: Tag = js.native
    inline def escape_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escape")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.float")
    @js.native
    def float: Tag = js.native
    inline def float_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("float")(x.asInstanceOf[js.Any])
    
    inline def function(tag: Tag): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("function")(tag.asInstanceOf[js.Any]).asInstanceOf[Tag]
    
    @JSImport("@lezer/highlight", "tags.heading")
    @js.native
    def heading: Tag = js.native
    
    @JSImport("@lezer/highlight", "tags.heading1")
    @js.native
    def heading1: Tag = js.native
    inline def heading1_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heading1")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.heading2")
    @js.native
    def heading2: Tag = js.native
    inline def heading2_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heading2")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.heading3")
    @js.native
    def heading3: Tag = js.native
    inline def heading3_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heading3")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.heading4")
    @js.native
    def heading4: Tag = js.native
    inline def heading4_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heading4")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.heading5")
    @js.native
    def heading5: Tag = js.native
    inline def heading5_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heading5")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.heading6")
    @js.native
    def heading6: Tag = js.native
    inline def heading6_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heading6")(x.asInstanceOf[js.Any])
    
    inline def heading_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heading")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.inserted")
    @js.native
    def inserted: Tag = js.native
    inline def inserted_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inserted")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.integer")
    @js.native
    def integer: Tag = js.native
    inline def integer_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("integer")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.invalid")
    @js.native
    def invalid: Tag = js.native
    inline def invalid_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalid")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.keyword")
    @js.native
    def keyword: Tag = js.native
    inline def keyword_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyword")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.labelName")
    @js.native
    def labelName: Tag = js.native
    inline def labelName_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelName")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.lineComment")
    @js.native
    def lineComment: Tag = js.native
    inline def lineComment_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineComment")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.link")
    @js.native
    def link: Tag = js.native
    inline def link_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("link")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.list")
    @js.native
    def list: Tag = js.native
    inline def list_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("list")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.literal")
    @js.native
    def literal: Tag = js.native
    inline def literal_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("literal")(x.asInstanceOf[js.Any])
    
    inline def local(tag: Tag): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("local")(tag.asInstanceOf[js.Any]).asInstanceOf[Tag]
    
    @JSImport("@lezer/highlight", "tags.logicOperator")
    @js.native
    def logicOperator: Tag = js.native
    inline def logicOperator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logicOperator")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.macroName")
    @js.native
    def macroName: Tag = js.native
    inline def macroName_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("macroName")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.meta")
    @js.native
    def meta: Tag = js.native
    inline def meta_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("meta")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.modifier")
    @js.native
    def modifier: Tag = js.native
    inline def modifier_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modifier")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.moduleKeyword")
    @js.native
    def moduleKeyword: Tag = js.native
    inline def moduleKeyword_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.monospace")
    @js.native
    def monospace: Tag = js.native
    inline def monospace_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monospace")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.name")
    @js.native
    def name: Tag = js.native
    inline def name_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.namespace")
    @js.native
    def namespace: Tag = js.native
    inline def namespace_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("namespace")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.null")
    @js.native
    val `null`: Tag = js.native
    
    @JSImport("@lezer/highlight", "tags.number")
    @js.native
    def number: Tag = js.native
    inline def number_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.operator")
    @js.native
    def operator: Tag = js.native
    
    @JSImport("@lezer/highlight", "tags.operatorKeyword")
    @js.native
    def operatorKeyword: Tag = js.native
    inline def operatorKeyword_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("operatorKeyword")(x.asInstanceOf[js.Any])
    
    inline def operator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("operator")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.paren")
    @js.native
    def paren: Tag = js.native
    inline def paren_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paren")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.processingInstruction")
    @js.native
    def processingInstruction: Tag = js.native
    inline def processingInstruction_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("processingInstruction")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.propertyName")
    @js.native
    def propertyName: Tag = js.native
    inline def propertyName_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propertyName")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.punctuation")
    @js.native
    def punctuation: Tag = js.native
    inline def punctuation_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("punctuation")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.quote")
    @js.native
    def quote: Tag = js.native
    inline def quote_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quote")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.regexp")
    @js.native
    def regexp: Tag = js.native
    inline def regexp_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regexp")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.self")
    @js.native
    def self: Tag = js.native
    inline def self_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.separator")
    @js.native
    def separator: Tag = js.native
    inline def separator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("separator")(x.asInstanceOf[js.Any])
    
    inline def special(tag: Tag): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("special")(tag.asInstanceOf[js.Any]).asInstanceOf[Tag]
    
    @JSImport("@lezer/highlight", "tags.squareBracket")
    @js.native
    def squareBracket: Tag = js.native
    inline def squareBracket_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("squareBracket")(x.asInstanceOf[js.Any])
    
    inline def standard(tag: Tag): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("standard")(tag.asInstanceOf[js.Any]).asInstanceOf[Tag]
    
    @JSImport("@lezer/highlight", "tags.strikethrough")
    @js.native
    def strikethrough: Tag = js.native
    inline def strikethrough_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strikethrough")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.string")
    @js.native
    def string: Tag = js.native
    inline def string_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.strong")
    @js.native
    def strong: Tag = js.native
    inline def strong_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strong")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.tagName")
    @js.native
    def tagName: Tag = js.native
    inline def tagName_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tagName")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.typeName")
    @js.native
    def typeName: Tag = js.native
    inline def typeName_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeName")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.typeOperator")
    @js.native
    def typeOperator: Tag = js.native
    inline def typeOperator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeOperator")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.unit")
    @js.native
    def unit: Tag = js.native
    inline def unit_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unit")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.updateOperator")
    @js.native
    def updateOperator: Tag = js.native
    inline def updateOperator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updateOperator")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.url")
    @js.native
    def url: Tag = js.native
    inline def url_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("url")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/highlight", "tags.variableName")
    @js.native
    def variableName: Tag = js.native
    inline def variableName_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("variableName")(x.asInstanceOf[js.Any])
  }
  
  trait Highlighter extends StObject {
    
    var scope: js.UndefOr[js.Function1[/* node */ NodeType, Boolean]] = js.undefined
    
    def style(tags: js.Array[Tag]): String | Null
  }
  object Highlighter {
    
    inline def apply(style: js.Array[Tag] => String | Null): Highlighter = {
      val __obj = js.Dynamic.literal(style = js.Any.fromFunction1(style))
      __obj.asInstanceOf[Highlighter]
    }
    
    extension [Self <: Highlighter](x: Self) {
      
      inline def setScope(value: /* node */ NodeType => Boolean): Self = StObject.set(x, "scope", js.Any.fromFunction1(value))
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setStyle(value: js.Array[Tag] => String | Null): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
    }
  }
}
