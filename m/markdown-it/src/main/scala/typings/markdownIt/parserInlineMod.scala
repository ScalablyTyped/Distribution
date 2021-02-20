package typings.markdownIt

import org.scalablytyped.runtime.Instantiable4
import typings.markdownIt.libMod.MarkdownIt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserInlineMod {
  
  @JSImport("markdown-it/lib/parser_inline", JSImport.Namespace)
  @js.native
  class ^ () extends ParserInline
  
  @js.native
  trait ParserInline extends StObject {
    
    var State: Instantiable4[
        /* src */ String, 
        /* md */ MarkdownIt, 
        /* env */ js.Any, 
        /* outTokens */ js.Array[typings.markdownIt.tokenMod.^], 
        typings.markdownIt.stateInlineMod.^
      ] = js.native
    
    /**
      * Process input string and push inline tokens into `outTokens`
      */
    def parse(str: String, md: MarkdownIt, env: js.Any, outTokens: js.Array[typings.markdownIt.tokenMod.^]): Unit = js.native
    
    /**
      * [[Ruler]] instance. Keep configuration of inline rules.
      */
    var ruler: typings.markdownIt.rulerMod.^[RuleInline] = js.native
    
    /**
      * [[Ruler]] instance. Second ruler used for post-processing
      * (e.g. in emphasis-like rules).
      */
    var ruler2: typings.markdownIt.rulerMod.^[RuleInline2] = js.native
    
    /**
      * Skip single token by running all rules in validation mode;
      * returns `true` if any rule reported success
      */
    def skipToken(state: typings.markdownIt.stateInlineMod.^): Unit = js.native
    
    /**
      * Generate tokens for input range
      */
    def tokenize(state: typings.markdownIt.stateInlineMod.^): Unit = js.native
  }
  object ParserInline {
    
    @scala.inline
    def apply(
      State: Instantiable4[
          /* src */ String, 
          /* md */ MarkdownIt, 
          /* env */ js.Any, 
          /* outTokens */ js.Array[typings.markdownIt.tokenMod.^], 
          typings.markdownIt.stateInlineMod.^
        ],
      parse: (String, MarkdownIt, js.Any, js.Array[typings.markdownIt.tokenMod.^]) => Unit,
      ruler: typings.markdownIt.rulerMod.^[RuleInline],
      ruler2: typings.markdownIt.rulerMod.^[RuleInline2],
      skipToken: typings.markdownIt.stateInlineMod.^ => Unit,
      tokenize: typings.markdownIt.stateInlineMod.^ => Unit
    ): ParserInline = {
      val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], parse = js.Any.fromFunction4(parse), ruler = ruler.asInstanceOf[js.Any], ruler2 = ruler2.asInstanceOf[js.Any], skipToken = js.Any.fromFunction1(skipToken), tokenize = js.Any.fromFunction1(tokenize))
      __obj.asInstanceOf[ParserInline]
    }
    
    @scala.inline
    implicit class ParserInlineMutableBuilder[Self <: ParserInline] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParse(value: (String, MarkdownIt, js.Any, js.Array[typings.markdownIt.tokenMod.^]) => Unit): Self = StObject.set(x, "parse", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRuler(value: typings.markdownIt.rulerMod.^[RuleInline]): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuler2(value: typings.markdownIt.rulerMod.^[RuleInline2]): Self = StObject.set(x, "ruler2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipToken(value: typings.markdownIt.stateInlineMod.^ => Unit): Self = StObject.set(x, "skipToken", js.Any.fromFunction1(value))
      
      @scala.inline
      def setState(
        value: Instantiable4[
              /* src */ String, 
              /* md */ MarkdownIt, 
              /* env */ js.Any, 
              /* outTokens */ js.Array[typings.markdownIt.tokenMod.^], 
              typings.markdownIt.stateInlineMod.^
            ]
      ): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenize(value: typings.markdownIt.stateInlineMod.^ => Unit): Self = StObject.set(x, "tokenize", js.Any.fromFunction1(value))
    }
  }
  
  type RuleInline = js.Function2[/* state */ typings.markdownIt.stateInlineMod.^, /* silent */ Boolean, Boolean]
  
  type RuleInline2 = js.Function1[/* state */ typings.markdownIt.stateInlineMod.^, Boolean]
}
