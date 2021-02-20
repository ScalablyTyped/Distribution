package typings.graphqlReact

import typings.graphqlReact.mod.GraphQLCache
import typings.graphqlReact.mod.GraphQLCacheKey
import typings.graphqlReact.mod.GraphQLCacheValue
import typings.graphqlReact.mod.GraphQLFetchOptions
import typings.graphqlReact.mod.GraphQLFetchOptionsOverride
import typings.graphqlReact.mod.GraphQLOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cache extends StObject {
    
    var cache: js.UndefOr[GraphQLCache] = js.native
  }
  object Cache {
    
    @scala.inline
    def apply(): Cache = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cache]
    }
    
    @scala.inline
    implicit class CacheMutableBuilder[Self <: Cache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: GraphQLCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    }
  }
  
  @js.native
  trait CacheKey extends StObject {
    
    var cacheKey: GraphQLCacheKey = js.native
    
    var cacheValue: GraphQLCacheValue[_] = js.native
  }
  object CacheKey {
    
    @scala.inline
    def apply(cacheKey: GraphQLCacheKey, cacheValue: GraphQLCacheValue[_]): CacheKey = {
      val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], cacheValue = cacheValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheKey]
    }
    
    @scala.inline
    implicit class CacheKeyMutableBuilder[Self <: CacheKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheKey(value: GraphQLCacheKey): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheValue(value: GraphQLCacheValue[_]): Self = StObject.set(x, "cacheValue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CacheValuePromise extends StObject {
    
    var cacheKey: GraphQLCacheKey = js.native
    
    var cacheValuePromise: js.Promise[GraphQLCacheValue[_]] = js.native
  }
  object CacheValuePromise {
    
    @scala.inline
    def apply(cacheKey: GraphQLCacheKey, cacheValuePromise: js.Promise[GraphQLCacheValue[_]]): CacheValuePromise = {
      val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], cacheValuePromise = cacheValuePromise.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheValuePromise]
    }
    
    @scala.inline
    implicit class CacheValuePromiseMutableBuilder[Self <: CacheValuePromise] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheKey(value: GraphQLCacheKey): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheValuePromise(value: js.Promise[GraphQLCacheValue[_]]): Self = StObject.set(x, "cacheValuePromise", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Column extends StObject {
    
    var column: Double = js.native
    
    var line: Double = js.native
  }
  object Column {
    
    @scala.inline
    def apply(column: Double, line: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExceptCacheKey extends StObject {
    
    var exceptCacheKey: GraphQLCacheKey = js.native
  }
  object ExceptCacheKey {
    
    @scala.inline
    def apply(exceptCacheKey: GraphQLCacheKey): ExceptCacheKey = {
      val __obj = js.Dynamic.literal(exceptCacheKey = exceptCacheKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptCacheKey]
    }
    
    @scala.inline
    implicit class ExceptCacheKeyMutableBuilder[Self <: ExceptCacheKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExceptCacheKey(value: GraphQLCacheKey): Self = StObject.set(x, "exceptCacheKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FetchOptionsOverride[V] extends StObject {
    
    var fetchOptionsOverride: js.UndefOr[GraphQLFetchOptionsOverride] = js.native
    
    var operation: GraphQLOperation[V] = js.native
    
    var reloadOnLoad: js.UndefOr[Boolean] = js.native
    
    var resetOnLoad: js.UndefOr[Boolean] = js.native
  }
  object FetchOptionsOverride {
    
    @scala.inline
    def apply[V](operation: GraphQLOperation[V]): FetchOptionsOverride[V] = {
      val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchOptionsOverride[V]]
    }
    
    @scala.inline
    implicit class FetchOptionsOverrideMutableBuilder[Self <: FetchOptionsOverride[_], V] (val x: Self with FetchOptionsOverride[V]) extends AnyVal {
      
      @scala.inline
      def setFetchOptionsOverride(value: /* options */ GraphQLFetchOptions => Unit): Self = StObject.set(x, "fetchOptionsOverride", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFetchOptionsOverrideUndefined: Self = StObject.set(x, "fetchOptionsOverride", js.undefined)
      
      @scala.inline
      def setOperation(value: GraphQLOperation[V]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadOnLoad(value: Boolean): Self = StObject.set(x, "reloadOnLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadOnLoadUndefined: Self = StObject.set(x, "reloadOnLoad", js.undefined)
      
      @scala.inline
      def setResetOnLoad(value: Boolean): Self = StObject.set(x, "resetOnLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetOnLoadUndefined: Self = StObject.set(x, "resetOnLoad", js.undefined)
    }
  }
  
  @js.native
  trait LoadOnMount[V] extends StObject {
    
    var fetchOptionsOverride: js.UndefOr[GraphQLFetchOptionsOverride] = js.native
    
    var loadOnMount: js.UndefOr[Boolean] = js.native
    
    var loadOnReload: js.UndefOr[Boolean] = js.native
    
    var loadOnReset: js.UndefOr[Boolean] = js.native
    
    var operation: GraphQLOperation[V] = js.native
    
    var reloadOnLoad: js.UndefOr[Boolean] = js.native
    
    var resetOnLoad: js.UndefOr[Boolean] = js.native
  }
  object LoadOnMount {
    
    @scala.inline
    def apply[V](operation: GraphQLOperation[V]): LoadOnMount[V] = {
      val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadOnMount[V]]
    }
    
    @scala.inline
    implicit class LoadOnMountMutableBuilder[Self <: LoadOnMount[_], V] (val x: Self with LoadOnMount[V]) extends AnyVal {
      
      @scala.inline
      def setFetchOptionsOverride(value: /* options */ GraphQLFetchOptions => Unit): Self = StObject.set(x, "fetchOptionsOverride", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFetchOptionsOverrideUndefined: Self = StObject.set(x, "fetchOptionsOverride", js.undefined)
      
      @scala.inline
      def setLoadOnMount(value: Boolean): Self = StObject.set(x, "loadOnMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadOnMountUndefined: Self = StObject.set(x, "loadOnMount", js.undefined)
      
      @scala.inline
      def setLoadOnReload(value: Boolean): Self = StObject.set(x, "loadOnReload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadOnReloadUndefined: Self = StObject.set(x, "loadOnReload", js.undefined)
      
      @scala.inline
      def setLoadOnReset(value: Boolean): Self = StObject.set(x, "loadOnReset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadOnResetUndefined: Self = StObject.set(x, "loadOnReset", js.undefined)
      
      @scala.inline
      def setOperation(value: GraphQLOperation[V]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadOnLoad(value: Boolean): Self = StObject.set(x, "reloadOnLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadOnLoadUndefined: Self = StObject.set(x, "reloadOnLoad", js.undefined)
      
      @scala.inline
      def setResetOnLoad(value: Boolean): Self = StObject.set(x, "resetOnLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetOnLoadUndefined: Self = StObject.set(x, "resetOnLoad", js.undefined)
    }
  }
  
  @js.native
  trait Locations extends StObject {
    
    var locations: js.Array[Column] = js.native
    
    var message: String = js.native
    
    var path: js.Array[String] = js.native
  }
  object Locations {
    
    @scala.inline
    def apply(locations: js.Array[Column], message: String, path: js.Array[String]): Locations = {
      val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locations]
    }
    
    @scala.inline
    implicit class LocationsMutableBuilder[Self <: Locations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocations(value: js.Array[Column]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationsVarargs(value: Column*): Self = StObject.set(x, "locations", js.Array(value :_*))
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Query extends StObject {
    
    var query: String = js.native
  }
  object Query {
    
    @scala.inline
    def apply(query: String): Query = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit class QueryMutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Variables[V] extends StObject {
    
    var variables: V = js.native
  }
  object Variables {
    
    @scala.inline
    def apply[V](variables: V): Variables[V] = {
      val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[Variables[V]]
    }
    
    @scala.inline
    implicit class VariablesMutableBuilder[Self <: Variables[_], V] (val x: Self with Variables[V]) extends AnyVal {
      
      @scala.inline
      def setVariables(value: V): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
}
