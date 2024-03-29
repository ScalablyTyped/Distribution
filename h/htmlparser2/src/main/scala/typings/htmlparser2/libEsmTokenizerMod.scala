package typings.htmlparser2

import typings.htmlparser2.anon.DecodeEntities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmTokenizerMod {
  
  @JSImport("htmlparser2/lib/esm/Tokenizer", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Tokenizer {
    def this(param0: DecodeEntities, cbs: Callbacks) = this()
    
    /** Some behavior, eg. when decoding entities, is done while we are in another state. This keeps track of the other state type. */
    /* private */ /* CompleteClass */
    var baseState: Any = js.native
    
    /** The read buffer. */
    /* private */ /* CompleteClass */
    var buffer: Any = js.native
    
    /* private */ /* CompleteClass */
    override val cbs: Any = js.native
    
    /**
      * Remove data that has already been consumed from the buffer.
      */
    /* private */ /* CompleteClass */
    var cleanup: Any = js.native
    
    /* private */ /* CompleteClass */
    var currentSequence: Any = js.native
    
    /* private */ /* CompleteClass */
    override val decodeEntities: Any = js.native
    
    /* private */ /* CompleteClass */
    var emitCodePoint: Any = js.native
    
    /* CompleteClass */
    override def end(): Unit = js.native
    
    /* private */ /* CompleteClass */
    override val entityDecoder: Any = js.native
    
    /** The start of the last entity. */
    /* private */ /* CompleteClass */
    var entityStart: Any = js.native
    
    /**
      * When we wait for one specific character, we can speed things up
      * by skipping through the buffer until we find it.
      *
      * @returns Whether the character was found.
      */
    /* private */ /* CompleteClass */
    var fastForwardTo: Any = js.native
    
    /* private */ /* CompleteClass */
    var finish: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleInAttributeValue: Any = js.native
    
    /** Handle any trailing data. */
    /* private */ /* CompleteClass */
    var handleTrailingData: Any = js.native
    
    /** The index within the buffer that we are currently looking at. */
    /* private */ /* CompleteClass */
    var index: Any = js.native
    
    /** For special parsing behavior inside of script and style tags. */
    /* private */ /* CompleteClass */
    var isSpecial: Any = js.native
    
    /**
      * HTML only allows ASCII alpha characters (a-z and A-Z) at the beginning of a tag name.
      *
      * XML allows a lot more characters here (@see https://www.w3.org/TR/REC-xml/#NT-NameStartChar).
      * We allow anything that wouldn't end the tag.
      */
    /* private */ /* CompleteClass */
    var isTagStartChar: Any = js.native
    
    /** The offset of the current buffer. */
    /* private */ /* CompleteClass */
    var offset: Any = js.native
    
    /**
      * Iterates through the buffer, calling the function corresponding to the current state.
      *
      * States that are more likely to be hit are higher up, as a performance improvement.
      */
    /* private */ /* CompleteClass */
    var parse: Any = js.native
    
    /* CompleteClass */
    override def pause(): Unit = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def resume(): Unit = js.native
    
    /** Indicates whether the tokenizer has been paused. */
    /* CompleteClass */
    var running: Boolean = js.native
    
    /** The beginning of the section that is currently being read. */
    /* private */ /* CompleteClass */
    var sectionStart: Any = js.native
    
    /* private */ /* CompleteClass */
    var sequenceIndex: Any = js.native
    
    /* private */ /* CompleteClass */
    var shouldContinue: Any = js.native
    
    /* private */ /* CompleteClass */
    var startEntity: Any = js.native
    
    /* private */ /* CompleteClass */
    var startSpecial: Any = js.native
    
    /** The current state the tokenizer is in. */
    /* private */ /* CompleteClass */
    var state: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateAfterAttributeName: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateAfterClosingTagName: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateBeforeAttributeName: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateBeforeAttributeValue: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateBeforeClosingTagName: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateBeforeComment: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateBeforeDeclaration: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateBeforeSpecialS: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateBeforeTagName: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateCDATASequence: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateInAttributeName: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateInAttributeValueDoubleQuotes: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateInAttributeValueNoQuotes: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateInAttributeValueSingleQuotes: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateInClosingTagName: Any = js.native
    
    /**
      * Comments and CDATA end with `-->` and `]]>`.
      *
      * Their common qualities are:
      * - Their end sequences have a distinct character they start with.
      * - That character is then repeated, so we have to check multiple repeats.
      * - All characters but the start character of the sequence can be skipped.
      */
    /* private */ /* CompleteClass */
    var stateInCommentLike: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateInDeclaration: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateInEntity: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateInProcessingInstruction: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateInSelfClosingTag: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateInSpecialComment: Any = js.native
    
    /** Look for an end tag. For <title> tags, also decode entities. */
    /* private */ /* CompleteClass */
    var stateInSpecialTag: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateInTagName: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateSpecialStartSequence: Any = js.native
    
    /* private */ /* CompleteClass */
    var stateText: Any = js.native
    
    /* CompleteClass */
    override def write(chunk: String): Unit = js.native
    
    /* private */ /* CompleteClass */
    override val xmlMode: Any = js.native
  }
  
  @js.native
  sealed trait QuoteType extends StObject
  @JSImport("htmlparser2/lib/esm/Tokenizer", "QuoteType")
  @js.native
  object QuoteType extends StObject {
    
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[QuoteType & scala.Double] = js.native
    
    @js.native
    sealed trait Double
      extends StObject
         with QuoteType
    /* 3 */ val Double: typings.htmlparser2.libEsmTokenizerMod.QuoteType.Double & scala.Double = js.native
    
    @js.native
    sealed trait NoValue
      extends StObject
         with QuoteType
    /* 0 */ val NoValue: typings.htmlparser2.libEsmTokenizerMod.QuoteType.NoValue & scala.Double = js.native
    
    @js.native
    sealed trait Single
      extends StObject
         with QuoteType
    /* 2 */ val Single: typings.htmlparser2.libEsmTokenizerMod.QuoteType.Single & scala.Double = js.native
    
    @js.native
    sealed trait Unquoted
      extends StObject
         with QuoteType
    /* 1 */ val Unquoted: typings.htmlparser2.libEsmTokenizerMod.QuoteType.Unquoted & scala.Double = js.native
  }
  
  trait Callbacks extends StObject {
    
    def onattribdata(start: Double, endIndex: Double): Unit
    
    def onattribend(quote: QuoteType, endIndex: Double): Unit
    
    def onattribentity(codepoint: Double): Unit
    
    def onattribname(start: Double, endIndex: Double): Unit
    
    def oncdata(start: Double, endIndex: Double, endOffset: Double): Unit
    
    def onclosetag(start: Double, endIndex: Double): Unit
    
    def oncomment(start: Double, endIndex: Double, endOffset: Double): Unit
    
    def ondeclaration(start: Double, endIndex: Double): Unit
    
    def onend(): Unit
    
    def onopentagend(endIndex: Double): Unit
    
    def onopentagname(start: Double, endIndex: Double): Unit
    
    def onprocessinginstruction(start: Double, endIndex: Double): Unit
    
    def onselfclosingtag(endIndex: Double): Unit
    
    def ontext(start: Double, endIndex: Double): Unit
    
    def ontextentity(codepoint: Double, endIndex: Double): Unit
  }
  object Callbacks {
    
    inline def apply(
      onattribdata: (Double, Double) => Unit,
      onattribend: (QuoteType, Double) => Unit,
      onattribentity: Double => Unit,
      onattribname: (Double, Double) => Unit,
      oncdata: (Double, Double, Double) => Unit,
      onclosetag: (Double, Double) => Unit,
      oncomment: (Double, Double, Double) => Unit,
      ondeclaration: (Double, Double) => Unit,
      onend: () => Unit,
      onopentagend: Double => Unit,
      onopentagname: (Double, Double) => Unit,
      onprocessinginstruction: (Double, Double) => Unit,
      onselfclosingtag: Double => Unit,
      ontext: (Double, Double) => Unit,
      ontextentity: (Double, Double) => Unit
    ): Callbacks = {
      val __obj = js.Dynamic.literal(onattribdata = js.Any.fromFunction2(onattribdata), onattribend = js.Any.fromFunction2(onattribend), onattribentity = js.Any.fromFunction1(onattribentity), onattribname = js.Any.fromFunction2(onattribname), oncdata = js.Any.fromFunction3(oncdata), onclosetag = js.Any.fromFunction2(onclosetag), oncomment = js.Any.fromFunction3(oncomment), ondeclaration = js.Any.fromFunction2(ondeclaration), onend = js.Any.fromFunction0(onend), onopentagend = js.Any.fromFunction1(onopentagend), onopentagname = js.Any.fromFunction2(onopentagname), onprocessinginstruction = js.Any.fromFunction2(onprocessinginstruction), onselfclosingtag = js.Any.fromFunction1(onselfclosingtag), ontext = js.Any.fromFunction2(ontext), ontextentity = js.Any.fromFunction2(ontextentity))
      __obj.asInstanceOf[Callbacks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Callbacks] (val x: Self) extends AnyVal {
      
      inline def setOnattribdata(value: (Double, Double) => Unit): Self = StObject.set(x, "onattribdata", js.Any.fromFunction2(value))
      
      inline def setOnattribend(value: (QuoteType, Double) => Unit): Self = StObject.set(x, "onattribend", js.Any.fromFunction2(value))
      
      inline def setOnattribentity(value: Double => Unit): Self = StObject.set(x, "onattribentity", js.Any.fromFunction1(value))
      
      inline def setOnattribname(value: (Double, Double) => Unit): Self = StObject.set(x, "onattribname", js.Any.fromFunction2(value))
      
      inline def setOncdata(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "oncdata", js.Any.fromFunction3(value))
      
      inline def setOnclosetag(value: (Double, Double) => Unit): Self = StObject.set(x, "onclosetag", js.Any.fromFunction2(value))
      
      inline def setOncomment(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "oncomment", js.Any.fromFunction3(value))
      
      inline def setOndeclaration(value: (Double, Double) => Unit): Self = StObject.set(x, "ondeclaration", js.Any.fromFunction2(value))
      
      inline def setOnend(value: () => Unit): Self = StObject.set(x, "onend", js.Any.fromFunction0(value))
      
      inline def setOnopentagend(value: Double => Unit): Self = StObject.set(x, "onopentagend", js.Any.fromFunction1(value))
      
      inline def setOnopentagname(value: (Double, Double) => Unit): Self = StObject.set(x, "onopentagname", js.Any.fromFunction2(value))
      
      inline def setOnprocessinginstruction(value: (Double, Double) => Unit): Self = StObject.set(x, "onprocessinginstruction", js.Any.fromFunction2(value))
      
      inline def setOnselfclosingtag(value: Double => Unit): Self = StObject.set(x, "onselfclosingtag", js.Any.fromFunction1(value))
      
      inline def setOntext(value: (Double, Double) => Unit): Self = StObject.set(x, "ontext", js.Any.fromFunction2(value))
      
      inline def setOntextentity(value: (Double, Double) => Unit): Self = StObject.set(x, "ontextentity", js.Any.fromFunction2(value))
    }
  }
  
  trait Tokenizer extends StObject {
    
    /** Some behavior, eg. when decoding entities, is done while we are in another state. This keeps track of the other state type. */
    /* private */ var baseState: Any
    
    /** The read buffer. */
    /* private */ var buffer: Any
    
    /* private */ val cbs: Any
    
    /**
      * Remove data that has already been consumed from the buffer.
      */
    /* private */ var cleanup: Any
    
    /* private */ var currentSequence: Any
    
    /* private */ val decodeEntities: Any
    
    /* private */ var emitCodePoint: Any
    
    def end(): Unit
    
    /* private */ val entityDecoder: Any
    
    /** The start of the last entity. */
    /* private */ var entityStart: Any
    
    /**
      * When we wait for one specific character, we can speed things up
      * by skipping through the buffer until we find it.
      *
      * @returns Whether the character was found.
      */
    /* private */ var fastForwardTo: Any
    
    /* private */ var finish: Any
    
    /* private */ var handleInAttributeValue: Any
    
    /** Handle any trailing data. */
    /* private */ var handleTrailingData: Any
    
    /** The index within the buffer that we are currently looking at. */
    /* private */ var index: Any
    
    /** For special parsing behavior inside of script and style tags. */
    /* private */ var isSpecial: Any
    
    /**
      * HTML only allows ASCII alpha characters (a-z and A-Z) at the beginning of a tag name.
      *
      * XML allows a lot more characters here (@see https://www.w3.org/TR/REC-xml/#NT-NameStartChar).
      * We allow anything that wouldn't end the tag.
      */
    /* private */ var isTagStartChar: Any
    
    /** The offset of the current buffer. */
    /* private */ var offset: Any
    
    /**
      * Iterates through the buffer, calling the function corresponding to the current state.
      *
      * States that are more likely to be hit are higher up, as a performance improvement.
      */
    /* private */ var parse: Any
    
    def pause(): Unit
    
    def reset(): Unit
    
    def resume(): Unit
    
    /** Indicates whether the tokenizer has been paused. */
    var running: Boolean
    
    /** The beginning of the section that is currently being read. */
    /* private */ var sectionStart: Any
    
    /* private */ var sequenceIndex: Any
    
    /* private */ var shouldContinue: Any
    
    /* private */ var startEntity: Any
    
    /* private */ var startSpecial: Any
    
    /** The current state the tokenizer is in. */
    /* private */ var state: Any
    
    /* private */ var stateAfterAttributeName: Any
    
    /* private */ var stateAfterClosingTagName: Any
    
    /* private */ var stateBeforeAttributeName: Any
    
    /* private */ var stateBeforeAttributeValue: Any
    
    /* private */ var stateBeforeClosingTagName: Any
    
    /* private */ var stateBeforeComment: Any
    
    /* private */ var stateBeforeDeclaration: Any
    
    /* private */ var stateBeforeSpecialS: Any
    
    /* private */ var stateBeforeTagName: Any
    
    /* private */ var stateCDATASequence: Any
    
    /* private */ var stateInAttributeName: Any
    
    /* private */ var stateInAttributeValueDoubleQuotes: Any
    
    /* private */ var stateInAttributeValueNoQuotes: Any
    
    /* private */ var stateInAttributeValueSingleQuotes: Any
    
    /* private */ var stateInClosingTagName: Any
    
    /**
      * Comments and CDATA end with `-->` and `]]>`.
      *
      * Their common qualities are:
      * - Their end sequences have a distinct character they start with.
      * - That character is then repeated, so we have to check multiple repeats.
      * - All characters but the start character of the sequence can be skipped.
      */
    /* private */ var stateInCommentLike: Any
    
    /* private */ var stateInDeclaration: Any
    
    /* private */ var stateInEntity: Any
    
    /* private */ var stateInProcessingInstruction: Any
    
    /* private */ var stateInSelfClosingTag: Any
    
    /* private */ var stateInSpecialComment: Any
    
    /** Look for an end tag. For <title> tags, also decode entities. */
    /* private */ var stateInSpecialTag: Any
    
    /* private */ var stateInTagName: Any
    
    /* private */ var stateSpecialStartSequence: Any
    
    /* private */ var stateText: Any
    
    def write(chunk: String): Unit
    
    /* private */ val xmlMode: Any
  }
  object Tokenizer {
    
    inline def apply(
      baseState: Any,
      buffer: Any,
      cbs: Any,
      cleanup: Any,
      currentSequence: Any,
      decodeEntities: Any,
      emitCodePoint: Any,
      end: () => Unit,
      entityDecoder: Any,
      entityStart: Any,
      fastForwardTo: Any,
      finish: Any,
      handleInAttributeValue: Any,
      handleTrailingData: Any,
      index: Any,
      isSpecial: Any,
      isTagStartChar: Any,
      offset: Any,
      parse: Any,
      pause: () => Unit,
      reset: () => Unit,
      resume: () => Unit,
      running: Boolean,
      sectionStart: Any,
      sequenceIndex: Any,
      shouldContinue: Any,
      startEntity: Any,
      startSpecial: Any,
      state: Any,
      stateAfterAttributeName: Any,
      stateAfterClosingTagName: Any,
      stateBeforeAttributeName: Any,
      stateBeforeAttributeValue: Any,
      stateBeforeClosingTagName: Any,
      stateBeforeComment: Any,
      stateBeforeDeclaration: Any,
      stateBeforeSpecialS: Any,
      stateBeforeTagName: Any,
      stateCDATASequence: Any,
      stateInAttributeName: Any,
      stateInAttributeValueDoubleQuotes: Any,
      stateInAttributeValueNoQuotes: Any,
      stateInAttributeValueSingleQuotes: Any,
      stateInClosingTagName: Any,
      stateInCommentLike: Any,
      stateInDeclaration: Any,
      stateInEntity: Any,
      stateInProcessingInstruction: Any,
      stateInSelfClosingTag: Any,
      stateInSpecialComment: Any,
      stateInSpecialTag: Any,
      stateInTagName: Any,
      stateSpecialStartSequence: Any,
      stateText: Any,
      write: String => Unit,
      xmlMode: Any
    ): Tokenizer = {
      val __obj = js.Dynamic.literal(baseState = baseState.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], cbs = cbs.asInstanceOf[js.Any], cleanup = cleanup.asInstanceOf[js.Any], currentSequence = currentSequence.asInstanceOf[js.Any], decodeEntities = decodeEntities.asInstanceOf[js.Any], emitCodePoint = emitCodePoint.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), entityDecoder = entityDecoder.asInstanceOf[js.Any], entityStart = entityStart.asInstanceOf[js.Any], fastForwardTo = fastForwardTo.asInstanceOf[js.Any], finish = finish.asInstanceOf[js.Any], handleInAttributeValue = handleInAttributeValue.asInstanceOf[js.Any], handleTrailingData = handleTrailingData.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isSpecial = isSpecial.asInstanceOf[js.Any], isTagStartChar = isTagStartChar.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), reset = js.Any.fromFunction0(reset), resume = js.Any.fromFunction0(resume), running = running.asInstanceOf[js.Any], sectionStart = sectionStart.asInstanceOf[js.Any], sequenceIndex = sequenceIndex.asInstanceOf[js.Any], shouldContinue = shouldContinue.asInstanceOf[js.Any], startEntity = startEntity.asInstanceOf[js.Any], startSpecial = startSpecial.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateAfterAttributeName = stateAfterAttributeName.asInstanceOf[js.Any], stateAfterClosingTagName = stateAfterClosingTagName.asInstanceOf[js.Any], stateBeforeAttributeName = stateBeforeAttributeName.asInstanceOf[js.Any], stateBeforeAttributeValue = stateBeforeAttributeValue.asInstanceOf[js.Any], stateBeforeClosingTagName = stateBeforeClosingTagName.asInstanceOf[js.Any], stateBeforeComment = stateBeforeComment.asInstanceOf[js.Any], stateBeforeDeclaration = stateBeforeDeclaration.asInstanceOf[js.Any], stateBeforeSpecialS = stateBeforeSpecialS.asInstanceOf[js.Any], stateBeforeTagName = stateBeforeTagName.asInstanceOf[js.Any], stateCDATASequence = stateCDATASequence.asInstanceOf[js.Any], stateInAttributeName = stateInAttributeName.asInstanceOf[js.Any], stateInAttributeValueDoubleQuotes = stateInAttributeValueDoubleQuotes.asInstanceOf[js.Any], stateInAttributeValueNoQuotes = stateInAttributeValueNoQuotes.asInstanceOf[js.Any], stateInAttributeValueSingleQuotes = stateInAttributeValueSingleQuotes.asInstanceOf[js.Any], stateInClosingTagName = stateInClosingTagName.asInstanceOf[js.Any], stateInCommentLike = stateInCommentLike.asInstanceOf[js.Any], stateInDeclaration = stateInDeclaration.asInstanceOf[js.Any], stateInEntity = stateInEntity.asInstanceOf[js.Any], stateInProcessingInstruction = stateInProcessingInstruction.asInstanceOf[js.Any], stateInSelfClosingTag = stateInSelfClosingTag.asInstanceOf[js.Any], stateInSpecialComment = stateInSpecialComment.asInstanceOf[js.Any], stateInSpecialTag = stateInSpecialTag.asInstanceOf[js.Any], stateInTagName = stateInTagName.asInstanceOf[js.Any], stateSpecialStartSequence = stateSpecialStartSequence.asInstanceOf[js.Any], stateText = stateText.asInstanceOf[js.Any], write = js.Any.fromFunction1(write), xmlMode = xmlMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tokenizer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tokenizer] (val x: Self) extends AnyVal {
      
      inline def setBaseState(value: Any): Self = StObject.set(x, "baseState", value.asInstanceOf[js.Any])
      
      inline def setBuffer(value: Any): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setCbs(value: Any): Self = StObject.set(x, "cbs", value.asInstanceOf[js.Any])
      
      inline def setCleanup(value: Any): Self = StObject.set(x, "cleanup", value.asInstanceOf[js.Any])
      
      inline def setCurrentSequence(value: Any): Self = StObject.set(x, "currentSequence", value.asInstanceOf[js.Any])
      
      inline def setDecodeEntities(value: Any): Self = StObject.set(x, "decodeEntities", value.asInstanceOf[js.Any])
      
      inline def setEmitCodePoint(value: Any): Self = StObject.set(x, "emitCodePoint", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setEntityDecoder(value: Any): Self = StObject.set(x, "entityDecoder", value.asInstanceOf[js.Any])
      
      inline def setEntityStart(value: Any): Self = StObject.set(x, "entityStart", value.asInstanceOf[js.Any])
      
      inline def setFastForwardTo(value: Any): Self = StObject.set(x, "fastForwardTo", value.asInstanceOf[js.Any])
      
      inline def setFinish(value: Any): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
      
      inline def setHandleInAttributeValue(value: Any): Self = StObject.set(x, "handleInAttributeValue", value.asInstanceOf[js.Any])
      
      inline def setHandleTrailingData(value: Any): Self = StObject.set(x, "handleTrailingData", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIsSpecial(value: Any): Self = StObject.set(x, "isSpecial", value.asInstanceOf[js.Any])
      
      inline def setIsTagStartChar(value: Any): Self = StObject.set(x, "isTagStartChar", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setParse(value: Any): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
      
      inline def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
      
      inline def setSectionStart(value: Any): Self = StObject.set(x, "sectionStart", value.asInstanceOf[js.Any])
      
      inline def setSequenceIndex(value: Any): Self = StObject.set(x, "sequenceIndex", value.asInstanceOf[js.Any])
      
      inline def setShouldContinue(value: Any): Self = StObject.set(x, "shouldContinue", value.asInstanceOf[js.Any])
      
      inline def setStartEntity(value: Any): Self = StObject.set(x, "startEntity", value.asInstanceOf[js.Any])
      
      inline def setStartSpecial(value: Any): Self = StObject.set(x, "startSpecial", value.asInstanceOf[js.Any])
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateAfterAttributeName(value: Any): Self = StObject.set(x, "stateAfterAttributeName", value.asInstanceOf[js.Any])
      
      inline def setStateAfterClosingTagName(value: Any): Self = StObject.set(x, "stateAfterClosingTagName", value.asInstanceOf[js.Any])
      
      inline def setStateBeforeAttributeName(value: Any): Self = StObject.set(x, "stateBeforeAttributeName", value.asInstanceOf[js.Any])
      
      inline def setStateBeforeAttributeValue(value: Any): Self = StObject.set(x, "stateBeforeAttributeValue", value.asInstanceOf[js.Any])
      
      inline def setStateBeforeClosingTagName(value: Any): Self = StObject.set(x, "stateBeforeClosingTagName", value.asInstanceOf[js.Any])
      
      inline def setStateBeforeComment(value: Any): Self = StObject.set(x, "stateBeforeComment", value.asInstanceOf[js.Any])
      
      inline def setStateBeforeDeclaration(value: Any): Self = StObject.set(x, "stateBeforeDeclaration", value.asInstanceOf[js.Any])
      
      inline def setStateBeforeSpecialS(value: Any): Self = StObject.set(x, "stateBeforeSpecialS", value.asInstanceOf[js.Any])
      
      inline def setStateBeforeTagName(value: Any): Self = StObject.set(x, "stateBeforeTagName", value.asInstanceOf[js.Any])
      
      inline def setStateCDATASequence(value: Any): Self = StObject.set(x, "stateCDATASequence", value.asInstanceOf[js.Any])
      
      inline def setStateInAttributeName(value: Any): Self = StObject.set(x, "stateInAttributeName", value.asInstanceOf[js.Any])
      
      inline def setStateInAttributeValueDoubleQuotes(value: Any): Self = StObject.set(x, "stateInAttributeValueDoubleQuotes", value.asInstanceOf[js.Any])
      
      inline def setStateInAttributeValueNoQuotes(value: Any): Self = StObject.set(x, "stateInAttributeValueNoQuotes", value.asInstanceOf[js.Any])
      
      inline def setStateInAttributeValueSingleQuotes(value: Any): Self = StObject.set(x, "stateInAttributeValueSingleQuotes", value.asInstanceOf[js.Any])
      
      inline def setStateInClosingTagName(value: Any): Self = StObject.set(x, "stateInClosingTagName", value.asInstanceOf[js.Any])
      
      inline def setStateInCommentLike(value: Any): Self = StObject.set(x, "stateInCommentLike", value.asInstanceOf[js.Any])
      
      inline def setStateInDeclaration(value: Any): Self = StObject.set(x, "stateInDeclaration", value.asInstanceOf[js.Any])
      
      inline def setStateInEntity(value: Any): Self = StObject.set(x, "stateInEntity", value.asInstanceOf[js.Any])
      
      inline def setStateInProcessingInstruction(value: Any): Self = StObject.set(x, "stateInProcessingInstruction", value.asInstanceOf[js.Any])
      
      inline def setStateInSelfClosingTag(value: Any): Self = StObject.set(x, "stateInSelfClosingTag", value.asInstanceOf[js.Any])
      
      inline def setStateInSpecialComment(value: Any): Self = StObject.set(x, "stateInSpecialComment", value.asInstanceOf[js.Any])
      
      inline def setStateInSpecialTag(value: Any): Self = StObject.set(x, "stateInSpecialTag", value.asInstanceOf[js.Any])
      
      inline def setStateInTagName(value: Any): Self = StObject.set(x, "stateInTagName", value.asInstanceOf[js.Any])
      
      inline def setStateSpecialStartSequence(value: Any): Self = StObject.set(x, "stateSpecialStartSequence", value.asInstanceOf[js.Any])
      
      inline def setStateText(value: Any): Self = StObject.set(x, "stateText", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      
      inline def setXmlMode(value: Any): Self = StObject.set(x, "xmlMode", value.asInstanceOf[js.Any])
    }
  }
}
