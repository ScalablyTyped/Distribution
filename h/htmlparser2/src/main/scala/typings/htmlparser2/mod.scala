package typings.htmlparser2

import typings.domhandler.mod.DomElement
import typings.domhandler.mod.DomHandlerOptions
import typings.domutils.anon.DecodeEntities
import typings.htmlparser2.anon.PartialDomHandler
import typings.node.streamMod.Writable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("htmlparser2", "DomHandler")
  @js.native
  class DomHandler protected ()
    extends typings.domhandler.mod.DomHandler {
    def this(callback: js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], js.Any]) = this()
    def this(
      callback: js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], js.Any],
      options: DomHandlerOptions
    ) = this()
  }
  
  object DomUtils {
    
    @JSImport("htmlparser2", "DomUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def append(elem: DomElement, next: DomElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(elem.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def appendChild(elem: DomElement, child: DomElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendChild")(elem.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def compareDocumentPosition(nodeA: DomElement, nodeB: DomElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDocumentPosition")(nodeA.asInstanceOf[js.Any], nodeB.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def existsOne(test: js.Any, elems: js.Array[DomElement]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("existsOne")(test.asInstanceOf[js.Any], elems.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def filter(test: js.Any, element: DomElement, recurse: Boolean, limit: Double): js.Array[DomElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(test.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[DomElement]]
    
    @scala.inline
    def find(test: js.Any, elems: js.Array[DomElement], recurse: Boolean, limit: Double): js.Array[DomElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(test.asInstanceOf[js.Any], elems.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[DomElement]]
    
    @scala.inline
    def findAll(test: js.Any, rootElems: js.Array[DomElement]): js.Array[DomElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAll")(test.asInstanceOf[js.Any], rootElems.asInstanceOf[js.Any])).asInstanceOf[js.Array[DomElement]]
    
    @scala.inline
    def findOne(test: js.Any, elems: js.Array[DomElement]): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(test.asInstanceOf[js.Any], elems.asInstanceOf[js.Any])).asInstanceOf[DomElement]
    
    @scala.inline
    def findOneChild(test: js.Any, elems: js.Array[DomElement]): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("findOneChild")(test.asInstanceOf[js.Any], elems.asInstanceOf[js.Any])).asInstanceOf[DomElement]
    
    @scala.inline
    def getAttributeValue(elem: DomElement, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttributeValue")(elem.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def getChildren(elem: DomElement): js.Array[DomElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildren")(elem.asInstanceOf[js.Any]).asInstanceOf[js.Array[DomElement]]
    
    @scala.inline
    def getElementById(id: js.Any, element: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def getElementById(id: js.Any, element: js.Any, recurse: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def getElements(options: js.Any, element: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(options.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def getElements(options: js.Any, element: js.Any, recurse: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(options.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def getElements(options: js.Any, element: js.Any, recurse: js.Any, limit: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(options.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def getElements(options: js.Any, element: js.Any, recurse: Unit, limit: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(options.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def getElementsByTagName(name: js.Any, element: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(name.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def getElementsByTagName(name: js.Any, element: js.Any, recurse: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(name.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def getElementsByTagName(name: js.Any, element: js.Any, recurse: js.Any, limit: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(name.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def getElementsByTagName(name: js.Any, element: js.Any, recurse: Unit, limit: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(name.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def getElementsByTagType(`type`: js.Any, element: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def getElementsByTagType(`type`: js.Any, element: js.Any, recurse: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def getElementsByTagType(`type`: js.Any, element: js.Any, recurse: js.Any, limit: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def getElementsByTagType(`type`: js.Any, element: js.Any, recurse: Unit, limit: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def getInnerHTML(elem: DomElement, opts: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getInnerHTML")(elem.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def getName(elem: DomElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def getOuterHTML(dom: js.Array[DomElement]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOuterHTML")(dom.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def getOuterHTML(dom: js.Array[DomElement], opts: DecodeEntities): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getOuterHTML")(dom.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def getParent(elem: DomElement): DomElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getParent")(elem.asInstanceOf[js.Any]).asInstanceOf[DomElement]
    
    @scala.inline
    def getSiblings(elem: DomElement): js.Array[DomElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSiblings")(elem.asInstanceOf[js.Any]).asInstanceOf[js.Array[DomElement]]
    
    @scala.inline
    def getText(elem: DomElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def hasAttrib(elem: DomElement, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasAttrib")(elem.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isTag(elem: DomElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTag")(elem.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def prepend(elem: DomElement, prev: DomElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prepend")(elem.asInstanceOf[js.Any], prev.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def removeElement(elem: DomElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeElement")(elem.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def removeSubsets(nodes: js.Array[DomElement]): js.Array[DomElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSubsets")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[DomElement]]
    
    @scala.inline
    def replaceElement(elem: DomElement, replacement: DomElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceElement")(elem.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def testElement(options: js.Any, element: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("testElement")(options.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def uniqueSort(nodes: js.Array[DomElement]): js.Array[DomElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueSort")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[DomElement]]
  }
  
  @JSImport("htmlparser2", "Parser")
  @js.native
  class Parser protected () extends StObject {
    def this(handler: PartialDomHandler) = this()
    def this(handler: PartialDomHandler, options: ParserOptions) = this()
    
    /***
      * alias for backwards compat
      */
    def done(): Unit = js.native
    
    /***
      * Parses the end of the buffer and clears the stack, calls onend.
      */
    def end(): Unit = js.native
    /***
      * Parses the end of the buffer and clears the stack, calls onend.
      */
    def end(chunk: String): Unit = js.native
    
    def onattribend(): Unit = js.native
    
    def onattribname(name: String): Unit = js.native
    
    def oncdata(value: String): Unit = js.native
    
    def onclosetag(name: String): Unit = js.native
    
    def oncomment(value: String): Unit = js.native
    
    def ondeclaration(): Unit = js.native
    
    def onend(): Unit = js.native
    
    def onerror(err: Error): Unit = js.native
    
    def onopentagend(): Unit = js.native
    
    def onopentagname(name: String): Unit = js.native
    
    def onprocessinginstruction(value: String): Unit = js.native
    
    def onselfclosingtag(): Unit = js.native
    
    def ontext(data: js.Any): Unit = js.native
    
    /***
      * alias for backwards compat
      */
    def parseChunk(chunk: String): Unit = js.native
    
    /***
      * Resets the parser, parses the data & calls end.
      * @param input
      */
    def parseComplete(input: String): Unit = js.native
    
    /***
      * Pauses the parser
      */
    def pause(): Unit = js.native
    
    /***
      * Resets buffer & stack, calls onreset.
      */
    def reset(): Unit = js.native
    
    /***
      * Resumes the parser
      */
    def resume(): Unit = js.native
    
    /***
      * Parses a chunk of data and calls the corresponding callbacks.
      * @param input
      */
    def write(input: String): Unit = js.native
  }
  
  @JSImport("htmlparser2", "WritableStream")
  @js.native
  class WritableStream protected () extends Writable {
    def this(handler: typings.domhandler.mod.DomHandler) = this()
    def this(handler: typings.domhandler.mod.DomHandler, options: ParserOptions) = this()
  }
  
  type Options = ParserOptions
  
  trait ParserOptions extends StObject {
    
    /***
      * If set to true, entities within the document will be decoded. Defaults to false.
      */
    var decodeEntities: js.UndefOr[Boolean] = js.undefined
    
    /***
      * If set to true, all attribute names will be lowercased. This has noticeable impact on speed, so it defaults to false.
      */
    var lowerCaseAttributeNames: js.UndefOr[Boolean] = js.undefined
    
    /***
      * If set to true, all tags will be lowercased. If xmlMode is disabled, this defaults to true.
      */
    var lowerCaseTags: js.UndefOr[Boolean] = js.undefined
    
    /***
      * If set to true, CDATA sections will be recognized as text even if the xmlMode option is not enabled.
      * NOTE: If xmlMode is set to true then CDATA sections will always be recognized as text.
      */
    var recognizeCDATA: js.UndefOr[Boolean] = js.undefined
    
    /***
      * If set to true, self-closing tags will trigger the onclosetag event even if xmlMode is not set to true.
      * NOTE: If xmlMode is set to true then self-closing tags will always be recognized.
      */
    var recognizeSelfClosing: js.UndefOr[Boolean] = js.undefined
    
    /***
      * Indicates whether special tags (<script> and <style>) should get special treatment
      * and if "empty" tags (eg. <br>) can have children.  If false, the content of special tags
      * will be text only. For feeds and other XML content (documents that don't consist of HTML),
      * set this to true. Default: false.
      */
    var xmlMode: js.UndefOr[Boolean] = js.undefined
  }
  object ParserOptions {
    
    @scala.inline
    def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    @scala.inline
    implicit class ParserOptionsMutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecodeEntities(value: Boolean): Self = StObject.set(x, "decodeEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeEntitiesUndefined: Self = StObject.set(x, "decodeEntities", js.undefined)
      
      @scala.inline
      def setLowerCaseAttributeNames(value: Boolean): Self = StObject.set(x, "lowerCaseAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowerCaseAttributeNamesUndefined: Self = StObject.set(x, "lowerCaseAttributeNames", js.undefined)
      
      @scala.inline
      def setLowerCaseTags(value: Boolean): Self = StObject.set(x, "lowerCaseTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowerCaseTagsUndefined: Self = StObject.set(x, "lowerCaseTags", js.undefined)
      
      @scala.inline
      def setRecognizeCDATA(value: Boolean): Self = StObject.set(x, "recognizeCDATA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecognizeCDATAUndefined: Self = StObject.set(x, "recognizeCDATA", js.undefined)
      
      @scala.inline
      def setRecognizeSelfClosing(value: Boolean): Self = StObject.set(x, "recognizeSelfClosing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecognizeSelfClosingUndefined: Self = StObject.set(x, "recognizeSelfClosing", js.undefined)
      
      @scala.inline
      def setXmlMode(value: Boolean): Self = StObject.set(x, "xmlMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlModeUndefined: Self = StObject.set(x, "xmlMode", js.undefined)
    }
  }
}
