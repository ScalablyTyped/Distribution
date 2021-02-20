package typings.htmlparser2

import typings.domhandler.mod.DomElement
import typings.domhandler.mod.DomHandlerOptions
import typings.domutils.anon.DecodeEntities
import typings.htmlparser2.anon.PartialDomHandler
import typings.node.streamMod.Writable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("htmlparser2", "DomHandler")
  @js.native
  class DomHandler protected ()
    extends typings.domhandler.mod.DomHandler {
    def this(callback: js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], _]) = this()
    def this(
      callback: js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], _],
      options: DomHandlerOptions
    ) = this()
  }
  
  object DomUtils {
    
    @JSImport("htmlparser2", "DomUtils.append")
    @js.native
    def append(elem: DomElement, next: DomElement): Unit = js.native
    
    @JSImport("htmlparser2", "DomUtils.appendChild")
    @js.native
    def appendChild(elem: DomElement, child: DomElement): Unit = js.native
    
    @JSImport("htmlparser2", "DomUtils.compareDocumentPosition")
    @js.native
    def compareDocumentPosition(nodeA: DomElement, nodeB: DomElement): Double = js.native
    
    @JSImport("htmlparser2", "DomUtils.existsOne")
    @js.native
    def existsOne(test: js.Any, elems: js.Array[DomElement]): Boolean = js.native
    
    @JSImport("htmlparser2", "DomUtils.filter")
    @js.native
    def filter(test: js.Any, element: DomElement, recurse: Boolean, limit: Double): js.Array[DomElement] = js.native
    
    @JSImport("htmlparser2", "DomUtils.find")
    @js.native
    def find(test: js.Any, elems: js.Array[DomElement], recurse: Boolean, limit: Double): js.Array[DomElement] = js.native
    
    @JSImport("htmlparser2", "DomUtils.findAll")
    @js.native
    def findAll(test: js.Any, rootElems: js.Array[DomElement]): js.Array[DomElement] = js.native
    
    @JSImport("htmlparser2", "DomUtils.findOne")
    @js.native
    def findOne(test: js.Any, elems: js.Array[DomElement]): DomElement = js.native
    
    @JSImport("htmlparser2", "DomUtils.findOneChild")
    @js.native
    def findOneChild(test: js.Any, elems: js.Array[DomElement]): DomElement = js.native
    
    @JSImport("htmlparser2", "DomUtils.getAttributeValue")
    @js.native
    def getAttributeValue(elem: DomElement, name: String): String = js.native
    
    @JSImport("htmlparser2", "DomUtils.getChildren")
    @js.native
    def getChildren(elem: DomElement): js.Array[DomElement] = js.native
    
    @JSImport("htmlparser2", "DomUtils.getElementById")
    @js.native
    def getElementById(id: js.Any, element: js.Any): js.Any = js.native
    @JSImport("htmlparser2", "DomUtils.getElementById")
    @js.native
    def getElementById(id: js.Any, element: js.Any, recurse: js.Any): js.Any = js.native
    
    @JSImport("htmlparser2", "DomUtils.getElements")
    @js.native
    def getElements(options: js.Any, element: js.Any): js.Any = js.native
    @JSImport("htmlparser2", "DomUtils.getElements")
    @js.native
    def getElements(options: js.Any, element: js.Any, recurse: js.UndefOr[scala.Nothing], limit: js.Any): js.Any = js.native
    @JSImport("htmlparser2", "DomUtils.getElements")
    @js.native
    def getElements(options: js.Any, element: js.Any, recurse: js.Any): js.Any = js.native
    @JSImport("htmlparser2", "DomUtils.getElements")
    @js.native
    def getElements(options: js.Any, element: js.Any, recurse: js.Any, limit: js.Any): js.Any = js.native
    
    @JSImport("htmlparser2", "DomUtils.getElementsByTagName")
    @js.native
    def getElementsByTagName(name: js.Any, element: js.Any): js.Any = js.native
    @JSImport("htmlparser2", "DomUtils.getElementsByTagName")
    @js.native
    def getElementsByTagName(name: js.Any, element: js.Any, recurse: js.UndefOr[scala.Nothing], limit: js.Any): js.Any = js.native
    @JSImport("htmlparser2", "DomUtils.getElementsByTagName")
    @js.native
    def getElementsByTagName(name: js.Any, element: js.Any, recurse: js.Any): js.Any = js.native
    @JSImport("htmlparser2", "DomUtils.getElementsByTagName")
    @js.native
    def getElementsByTagName(name: js.Any, element: js.Any, recurse: js.Any, limit: js.Any): js.Any = js.native
    
    @JSImport("htmlparser2", "DomUtils.getElementsByTagType")
    @js.native
    def getElementsByTagType(`type`: js.Any, element: js.Any): js.Any = js.native
    @JSImport("htmlparser2", "DomUtils.getElementsByTagType")
    @js.native
    def getElementsByTagType(`type`: js.Any, element: js.Any, recurse: js.UndefOr[scala.Nothing], limit: js.Any): js.Any = js.native
    @JSImport("htmlparser2", "DomUtils.getElementsByTagType")
    @js.native
    def getElementsByTagType(`type`: js.Any, element: js.Any, recurse: js.Any): js.Any = js.native
    @JSImport("htmlparser2", "DomUtils.getElementsByTagType")
    @js.native
    def getElementsByTagType(`type`: js.Any, element: js.Any, recurse: js.Any, limit: js.Any): js.Any = js.native
    
    @JSImport("htmlparser2", "DomUtils.getInnerHTML")
    @js.native
    def getInnerHTML(elem: DomElement, opts: js.Any): String = js.native
    
    @JSImport("htmlparser2", "DomUtils.getName")
    @js.native
    def getName(elem: DomElement): String = js.native
    
    @JSImport("htmlparser2", "DomUtils.getOuterHTML")
    @js.native
    def getOuterHTML(dom: js.Array[DomElement]): String = js.native
    @JSImport("htmlparser2", "DomUtils.getOuterHTML")
    @js.native
    def getOuterHTML(dom: js.Array[DomElement], opts: DecodeEntities): String = js.native
    
    @JSImport("htmlparser2", "DomUtils.getParent")
    @js.native
    def getParent(elem: DomElement): DomElement = js.native
    
    @JSImport("htmlparser2", "DomUtils.getSiblings")
    @js.native
    def getSiblings(elem: DomElement): js.Array[DomElement] = js.native
    
    @JSImport("htmlparser2", "DomUtils.getText")
    @js.native
    def getText(elem: DomElement): String = js.native
    
    @JSImport("htmlparser2", "DomUtils.hasAttrib")
    @js.native
    def hasAttrib(elem: DomElement, name: String): Boolean = js.native
    
    @JSImport("htmlparser2", "DomUtils.isTag")
    @js.native
    def isTag(elem: DomElement): Boolean = js.native
    
    @JSImport("htmlparser2", "DomUtils.prepend")
    @js.native
    def prepend(elem: DomElement, prev: DomElement): Unit = js.native
    
    @JSImport("htmlparser2", "DomUtils.removeElement")
    @js.native
    def removeElement(elem: DomElement): Unit = js.native
    
    @JSImport("htmlparser2", "DomUtils.removeSubsets")
    @js.native
    def removeSubsets(nodes: js.Array[DomElement]): js.Array[DomElement] = js.native
    
    @JSImport("htmlparser2", "DomUtils.replaceElement")
    @js.native
    def replaceElement(elem: DomElement, replacement: DomElement): Unit = js.native
    
    @JSImport("htmlparser2", "DomUtils.testElement")
    @js.native
    def testElement(options: js.Any, element: js.Any): js.Any = js.native
    
    @JSImport("htmlparser2", "DomUtils.uniqueSort")
    @js.native
    def uniqueSort(nodes: js.Array[DomElement]): js.Array[DomElement] = js.native
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
  
  @js.native
  trait ParserOptions extends StObject {
    
    /***
      * If set to true, entities within the document will be decoded. Defaults to false.
      */
    var decodeEntities: js.UndefOr[Boolean] = js.native
    
    /***
      * If set to true, all attribute names will be lowercased. This has noticeable impact on speed, so it defaults to false.
      */
    var lowerCaseAttributeNames: js.UndefOr[Boolean] = js.native
    
    /***
      * If set to true, all tags will be lowercased. If xmlMode is disabled, this defaults to true.
      */
    var lowerCaseTags: js.UndefOr[Boolean] = js.native
    
    /***
      * If set to true, CDATA sections will be recognized as text even if the xmlMode option is not enabled.
      * NOTE: If xmlMode is set to true then CDATA sections will always be recognized as text.
      */
    var recognizeCDATA: js.UndefOr[Boolean] = js.native
    
    /***
      * If set to true, self-closing tags will trigger the onclosetag event even if xmlMode is not set to true.
      * NOTE: If xmlMode is set to true then self-closing tags will always be recognized.
      */
    var recognizeSelfClosing: js.UndefOr[Boolean] = js.native
    
    /***
      * Indicates whether special tags (<script> and <style>) should get special treatment
      * and if "empty" tags (eg. <br>) can have children.  If false, the content of special tags
      * will be text only. For feeds and other XML content (documents that don't consist of HTML),
      * set this to true. Default: false.
      */
    var xmlMode: js.UndefOr[Boolean] = js.native
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
