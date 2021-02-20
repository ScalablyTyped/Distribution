package typings.markdownIt

import org.scalablytyped.runtime.Instantiable3
import typings.markdownIt.libMod.MarkdownIt
import typings.markdownIt.tokenMod.Nesting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateInlineMod {
  
  @JSImport("markdown-it/lib/rules_inline/state_inline", JSImport.Namespace)
  @js.native
  class ^ protected () extends StateInline {
    def this(src: String, md: MarkdownIt, env: js.Any, outTokens: js.Array[typings.markdownIt.tokenMod.^]) = this()
  }
  
  @js.native
  trait Delimiter extends StObject {
    
    var close: Boolean = js.native
    
    var end: Double = js.native
    
    var jump: Double = js.native
    
    var length: Double = js.native
    
    var marker: Double = js.native
    
    var open: Boolean = js.native
    
    var token: Double = js.native
  }
  object Delimiter {
    
    @scala.inline
    def apply(
      close: Boolean,
      end: Double,
      jump: Double,
      length: Double,
      marker: Double,
      open: Boolean,
      token: Double
    ): Delimiter = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], jump = jump.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delimiter]
    }
    
    @scala.inline
    implicit class DelimiterMutableBuilder[Self <: Delimiter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJump(value: Double): Self = StObject.set(x, "jump", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarker(value: Double): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: Double): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Scanned extends StObject {
    
    var can_close: Boolean = js.native
    
    var can_open: Boolean = js.native
    
    var length: Double = js.native
  }
  object Scanned {
    
    @scala.inline
    def apply(can_close: Boolean, can_open: Boolean, length: Double): Scanned = {
      val __obj = js.Dynamic.literal(can_close = can_close.asInstanceOf[js.Any], can_open = can_open.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scanned]
    }
    
    @scala.inline
    implicit class ScannedMutableBuilder[Self <: Scanned] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCan_close(value: Boolean): Self = StObject.set(x, "can_close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_open(value: Boolean): Self = StObject.set(x, "can_open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StateInline extends StObject {
    
    var Token: Instantiable3[
        /* type */ String, 
        /* tag */ String, 
        /* nesting */ Nesting, 
        typings.markdownIt.tokenMod.^
      ] = js.native
    
    /**
      * Stores { start: end } pairs. Useful for backtrack
      * optimization of pairs parse (emphasis, strikes).
      */
    var cache: js.Any = js.native
    
    /**
      * List of emphasis-like delimiters for current tag
      */
    var delimiters: js.Array[Delimiter] = js.native
    
    var env: js.Any = js.native
    
    var level: Double = js.native
    
    var md: MarkdownIt = js.native
    
    var pending: String = js.native
    
    var pendingLevel: Double = js.native
    
    var pos: Double = js.native
    
    var posMax: Double = js.native
    
    /**
      * Push new token to "stream".
      * If pending text exists - flush it as text token
      */
    def push(`type`: String, tag: String, nesting: Nesting): typings.markdownIt.tokenMod.^ = js.native
    
    // Stack of delimiter lists for upper level tags
    // _prev_delimiters: StateInline.Delimiter[][];
    /**
      * Flush pending text
      */
    def pushPending(): typings.markdownIt.tokenMod.^ = js.native
    
    /**
      * Scan a sequence of emphasis-like markers, and determine whether
      * it can start an emphasis sequence or end an emphasis sequence.
      *
      * @param start position to scan from (it should point at a valid marker);
      * @param canSplitWord determine if these markers can be found inside a word
      */
    def scanDelims(start: Double, canSplitWord: Boolean): Scanned = js.native
    
    var src: String = js.native
    
    var tokens: js.Array[typings.markdownIt.tokenMod.^] = js.native
    
    var tokens_meta: js.Array[TokenMata | Null] = js.native
  }
  object StateInline {
    
    @scala.inline
    def apply(
      Token: Instantiable3[
          /* type */ String, 
          /* tag */ String, 
          /* nesting */ Nesting, 
          typings.markdownIt.tokenMod.^
        ],
      cache: js.Any,
      delimiters: js.Array[Delimiter],
      env: js.Any,
      level: Double,
      md: MarkdownIt,
      pending: String,
      pendingLevel: Double,
      pos: Double,
      posMax: Double,
      push: (String, String, Nesting) => typings.markdownIt.tokenMod.^,
      pushPending: () => typings.markdownIt.tokenMod.^,
      scanDelims: (Double, Boolean) => Scanned,
      src: String,
      tokens: js.Array[typings.markdownIt.tokenMod.^],
      tokens_meta: js.Array[TokenMata | Null]
    ): StateInline = {
      val __obj = js.Dynamic.literal(Token = Token.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], delimiters = delimiters.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], pendingLevel = pendingLevel.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], posMax = posMax.asInstanceOf[js.Any], push = js.Any.fromFunction3(push), pushPending = js.Any.fromFunction0(pushPending), scanDelims = js.Any.fromFunction2(scanDelims), src = src.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], tokens_meta = tokens_meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateInline]
    }
    
    @scala.inline
    implicit class StateInlineMutableBuilder[Self <: StateInline] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: js.Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiters(value: js.Array[Delimiter]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimitersVarargs(value: Delimiter*): Self = StObject.set(x, "delimiters", js.Array(value :_*))
      
      @scala.inline
      def setEnv(value: js.Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMd(value: MarkdownIt): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPending(value: String): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPendingLevel(value: Double): Self = StObject.set(x, "pendingLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosMax(value: Double): Self = StObject.set(x, "posMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPush(value: (String, String, Nesting) => typings.markdownIt.tokenMod.^): Self = StObject.set(x, "push", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPushPending(value: () => typings.markdownIt.tokenMod.^): Self = StObject.set(x, "pushPending", js.Any.fromFunction0(value))
      
      @scala.inline
      def setScanDelims(value: (Double, Boolean) => Scanned): Self = StObject.set(x, "scanDelims", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(
        value: Instantiable3[
              /* type */ String, 
              /* tag */ String, 
              /* nesting */ Nesting, 
              typings.markdownIt.tokenMod.^
            ]
      ): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokens(value: js.Array[typings.markdownIt.tokenMod.^]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokensVarargs(value: typings.markdownIt.tokenMod.^ *): Self = StObject.set(x, "tokens", js.Array(value :_*))
      
      @scala.inline
      def setTokens_meta(value: js.Array[TokenMata | Null]): Self = StObject.set(x, "tokens_meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokens_metaVarargs(value: (TokenMata | Null)*): Self = StObject.set(x, "tokens_meta", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TokenMata extends StObject {
    
    var delimiters: js.Array[Delimiter] = js.native
  }
  object TokenMata {
    
    @scala.inline
    def apply(delimiters: js.Array[Delimiter]): TokenMata = {
      val __obj = js.Dynamic.literal(delimiters = delimiters.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenMata]
    }
    
    @scala.inline
    implicit class TokenMataMutableBuilder[Self <: TokenMata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelimiters(value: js.Array[Delimiter]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimitersVarargs(value: Delimiter*): Self = StObject.set(x, "delimiters", js.Array(value :_*))
    }
  }
}
