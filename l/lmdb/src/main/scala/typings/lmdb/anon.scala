package typings.lmdb

import typings.lmdb.lmdbStrings.`ordered-binary`
import typings.lmdb.lmdbStrings.binary
import typings.lmdb.lmdbStrings.json
import typings.lmdb.lmdbStrings.msgpack
import typings.lmdb.lmdbStrings.string
import typings.lmdb.lmdbStrings.uint32
import typings.lmdb.mod.CompressionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined lmdb.lmdb.DatabaseOptions & {  name :string} */
  trait DatabaseOptionsnamestring extends StObject {
    
    var cache: js.UndefOr[Boolean | js.Object] = js.undefined
    
    var compression: js.UndefOr[Boolean | CompressionOptions] = js.undefined
    
    var dupSort: js.UndefOr[Boolean] = js.undefined
    
    var encoding: js.UndefOr[msgpack | json | string | binary | `ordered-binary`] = js.undefined
    
    var keyEncoding: js.UndefOr[uint32 | binary | `ordered-binary`] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var sharedStructuresKey: js.UndefOr[typings.lmdb.mod.Key] = js.undefined
    
    var strictAsyncOrder: js.UndefOr[Boolean] = js.undefined
    
    var useVersions: js.UndefOr[Boolean] = js.undefined
  }
  object DatabaseOptionsnamestring {
    
    inline def apply(): DatabaseOptionsnamestring = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatabaseOptionsnamestring]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatabaseOptionsnamestring] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Boolean | js.Object): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCompression(value: Boolean | CompressionOptions): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setDupSort(value: Boolean): Self = StObject.set(x, "dupSort", value.asInstanceOf[js.Any])
      
      inline def setDupSortUndefined: Self = StObject.set(x, "dupSort", js.undefined)
      
      inline def setEncoding(value: msgpack | json | string | binary | `ordered-binary`): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setKeyEncoding(value: uint32 | binary | `ordered-binary`): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSharedStructuresKey(value: typings.lmdb.mod.Key): Self = StObject.set(x, "sharedStructuresKey", value.asInstanceOf[js.Any])
      
      inline def setSharedStructuresKeyUndefined: Self = StObject.set(x, "sharedStructuresKey", js.undefined)
      
      inline def setSharedStructuresKeyVarargs(value: Any*): Self = StObject.set(x, "sharedStructuresKey", js.Array(value*))
      
      inline def setStrictAsyncOrder(value: Boolean): Self = StObject.set(x, "strictAsyncOrder", value.asInstanceOf[js.Any])
      
      inline def setStrictAsyncOrderUndefined: Self = StObject.set(x, "strictAsyncOrder", js.undefined)
      
      inline def setUseVersions(value: Boolean): Self = StObject.set(x, "useVersions", value.asInstanceOf[js.Any])
      
      inline def setUseVersionsUndefined: Self = StObject.set(x, "useVersions", js.undefined)
    }
  }
  
  trait Key[K /* <: typings.lmdb.mod.Key */, V] extends StObject {
    
    var key: K
    
    var value: V
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object Key {
    
    inline def apply[K /* <: typings.lmdb.mod.Key */, V](key: K, value: V): Key[K, V] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key[K, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key[?, ?], K /* <: typings.lmdb.mod.Key */, V] (val x: Self & (Key[K, V])) extends AnyVal {
      
      inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Value[V] extends StObject {
    
    var value: V
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object Value {
    
    inline def apply[V](value: V): Value[V] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value[?], V] (val x: Self & Value[V]) extends AnyVal {
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
