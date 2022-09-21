package typings.htmlparser2

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.htmlparser2.anon.DecodeEntities
import typings.htmlparser2.anon.PartialHandler
import typings.htmlparser2.libTokenizerMod.Callbacks
import typings.htmlparser2.libTokenizerMod.QuoteType
import typings.htmlparser2.libTokenizerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParserMod {
  
  @JSImport("htmlparser2/lib/Parser", "Parser")
  @js.native
  open class Parser ()
    extends StObject
       with Callbacks {
    def this(cbs: PartialHandler) = this()
    def this(cbs: Null, options: ParserOptions) = this()
    def this(cbs: Unit, options: ParserOptions) = this()
    def this(cbs: PartialHandler, options: ParserOptions) = this()
    
    /* private */ var attribname: Any = js.native
    
    /* private */ var attribs: Any = js.native
    
    /* private */ var attribvalue: Any = js.native
    
    /* private */ var bufferOffset: Any = js.native
    
    /* private */ val buffers: Any = js.native
    
    /* private */ val cbs: Any = js.native
    
    /* private */ var closeCurrentTag: Any = js.native
    
    /**
      * Alias of `end`, for backwards compatibility.
      *
      * @param chunk Optional final chunk to parse.
      * @deprecated
      */
    def done(): Unit = js.native
    def done(chunk: String): Unit = js.native
    
    /* private */ var emitOpenTag: Any = js.native
    
    /**
      * Parses the end of the buffer and clears the stack, calls onend.
      *
      * @param chunk Optional final chunk to parse.
      */
    def end(): Unit = js.native
    def end(chunk: String): Unit = js.native
    
    /** The end index of the last event. */
    var endIndex: Double = js.native
    
    /* private */ var endOpenTag: Any = js.native
    
    /** Indicates whether the parser has finished running / `.end` has been called. */
    /* private */ var ended: Any = js.native
    
    /* private */ val foreignContext: Any = js.native
    
    /* private */ var getInstructionName: Any = js.native
    
    /* private */ var getSlice: Any = js.native
    
    /* protected */ def isVoidElement(name: String): Boolean = js.native
    
    /* private */ val lowerCaseAttributeNames: Any = js.native
    
    /* private */ val lowerCaseTagNames: Any = js.native
    
    /* CompleteClass */
    override def onattribdata(start: Double, endIndex: Double): Unit = js.native
    
    /* CompleteClass */
    override def onattribend(quote: QuoteType, endIndex: Double): Unit = js.native
    
    /* CompleteClass */
    override def onattribentity(codepoint: Double): Unit = js.native
    
    /* CompleteClass */
    override def onattribname(start: Double, endIndex: Double): Unit = js.native
    
    /* CompleteClass */
    override def oncdata(start: Double, endIndex: Double, endOffset: Double): Unit = js.native
    
    /* CompleteClass */
    override def onclosetag(start: Double, endIndex: Double): Unit = js.native
    
    /* CompleteClass */
    override def oncomment(start: Double, endIndex: Double, endOffset: Double): Unit = js.native
    
    /* CompleteClass */
    override def ondeclaration(start: Double, endIndex: Double): Unit = js.native
    
    /* CompleteClass */
    override def onend(): Unit = js.native
    
    /* CompleteClass */
    override def onopentagend(endIndex: Double): Unit = js.native
    
    /* CompleteClass */
    override def onopentagname(start: Double, endIndex: Double): Unit = js.native
    
    /* CompleteClass */
    override def onprocessinginstruction(start: Double, endIndex: Double): Unit = js.native
    
    /* CompleteClass */
    override def onselfclosingtag(endIndex: Double): Unit = js.native
    
    /* CompleteClass */
    override def ontext(start: Double, endIndex: Double): Unit = js.native
    
    /* CompleteClass */
    override def ontextentity(codepoint: Double): Unit = js.native
    
    /**
      * Store the start index of the current open tag,
      * so we can update the start index for attributes.
      */
    /* private */ var openTagStart: Any = js.native
    
    /* private */ val options: Any = js.native
    
    /**
      * Alias of `write`, for backwards compatibility.
      *
      * @param chunk Chunk to parse.
      * @deprecated
      */
    def parseChunk(chunk: String): Unit = js.native
    
    /**
      * Resets the parser, then parses a complete document and
      * pushes it to the handler.
      *
      * @param data Document to parse.
      */
    def parseComplete(data: String): Unit = js.native
    
    /**
      * Pauses parsing. The parser won't emit events until `resume` is called.
      */
    def pause(): Unit = js.native
    
    /**
      * Resets the parser to a blank state, ready to parse a new HTML document
      */
    def reset(): Unit = js.native
    
    /**
      * Resumes parsing after `pause` was called.
      */
    def resume(): Unit = js.native
    
    /* private */ var shiftBuffer: Any = js.native
    
    /* private */ var stack: Any = js.native
    
    /** The start index of the last event. */
    var startIndex: Double = js.native
    
    /* private */ var tagname: Any = js.native
    
    /* private */ val tokenizer: Any = js.native
    
    /**
      * Parses a chunk of data and calls the corresponding callbacks.
      *
      * @param chunk Chunk to parse.
      */
    def write(chunk: String): Unit = js.native
    
    /** The index of the last written buffer. Used when resuming after a `pause()`. */
    /* private */ var writeIndex: Any = js.native
  }
  
  @js.native
  trait Handler extends StObject {
    
    /**
      *
      * @param name Name of the attribute
      * @param value Value of the attribute.
      * @param quote Quotes used around the attribute. `null` if the attribute has no quotes around the value, `undefined` if the attribute has no value.
      */
    def onattribute(name: String, value: String): Unit = js.native
    def onattribute(name: String, value: String, quote: String): Unit = js.native
    
    def oncdataend(): Unit = js.native
    
    def oncdatastart(): Unit = js.native
    
    def onclosetag(name: String, isImplied: Boolean): Unit = js.native
    
    def oncomment(data: String): Unit = js.native
    
    def oncommentend(): Unit = js.native
    
    /**
      * Signals the handler that parsing is done
      */
    def onend(): Unit = js.native
    
    def onerror(error: js.Error): Unit = js.native
    
    def onopentag(name: String, attribs: StringDictionary[String], isImplied: Boolean): Unit = js.native
    
    def onopentagname(name: String): Unit = js.native
    
    def onparserinit(parser: Parser): Unit = js.native
    
    def onprocessinginstruction(name: String, data: String): Unit = js.native
    
    /**
      * Resets the handler back to starting state
      */
    def onreset(): Unit = js.native
    
    def ontext(data: String): Unit = js.native
  }
  
  trait ParserOptions extends StObject {
    
    /**
      * Allows the default tokenizer to be overwritten.
      */
    var Tokenizer: js.UndefOr[
        Instantiable2[/* hasXmlModeDecodeEntities */ DecodeEntities, /* cbs */ Callbacks, default]
      ] = js.undefined
    
    /**
      * Decode entities within the document.
      *
      * @default true
      */
    var decodeEntities: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to `true`, all attribute names will be lowercased. This has noticeable impact on speed.
      *
      * @default !xmlMode
      */
    var lowerCaseAttributeNames: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true, all tags will be lowercased.
      *
      * @default !xmlMode
      */
    var lowerCaseTags: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true, CDATA sections will be recognized as text even if the xmlMode option is not enabled.
      * NOTE: If xmlMode is set to `true` then CDATA sections will always be recognized as text.
      *
      * @default xmlMode
      */
    var recognizeCDATA: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to `true`, self-closing tags will trigger the onclosetag event even if xmlMode is not set to `true`.
      * NOTE: If xmlMode is set to `true` then self-closing tags will always be recognized.
      *
      * @default xmlMode
      */
    var recognizeSelfClosing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether special tags (`<script>`, `<style>`, and `<title>`) should get special treatment
      * and if "empty" tags (eg. `<br>`) can have children.  If `false`, the content of special tags
      * will be text only. For feeds and other XML content (documents that don't consist of HTML),
      * set this to `true`.
      *
      * @default false
      */
    var xmlMode: js.UndefOr[Boolean] = js.undefined
  }
  object ParserOptions {
    
    inline def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    extension [Self <: ParserOptions](x: Self) {
      
      inline def setDecodeEntities(value: Boolean): Self = StObject.set(x, "decodeEntities", value.asInstanceOf[js.Any])
      
      inline def setDecodeEntitiesUndefined: Self = StObject.set(x, "decodeEntities", js.undefined)
      
      inline def setLowerCaseAttributeNames(value: Boolean): Self = StObject.set(x, "lowerCaseAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setLowerCaseAttributeNamesUndefined: Self = StObject.set(x, "lowerCaseAttributeNames", js.undefined)
      
      inline def setLowerCaseTags(value: Boolean): Self = StObject.set(x, "lowerCaseTags", value.asInstanceOf[js.Any])
      
      inline def setLowerCaseTagsUndefined: Self = StObject.set(x, "lowerCaseTags", js.undefined)
      
      inline def setRecognizeCDATA(value: Boolean): Self = StObject.set(x, "recognizeCDATA", value.asInstanceOf[js.Any])
      
      inline def setRecognizeCDATAUndefined: Self = StObject.set(x, "recognizeCDATA", js.undefined)
      
      inline def setRecognizeSelfClosing(value: Boolean): Self = StObject.set(x, "recognizeSelfClosing", value.asInstanceOf[js.Any])
      
      inline def setRecognizeSelfClosingUndefined: Self = StObject.set(x, "recognizeSelfClosing", js.undefined)
      
      inline def setTokenizer(value: Instantiable2[/* hasXmlModeDecodeEntities */ DecodeEntities, /* cbs */ Callbacks, default]): Self = StObject.set(x, "Tokenizer", value.asInstanceOf[js.Any])
      
      inline def setTokenizerUndefined: Self = StObject.set(x, "Tokenizer", js.undefined)
      
      inline def setXmlMode(value: Boolean): Self = StObject.set(x, "xmlMode", value.asInstanceOf[js.Any])
      
      inline def setXmlModeUndefined: Self = StObject.set(x, "xmlMode", js.undefined)
    }
  }
}
