package typings.jsonQuery

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-query", JSImport.Namespace)
  @js.native
  def apply(selector: SelectorWithQueryParams, options: Options): Result = js.native
  @JSImport("json-query", JSImport.Namespace)
  @js.native
  def apply(selector: Selector, options: Options): Result = js.native
  
  type Context = js.Any
  
  type Filter = js.Function2[/* input */ Context, /* repeated */ js.Any, Context]
  
  type Locals = StringDictionary[Filter]
  
  @js.native
  trait Options extends StObject {
    
    var allowRegexp: js.UndefOr[Boolean] = js.native
    
    var context: js.UndefOr[Context] = js.native
    
    var data: js.UndefOr[Context] = js.native
    
    var force: js.UndefOr[Boolean] = js.native
    
    var globals: js.UndefOr[Boolean] = js.native
    
    var locals: js.UndefOr[Locals] = js.native
    
    var parent: js.UndefOr[Context] = js.native
    
    var rootContext: js.UndefOr[Context] = js.native
    
    var source: js.UndefOr[Context] = js.native
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
      def setAllowRegexp(value: Boolean): Self = StObject.set(x, "allowRegexp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowRegexpUndefined: Self = StObject.set(x, "allowRegexp", js.undefined)
      
      @scala.inline
      def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setData(value: Context): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setGlobals(value: Boolean): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
      
      @scala.inline
      def setLocals(value: Locals): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
      
      @scala.inline
      def setParent(value: Context): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setRootContext(value: Context): Self = StObject.set(x, "rootContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootContextUndefined: Self = StObject.set(x, "rootContext", js.undefined)
      
      @scala.inline
      def setSource(value: Context): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  type QueryParam = js.Any
  
  @js.native
  trait Result extends StObject {
    
    var key: String = js.native
    
    var parents: js.Array[String] = js.native
    
    var references: js.Array[_] = js.native
    
    var value: js.Any = js.native
  }
  object Result {
    
    @scala.inline
    def apply(key: String, parents: js.Array[String], references: js.Array[_], value: js.Any): Result = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParents(value: js.Array[String]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentsVarargs(value: String*): Self = StObject.set(x, "parents", js.Array(value :_*))
      
      @scala.inline
      def setReferences(value: js.Array[_]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencesVarargs(value: js.Any*): Self = StObject.set(x, "references", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
