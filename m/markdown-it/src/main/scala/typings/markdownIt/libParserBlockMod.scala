package typings.markdownIt

import org.scalablytyped.runtime.Instantiable4
import typings.markdownIt.libMod.MarkdownIt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParserBlockMod {
  
  @JSImport("markdown-it/lib/parser_block", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ParserBlock {
    
    /* CompleteClass */
    var State: Instantiable4[
        /* src */ String, 
        /* md */ MarkdownIt, 
        /* env */ Any, 
        /* tokens */ js.Array[typings.markdownIt.libTokenMod.^], 
        typings.markdownIt.libRulesBlockStateBlockMod.^
      ] = js.native
    
    /**
      * Process input string and push block tokens into `outTokens`
      */
    /* CompleteClass */
    override def parse(str: String, md: MarkdownIt, env: Any, outTokens: js.Array[typings.markdownIt.libTokenMod.^]): Unit = js.native
    
    /**
      * [[Ruler]] instance. Keep configuration of block rules.
      */
    /* CompleteClass */
    var ruler: typings.markdownIt.libRulerMod.^[RuleBlock] = js.native
    
    /**
      * Generate tokens for input range
      */
    /* CompleteClass */
    override def tokenize(state: typings.markdownIt.libRulesBlockStateBlockMod.^, startLine: Double, endLine: Double): Unit = js.native
  }
  
  trait ParserBlock extends StObject {
    
    var State: Instantiable4[
        /* src */ String, 
        /* md */ MarkdownIt, 
        /* env */ Any, 
        /* tokens */ js.Array[typings.markdownIt.libTokenMod.^], 
        typings.markdownIt.libRulesBlockStateBlockMod.^
      ]
    
    /**
      * Process input string and push block tokens into `outTokens`
      */
    def parse(str: String, md: MarkdownIt, env: Any, outTokens: js.Array[typings.markdownIt.libTokenMod.^]): Unit
    
    /**
      * [[Ruler]] instance. Keep configuration of block rules.
      */
    var ruler: typings.markdownIt.libRulerMod.^[RuleBlock]
    
    /**
      * Generate tokens for input range
      */
    def tokenize(state: typings.markdownIt.libRulesBlockStateBlockMod.^, startLine: Double, endLine: Double): Unit
  }
  object ParserBlock {
    
    inline def apply(
      State: Instantiable4[
          /* src */ String, 
          /* md */ MarkdownIt, 
          /* env */ Any, 
          /* tokens */ js.Array[typings.markdownIt.libTokenMod.^], 
          typings.markdownIt.libRulesBlockStateBlockMod.^
        ],
      parse: (String, MarkdownIt, Any, js.Array[typings.markdownIt.libTokenMod.^]) => Unit,
      ruler: typings.markdownIt.libRulerMod.^[RuleBlock],
      tokenize: (typings.markdownIt.libRulesBlockStateBlockMod.^, Double, Double) => Unit
    ): ParserBlock = {
      val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], parse = js.Any.fromFunction4(parse), ruler = ruler.asInstanceOf[js.Any], tokenize = js.Any.fromFunction3(tokenize))
      __obj.asInstanceOf[ParserBlock]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParserBlock] (val x: Self) extends AnyVal {
      
      inline def setParse(value: (String, MarkdownIt, Any, js.Array[typings.markdownIt.libTokenMod.^]) => Unit): Self = StObject.set(x, "parse", js.Any.fromFunction4(value))
      
      inline def setRuler(value: typings.markdownIt.libRulerMod.^[RuleBlock]): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
      
      inline def setState(
        value: Instantiable4[
              /* src */ String, 
              /* md */ MarkdownIt, 
              /* env */ Any, 
              /* tokens */ js.Array[typings.markdownIt.libTokenMod.^], 
              typings.markdownIt.libRulesBlockStateBlockMod.^
            ]
      ): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      inline def setTokenize(value: (typings.markdownIt.libRulesBlockStateBlockMod.^, Double, Double) => Unit): Self = StObject.set(x, "tokenize", js.Any.fromFunction3(value))
    }
  }
  
  type RuleBlock = js.Function4[
    /* state */ typings.markdownIt.libRulesBlockStateBlockMod.^, 
    /* startLine */ Double, 
    /* endLine */ Double, 
    /* silent */ Boolean, 
    Boolean
  ]
}
