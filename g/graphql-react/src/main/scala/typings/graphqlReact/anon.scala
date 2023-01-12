package typings.graphqlReact

import typings.graphqlReact.mod.GraphQLCache
import typings.graphqlReact.mod.GraphQLCacheKey
import typings.graphqlReact.mod.GraphQLCacheValue
import typings.graphqlReact.mod.GraphQLFetchOptions
import typings.graphqlReact.mod.GraphQLFetchOptionsOverride
import typings.graphqlReact.mod.GraphQLOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cache extends StObject {
    
    var cache: js.UndefOr[GraphQLCache] = js.undefined
  }
  object Cache {
    
    inline def apply(): Cache = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cache] (val x: Self) extends AnyVal {
      
      inline def setCache(value: GraphQLCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    }
  }
  
  trait CacheKey extends StObject {
    
    var cacheKey: GraphQLCacheKey
    
    var cacheValue: GraphQLCacheValue[Any]
  }
  object CacheKey {
    
    inline def apply(cacheKey: GraphQLCacheKey, cacheValue: GraphQLCacheValue[Any]): CacheKey = {
      val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], cacheValue = cacheValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheKey] (val x: Self) extends AnyVal {
      
      inline def setCacheKey(value: GraphQLCacheKey): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      inline def setCacheValue(value: GraphQLCacheValue[Any]): Self = StObject.set(x, "cacheValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait CacheValuePromise extends StObject {
    
    var cacheKey: GraphQLCacheKey
    
    var cacheValuePromise: js.Promise[GraphQLCacheValue[Any]]
  }
  object CacheValuePromise {
    
    inline def apply(cacheKey: GraphQLCacheKey, cacheValuePromise: js.Promise[GraphQLCacheValue[Any]]): CacheValuePromise = {
      val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], cacheValuePromise = cacheValuePromise.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheValuePromise]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheValuePromise] (val x: Self) extends AnyVal {
      
      inline def setCacheKey(value: GraphQLCacheKey): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      inline def setCacheValuePromise(value: js.Promise[GraphQLCacheValue[Any]]): Self = StObject.set(x, "cacheValuePromise", value.asInstanceOf[js.Any])
    }
  }
  
  trait Column extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object Column {
    
    inline def apply(column: Double, line: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExceptCacheKey extends StObject {
    
    var exceptCacheKey: GraphQLCacheKey
  }
  object ExceptCacheKey {
    
    inline def apply(exceptCacheKey: GraphQLCacheKey): ExceptCacheKey = {
      val __obj = js.Dynamic.literal(exceptCacheKey = exceptCacheKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExceptCacheKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExceptCacheKey] (val x: Self) extends AnyVal {
      
      inline def setExceptCacheKey(value: GraphQLCacheKey): Self = StObject.set(x, "exceptCacheKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait FetchOptionsOverride[V] extends StObject {
    
    var fetchOptionsOverride: js.UndefOr[GraphQLFetchOptionsOverride] = js.undefined
    
    var operation: GraphQLOperation[V]
    
    var reloadOnLoad: js.UndefOr[Boolean] = js.undefined
    
    var resetOnLoad: js.UndefOr[Boolean] = js.undefined
  }
  object FetchOptionsOverride {
    
    inline def apply[V](operation: GraphQLOperation[V]): FetchOptionsOverride[V] = {
      val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchOptionsOverride[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchOptionsOverride[?], V] (val x: Self & FetchOptionsOverride[V]) extends AnyVal {
      
      inline def setFetchOptionsOverride(value: /* options */ GraphQLFetchOptions => Unit): Self = StObject.set(x, "fetchOptionsOverride", js.Any.fromFunction1(value))
      
      inline def setFetchOptionsOverrideUndefined: Self = StObject.set(x, "fetchOptionsOverride", js.undefined)
      
      inline def setOperation(value: GraphQLOperation[V]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setReloadOnLoad(value: Boolean): Self = StObject.set(x, "reloadOnLoad", value.asInstanceOf[js.Any])
      
      inline def setReloadOnLoadUndefined: Self = StObject.set(x, "reloadOnLoad", js.undefined)
      
      inline def setResetOnLoad(value: Boolean): Self = StObject.set(x, "resetOnLoad", value.asInstanceOf[js.Any])
      
      inline def setResetOnLoadUndefined: Self = StObject.set(x, "resetOnLoad", js.undefined)
    }
  }
  
  trait LoadOnMount[V] extends StObject {
    
    var fetchOptionsOverride: js.UndefOr[GraphQLFetchOptionsOverride] = js.undefined
    
    var loadOnMount: js.UndefOr[Boolean] = js.undefined
    
    var loadOnReload: js.UndefOr[Boolean] = js.undefined
    
    var loadOnReset: js.UndefOr[Boolean] = js.undefined
    
    var operation: GraphQLOperation[V]
    
    var reloadOnLoad: js.UndefOr[Boolean] = js.undefined
    
    var resetOnLoad: js.UndefOr[Boolean] = js.undefined
  }
  object LoadOnMount {
    
    inline def apply[V](operation: GraphQLOperation[V]): LoadOnMount[V] = {
      val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadOnMount[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadOnMount[?], V] (val x: Self & LoadOnMount[V]) extends AnyVal {
      
      inline def setFetchOptionsOverride(value: /* options */ GraphQLFetchOptions => Unit): Self = StObject.set(x, "fetchOptionsOverride", js.Any.fromFunction1(value))
      
      inline def setFetchOptionsOverrideUndefined: Self = StObject.set(x, "fetchOptionsOverride", js.undefined)
      
      inline def setLoadOnMount(value: Boolean): Self = StObject.set(x, "loadOnMount", value.asInstanceOf[js.Any])
      
      inline def setLoadOnMountUndefined: Self = StObject.set(x, "loadOnMount", js.undefined)
      
      inline def setLoadOnReload(value: Boolean): Self = StObject.set(x, "loadOnReload", value.asInstanceOf[js.Any])
      
      inline def setLoadOnReloadUndefined: Self = StObject.set(x, "loadOnReload", js.undefined)
      
      inline def setLoadOnReset(value: Boolean): Self = StObject.set(x, "loadOnReset", value.asInstanceOf[js.Any])
      
      inline def setLoadOnResetUndefined: Self = StObject.set(x, "loadOnReset", js.undefined)
      
      inline def setOperation(value: GraphQLOperation[V]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setReloadOnLoad(value: Boolean): Self = StObject.set(x, "reloadOnLoad", value.asInstanceOf[js.Any])
      
      inline def setReloadOnLoadUndefined: Self = StObject.set(x, "reloadOnLoad", js.undefined)
      
      inline def setResetOnLoad(value: Boolean): Self = StObject.set(x, "resetOnLoad", value.asInstanceOf[js.Any])
      
      inline def setResetOnLoadUndefined: Self = StObject.set(x, "resetOnLoad", js.undefined)
    }
  }
  
  trait Locations extends StObject {
    
    var locations: js.Array[Column]
    
    var message: String
    
    var path: js.Array[String]
  }
  object Locations {
    
    inline def apply(locations: js.Array[Column], message: String, path: js.Array[String]): Locations = {
      val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locations]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Locations] (val x: Self) extends AnyVal {
      
      inline def setLocations(value: js.Array[Column]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsVarargs(value: Column*): Self = StObject.set(x, "locations", js.Array(value*))
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
  
  trait Query extends StObject {
    
    var query: String
  }
  object Query {
    
    inline def apply(query: String): Query = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
}
