package typings.htmlparser2

import typings.domSerializer.mod.DomSerializerOptions
import typings.domelementtype.anon.TypeElementType
import typings.domelementtype.mod.ElementType
import typings.domhandler.libNodeMod.AnyNode
import typings.domhandler.libNodeMod.ChildNode
import typings.domhandler.libNodeMod.Node
import typings.domhandler.libNodeMod.ParentNode
import typings.domhandler.mod.Callback
import typings.domhandler.mod.Document
import typings.domhandler.mod.DomHandlerOptions
import typings.domhandler.mod.Element
import typings.domhandler.mod.ElementCallback
import typings.domutils.libFeedsMod.Feed
import typings.domutils.libLegacyMod.TestElementOpts
import typings.htmlparser2.anon.DecodeEntities
import typings.htmlparser2.anon.PartialHandler
import typings.htmlparser2.libParserMod.ParserOptions
import typings.htmlparser2.libTokenizerMod.Callbacks
import typings.htmlparser2.libTokenizerMod.default
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("htmlparser2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("htmlparser2", "DefaultHandler")
  @js.native
  /**
    * @param callback Called once parsing has completed.
    * @param options Settings for the handler.
    * @param elementCB Callback whenever a tag is closed.
    */
  open class DefaultHandler ()
    extends typings.domhandler.mod.DomHandler {
    def this(callback: Callback) = this()
    def this(callback: Null, options: DomHandlerOptions) = this()
    def this(callback: Unit, options: DomHandlerOptions) = this()
    def this(callback: Callback, options: DomHandlerOptions) = this()
    def this(callback: Null, options: Null, elementCB: ElementCallback) = this()
    def this(callback: Null, options: Unit, elementCB: ElementCallback) = this()
    def this(callback: Null, options: DomHandlerOptions, elementCB: ElementCallback) = this()
    def this(callback: Unit, options: Null, elementCB: ElementCallback) = this()
    def this(callback: Unit, options: Unit, elementCB: ElementCallback) = this()
    def this(callback: Unit, options: DomHandlerOptions, elementCB: ElementCallback) = this()
    def this(callback: Callback, options: Null, elementCB: ElementCallback) = this()
    def this(callback: Callback, options: Unit, elementCB: ElementCallback) = this()
    def this(callback: Callback, options: DomHandlerOptions, elementCB: ElementCallback) = this()
  }
  
  @JSImport("htmlparser2", "DomHandler")
  @js.native
  /**
    * @param callback Called once parsing has completed.
    * @param options Settings for the handler.
    * @param elementCB Callback whenever a tag is closed.
    */
  open class DomHandler ()
    extends typings.domhandler.mod.DomHandler {
    def this(callback: Callback) = this()
    def this(callback: Null, options: DomHandlerOptions) = this()
    def this(callback: Unit, options: DomHandlerOptions) = this()
    def this(callback: Callback, options: DomHandlerOptions) = this()
    def this(callback: Null, options: Null, elementCB: ElementCallback) = this()
    def this(callback: Null, options: Unit, elementCB: ElementCallback) = this()
    def this(callback: Null, options: DomHandlerOptions, elementCB: ElementCallback) = this()
    def this(callback: Unit, options: Null, elementCB: ElementCallback) = this()
    def this(callback: Unit, options: Unit, elementCB: ElementCallback) = this()
    def this(callback: Unit, options: DomHandlerOptions, elementCB: ElementCallback) = this()
    def this(callback: Callback, options: Null, elementCB: ElementCallback) = this()
    def this(callback: Callback, options: Unit, elementCB: ElementCallback) = this()
    def this(callback: Callback, options: DomHandlerOptions, elementCB: ElementCallback) = this()
  }
  
  object DomUtils {
    
    @JSImport("htmlparser2", "DomUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def append(elem: ChildNode, next: ChildNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(elem.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def appendChild(elem: Element, child: ChildNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendChild")(elem.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def compareDocumentPosition(nodeA: AnyNode, nodeB: AnyNode): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDocumentPosition")(nodeA.asInstanceOf[js.Any], nodeB.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def existsOne(test: js.Function1[/* elem */ Element, Boolean], nodes: js.Array[AnyNode]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("existsOne")(test.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def filter(test: js.Function1[/* elem */ AnyNode, Boolean], node: js.Array[AnyNode]): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(test.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def filter(test: js.Function1[/* elem */ AnyNode, Boolean], node: js.Array[AnyNode], recurse: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(test.asInstanceOf[js.Any], node.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def filter(
      test: js.Function1[/* elem */ AnyNode, Boolean],
      node: js.Array[AnyNode],
      recurse: Boolean,
      limit: Double
    ): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(test.asInstanceOf[js.Any], node.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def filter(
      test: js.Function1[/* elem */ AnyNode, Boolean],
      node: js.Array[AnyNode],
      recurse: Unit,
      limit: Double
    ): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(test.asInstanceOf[js.Any], node.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def filter(test: js.Function1[/* elem */ AnyNode, Boolean], node: AnyNode): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(test.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def filter(test: js.Function1[/* elem */ AnyNode, Boolean], node: AnyNode, recurse: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(test.asInstanceOf[js.Any], node.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def filter(test: js.Function1[/* elem */ AnyNode, Boolean], node: AnyNode, recurse: Boolean, limit: Double): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(test.asInstanceOf[js.Any], node.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def filter(test: js.Function1[/* elem */ AnyNode, Boolean], node: AnyNode, recurse: Unit, limit: Double): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(test.asInstanceOf[js.Any], node.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    
    inline def find(
      test: js.Function1[/* elem */ AnyNode, Boolean],
      nodes: js.Array[AnyNode],
      recurse: Boolean,
      limit: Double
    ): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(test.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    
    inline def findAll(test: js.Function1[/* elem */ Element, Boolean], nodes: js.Array[AnyNode]): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAll")(test.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    
    inline def findOne(test: js.Function1[/* elem */ Element, Boolean], nodes: js.Array[AnyNode]): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(test.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def findOne(test: js.Function1[/* elem */ Element, Boolean], nodes: js.Array[AnyNode], recurse: Boolean): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(test.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    inline def findOneChild[T](test: js.Function1[/* elem */ T, Boolean], nodes: js.Array[T]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findOneChild")(test.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
    
    inline def getAttributeValue(elem: Element, name: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttributeValue")(elem.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    
    inline def getChildren(elem: AnyNode): js.Array[ChildNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildren")(elem.asInstanceOf[js.Any]).asInstanceOf[js.Array[ChildNode]]
    
    inline def getElementById(id: String, nodes: js.Array[AnyNode]): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def getElementById(id: String, nodes: js.Array[AnyNode], recurse: Boolean): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def getElementById(id: String, nodes: AnyNode): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def getElementById(id: String, nodes: AnyNode, recurse: Boolean): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def getElementById(id: js.Function1[/* id */ String, Boolean], nodes: js.Array[AnyNode]): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def getElementById(id: js.Function1[/* id */ String, Boolean], nodes: js.Array[AnyNode], recurse: Boolean): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def getElementById(id: js.Function1[/* id */ String, Boolean], nodes: AnyNode): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def getElementById(id: js.Function1[/* id */ String, Boolean], nodes: AnyNode, recurse: Boolean): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    inline def getElements(options: TestElementOpts, nodes: js.Array[AnyNode], recurse: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(options.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def getElements(options: TestElementOpts, nodes: js.Array[AnyNode], recurse: Boolean, limit: Double): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(options.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def getElements(options: TestElementOpts, nodes: AnyNode, recurse: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(options.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def getElements(options: TestElementOpts, nodes: AnyNode, recurse: Boolean, limit: Double): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(options.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    
    inline def getElementsByTagName(tagName: String, nodes: js.Array[AnyNode]): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    inline def getElementsByTagName(tagName: String, nodes: js.Array[AnyNode], recurse: Boolean): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    inline def getElementsByTagName(tagName: String, nodes: js.Array[AnyNode], recurse: Boolean, limit: Double): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    inline def getElementsByTagName(tagName: String, nodes: js.Array[AnyNode], recurse: Unit, limit: Double): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    inline def getElementsByTagName(tagName: String, nodes: AnyNode): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    inline def getElementsByTagName(tagName: String, nodes: AnyNode, recurse: Boolean): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    inline def getElementsByTagName(tagName: String, nodes: AnyNode, recurse: Boolean, limit: Double): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    inline def getElementsByTagName(tagName: String, nodes: AnyNode, recurse: Unit, limit: Double): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    inline def getElementsByTagName(tagName: js.Function1[/* name */ String, Boolean], nodes: js.Array[AnyNode]): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    inline def getElementsByTagName(tagName: js.Function1[/* name */ String, Boolean], nodes: js.Array[AnyNode], recurse: Boolean): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    inline def getElementsByTagName(
      tagName: js.Function1[/* name */ String, Boolean],
      nodes: js.Array[AnyNode],
      recurse: Boolean,
      limit: Double
    ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    inline def getElementsByTagName(
      tagName: js.Function1[/* name */ String, Boolean],
      nodes: js.Array[AnyNode],
      recurse: Unit,
      limit: Double
    ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    inline def getElementsByTagName(tagName: js.Function1[/* name */ String, Boolean], nodes: AnyNode): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    inline def getElementsByTagName(tagName: js.Function1[/* name */ String, Boolean], nodes: AnyNode, recurse: Boolean): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    inline def getElementsByTagName(tagName: js.Function1[/* name */ String, Boolean], nodes: AnyNode, recurse: Boolean, limit: Double): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    inline def getElementsByTagName(tagName: js.Function1[/* name */ String, Boolean], nodes: AnyNode, recurse: Unit, limit: Double): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    
    inline def getElementsByTagType(`type`: js.Function1[/* type */ ElementType, Boolean], nodes: js.Array[AnyNode]): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def getElementsByTagType(`type`: js.Function1[/* type */ ElementType, Boolean], nodes: js.Array[AnyNode], recurse: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def getElementsByTagType(
      `type`: js.Function1[/* type */ ElementType, Boolean],
      nodes: js.Array[AnyNode],
      recurse: Boolean,
      limit: Double
    ): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def getElementsByTagType(
      `type`: js.Function1[/* type */ ElementType, Boolean],
      nodes: js.Array[AnyNode],
      recurse: Unit,
      limit: Double
    ): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def getElementsByTagType(`type`: js.Function1[/* type */ ElementType, Boolean], nodes: AnyNode): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def getElementsByTagType(`type`: js.Function1[/* type */ ElementType, Boolean], nodes: AnyNode, recurse: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def getElementsByTagType(
      `type`: js.Function1[/* type */ ElementType, Boolean],
      nodes: AnyNode,
      recurse: Boolean,
      limit: Double
    ): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def getElementsByTagType(
      `type`: js.Function1[/* type */ ElementType, Boolean],
      nodes: AnyNode,
      recurse: Unit,
      limit: Double
    ): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def getElementsByTagType(`type`: ElementType, nodes: js.Array[AnyNode]): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def getElementsByTagType(`type`: ElementType, nodes: js.Array[AnyNode], recurse: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def getElementsByTagType(`type`: ElementType, nodes: js.Array[AnyNode], recurse: Boolean, limit: Double): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def getElementsByTagType(`type`: ElementType, nodes: js.Array[AnyNode], recurse: Unit, limit: Double): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def getElementsByTagType(`type`: ElementType, nodes: AnyNode): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def getElementsByTagType(`type`: ElementType, nodes: AnyNode, recurse: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def getElementsByTagType(`type`: ElementType, nodes: AnyNode, recurse: Boolean, limit: Double): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    inline def getElementsByTagType(`type`: ElementType, nodes: AnyNode, recurse: Unit, limit: Double): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
    
    inline def getFeed(doc: js.Array[AnyNode]): Feed | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFeed")(doc.asInstanceOf[js.Any]).asInstanceOf[Feed | Null]
    
    inline def getInnerHTML(node: AnyNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInnerHTML")(node.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getInnerHTML(node: AnyNode, options: DomSerializerOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getInnerHTML")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getName(elem: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getOuterHTML(node: AnyNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOuterHTML")(node.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getOuterHTML(node: AnyNode, options: DomSerializerOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getOuterHTML")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getOuterHTML(node: ArrayLike[AnyNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOuterHTML")(node.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getOuterHTML(node: ArrayLike[AnyNode], options: DomSerializerOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getOuterHTML")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getParent(elem: AnyNode): ParentNode | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getParent")(elem.asInstanceOf[js.Any]).asInstanceOf[ParentNode | Null]
    
    inline def getSiblings(elem: AnyNode): js.Array[AnyNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSiblings")(elem.asInstanceOf[js.Any]).asInstanceOf[js.Array[AnyNode]]
    
    inline def getText(node: js.Array[AnyNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")(node.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getText(node: AnyNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")(node.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def hasAttrib(elem: Element, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasAttrib")(elem.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def hasChildren(node: Node): /* is domhandler.domhandler/lib/node.ParentNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasChildren")(node.asInstanceOf[js.Any]).asInstanceOf[/* is domhandler.domhandler/lib/node.ParentNode */ Boolean]
    
    inline def innerText(node: js.Array[AnyNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("innerText")(node.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def innerText(node: AnyNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("innerText")(node.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isCDATA(node: Node): /* is domhandler.domhandler/lib/node.CDATA */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCDATA")(node.asInstanceOf[js.Any]).asInstanceOf[/* is domhandler.domhandler/lib/node.CDATA */ Boolean]
    
    inline def isComment(node: Node): /* is domhandler.domhandler/lib/node.Comment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is domhandler.domhandler/lib/node.Comment */ Boolean]
    
    inline def isDocument(node: Node): /* is domhandler.domhandler/lib/node.Document */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDocument")(node.asInstanceOf[js.Any]).asInstanceOf[/* is domhandler.domhandler/lib/node.Document */ Boolean]
    
    inline def isTag(node: Node): /* is domhandler.domhandler/lib/node.Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is domhandler.domhandler/lib/node.Element */ Boolean]
    
    inline def isText(node: Node): /* is domhandler.domhandler/lib/node.Text */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isText")(node.asInstanceOf[js.Any]).asInstanceOf[/* is domhandler.domhandler/lib/node.Text */ Boolean]
    
    inline def nextElementSibling(elem: AnyNode): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("nextElementSibling")(elem.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    
    inline def prepend(elem: ChildNode, prev: ChildNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prepend")(elem.asInstanceOf[js.Any], prev.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def prependChild(elem: Element, child: ChildNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prependChild")(elem.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def prevElementSibling(elem: AnyNode): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("prevElementSibling")(elem.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    
    inline def removeElement(elem: ChildNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeElement")(elem.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def removeSubsets(nodes: js.Array[AnyNode]): js.Array[AnyNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSubsets")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[AnyNode]]
    
    inline def replaceElement(elem: ChildNode, replacement: ChildNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceElement")(elem.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def testElement(options: TestElementOpts, node: AnyNode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testElement")(options.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def textContent(node: js.Array[AnyNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("textContent")(node.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def textContent(node: AnyNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("textContent")(node.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def uniqueSort[T /* <: AnyNode */](nodes: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueSort")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  }
  
  object ElementType {
    
    @JSImport("htmlparser2", "ElementType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("htmlparser2", "ElementType.CDATA")
    @js.native
    val CDATA: String | Double = js.native
    
    @JSImport("htmlparser2", "ElementType.Comment")
    @js.native
    val Comment: String | Double = js.native
    
    @JSImport("htmlparser2", "ElementType.Directive")
    @js.native
    val Directive: String | Double = js.native
    
    @JSImport("htmlparser2", "ElementType.Doctype")
    @js.native
    val Doctype: String | Double = js.native
    
    @JSImport("htmlparser2", "ElementType.ElementType")
    @js.native
    object ElementType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.domelementtype.mod.ElementType & String] = js.native
      
      /* "cdata" */ val CDATA: typings.domelementtype.mod.ElementType.CDATA & String = js.native
      
      /* "comment" */ val Comment: typings.domelementtype.mod.ElementType.Comment & String = js.native
      
      /* "directive" */ val Directive: typings.domelementtype.mod.ElementType.Directive & String = js.native
      
      /* "doctype" */ val Doctype: typings.domelementtype.mod.ElementType.Doctype & String = js.native
      
      /* "root" */ val Root: typings.domelementtype.mod.ElementType.Root & String = js.native
      
      /* "script" */ val Script: typings.domelementtype.mod.ElementType.Script & String = js.native
      
      /* "style" */ val Style: typings.domelementtype.mod.ElementType.Style & String = js.native
      
      /* "tag" */ val Tag: typings.domelementtype.mod.ElementType.Tag & String = js.native
      
      /* "text" */ val Text: typings.domelementtype.mod.ElementType.Text & String = js.native
    }
    
    @JSImport("htmlparser2", "ElementType.Root")
    @js.native
    val Root: String | Double = js.native
    
    @JSImport("htmlparser2", "ElementType.Script")
    @js.native
    val Script: String | Double = js.native
    
    @JSImport("htmlparser2", "ElementType.Style")
    @js.native
    val Style: String | Double = js.native
    
    @JSImport("htmlparser2", "ElementType.Tag")
    @js.native
    val Tag: String | Double = js.native
    
    @JSImport("htmlparser2", "ElementType.Text")
    @js.native
    val Text: String | Double = js.native
    
    inline def isTag(elem: TypeElementType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTag")(elem.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("htmlparser2", "Parser")
  @js.native
  open class Parser ()
    extends typings.htmlparser2.libParserMod.Parser {
    def this(cbs: PartialHandler) = this()
    def this(cbs: Null, options: ParserOptions) = this()
    def this(cbs: Unit, options: ParserOptions) = this()
    def this(cbs: PartialHandler, options: ParserOptions) = this()
  }
  
  @JSImport("htmlparser2", "Tokenizer")
  @js.native
  open class Tokenizer protected () extends default {
    def this(param0: DecodeEntities, cbs: Callbacks) = this()
  }
  
  inline def createDomStream(cb: js.Function2[/* error */ js.Error | Null, /* dom */ js.Array[ChildNode], Unit]): typings.htmlparser2.libParserMod.Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("createDomStream")(cb.asInstanceOf[js.Any]).asInstanceOf[typings.htmlparser2.libParserMod.Parser]
  inline def createDomStream(
    cb: js.Function2[/* error */ js.Error | Null, /* dom */ js.Array[ChildNode], Unit],
    options: Unit,
    elementCb: js.Function1[/* element */ Element, Unit]
  ): typings.htmlparser2.libParserMod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("createDomStream")(cb.asInstanceOf[js.Any], options.asInstanceOf[js.Any], elementCb.asInstanceOf[js.Any])).asInstanceOf[typings.htmlparser2.libParserMod.Parser]
  inline def createDomStream(
    cb: js.Function2[/* error */ js.Error | Null, /* dom */ js.Array[ChildNode], Unit],
    options: Options
  ): typings.htmlparser2.libParserMod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("createDomStream")(cb.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.htmlparser2.libParserMod.Parser]
  inline def createDomStream(
    cb: js.Function2[/* error */ js.Error | Null, /* dom */ js.Array[ChildNode], Unit],
    options: Options,
    elementCb: js.Function1[/* element */ Element, Unit]
  ): typings.htmlparser2.libParserMod.Parser = (^.asInstanceOf[js.Dynamic].applyDynamic("createDomStream")(cb.asInstanceOf[js.Any], options.asInstanceOf[js.Any], elementCb.asInstanceOf[js.Any])).asInstanceOf[typings.htmlparser2.libParserMod.Parser]
  
  inline def getFeed(doc: js.Array[AnyNode]): Feed | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFeed")(doc.asInstanceOf[js.Any]).asInstanceOf[Feed | Null]
  
  inline def parseDOM(data: String): js.Array[ChildNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDOM")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[ChildNode]]
  inline def parseDOM(data: String, options: Options): js.Array[ChildNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDOM")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ChildNode]]
  
  inline def parseDocument(data: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDocument")(data.asInstanceOf[js.Any]).asInstanceOf[Document]
  inline def parseDocument(data: String, options: Options): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDocument")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Document]
  
  inline def parseFeed(feed: String): Feed | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFeed")(feed.asInstanceOf[js.Any]).asInstanceOf[Feed | Null]
  inline def parseFeed(feed: String, options: ParserOptions & DomHandlerOptions): Feed | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFeed")(feed.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Feed | Null]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.domhandler.mod.DomHandlerOptions because var conflicts: xmlMode. Inlined withStartIndices, withEndIndices */ trait Options
    extends StObject
       with ParserOptions {
    
    /**
      * Add an `endIndex` property to nodes.
      * When the parser is used in a non-streaming fashion, `endIndex` is an integer
      * indicating the position of the end of the node in the document.
      *
      * @default false
      */
    var withEndIndices: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Add a `startIndex` property to nodes.
      * When the parser is used in a non-streaming fashion, `startIndex` is an integer
      * indicating the position of the start of the node in the document.
      *
      * @default false
      */
    var withStartIndices: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setWithEndIndices(value: Boolean): Self = StObject.set(x, "withEndIndices", value.asInstanceOf[js.Any])
      
      inline def setWithEndIndicesUndefined: Self = StObject.set(x, "withEndIndices", js.undefined)
      
      inline def setWithStartIndices(value: Boolean): Self = StObject.set(x, "withStartIndices", value.asInstanceOf[js.Any])
      
      inline def setWithStartIndicesUndefined: Self = StObject.set(x, "withStartIndices", js.undefined)
    }
  }
}
