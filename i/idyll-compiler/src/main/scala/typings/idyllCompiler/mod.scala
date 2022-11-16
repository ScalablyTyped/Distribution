package typings.idyllCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  inline def apply(input: String): js.Promise[AST] | AST = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AST] | AST]
  inline def apply(input: String, options: Unit, callback: js.Function0[Unit]): js.Promise[AST] | AST = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AST] | AST]
  inline def apply(input: String, options: Options): js.Promise[AST] | AST = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AST] | AST]
  inline def apply(input: String, options: Options, callback: js.Function0[Unit]): js.Promise[AST] | AST = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AST] | AST]
  
  @JSImport("idyll-compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type AST = js.Array[Node]
  
  type Node = TreeNode | String
  
  trait Options extends StObject {
    
    /**
      * If false and there is no postprocessors, compiler returns the AST synchronously
      * Otherwise, a promise is returned
      *
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /**
      * compiler plugins
      * If provided, compiler always compiles asynchronously
      */
    var postProcessors: js.UndefOr[js.Array[PostProcessor]] = js.undefined
    
    var smartquotes: js.UndefOr[Boolean] = js.undefined
    
    var spellcheck: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setPostProcessors(value: js.Array[PostProcessor]): Self = StObject.set(x, "postProcessors", value.asInstanceOf[js.Any])
      
      inline def setPostProcessorsUndefined: Self = StObject.set(x, "postProcessors", js.undefined)
      
      inline def setPostProcessorsVarargs(value: PostProcessor*): Self = StObject.set(x, "postProcessors", js.Array(value*))
      
      inline def setSmartquotes(value: Boolean): Self = StObject.set(x, "smartquotes", value.asInstanceOf[js.Any])
      
      inline def setSmartquotesUndefined: Self = StObject.set(x, "smartquotes", js.undefined)
      
      inline def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
      
      inline def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
    }
  }
  
  type PostProcessor = (js.Function1[/* ast */ AST, AST]) | (js.Function2[
    /* ast */ AST, 
    /* callback */ js.Function2[/* err */ Any, /* value */ AST, Unit], 
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
    
    inline def expression: typings.idyllCompiler.idyllCompilerStrings.expression = "expression".asInstanceOf[typings.idyllCompiler.idyllCompilerStrings.expression]
    
    inline def value: typings.idyllCompiler.idyllCompilerStrings.value = "value".asInstanceOf[typings.idyllCompiler.idyllCompilerStrings.value]
    
    inline def variable: typings.idyllCompiler.idyllCompilerStrings.variable = "variable".asInstanceOf[typings.idyllCompiler.idyllCompilerStrings.variable]
  }
  
  type PropValue = js.Tuple2[PropType, PropData]
  
  type Property = js.Tuple2[PropKey, PropValue]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type __RecursiveNode = [string, std.Array<idyll-compiler.idyll-compiler.Property>, std.Array<T>]
  }}}
  to avoid circular code involving: 
  - idyll-compiler.idyll-compiler.AST
  - idyll-compiler.idyll-compiler.Node
  - idyll-compiler.idyll-compiler.PostProcessor
  - idyll-compiler.idyll-compiler.TreeNode
  - idyll-compiler.idyll-compiler.__RecursiveNode
  */
  type RecursiveNode[T] = js.Tuple3[String, js.Array[Property], js.Array[T]]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type TreeNode = idyll-compiler.idyll-compiler.__RecursiveNode<idyll-compiler.idyll-compiler.Node>
  }}}
  to avoid circular code involving: 
  - idyll-compiler.idyll-compiler.AST
  - idyll-compiler.idyll-compiler.Node
  - idyll-compiler.idyll-compiler.PostProcessor
  - idyll-compiler.idyll-compiler.TreeNode
  */
  type TreeNode = RecursiveNode[Any]
}
