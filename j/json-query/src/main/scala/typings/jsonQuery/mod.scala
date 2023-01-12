package typings.jsonQuery

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(selector: SelectorWithQueryParams, options: Options): Result = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result]
  inline def apply(selector: Selector, options: Options): Result = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result]
  
  @JSImport("json-query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Context = Any
  
  @js.native
  trait Filter extends StObject {
    
    def apply(input: Context, args: Any*): Context = js.native
  }
  
  type Locals = StringDictionary[Filter]
  
  trait Options extends StObject {
    
    var allowRegexp: js.UndefOr[Boolean] = js.undefined
    
    var context: js.UndefOr[Context] = js.undefined
    
    var data: js.UndefOr[Context] = js.undefined
    
    var filters: js.UndefOr[Locals] = js.undefined
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var globals: js.UndefOr[Boolean] = js.undefined
    
    var locals: js.UndefOr[Locals] = js.undefined
    
    var parent: js.UndefOr[Context] = js.undefined
    
    var rootContext: js.UndefOr[Context] = js.undefined
    
    var source: js.UndefOr[Context] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllowRegexp(value: Boolean): Self = StObject.set(x, "allowRegexp", value.asInstanceOf[js.Any])
      
      inline def setAllowRegexpUndefined: Self = StObject.set(x, "allowRegexp", js.undefined)
      
      inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setData(value: Context): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFilters(value: Locals): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setGlobals(value: Boolean): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
      
      inline def setLocals(value: Locals): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      
      inline def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
      
      inline def setParent(value: Context): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setRootContext(value: Context): Self = StObject.set(x, "rootContext", value.asInstanceOf[js.Any])
      
      inline def setRootContextUndefined: Self = StObject.set(x, "rootContext", js.undefined)
      
      inline def setSource(value: Context): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  type QueryParam = Any
  
  trait Result extends StObject {
    
    var key: String
    
    var parents: js.Array[String]
    
    var references: js.Array[Any]
    
    var value: Any
  }
  object Result {
    
    inline def apply(key: String, parents: js.Array[String], references: js.Array[Any], value: Any): Result = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setParents(value: js.Array[String]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setParentsVarargs(value: String*): Self = StObject.set(x, "parents", js.Array(value*))
      
      inline def setReferences(value: js.Array[Any]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setReferencesVarargs(value: Any*): Self = StObject.set(x, "references", js.Array(value*))
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Selector = String
  
  // No way to support [Selector, ...QueryParam[]]?
  // 10 params should be more than enough, hopefully.
  type SelectorWithQueryParams = (js.Tuple2[Selector, QueryParam]) | (js.Tuple3[Selector, QueryParam, QueryParam]) | (js.Tuple4[Selector, QueryParam, QueryParam, QueryParam]) | (js.Tuple5[Selector, QueryParam, QueryParam, QueryParam, QueryParam]) | (js.Tuple6[Selector, QueryParam, QueryParam, QueryParam, QueryParam, QueryParam]) | (js.Tuple7[Selector, QueryParam, QueryParam, QueryParam, QueryParam, QueryParam, QueryParam]) | (js.Tuple8[Selector, QueryParam, QueryParam, QueryParam, QueryParam, QueryParam, QueryParam, QueryParam]) | (js.Tuple9[
    Selector, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam
  ]) | (js.Tuple10[
    Selector, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam
  ]) | (js.Tuple11[
    Selector, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam, 
    QueryParam
  ])
}
