package typings.hastUtilRaw

import typings.hast.mod.DocType
import typings.hast.mod.ElementContent
import typings.hast.mod.Properties
import typings.hastUtilRaw.anon.Location
import typings.hastUtilRaw.complexTypesMod.Raw
import typings.hastUtilRaw.hastUtilRawStrings.comment
import typings.hastUtilRaw.hastUtilRawStrings.element
import typings.parse5.distParserMod.ParserOptions
import typings.parse5.treeAdaptersInterfaceMod.TreeAdapterTypeMap
import typings.std.DOMStringList
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Record
import typings.unist.mod.Data
import typings.unist.mod.NodeData
import typings.unist.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("hast-util-raw/lib", "raw")
  @js.native
  val raw: (js.Function3[/* tree */ Node, /* file */ js.UndefOr[VFile], /* options */ js.UndefOr[Options], Node]) & (js.Function2[/* tree */ Node, /* options */ js.UndefOr[Options], Node]) = js.native
  
  type Comment = typings.hast.mod.Comment
  
  type Content = typings.hast.mod.Content
  
  type Doctype = DocType
  
  type Element = typings.hast.mod.Element
  
  trait HiddenLocationTracker extends StObject {
    
    var ctLoc: P5Location
    
    var currentAttrLocation: js.UndefOr[P5Location] = js.undefined
    
    var posTracker: HiddenPosTracker
  }
  object HiddenLocationTracker {
    
    inline def apply(ctLoc: P5Location, posTracker: HiddenPosTracker): HiddenLocationTracker = {
      val __obj = js.Dynamic.literal(ctLoc = ctLoc.asInstanceOf[js.Any], posTracker = posTracker.asInstanceOf[js.Any])
      __obj.asInstanceOf[HiddenLocationTracker]
    }
    
    extension [Self <: HiddenLocationTracker](x: Self) {
      
      inline def setCtLoc(value: P5Location): Self = StObject.set(x, "ctLoc", value.asInstanceOf[js.Any])
      
      inline def setCurrentAttrLocation(value: P5Location): Self = StObject.set(x, "currentAttrLocation", value.asInstanceOf[js.Any])
      
      inline def setCurrentAttrLocationUndefined: Self = StObject.set(x, "currentAttrLocation", js.undefined)
      
      inline def setPosTracker(value: HiddenPosTracker): Self = StObject.set(x, "posTracker", value.asInstanceOf[js.Any])
    }
  }
  
  trait HiddenPosTracker extends StObject {
    
    var col: Double
    
    var droppedBufferSize: Double
    
    var isEol: Boolean
    
    var line: Double
    
    var lineStartPos: Double
    
    var offset: Double
  }
  object HiddenPosTracker {
    
    inline def apply(
      col: Double,
      droppedBufferSize: Double,
      isEol: Boolean,
      line: Double,
      lineStartPos: Double,
      offset: Double
    ): HiddenPosTracker = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], droppedBufferSize = droppedBufferSize.asInstanceOf[js.Any], isEol = isEol.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineStartPos = lineStartPos.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[HiddenPosTracker]
    }
    
    extension [Self <: HiddenPosTracker](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setDroppedBufferSize(value: Double): Self = StObject.set(x, "droppedBufferSize", value.asInstanceOf[js.Any])
      
      inline def setIsEol(value: Boolean): Self = StObject.set(x, "isEol", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineStartPos(value: Double): Self = StObject.set(x, "lineStartPos", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait HiddenPreprocessor extends StObject {
    
    var endOfChunkHit: Boolean
    
    var gapStack: js.Array[Double]
    
    var html: js.UndefOr[String] = js.undefined
    
    var lastCharPos: Double
    
    var lastChunkWritten: Boolean
    
    var lastGapPos: Double
    
    var pos: Double
    
    var skipNextNewLine: Boolean
  }
  object HiddenPreprocessor {
    
    inline def apply(
      endOfChunkHit: Boolean,
      gapStack: js.Array[Double],
      lastCharPos: Double,
      lastChunkWritten: Boolean,
      lastGapPos: Double,
      pos: Double,
      skipNextNewLine: Boolean
    ): HiddenPreprocessor = {
      val __obj = js.Dynamic.literal(endOfChunkHit = endOfChunkHit.asInstanceOf[js.Any], gapStack = gapStack.asInstanceOf[js.Any], lastCharPos = lastCharPos.asInstanceOf[js.Any], lastChunkWritten = lastChunkWritten.asInstanceOf[js.Any], lastGapPos = lastGapPos.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], skipNextNewLine = skipNextNewLine.asInstanceOf[js.Any])
      __obj.asInstanceOf[HiddenPreprocessor]
    }
    
    extension [Self <: HiddenPreprocessor](x: Self) {
      
      inline def setEndOfChunkHit(value: Boolean): Self = StObject.set(x, "endOfChunkHit", value.asInstanceOf[js.Any])
      
      inline def setGapStack(value: js.Array[Double]): Self = StObject.set(x, "gapStack", value.asInstanceOf[js.Any])
      
      inline def setGapStackVarargs(value: Double*): Self = StObject.set(x, "gapStack", js.Array(value*))
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setLastCharPos(value: Double): Self = StObject.set(x, "lastCharPos", value.asInstanceOf[js.Any])
      
      inline def setLastChunkWritten(value: Boolean): Self = StObject.set(x, "lastChunkWritten", value.asInstanceOf[js.Any])
      
      inline def setLastGapPos(value: Double): Self = StObject.set(x, "lastGapPos", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setSkipNextNewLine(value: Boolean): Self = StObject.set(x, "skipNextNewLine", value.asInstanceOf[js.Any])
    }
  }
  
  type HiddenToken = (Record[String, Any]) & Location
  
  trait HiddenTokenizer extends StObject {
    
    var NAMED_CHARACTER_REFERENCE_STATE: js.Function
    
    var NUMERIC_CHARACTER_REFERENCE_END_STATE: js.Function
    
    /**
      * Way too simple, but works for us.
      */
    var __mixins: js.Array[HiddenLocationTracker]
    
    def _consume(): Double
    
    var _flushCodePointsConsumedAsCharacterReference: js.Function
    
    var active: Boolean
    
    var charRefCode: Double
    
    var consumedAfterSnapshot: Double
    
    var currentAttr: Any
    
    var currentCharacterToken: js.UndefOr[HiddenToken] = js.undefined
    
    var currentToken: js.UndefOr[HiddenToken] = js.undefined
    
    var lastStartTagName: String
    
    var preprocessor: HiddenPreprocessor
    
    var returnState: String
    
    var state: String
    
    var tempBuff: js.Array[Double]
    
    var tokenQueue: js.Array[HiddenToken]
    
    def write(value: String): Unit
  }
  object HiddenTokenizer {
    
    inline def apply(
      NAMED_CHARACTER_REFERENCE_STATE: js.Function,
      NUMERIC_CHARACTER_REFERENCE_END_STATE: js.Function,
      __mixins: js.Array[HiddenLocationTracker],
      _consume: () => Double,
      _flushCodePointsConsumedAsCharacterReference: js.Function,
      active: Boolean,
      charRefCode: Double,
      consumedAfterSnapshot: Double,
      currentAttr: Any,
      lastStartTagName: String,
      preprocessor: HiddenPreprocessor,
      returnState: String,
      state: String,
      tempBuff: js.Array[Double],
      tokenQueue: js.Array[HiddenToken],
      write: String => Unit
    ): HiddenTokenizer = {
      val __obj = js.Dynamic.literal(NAMED_CHARACTER_REFERENCE_STATE = NAMED_CHARACTER_REFERENCE_STATE.asInstanceOf[js.Any], NUMERIC_CHARACTER_REFERENCE_END_STATE = NUMERIC_CHARACTER_REFERENCE_END_STATE.asInstanceOf[js.Any], __mixins = __mixins.asInstanceOf[js.Any], _consume = js.Any.fromFunction0(_consume), _flushCodePointsConsumedAsCharacterReference = _flushCodePointsConsumedAsCharacterReference.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], charRefCode = charRefCode.asInstanceOf[js.Any], consumedAfterSnapshot = consumedAfterSnapshot.asInstanceOf[js.Any], currentAttr = currentAttr.asInstanceOf[js.Any], lastStartTagName = lastStartTagName.asInstanceOf[js.Any], preprocessor = preprocessor.asInstanceOf[js.Any], returnState = returnState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tempBuff = tempBuff.asInstanceOf[js.Any], tokenQueue = tokenQueue.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[HiddenTokenizer]
    }
    
    extension [Self <: HiddenTokenizer](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setCharRefCode(value: Double): Self = StObject.set(x, "charRefCode", value.asInstanceOf[js.Any])
      
      inline def setConsumedAfterSnapshot(value: Double): Self = StObject.set(x, "consumedAfterSnapshot", value.asInstanceOf[js.Any])
      
      inline def setCurrentAttr(value: Any): Self = StObject.set(x, "currentAttr", value.asInstanceOf[js.Any])
      
      inline def setCurrentCharacterToken(value: HiddenToken): Self = StObject.set(x, "currentCharacterToken", value.asInstanceOf[js.Any])
      
      inline def setCurrentCharacterTokenUndefined: Self = StObject.set(x, "currentCharacterToken", js.undefined)
      
      inline def setCurrentToken(value: HiddenToken): Self = StObject.set(x, "currentToken", value.asInstanceOf[js.Any])
      
      inline def setCurrentTokenUndefined: Self = StObject.set(x, "currentToken", js.undefined)
      
      inline def setLastStartTagName(value: String): Self = StObject.set(x, "lastStartTagName", value.asInstanceOf[js.Any])
      
      inline def setNAMED_CHARACTER_REFERENCE_STATE(value: js.Function): Self = StObject.set(x, "NAMED_CHARACTER_REFERENCE_STATE", value.asInstanceOf[js.Any])
      
      inline def setNUMERIC_CHARACTER_REFERENCE_END_STATE(value: js.Function): Self = StObject.set(x, "NUMERIC_CHARACTER_REFERENCE_END_STATE", value.asInstanceOf[js.Any])
      
      inline def setPreprocessor(value: HiddenPreprocessor): Self = StObject.set(x, "preprocessor", value.asInstanceOf[js.Any])
      
      inline def setReturnState(value: String): Self = StObject.set(x, "returnState", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTempBuff(value: js.Array[Double]): Self = StObject.set(x, "tempBuff", value.asInstanceOf[js.Any])
      
      inline def setTempBuffVarargs(value: Double*): Self = StObject.set(x, "tempBuff", js.Array(value*))
      
      inline def setTokenQueue(value: js.Array[HiddenToken]): Self = StObject.set(x, "tokenQueue", value.asInstanceOf[js.Any])
      
      inline def setTokenQueueVarargs(value: HiddenToken*): Self = StObject.set(x, "tokenQueue", js.Array(value*))
      
      inline def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      
      inline def set__mixins(value: js.Array[HiddenLocationTracker]): Self = StObject.set(x, "__mixins", value.asInstanceOf[js.Any])
      
      inline def set__mixinsVarargs(value: HiddenLocationTracker*): Self = StObject.set(x, "__mixins", js.Array(value*))
      
      inline def set_consume(value: () => Double): Self = StObject.set(x, "_consume", js.Any.fromFunction0(value))
      
      inline def set_flushCodePointsConsumedAsCharacterReference(value: js.Function): Self = StObject.set(x, "_flushCodePointsConsumedAsCharacterReference", value.asInstanceOf[js.Any])
    }
  }
  
  type Node = Root | Content
  
  trait Options extends StObject {
    
    /**
      * List of custom hast node types to pass through (keep) in hast.
      * If the passed through nodes have children, those children are expected to
      * be hast and will be handled.
      */
    var passThrough: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPassThrough(value: js.Array[String]): Self = StObject.set(x, "passThrough", value.asInstanceOf[js.Any])
      
      inline def setPassThroughUndefined: Self = StObject.set(x, "passThrough", js.undefined)
      
      inline def setPassThroughVarargs(value: String*): Self = StObject.set(x, "passThrough", js.Array(value*))
    }
  }
  
  type P5Attribute = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parse5.Attribute */ Any
  
  type P5Document = Document
  
  /* Inlined std.Omit<hast-util-raw.hast-util-raw/lib.Element, 'parentNode'> */
  trait P5Element extends StObject {
    
    var children: js.Array[ElementContent]
    
    var content: js.UndefOr[typings.hast.mod.Root] = js.undefined
    
    var data: js.UndefOr[NodeData[typings.unist.mod.Node[Data]]] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var properties: js.UndefOr[Properties] = js.undefined
    
    var tagName: String
    
    var `type`: element
  }
  object P5Element {
    
    inline def apply(children: js.Array[ElementContent], tagName: String): P5Element = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("element")
      __obj.asInstanceOf[P5Element]
    }
    
    extension [Self <: P5Element](x: Self) {
      
      inline def setChildren(value: js.Array[ElementContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ElementContent*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setContent(value: typings.hast.mod.Root): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setData(value: NodeData[typings.unist.mod.Node[Data]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type P5Fragment = DocumentFragment
  
  /* Inlined std.Omit<std.Location, 'startOffset' | 'endOffset'> & {  startOffset :number | undefined,   endOffset :number | undefined} */
  trait P5Location extends StObject {
    
    var ancestorOrigins: DOMStringList
    
    def assign(url: String): Unit
    @JSName("assign")
    var assign_Original: js.Function1[/* url */ String, Unit]
    
    var endOffset: js.UndefOr[Double] = js.undefined
    
    var hash: String
    
    var host: String
    
    var hostname: String
    
    var href: String
    
    var origin: String
    
    var pathname: String
    
    var port: String
    
    var protocol: String
    
    def reload(): Unit
    @JSName("reload")
    var reload_Original: js.Function0[Unit]
    
    def replace(url: String): Unit
    @JSName("replace")
    var replace_Original: js.Function1[/* url */ String, Unit]
    
    var search: String
    
    var startOffset: js.UndefOr[Double] = js.undefined
    
    @JSName("toString")
    var toString_Original: js.Function0[String]
  }
  object P5Location {
    
    inline def apply(
      ancestorOrigins: DOMStringList,
      assign: /* url */ String => Unit,
      hash: String,
      host: String,
      hostname: String,
      href: String,
      origin: String,
      pathname: String,
      port: String,
      protocol: String,
      reload: () => Unit,
      replace: /* url */ String => Unit,
      search: String,
      toString_ : () => String
    ): P5Location = {
      val __obj = js.Dynamic.literal(ancestorOrigins = ancestorOrigins.asInstanceOf[js.Any], assign = js.Any.fromFunction1(assign), hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], reload = js.Any.fromFunction0(reload), replace = js.Any.fromFunction1(replace), search = search.asInstanceOf[js.Any])
      __obj.updateDynamic("toString")(js.Any.fromFunction0(toString_))
      __obj.asInstanceOf[P5Location]
    }
    
    extension [Self <: P5Location](x: Self) {
      
      inline def setAncestorOrigins(value: DOMStringList): Self = StObject.set(x, "ancestorOrigins", value.asInstanceOf[js.Any])
      
      inline def setAssign(value: /* url */ String => Unit): Self = StObject.set(x, "assign", js.Any.fromFunction1(value))
      
      inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
      
      inline def setEndOffsetUndefined: Self = StObject.set(x, "endOffset", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setReload(value: () => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction0(value))
      
      inline def setReplace(value: /* url */ String => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
      
      inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
      
      inline def setToString_(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
    }
  }
  
  type P5ParserOptions = ParserOptions[TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]]
  
  type Raw_ = Raw
  
  type Root = typings.hast.mod.Root
  
  /* Inlined std.Omit<hast-util-raw.hast-util-raw/lib.Comment, 'value'> & {  value :{  stitch :hast-util-raw.hast-util-raw/lib.Node}} */
  trait Stitch extends StObject {
    
    var data: js.UndefOr[Data] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var `type`: comment
    
    var value: typings.hastUtilRaw.anon.Stitch
  }
  object Stitch {
    
    inline def apply(value: typings.hastUtilRaw.anon.Stitch): Stitch = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("comment")
      __obj.asInstanceOf[Stitch]
    }
    
    extension [Self <: Stitch](x: Self) {
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setType(value: comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: typings.hastUtilRaw.anon.Stitch): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Text = typings.hast.mod.Text
  
  type VFile = typings.vfile.mod.VFile
}
