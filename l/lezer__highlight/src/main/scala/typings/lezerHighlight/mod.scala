package typings.lezerHighlight

import org.scalablytyped.runtime.StringDictionary
import typings.lezerCommon.distTreeMod.NodePropSource
import typings.lezerCommon.distTreeMod.SyntaxNodeRef
import typings.lezerCommon.mod.NodeType
import typings.lezerCommon.mod.Tree
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
  
  /**
  Highlighting tags are markers that denote a highlighting category.
  They are [associated](#highlight.styleTags) with parts of a syntax
  tree by a language mode, and then mapped to an actual CSS style by
  a [highlighter](#highlight.Highlighter).
  Because syntax tree node types and highlight styles have to be
  able to talk the same language, CodeMirror uses a mostly _closed_
  [vocabulary](#highlight.tags) of syntax tags (as opposed to
  traditional open string-based systems, which make it hard for
  highlighting themes to cover all the tokens produced by the
  various languages).
  It _is_ possible to [define](#highlight.Tag^define) your own
  highlighting tags for system-internal use (where you control both
  the language package and the highlighter), but such tags will not
  be picked up by regular highlighters (though you can derive them
  from standard tags to allow highlighters to fall back to those).
  */
  @JSImport("@lezer/highlight", "Tag")
  @js.native
  open class Tag () extends StObject {
    
    /**
      The set of this tag and all its parent tags, starting with
      this one itself and sorted in order of decreasing specificity.
      */
    val set: js.Array[Tag] = js.native
  }
  object Tag {
    
    @JSImport("@lezer/highlight", "Tag")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      Define a new tag. If `parent` is given, the tag is treated as a
      sub-tag of that parent, and
      [highlighters](#highlight.tagHighlighter) that don't mention
      this tag will try to fall back to the parent tag (or grandparent
      tag, etc).
      */
    /* static member */
    inline def define(): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("define")().asInstanceOf[Tag]
    inline def define(parent: Tag): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(parent.asInstanceOf[js.Any]).asInstanceOf[Tag]
    
    /**
      Define a tag _modifier_, which is a function that, given a tag,
      will return a tag that is a subtag of the original. Applying the
      same modifier to a twice tag will return the same value (`m1(t1)
      == m1(t1)`) and applying multiple modifiers will, regardless or
      order, produce the same tag (`m1(m2(t1)) == m2(m1(t1))`).
      
      When multiple modifiers are applied to a given base tag, each
      smaller set of modifiers is registered as a parent, so that for
      example `m1(m2(m3(t1)))` is a subtype of `m1(m2(t1))`,
      `m1(m3(t1)`, and so on.
      */
    /* static member */
    inline def defineModifier(): js.Function1[/* tag */ Tag, Tag] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineModifier")().asInstanceOf[js.Function1[/* tag */ Tag, Tag]]
  }
  
  /**
  This is a highlighter that adds stable, predictable classes to
  tokens, for styling with external CSS.
  The following tags are mapped to their name prefixed with `"tok-"`
  (for example `"tok-comment"`):
  * [`link`](#highlight.tags.link)
  * [`heading`](#highlight.tags.heading)
  * [`emphasis`](#highlight.tags.emphasis)
  * [`strong`](#highlight.tags.strong)
  * [`keyword`](#highlight.tags.keyword)
  * [`atom`](#highlight.tags.atom)
  * [`bool`](#highlight.tags.bool)
  * [`url`](#highlight.tags.url)
  * [`labelName`](#highlight.tags.labelName)
  * [`inserted`](#highlight.tags.inserted)
  * [`deleted`](#highlight.tags.deleted)
  * [`literal`](#highlight.tags.literal)
  * [`string`](#highlight.tags.string)
  * [`number`](#highlight.tags.number)
  * [`variableName`](#highlight.tags.variableName)
  * [`typeName`](#highlight.tags.typeName)
  * [`namespace`](#highlight.tags.namespace)
  * [`className`](#highlight.tags.className)
  * [`macroName`](#highlight.tags.macroName)
  * [`propertyName`](#highlight.tags.propertyName)
  * [`operator`](#highlight.tags.operator)
  * [`comment`](#highlight.tags.comment)
  * [`meta`](#highlight.tags.meta)
  * [`punctuation`](#highlight.tags.punctuation)
  * [`invalid`](#highlight.tags.invalid)
  In addition, these mappings are provided:
  * [`regexp`](#highlight.tags.regexp),
    [`escape`](#highlight.tags.escape), and
    [`special`](#highlight.tags.special)[`(string)`](#highlight.tags.string)
    are mapped to `"tok-string2"`
  * [`special`](#highlight.tags.special)[`(variableName)`](#highlight.tags.variableName)
    to `"tok-variableName2"`
  * [`local`](#highlight.tags.local)[`(variableName)`](#highlight.tags.variableName)
    to `"tok-variableName tok-local"`
  * [`definition`](#highlight.tags.definition)[`(variableName)`](#highlight.tags.variableName)
    to `"tok-variableName tok-definition"`
  * [`definition`](#highlight.tags.definition)[`(propertyName)`](#highlight.tags.propertyName)
    to `"tok-propertyName tok-definition"`
  */
  @JSImport("@lezer/highlight", "classHighlighter")
  @js.native
  val classHighlighter: Highlighter = js.native
  
  /**
  Match a syntax node's [highlight rules](#highlight.styleTags). If
  there's a match, return its set of tags, and whether it is
  opaque (uses a `!`) or applies to all child nodes (`/...`).
  */
  inline def getStyleTags(node: SyntaxNodeRef): Inherit | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyleTags")(node.asInstanceOf[js.Any]).asInstanceOf[Inherit | Null]
  
  inline def highlightTree(
    tree: Tree,
    highlighter: js.Array[Highlighter],
    /**
  Assign styling to a region of the text. Will be called, in order
  of position, for any ranges where more than zero classes apply.
  `classes` is a space separated string of CSS classes.
  */
  putStyle: js.Function3[/* from */ Double, /* to */ Double, /* classes */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightTree")(tree.asInstanceOf[js.Any], highlighter.asInstanceOf[js.Any], putStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def highlightTree(
    tree: Tree,
    highlighter: js.Array[Highlighter],
    /**
  Assign styling to a region of the text. Will be called, in order
  of position, for any ranges where more than zero classes apply.
  `classes` is a space separated string of CSS classes.
  */
  putStyle: js.Function3[/* from */ Double, /* to */ Double, /* classes */ String, Unit],
    /**
  The start of the range to highlight.
  */
  from: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightTree")(tree.asInstanceOf[js.Any], highlighter.asInstanceOf[js.Any], putStyle.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def highlightTree(
    tree: Tree,
    highlighter: js.Array[Highlighter],
    /**
  Assign styling to a region of the text. Will be called, in order
  of position, for any ranges where more than zero classes apply.
  `classes` is a space separated string of CSS classes.
  */
  putStyle: js.Function3[/* from */ Double, /* to */ Double, /* classes */ String, Unit],
    /**
  The start of the range to highlight.
  */
  from: Double,
    /**
  The end of the range.
  */
  to: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightTree")(tree.asInstanceOf[js.Any], highlighter.asInstanceOf[js.Any], putStyle.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def highlightTree(
    tree: Tree,
    highlighter: js.Array[Highlighter],
    /**
  Assign styling to a region of the text. Will be called, in order
  of position, for any ranges where more than zero classes apply.
  `classes` is a space separated string of CSS classes.
  */
  putStyle: js.Function3[/* from */ Double, /* to */ Double, /* classes */ String, Unit],
    /**
  The start of the range to highlight.
  */
  from: Unit,
    /**
  The end of the range.
  */
  to: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightTree")(tree.asInstanceOf[js.Any], highlighter.asInstanceOf[js.Any], putStyle.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
  Highlight the given [tree](#common.Tree) with the given
  [highlighter](#highlight.Highlighter).
  */
  inline def highlightTree(
    tree: Tree,
    highlighter: Highlighter,
    /**
  Assign styling to a region of the text. Will be called, in order
  of position, for any ranges where more than zero classes apply.
  `classes` is a space separated string of CSS classes.
  */
  putStyle: js.Function3[/* from */ Double, /* to */ Double, /* classes */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightTree")(tree.asInstanceOf[js.Any], highlighter.asInstanceOf[js.Any], putStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def highlightTree(
    tree: Tree,
    highlighter: Highlighter,
    /**
  Assign styling to a region of the text. Will be called, in order
  of position, for any ranges where more than zero classes apply.
  `classes` is a space separated string of CSS classes.
  */
  putStyle: js.Function3[/* from */ Double, /* to */ Double, /* classes */ String, Unit],
    /**
  The start of the range to highlight.
  */
  from: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightTree")(tree.asInstanceOf[js.Any], highlighter.asInstanceOf[js.Any], putStyle.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def highlightTree(
    tree: Tree,
    highlighter: Highlighter,
    /**
  Assign styling to a region of the text. Will be called, in order
  of position, for any ranges where more than zero classes apply.
  `classes` is a space separated string of CSS classes.
  */
  putStyle: js.Function3[/* from */ Double, /* to */ Double, /* classes */ String, Unit],
    /**
  The start of the range to highlight.
  */
  from: Double,
    /**
  The end of the range.
  */
  to: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightTree")(tree.asInstanceOf[js.Any], highlighter.asInstanceOf[js.Any], putStyle.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def highlightTree(
    tree: Tree,
    highlighter: Highlighter,
    /**
  Assign styling to a region of the text. Will be called, in order
  of position, for any ranges where more than zero classes apply.
  `classes` is a space separated string of CSS classes.
  */
  putStyle: js.Function3[/* from */ Double, /* to */ Double, /* classes */ String, Unit],
    /**
  The start of the range to highlight.
  */
  from: Unit,
    /**
  The end of the range.
  */
  to: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightTree")(tree.asInstanceOf[js.Any], highlighter.asInstanceOf[js.Any], putStyle.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
  This function is used to add a set of tags to a language syntax
  via [`NodeSet.extend`](#common.NodeSet.extend) or
  [`LRParser.configure`](#lr.LRParser.configure).
  The argument object maps node selectors to [highlighting
  tags](#highlight.Tag) or arrays of tags.
  Node selectors may hold one or more (space-separated) node paths.
  Such a path can be a [node name](#common.NodeType.name), or
  multiple node names (or `*` wildcards) separated by slash
  characters, as in `"Block/Declaration/VariableName"`. Such a path
  matches the final node but only if its direct parent nodes are the
  other nodes mentioned. A `*` in such a path matches any parent,
  but only a single level—wildcards that match multiple parents
  aren't supported, both for efficiency reasons and because Lezer
  trees make it rather hard to reason about what they would match.)
  A path can be ended with `/...` to indicate that the tag assigned
  to the node should also apply to all child nodes, even if they
  match their own style (by default, only the innermost style is
  used).
  When a path ends in `!`, as in `Attribute!`, no further matching
  happens for the node's child nodes, and the entire node gets the
  given style.
  In this notation, node names that contain `/`, `!`, `*`, or `...`
  must be quoted as JSON strings.
  For example:
  ```javascript
  parser.withProps(
    styleTags({
    // Style Number and BigNumber nodes
    "Number BigNumber": tags.number,
    // Style Escape nodes whose parent is String
    "String/Escape": tags.escape,
    // Style anything inside Attributes nodes
    "Attributes!": tags.meta,
    // Add a style to all content inside Italic nodes
    "Italic/...": tags.emphasis,
    // Style InvalidString nodes as both `string` and `invalid`
    "InvalidString": [tags.string, tags.invalid],
    // Style the node named "/" as punctuation
    '"/"': tags.punctuation
    })
  )
  ```
  */
  inline def styleTags(spec: StringDictionary[Tag | js.Array[Tag]]): NodePropSource = ^.asInstanceOf[js.Dynamic].applyDynamic("styleTags")(spec.asInstanceOf[js.Any]).asInstanceOf[NodePropSource]
  
  /**
  Define a [highlighter](#highlight.Highlighter) from an array of
  tag/class pairs. Classes associated with more specific tags will
  take precedence.
  */
  inline def tagHighlighter(tags: js.Array[Class]): Highlighter = ^.asInstanceOf[js.Dynamic].applyDynamic("tagHighlighter")(tags.asInstanceOf[js.Any]).asInstanceOf[Highlighter]
  inline def tagHighlighter(tags: js.Array[Class], options: All): Highlighter = (^.asInstanceOf[js.Dynamic].applyDynamic("tagHighlighter")(tags.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Highlighter]
  
  /**
  The default set of highlighting [tags](#highlight.Tag).
  This collection is heavily biased towards programming languages,
  and necessarily incomplete. A full ontology of syntactic
  constructs would fill a stack of books, and be impractical to
  write themes for. So try to make do with this set. If all else
  fails, [open an
  issue](https://github.com/codemirror/codemirror.next) to propose a
  new tag, or [define](#highlight.Tag^define) a local custom tag for
  your use case.
  Note that it is not obligatory to always attach the most specific
  tag possible to an element—if your grammar can't easily
  distinguish a certain type of element (such as a local variable),
  it is okay to style it as its more general variant (a variable).
  For tags that extend some parent tag, the documentation links to
  the parent.
  */
  object tags {
    
    @JSImport("@lezer/highlight", "tags")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      Angle [brackets](#highlight.tags.bracket) (usually `<` and `>`
      tokens).
      */
    @JSImport("@lezer/highlight", "tags.angleBracket")
    @js.native
    def angleBracket: Tag = js.native
    inline def angleBracket_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("angleBracket")(x.asInstanceOf[js.Any])
    
    /**
      [Metadata](#highlight.tags.meta) that annotates or adds
      attributes to a given syntactic element.
      */
    @JSImport("@lezer/highlight", "tags.annotation")
    @js.native
    def annotation: Tag = js.native
    inline def annotation_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotation")(x.asInstanceOf[js.Any])
    
    /**
      Arithmetic-related [operator](#highlight.tags.operator).
      */
    @JSImport("@lezer/highlight", "tags.arithmeticOperator")
    @js.native
    def arithmeticOperator: Tag = js.native
    inline def arithmeticOperator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arithmeticOperator")(x.asInstanceOf[js.Any])
    
    /**
      A [keyword](#highlight.tags.keyword) denoting some atomic value.
      */
    @JSImport("@lezer/highlight", "tags.atom")
    @js.native
    def atom: Tag = js.native
    inline def atom_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atom")(x.asInstanceOf[js.Any])
    
    /**
      An attribute name (subtag of [`propertyName`](#highlight.tags.propertyName)).
      */
    @JSImport("@lezer/highlight", "tags.attributeName")
    @js.native
    def attributeName: Tag = js.native
    inline def attributeName_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attributeName")(x.asInstanceOf[js.Any])
    
    /**
      An attribute value (subtag of [string](#highlight.tags.string)).
      */
    @JSImport("@lezer/highlight", "tags.attributeValue")
    @js.native
    def attributeValue: Tag = js.native
    inline def attributeValue_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attributeValue")(x.asInstanceOf[js.Any])
    
    /**
      Bit [operator](#highlight.tags.operator).
      */
    @JSImport("@lezer/highlight", "tags.bitwiseOperator")
    @js.native
    def bitwiseOperator: Tag = js.native
    inline def bitwiseOperator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitwiseOperator")(x.asInstanceOf[js.Any])
    
    /**
      A block [comment](#highlight.tags.comment).
      */
    @JSImport("@lezer/highlight", "tags.blockComment")
    @js.native
    def blockComment: Tag = js.native
    inline def blockComment_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blockComment")(x.asInstanceOf[js.Any])
    
    /**
      A boolean [literal](#highlight.tags.literal).
      */
    @JSImport("@lezer/highlight", "tags.bool")
    @js.native
    def bool: Tag = js.native
    inline def bool_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bool")(x.asInstanceOf[js.Any])
    
    /**
      Braces (usually `{` and `}` tokens). Subtag of
      [bracket](#highlight.tags.bracket).
      */
    @JSImport("@lezer/highlight", "tags.brace")
    @js.native
    def brace: Tag = js.native
    inline def brace_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brace")(x.asInstanceOf[js.Any])
    
    /**
      Bracket-style [punctuation](#highlight.tags.punctuation).
      */
    @JSImport("@lezer/highlight", "tags.bracket")
    @js.native
    def bracket: Tag = js.native
    inline def bracket_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bracket")(x.asInstanceOf[js.Any])
    
    /**
      Changed text.
      */
    @JSImport("@lezer/highlight", "tags.changed")
    @js.native
    def changed: Tag = js.native
    inline def changed_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("changed")(x.asInstanceOf[js.Any])
    
    /**
      A character literal (subtag of [string](#highlight.tags.string)).
      */
    @JSImport("@lezer/highlight", "tags.character")
    @js.native
    def character: Tag = js.native
    inline def character_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("character")(x.asInstanceOf[js.Any])
    
    /**
      The [name](#highlight.tags.name) of a class.
      */
    @JSImport("@lezer/highlight", "tags.className")
    @js.native
    def className: Tag = js.native
    inline def className_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /**
      A color [literal](#highlight.tags.literal).
      */
    @JSImport("@lezer/highlight", "tags.color")
    @js.native
    def color: Tag = js.native
    inline def color_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
    
    /**
      A comment.
      */
    @JSImport("@lezer/highlight", "tags.comment")
    @js.native
    def comment: Tag = js.native
    inline def comment_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comment")(x.asInstanceOf[js.Any])
    
    /**
      Comparison [operator](#highlight.tags.operator).
      */
    @JSImport("@lezer/highlight", "tags.compareOperator")
    @js.native
    def compareOperator: Tag = js.native
    inline def compareOperator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compareOperator")(x.asInstanceOf[js.Any])
    
    /**
      [Modifier](#highlight.Tag^defineModifier) that indicates that
      something is constant. Mostly expected to be used with
      [variable names](#highlight.tags.variableName).
      */
    inline def constant(tag: Tag): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("constant")(tag.asInstanceOf[js.Any]).asInstanceOf[Tag]
    
    /**
      Content, for example plain text in XML or markup documents.
      */
    @JSImport("@lezer/highlight", "tags.content")
    @js.native
    def content: Tag = js.native
    
    /**
      A prose separator (such as a horizontal rule).
      */
    @JSImport("@lezer/highlight", "tags.contentSeparator")
    @js.native
    def contentSeparator: Tag = js.native
    inline def contentSeparator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contentSeparator")(x.asInstanceOf[js.Any])
    
    inline def content_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("content")(x.asInstanceOf[js.Any])
    
    /**
      A control-flow related [keyword](#highlight.tags.keyword).
      */
    @JSImport("@lezer/highlight", "tags.controlKeyword")
    @js.native
    def controlKeyword: Tag = js.native
    inline def controlKeyword_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlKeyword")(x.asInstanceOf[js.Any])
    
    /**
      Control-flow [operator](#highlight.tags.operator).
      */
    @JSImport("@lezer/highlight", "tags.controlOperator")
    @js.native
    def controlOperator: Tag = js.native
    inline def controlOperator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("controlOperator")(x.asInstanceOf[js.Any])
    
    /**
      [Modifier](#highlight.Tag^defineModifier) that indicates that a
      given element is being defined. Expected to be used with the
      various [name](#highlight.tags.name) tags.
      */
    inline def definition(tag: Tag): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("definition")(tag.asInstanceOf[js.Any]).asInstanceOf[Tag]
    
    /**
      A [keyword](#highlight.tags.keyword) that defines something.
      */
    @JSImport("@lezer/highlight", "tags.definitionKeyword")
    @js.native
    def definitionKeyword: Tag = js.native
    inline def definitionKeyword_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("definitionKeyword")(x.asInstanceOf[js.Any])
    
    /**
      [Operator](#highlight.tags.operator) that defines something.
      */
    @JSImport("@lezer/highlight", "tags.definitionOperator")
    @js.native
    def definitionOperator: Tag = js.native
    inline def definitionOperator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("definitionOperator")(x.asInstanceOf[js.Any])
    
    /**
      Deleted text.
      */
    @JSImport("@lezer/highlight", "tags.deleted")
    @js.native
    def deleted: Tag = js.native
    inline def deleted_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deleted")(x.asInstanceOf[js.Any])
    
    /**
      An [operator](#highlight.tags.operator) that dereferences something.
      */
    @JSImport("@lezer/highlight", "tags.derefOperator")
    @js.native
    def derefOperator: Tag = js.native
    inline def derefOperator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("derefOperator")(x.asInstanceOf[js.Any])
    
    /**
      A documentation [comment](#highlight.tags.comment).
      */
    @JSImport("@lezer/highlight", "tags.docComment")
    @js.native
    def docComment: Tag = js.native
    inline def docComment_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("docComment")(x.asInstanceOf[js.Any])
    
    /**
      A documentation [string](#highlight.tags.string).
      */
    @JSImport("@lezer/highlight", "tags.docString")
    @js.native
    def docString: Tag = js.native
    inline def docString_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("docString")(x.asInstanceOf[js.Any])
    
    /**
      [Metadata](#highlight.tags.meta) that applies to the entire
      document.
      */
    @JSImport("@lezer/highlight", "tags.documentMeta")
    @js.native
    def documentMeta: Tag = js.native
    inline def documentMeta_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("documentMeta")(x.asInstanceOf[js.Any])
    
    /**
      [Content](#highlight.tags.content) that is emphasized.
      */
    @JSImport("@lezer/highlight", "tags.emphasis")
    @js.native
    def emphasis: Tag = js.native
    inline def emphasis_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emphasis")(x.asInstanceOf[js.Any])
    
    /**
      An escape [literal](#highlight.tags.literal), for example a
      backslash escape in a string.
      */
    @JSImport("@lezer/highlight", "tags.escape")
    @js.native
    def escape: Tag = js.native
    inline def escape_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escape")(x.asInstanceOf[js.Any])
    
    /**
      A floating-point [number](#highlight.tags.number) literal.
      */
    @JSImport("@lezer/highlight", "tags.float")
    @js.native
    def float: Tag = js.native
    inline def float_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("float")(x.asInstanceOf[js.Any])
    
    /**
      [Modifier](#highlight.Tag^defineModifier) used to indicate that
      a [variable](#highlight.tags.variableName) or [property
      name](#highlight.tags.propertyName) is being called or defined
      as a function.
      */
    inline def function(tag: Tag): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("function")(tag.asInstanceOf[js.Any]).asInstanceOf[Tag]
    
    /**
      [Content](#highlight.tags.content) that represents a heading.
      */
    @JSImport("@lezer/highlight", "tags.heading")
    @js.native
    def heading: Tag = js.native
    
    /**
      A level 1 [heading](#highlight.tags.heading).
      */
    @JSImport("@lezer/highlight", "tags.heading1")
    @js.native
    def heading1: Tag = js.native
    inline def heading1_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heading1")(x.asInstanceOf[js.Any])
    
    /**
      A level 2 [heading](#highlight.tags.heading).
      */
    @JSImport("@lezer/highlight", "tags.heading2")
    @js.native
    def heading2: Tag = js.native
    inline def heading2_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heading2")(x.asInstanceOf[js.Any])
    
    /**
      A level 3 [heading](#highlight.tags.heading).
      */
    @JSImport("@lezer/highlight", "tags.heading3")
    @js.native
    def heading3: Tag = js.native
    inline def heading3_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heading3")(x.asInstanceOf[js.Any])
    
    /**
      A level 4 [heading](#highlight.tags.heading).
      */
    @JSImport("@lezer/highlight", "tags.heading4")
    @js.native
    def heading4: Tag = js.native
    inline def heading4_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heading4")(x.asInstanceOf[js.Any])
    
    /**
      A level 5 [heading](#highlight.tags.heading).
      */
    @JSImport("@lezer/highlight", "tags.heading5")
    @js.native
    def heading5: Tag = js.native
    inline def heading5_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heading5")(x.asInstanceOf[js.Any])
    
    /**
      A level 6 [heading](#highlight.tags.heading).
      */
    @JSImport("@lezer/highlight", "tags.heading6")
    @js.native
    def heading6: Tag = js.native
    inline def heading6_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heading6")(x.asInstanceOf[js.Any])
    
    inline def heading_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heading")(x.asInstanceOf[js.Any])
    
    /**
      Inserted text in a change-tracking format.
      */
    @JSImport("@lezer/highlight", "tags.inserted")
    @js.native
    def inserted: Tag = js.native
    inline def inserted_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inserted")(x.asInstanceOf[js.Any])
    
    /**
      An integer [number](#highlight.tags.number) literal.
      */
    @JSImport("@lezer/highlight", "tags.integer")
    @js.native
    def integer: Tag = js.native
    inline def integer_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("integer")(x.asInstanceOf[js.Any])
    
    /**
      An invalid or unsyntactic element.
      */
    @JSImport("@lezer/highlight", "tags.invalid")
    @js.native
    def invalid: Tag = js.native
    inline def invalid_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalid")(x.asInstanceOf[js.Any])
    
    /**
      A language keyword.
      */
    @JSImport("@lezer/highlight", "tags.keyword")
    @js.native
    def keyword: Tag = js.native
    inline def keyword_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyword")(x.asInstanceOf[js.Any])
    
    /**
      A label [name](#highlight.tags.name).
      */
    @JSImport("@lezer/highlight", "tags.labelName")
    @js.native
    def labelName: Tag = js.native
    inline def labelName_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelName")(x.asInstanceOf[js.Any])
    
    /**
      A line [comment](#highlight.tags.comment).
      */
    @JSImport("@lezer/highlight", "tags.lineComment")
    @js.native
    def lineComment: Tag = js.native
    inline def lineComment_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineComment")(x.asInstanceOf[js.Any])
    
    /**
      [Content](#highlight.tags.content) that is part of a link.
      */
    @JSImport("@lezer/highlight", "tags.link")
    @js.native
    def link: Tag = js.native
    inline def link_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("link")(x.asInstanceOf[js.Any])
    
    /**
      [Content](#highlight.tags.content) that represents a list.
      */
    @JSImport("@lezer/highlight", "tags.list")
    @js.native
    def list: Tag = js.native
    inline def list_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("list")(x.asInstanceOf[js.Any])
    
    /**
      A literal value.
      */
    @JSImport("@lezer/highlight", "tags.literal")
    @js.native
    def literal: Tag = js.native
    inline def literal_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("literal")(x.asInstanceOf[js.Any])
    
    /**
      [Modifier](#highlight.Tag^defineModifier) that indicates a given
      [names](#highlight.tags.name) is local to some scope.
      */
    inline def local(tag: Tag): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("local")(tag.asInstanceOf[js.Any]).asInstanceOf[Tag]
    
    /**
      Logical [operator](#highlight.tags.operator).
      */
    @JSImport("@lezer/highlight", "tags.logicOperator")
    @js.native
    def logicOperator: Tag = js.native
    inline def logicOperator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logicOperator")(x.asInstanceOf[js.Any])
    
    /**
      The [name](#highlight.tags.name) of a macro.
      */
    @JSImport("@lezer/highlight", "tags.macroName")
    @js.native
    def macroName: Tag = js.native
    inline def macroName_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("macroName")(x.asInstanceOf[js.Any])
    
    /**
      Metadata or meta-instruction.
      */
    @JSImport("@lezer/highlight", "tags.meta")
    @js.native
    def meta: Tag = js.native
    inline def meta_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("meta")(x.asInstanceOf[js.Any])
    
    /**
      A modifier [keyword](#highlight.tags.keyword).
      */
    @JSImport("@lezer/highlight", "tags.modifier")
    @js.native
    def modifier: Tag = js.native
    inline def modifier_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modifier")(x.asInstanceOf[js.Any])
    
    /**
      A [keyword](#highlight.tags.keyword) related to defining or
      interfacing with modules.
      */
    @JSImport("@lezer/highlight", "tags.moduleKeyword")
    @js.native
    def moduleKeyword: Tag = js.native
    inline def moduleKeyword_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleKeyword")(x.asInstanceOf[js.Any])
    
    /**
      [Content](#highlight.tags.content) that is styled as code or
      monospace.
      */
    @JSImport("@lezer/highlight", "tags.monospace")
    @js.native
    def monospace: Tag = js.native
    inline def monospace_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monospace")(x.asInstanceOf[js.Any])
    
    /**
      Any kind of identifier.
      */
    @JSImport("@lezer/highlight", "tags.name")
    @js.native
    def name: Tag = js.native
    inline def name_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    /**
      A namespace [name](#highlight.tags.name).
      */
    @JSImport("@lezer/highlight", "tags.namespace")
    @js.native
    def namespace: Tag = js.native
    inline def namespace_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("namespace")(x.asInstanceOf[js.Any])
    
    /**
      The [keyword](#highlight.tags.keyword) for null.
      */
    @JSImport("@lezer/highlight", "tags.null")
    @js.native
    val `null`: Tag = js.native
    
    /**
      A number [literal](#highlight.tags.literal).
      */
    @JSImport("@lezer/highlight", "tags.number")
    @js.native
    def number: Tag = js.native
    inline def number_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
    
    /**
      An operator.
      */
    @JSImport("@lezer/highlight", "tags.operator")
    @js.native
    def operator: Tag = js.native
    
    /**
      A [keyword](#highlight.tags.keyword) that acts as an operator.
      */
    @JSImport("@lezer/highlight", "tags.operatorKeyword")
    @js.native
    def operatorKeyword: Tag = js.native
    inline def operatorKeyword_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("operatorKeyword")(x.asInstanceOf[js.Any])
    
    inline def operator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("operator")(x.asInstanceOf[js.Any])
    
    /**
      Parentheses (usually `(` and `)` tokens). Subtag of
      [bracket](#highlight.tags.bracket).
      */
    @JSImport("@lezer/highlight", "tags.paren")
    @js.native
    def paren: Tag = js.native
    inline def paren_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paren")(x.asInstanceOf[js.Any])
    
    /**
      Processing instruction or preprocessor directive. Subtag of
      [meta](#highlight.tags.meta).
      */
    @JSImport("@lezer/highlight", "tags.processingInstruction")
    @js.native
    def processingInstruction: Tag = js.native
    inline def processingInstruction_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("processingInstruction")(x.asInstanceOf[js.Any])
    
    /**
      A property or field [name](#highlight.tags.name).
      */
    @JSImport("@lezer/highlight", "tags.propertyName")
    @js.native
    def propertyName: Tag = js.native
    inline def propertyName_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propertyName")(x.asInstanceOf[js.Any])
    
    /**
      Program or markup punctuation.
      */
    @JSImport("@lezer/highlight", "tags.punctuation")
    @js.native
    def punctuation: Tag = js.native
    inline def punctuation_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("punctuation")(x.asInstanceOf[js.Any])
    
    /**
      [Content](#highlight.tags.content) that represents a quote.
      */
    @JSImport("@lezer/highlight", "tags.quote")
    @js.native
    def quote: Tag = js.native
    inline def quote_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quote")(x.asInstanceOf[js.Any])
    
    /**
      Regular expression [literal](#highlight.tags.literal).
      */
    @JSImport("@lezer/highlight", "tags.regexp")
    @js.native
    def regexp: Tag = js.native
    inline def regexp_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regexp")(x.asInstanceOf[js.Any])
    
    /**
      The [keyword](#highlight.tags.keyword) for the self or this
      object.
      */
    @JSImport("@lezer/highlight", "tags.self")
    @js.native
    def self: Tag = js.native
    inline def self_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /**
      [Punctuation](#highlight.tags.punctuation) that separates
      things.
      */
    @JSImport("@lezer/highlight", "tags.separator")
    @js.native
    def separator: Tag = js.native
    inline def separator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("separator")(x.asInstanceOf[js.Any])
    
    /**
      A generic variant [modifier](#highlight.Tag^defineModifier) that
      can be used to tag language-specific alternative variants of
      some common tag. It is recommended for themes to define special
      forms of at least the [string](#highlight.tags.string) and
      [variable name](#highlight.tags.variableName) tags, since those
      come up a lot.
      */
    inline def special(tag: Tag): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("special")(tag.asInstanceOf[js.Any]).asInstanceOf[Tag]
    
    /**
      Square [brackets](#highlight.tags.bracket) (usually `[` and `]`
      tokens).
      */
    @JSImport("@lezer/highlight", "tags.squareBracket")
    @js.native
    def squareBracket: Tag = js.native
    inline def squareBracket_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("squareBracket")(x.asInstanceOf[js.Any])
    
    /**
      [Modifier](#highlight.Tag^defineModifier) that can be applied to
      [names](#highlight.tags.name) to indicate that they belong to
      the language's standard environment.
      */
    inline def standard(tag: Tag): Tag = ^.asInstanceOf[js.Dynamic].applyDynamic("standard")(tag.asInstanceOf[js.Any]).asInstanceOf[Tag]
    
    /**
      [Content](#highlight.tags.content) that has a strike-through
      style.
      */
    @JSImport("@lezer/highlight", "tags.strikethrough")
    @js.native
    def strikethrough: Tag = js.native
    inline def strikethrough_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strikethrough")(x.asInstanceOf[js.Any])
    
    /**
      A string [literal](#highlight.tags.literal).
      */
    @JSImport("@lezer/highlight", "tags.string")
    @js.native
    def string: Tag = js.native
    inline def string_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
    
    /**
      [Content](#highlight.tags.content) that is styled strong.
      */
    @JSImport("@lezer/highlight", "tags.strong")
    @js.native
    def strong: Tag = js.native
    inline def strong_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strong")(x.asInstanceOf[js.Any])
    
    /**
      A tag name (subtag of [`typeName`](#highlight.tags.typeName)).
      */
    @JSImport("@lezer/highlight", "tags.tagName")
    @js.native
    def tagName: Tag = js.native
    inline def tagName_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tagName")(x.asInstanceOf[js.Any])
    
    /**
      A type [name](#highlight.tags.name).
      */
    @JSImport("@lezer/highlight", "tags.typeName")
    @js.native
    def typeName: Tag = js.native
    inline def typeName_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeName")(x.asInstanceOf[js.Any])
    
    /**
      Type-related [operator](#highlight.tags.operator).
      */
    @JSImport("@lezer/highlight", "tags.typeOperator")
    @js.native
    def typeOperator: Tag = js.native
    inline def typeOperator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeOperator")(x.asInstanceOf[js.Any])
    
    /**
      A [keyword](#highlight.tags.keyword) that represents a unit.
      */
    @JSImport("@lezer/highlight", "tags.unit")
    @js.native
    def unit: Tag = js.native
    inline def unit_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unit")(x.asInstanceOf[js.Any])
    
    /**
      [Operator](#highlight.tags.operator) that updates its operand.
      */
    @JSImport("@lezer/highlight", "tags.updateOperator")
    @js.native
    def updateOperator: Tag = js.native
    inline def updateOperator_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updateOperator")(x.asInstanceOf[js.Any])
    
    /**
      A URL [literal](#highlight.tags.literal).
      */
    @JSImport("@lezer/highlight", "tags.url")
    @js.native
    def url: Tag = js.native
    inline def url_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("url")(x.asInstanceOf[js.Any])
    
    /**
      The [name](#highlight.tags.name) of a variable.
      */
    @JSImport("@lezer/highlight", "tags.variableName")
    @js.native
    def variableName: Tag = js.native
    inline def variableName_=(x: Tag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("variableName")(x.asInstanceOf[js.Any])
  }
  
  /**
  A highlighter defines a mapping from highlighting tags and
  language scopes to CSS class names. They are usually defined via
  [`tagHighlighter`](#highlight.tagHighlighter) or some wrapper
  around that, but it is also possible to implement them from
  scratch.
  */
  trait Highlighter extends StObject {
    
    /**
      When given, the highlighter will only be applied to trees on
      whose [top](#common.NodeType.isTop) node this predicate returns
      true.
      */
    var scope: js.UndefOr[js.Function1[/* node */ NodeType, Boolean]] = js.undefined
    
    /**
      Get the set of classes that should be applied to the given set
      of highlighting tags, or null if this highlighter doesn't assign
      a style to the tags.
      */
    def style(tags: js.Array[Tag]): String | Null
  }
  object Highlighter {
    
    inline def apply(style: js.Array[Tag] => String | Null): Highlighter = {
      val __obj = js.Dynamic.literal(style = js.Any.fromFunction1(style))
      __obj.asInstanceOf[Highlighter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Highlighter] (val x: Self) extends AnyVal {
      
      inline def setScope(value: /* node */ NodeType => Boolean): Self = StObject.set(x, "scope", js.Any.fromFunction1(value))
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setStyle(value: js.Array[Tag] => String | Null): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
    }
  }
}
