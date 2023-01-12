package typings.hyperformula

import typings.hyperformula.typingsInterpreterFunctionRegistryMod.FunctionRegistry
import typings.hyperformula.typingsMaybeMod.Maybe
import typings.hyperformula.typingsParserAstMod.Ast
import typings.hyperformula.typingsParserRelativeDependencyMod.RelativeDependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsParserCacheMod {
  
  @JSImport("hyperformula/typings/parser/Cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/parser/Cache", "Cache")
  @js.native
  open class Cache protected () extends StObject {
    def this(functionRegistry: FunctionRegistry) = this()
    
    /* private */ var cache: Any = js.native
    
    /* private */ val functionRegistry: Any = js.native
    
    def get(hash: String): Maybe[CacheEntry] = js.native
    
    def maybeSetAndThenGet(hash: String, ast: Ast): Ast = js.native
    
    def set(hash: String, ast: Ast): CacheEntry = js.native
  }
  
  inline def doesContainFunctions(ast: Ast, functionCriterion: js.Function1[/* functionId */ String, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doesContainFunctions")(ast.asInstanceOf[js.Any], functionCriterion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait CacheEntry extends StObject {
    
    var ast: Ast
    
    var hasStructuralChangeFunction: Boolean
    
    var hasVolatileFunction: Boolean
    
    var relativeDependencies: js.Array[RelativeDependency]
  }
  object CacheEntry {
    
    inline def apply(
      ast: Ast,
      hasStructuralChangeFunction: Boolean,
      hasVolatileFunction: Boolean,
      relativeDependencies: js.Array[RelativeDependency]
    ): CacheEntry = {
      val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], hasStructuralChangeFunction = hasStructuralChangeFunction.asInstanceOf[js.Any], hasVolatileFunction = hasVolatileFunction.asInstanceOf[js.Any], relativeDependencies = relativeDependencies.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheEntry] (val x: Self) extends AnyVal {
      
      inline def setAst(value: Ast): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      inline def setHasStructuralChangeFunction(value: Boolean): Self = StObject.set(x, "hasStructuralChangeFunction", value.asInstanceOf[js.Any])
      
      inline def setHasVolatileFunction(value: Boolean): Self = StObject.set(x, "hasVolatileFunction", value.asInstanceOf[js.Any])
      
      inline def setRelativeDependencies(value: js.Array[RelativeDependency]): Self = StObject.set(x, "relativeDependencies", value.asInstanceOf[js.Any])
      
      inline def setRelativeDependenciesVarargs(value: RelativeDependency*): Self = StObject.set(x, "relativeDependencies", js.Array(value*))
    }
  }
}
