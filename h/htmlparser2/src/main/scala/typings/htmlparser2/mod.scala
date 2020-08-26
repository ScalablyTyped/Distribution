package typings.htmlparser2

import typings.domSerializer.mod.DomSerializerOptions
import typings.domelementtype.anon.Type
import typings.domelementtype.mod.ElementType
import typings.domutils.legacyMod.TestElementOpts
import typings.htmlparser2.anon.DecodeEntities
import typings.htmlparser2.anon.PartialHandler
import typings.htmlparser2.feedHandlerMod.Feed
import typings.htmlparser2.parserMod.ParserOptions
import typings.htmlparser2.tokenizerMod.Callbacks
import typings.htmlparser2.tokenizerMod.default
import typings.std.Element
import typings.std.Error
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("htmlparser2", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CollectingHandler ()
    extends typings.htmlparser2.collectingHandlerMod.CollectingHandler {
    def this(cbs: PartialHandler) = this()
  }
  
  @js.native
  /**
    *
    * @param callback
    * @param options
    */
  class FeedHandler ()
    extends typings.htmlparser2.feedHandlerMod.FeedHandler {
    def this(callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomHandlerOptions */ js.Any) = this()
    def this(callback: js.Function1[/* error */ Error | Null, Unit]) = this()
    def this(
      callback: js.UndefOr[scala.Nothing],
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomHandlerOptions */ js.Any
    ) = this()
    def this(
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomHandlerOptions */ js.Any,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomHandlerOptions */ js.Any
    ) = this()
    def this(
      callback: js.Function1[/* error */ Error | Null, Unit],
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomHandlerOptions */ js.Any
    ) = this()
  }
  
  @js.native
  class Parser ()
    extends typings.htmlparser2.parserMod.Parser {
    def this(cbs: PartialHandler) = this()
    def this(cbs: Null, options: ParserOptions) = this()
    def this(cbs: PartialHandler, options: ParserOptions) = this()
  }
  
  @js.native
  /**
    *
    * @param callback
    * @param options
    */
  class RssHandler ()
    extends typings.htmlparser2.feedHandlerMod.FeedHandler {
    def this(callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomHandlerOptions */ js.Any) = this()
    def this(callback: js.Function1[/* error */ Error | Null, Unit]) = this()
    def this(
      callback: js.UndefOr[scala.Nothing],
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomHandlerOptions */ js.Any
    ) = this()
    def this(
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomHandlerOptions */ js.Any,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomHandlerOptions */ js.Any
    ) = this()
    def this(
      callback: js.Function1[/* error */ Error | Null, Unit],
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomHandlerOptions */ js.Any
    ) = this()
  }
  
  @js.native
  class Tokenizer protected () extends default {
    def this(options: Null, cbs: Callbacks) = this()
    def this(options: DecodeEntities, cbs: Callbacks) = this()
  }
  
  @js.native
  class WritableStream protected ()
    extends typings.htmlparser2.writableStreamMod.WritableStream {
    def this(cbs: PartialHandler) = this()
    def this(cbs: PartialHandler, options: ParserOptions) = this()
  }
  
  def createDomStream(cb: js.Function2[/* error */ Error | Null, /* dom */ js.Array[Node], Unit]): typings.htmlparser2.parserMod.Parser = js.native
  def createDomStream(
    cb: js.Function2[/* error */ Error | Null, /* dom */ js.Array[Node], Unit],
    options: js.UndefOr[scala.Nothing],
    elementCb: js.Function1[/* element */ Element, Unit]
  ): typings.htmlparser2.parserMod.Parser = js.native
  def createDomStream(cb: js.Function2[/* error */ Error | Null, /* dom */ js.Array[Node], Unit], options: Options): typings.htmlparser2.parserMod.Parser = js.native
  def createDomStream(
    cb: js.Function2[/* error */ Error | Null, /* dom */ js.Array[Node], Unit],
    options: Options,
    elementCb: js.Function1[/* element */ Element, Unit]
  ): typings.htmlparser2.parserMod.Parser = js.native
  def parseDOM(data: String): js.Array[Node] = js.native
  def parseDOM(data: String, options: Options): js.Array[Node] = js.native
  def parseFeed(feed: String): js.UndefOr[Feed] = js.native
  def parseFeed(
    feed: String,
    options: ParserOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomHandlerOptions */ js.Any)
  ): js.UndefOr[Feed] = js.native
  @js.native
  object DomUtils extends js.Object {
    def append(elem: Node, next: Node): Unit = js.native
    def appendChild(elem: Element, child: Node): Unit = js.native
    def compareDocumentPosition(nodeA: Node, nodeB: Node): Double = js.native
    def existsOne(test: js.Function1[/* elem */ Element, Boolean], nodes: js.Array[Node]): Boolean = js.native
    def filter(test: js.Function1[/* elem */ Node, Boolean], node: js.Array[Node]): js.Array[Node] = js.native
    def filter(
      test: js.Function1[/* elem */ Node, Boolean],
      node: js.Array[Node],
      recurse: js.UndefOr[scala.Nothing],
      limit: Double
    ): js.Array[Node] = js.native
    def filter(test: js.Function1[/* elem */ Node, Boolean], node: js.Array[Node], recurse: Boolean): js.Array[Node] = js.native
    def filter(
      test: js.Function1[/* elem */ Node, Boolean],
      node: js.Array[Node],
      recurse: Boolean,
      limit: Double
    ): js.Array[Node] = js.native
    def filter(test: js.Function1[/* elem */ Node, Boolean], node: Node): js.Array[Node] = js.native
    def filter(
      test: js.Function1[/* elem */ Node, Boolean],
      node: Node,
      recurse: js.UndefOr[scala.Nothing],
      limit: Double
    ): js.Array[Node] = js.native
    def filter(test: js.Function1[/* elem */ Node, Boolean], node: Node, recurse: Boolean): js.Array[Node] = js.native
    def filter(test: js.Function1[/* elem */ Node, Boolean], node: Node, recurse: Boolean, limit: Double): js.Array[Node] = js.native
    def find(
      test: js.Function1[/* elem */ Node, Boolean],
      nodes: js.Array[Node],
      recurse: Boolean,
      limit: Double
    ): js.Array[Node] = js.native
    def findAll(test: js.Function1[/* elem */ Element, Boolean], nodes: js.Array[Node]): js.Array[Element] = js.native
    def findOne(test: js.Function1[/* elem */ Element, Boolean], nodes: js.Array[Node]): Element | Null = js.native
    def findOne(test: js.Function1[/* elem */ Element, Boolean], nodes: js.Array[Node], recurse: Boolean): Element | Null = js.native
    def findOneChild(test: js.Function1[/* elem */ Node, Boolean], nodes: js.Array[Node]): js.UndefOr[Node] = js.native
    def getAttributeValue(elem: Element, name: String): String = js.native
    def getChildren(elem: Element): js.Array[Node] | Null = js.native
    def getChildren(elem: Node): js.Array[Node] | Null = js.native
    def getElementById(id: String, element: js.Array[Node]): Element | Null = js.native
    def getElementById(id: String, element: js.Array[Node], recurse: Boolean): Element | Null = js.native
    def getElementById(id: String, element: Node): Element | Null = js.native
    def getElementById(id: String, element: Node, recurse: Boolean): Element | Null = js.native
    def getElementById(id: js.Function1[/* id */ String, Boolean], element: js.Array[Node]): Element | Null = js.native
    def getElementById(id: js.Function1[/* id */ String, Boolean], element: js.Array[Node], recurse: Boolean): Element | Null = js.native
    def getElementById(id: js.Function1[/* id */ String, Boolean], element: Node): Element | Null = js.native
    def getElementById(id: js.Function1[/* id */ String, Boolean], element: Node, recurse: Boolean): Element | Null = js.native
    def getElements(options: TestElementOpts, element: js.Array[Node], recurse: Boolean): js.Array[Node] = js.native
    def getElements(options: TestElementOpts, element: js.Array[Node], recurse: Boolean, limit: Double): js.Array[Node] = js.native
    def getElements(options: TestElementOpts, element: Node, recurse: Boolean): js.Array[Node] = js.native
    def getElements(options: TestElementOpts, element: Node, recurse: Boolean, limit: Double): js.Array[Node] = js.native
    def getElementsByTagName(name: String, element: js.Array[Node], recurse: Boolean): js.Array[Element] = js.native
    def getElementsByTagName(name: String, element: js.Array[Node], recurse: Boolean, limit: Double): js.Array[Element] = js.native
    def getElementsByTagName(name: String, element: Node, recurse: Boolean): js.Array[Element] = js.native
    def getElementsByTagName(name: String, element: Node, recurse: Boolean, limit: Double): js.Array[Element] = js.native
    def getElementsByTagName(name: js.Function1[/* name */ String, Boolean], element: js.Array[Node], recurse: Boolean): js.Array[Element] = js.native
    def getElementsByTagName(
      name: js.Function1[/* name */ String, Boolean],
      element: js.Array[Node],
      recurse: Boolean,
      limit: Double
    ): js.Array[Element] = js.native
    def getElementsByTagName(name: js.Function1[/* name */ String, Boolean], element: Node, recurse: Boolean): js.Array[Element] = js.native
    def getElementsByTagName(name: js.Function1[/* name */ String, Boolean], element: Node, recurse: Boolean, limit: Double): js.Array[Element] = js.native
    def getElementsByTagType(`type`: js.Function1[/* type */ ElementType, Boolean], element: js.Array[Node]): js.Array[Node] = js.native
    def getElementsByTagType(
      `type`: js.Function1[/* type */ ElementType, Boolean],
      element: js.Array[Node],
      recurse: js.UndefOr[scala.Nothing],
      limit: Double
    ): js.Array[Node] = js.native
    def getElementsByTagType(`type`: js.Function1[/* type */ ElementType, Boolean], element: js.Array[Node], recurse: Boolean): js.Array[Node] = js.native
    def getElementsByTagType(
      `type`: js.Function1[/* type */ ElementType, Boolean],
      element: js.Array[Node],
      recurse: Boolean,
      limit: Double
    ): js.Array[Node] = js.native
    def getElementsByTagType(`type`: js.Function1[/* type */ ElementType, Boolean], element: Node): js.Array[Node] = js.native
    def getElementsByTagType(
      `type`: js.Function1[/* type */ ElementType, Boolean],
      element: Node,
      recurse: js.UndefOr[scala.Nothing],
      limit: Double
    ): js.Array[Node] = js.native
    def getElementsByTagType(`type`: js.Function1[/* type */ ElementType, Boolean], element: Node, recurse: Boolean): js.Array[Node] = js.native
    def getElementsByTagType(
      `type`: js.Function1[/* type */ ElementType, Boolean],
      element: Node,
      recurse: Boolean,
      limit: Double
    ): js.Array[Node] = js.native
    def getElementsByTagType(`type`: ElementType, element: js.Array[Node]): js.Array[Node] = js.native
    def getElementsByTagType(`type`: ElementType, element: js.Array[Node], recurse: js.UndefOr[scala.Nothing], limit: Double): js.Array[Node] = js.native
    def getElementsByTagType(`type`: ElementType, element: js.Array[Node], recurse: Boolean): js.Array[Node] = js.native
    def getElementsByTagType(`type`: ElementType, element: js.Array[Node], recurse: Boolean, limit: Double): js.Array[Node] = js.native
    def getElementsByTagType(`type`: ElementType, element: Node): js.Array[Node] = js.native
    def getElementsByTagType(`type`: ElementType, element: Node, recurse: js.UndefOr[scala.Nothing], limit: Double): js.Array[Node] = js.native
    def getElementsByTagType(`type`: ElementType, element: Node, recurse: Boolean): js.Array[Node] = js.native
    def getElementsByTagType(`type`: ElementType, element: Node, recurse: Boolean, limit: Double): js.Array[Node] = js.native
    def getInnerHTML(node: Node): String = js.native
    def getInnerHTML(node: Node, options: DomSerializerOptions): String = js.native
    def getName(elem: Element): String = js.native
    def getOuterHTML(node: js.Array[Node]): String = js.native
    def getOuterHTML(node: js.Array[Node], options: DomSerializerOptions): String = js.native
    def getOuterHTML(node: Node): String = js.native
    def getOuterHTML(node: Node, options: DomSerializerOptions): String = js.native
    def getParent(elem: Node): Node | Null = js.native
    def getSiblings(elem: Node): js.Array[Node] | Null = js.native
    def getText(node: js.Array[Node]): String = js.native
    def getText(node: Node): String = js.native
    def hasAttrib(elem: Element, name: String): Boolean = js.native
    def hasChildren(node: Node): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeWithChildren * / any */ Boolean = js.native
    def isCDATA(node: Node): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeWithChildren * / any */ Boolean = js.native
    def isComment(node: Node): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataNode * / any */ Boolean = js.native
    def isTag(node: Node): /* is std.Element */ Boolean = js.native
    def isText(node: Node): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataNode * / any */ Boolean = js.native
    def prepend(elem: Node, prev: Node): Unit = js.native
    def removeElement(elem: Node): Unit = js.native
    def removeSubsets(nodes: js.Array[Node]): js.Array[Node] = js.native
    def replaceElement(elem: Node, replacement: Node): Unit = js.native
    def testElement(options: TestElementOpts, element: Node): Boolean = js.native
    def uniqueSort(nodes: js.Array[Node]): js.Array[Node] = js.native
  }
  
  @js.native
  object EVENTS extends js.Object {
    var attribute: Double = js.native
    var cdataend: Double = js.native
    var cdatastart: Double = js.native
    var closetag: Double = js.native
    var comment: Double = js.native
    var commentend: Double = js.native
    var end: Double = js.native
    var error: Double = js.native
    var opentag: Double = js.native
    var opentagname: Double = js.native
    var processinginstruction: Double = js.native
    var text: Double = js.native
  }
  
  @js.native
  object ElementType extends js.Object {
    val CDATA: String | Double = js.native
    val Comment: String | Double = js.native
    val Directive: String | Double = js.native
    val Doctype: String | Double = js.native
    val Script: String | Double = js.native
    val Style: String | Double = js.native
    val Tag: String | Double = js.native
    val Text: String | Double = js.native
    def isTag(elem: Type): Boolean = js.native
  }
  
  type Options = ParserOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomHandlerOptions */ js.Any)
}

