package typings.idyllCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Compiles the given idyllMarkup and returns an AST either synchronously
    * or asynchronously.
    *
    * If postProcessors are provided or options.async is set to true:
    *      compiler returns a promise
    * Otherwise, compile returns the AST synchronously
    *
    */
  @JSImport("idyll-compiler", JSImport.Namespace)
  @js.native
  def apply(input: String): js.Promise[AST] | AST = js.native
  @JSImport("idyll-compiler", JSImport.Namespace)
  @js.native
  def apply(input: String, options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Promise[AST] | AST = js.native
  @JSImport("idyll-compiler", JSImport.Namespace)
  @js.native
  def apply(input: String, options: Options): js.Promise[AST] | AST = js.native
  @JSImport("idyll-compiler", JSImport.Namespace)
  @js.native
  def apply(input: String, options: Options, callback: js.Function0[Unit]): js.Promise[AST] | AST = js.native
  
  type AST = js.Array[Node]
  
  type Node = TreeNode | String
  
  @js.native
  trait Options extends StObject {
    
    /**
      * If false and there is no postprocessors, compiler returns the AST synchronously
      * Otherwise, a promise is returned
      *
      */
    var async: js.UndefOr[Boolean] = js.native
    
    /**
      * compiler plugins
      * If provided, compiler always compiles asynchronously
      */
    var postProcessors: js.UndefOr[js.Array[PostProcessor]] = js.native
    
    var smartquotes: js.UndefOr[Boolean] = js.native
    
    var spellcheck: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setPostProcessors(value: js.Array[PostProcessor]): Self = StObject.set(x, "postProcessors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostProcessorsUndefined: Self = StObject.set(x, "postProcessors", js.undefined)
      
      @scala.inline
      def setPostProcessorsVarargs(value: PostProcessor*): Self = StObject.set(x, "postProcessors", js.Array(value :_*))
      
      @scala.inline
      def setSmartquotes(value: Boolean): Self = StObject.set(x, "smartquotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmartquotesUndefined: Self = StObject.set(x, "smartquotes", js.undefined)
      
      @scala.inline
      def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
    }
  }
  
  type PostProcessor = (js.Function1[/* ast */ AST, AST]) | (js.Function2[
    /* ast */ AST, 
    /* callback */ js.Function2[/* err */ js.Any, /* value */ AST, Unit], 
    Unit
  ])
  
  type PropData = String | Double | Boolean
  
  type PropKey = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.idyllCompiler.idyllCompilerStrings.variable
    - typings.idyllCompiler.idyllCompilerStrings.value
    - typings.idyllCompiler.idyllCompilerStrings.expression
  */
  trait PropType extends StObject
  object PropType {
    
    @scala.inline
    def expression: typings.idyllCompiler.idyllCompilerStrings.expression = "expression".asInstanceOf[typings.idyllCompiler.idyllCompilerStrings.expression]
    
    @scala.inline
    def value: typings.idyllCompiler.idyllCompilerStrings.value = "value".asInstanceOf[typings.idyllCompiler.idyllCompilerStrings.value]
    
    @scala.inline
    def variable: typings.idyllCompiler.idyllCompilerStrings.variable = "variable".asInstanceOf[typings.idyllCompiler.idyllCompilerStrings.variable]
  }
  
  type PropValue = js.Tuple2[PropType, PropData]
  
  type Property = js.Tuple2[PropKey, PropValue]
  
  type RecursiveNode[T] = js.Tuple3[String, js.Array[Property], js.Array[T]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped [string, std.Array<idyll-compiler.idyll-compiler.Property>, std.Array<idyll-compiler.idyll-compiler.Node>] */ @js.native
  trait TreeNode extends StObject
}
