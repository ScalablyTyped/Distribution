package typings.markdownIt

import org.scalablytyped.runtime.Instantiable4
import typings.markdownIt.libMod.MarkdownIt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserBlockMod {
  
  @JSImport("markdown-it/lib/parser_block", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with ParserBlock {
    
    /* CompleteClass */
    var State: Instantiable4[
        /* src */ String, 
        /* md */ MarkdownIt, 
        /* env */ js.Any, 
        /* tokens */ js.Array[typings.markdownIt.tokenMod.^], 
        typings.markdownIt.stateBlockMod.^
      ] = js.native
    
    /**
      * Process input string and push block tokens into `outTokens`
      */
    /* CompleteClass */
    override def parse(str: String, md: MarkdownIt, env: js.Any, outTokens: js.Array[typings.markdownIt.tokenMod.^]): Unit = js.native
    
    /**
      * [[Ruler]] instance. Keep configuration of block rules.
      */
    /* CompleteClass */
    var ruler: typings.markdownIt.rulerMod.^[RuleBlock] = js.native
    
    /**
      * Generate tokens for input range
      */
    /* CompleteClass */
    override def tokenize(state: typings.markdownIt.stateBlockMod.^, startLine: Double, endLine: Double): Unit = js.native
  }
  
  trait ParserBlock extends StObject {
    
    var State: Instantiable4[
        /* src */ String, 
        /* md */ MarkdownIt, 
        /* env */ js.Any, 
        /* tokens */ js.Array[typings.markdownIt.tokenMod.^], 
        typings.markdownIt.stateBlockMod.^
      ]
    
    /**
      * Process input string and push block tokens into `outTokens`
      */
    def parse(str: String, md: MarkdownIt, env: js.Any, outTokens: js.Array[typings.markdownIt.tokenMod.^]): Unit
    
    /**
      * [[Ruler]] instance. Keep configuration of block rules.
      */
    var ruler: typings.markdownIt.rulerMod.^[RuleBlock]
    
    /**
      * Generate tokens for input range
      */
    def tokenize(state: typings.markdownIt.stateBlockMod.^, startLine: Double, endLine: Double): Unit
  }
  object ParserBlock {
    
    @scala.inline
    def apply(
      State: Instantiable4[
          /* src */ String, 
          /* md */ MarkdownIt, 
          /* env */ js.Any, 
          /* tokens */ js.Array[typings.markdownIt.tokenMod.^], 
          typings.markdownIt.stateBlockMod.^
        ],
      parse: (String, MarkdownIt, js.Any, js.Array[typings.markdownIt.tokenMod.^]) => Unit,
      ruler: typings.markdownIt.rulerMod.^[RuleBlock],
      tokenize: (typings.markdownIt.stateBlockMod.^, Double, Double) => Unit
    ): ParserBlock = {
      val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], parse = js.Any.fromFunction4(parse), ruler = ruler.asInstanceOf[js.Any], tokenize = js.Any.fromFunction3(tokenize))
      __obj.asInstanceOf[ParserBlock]
    }
    
    @scala.inline
    implicit class ParserBlockMutableBuilder[Self <: ParserBlock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParse(value: (String, MarkdownIt, js.Any, js.Array[typings.markdownIt.tokenMod.^]) => Unit): Self = StObject.set(x, "parse", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRuler(value: typings.markdownIt.rulerMod.^[RuleBlock]): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(
        value: Instantiable4[
              /* src */ String, 
              /* md */ MarkdownIt, 
              /* env */ js.Any, 
              /* tokens */ js.Array[typings.markdownIt.tokenMod.^], 
              typings.markdownIt.stateBlockMod.^
            ]
      ): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenize(value: (typings.markdownIt.stateBlockMod.^, Double, Double) => Unit): Self = StObject.set(x, "tokenize", js.Any.fromFunction3(value))
    }
  }
  
  type RuleBlock = js.Function4[
    /* state */ typings.markdownIt.stateBlockMod.^, 
    /* startLine */ Double, 
    /* endLine */ Double, 
    /* silent */ Boolean, 
    Boolean
  ]
}
