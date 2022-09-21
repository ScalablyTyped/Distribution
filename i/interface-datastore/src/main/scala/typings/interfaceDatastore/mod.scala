package typings.interfaceDatastore

import typings.interfaceStore.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("interface-datastore", "Key")
  @js.native
  open class Key protected ()
    extends typings.interfaceDatastore.keyMod.Key {
    /**
      * @param {string | Uint8Array} s
      * @param {boolean} [clean]
      */
    def this(s: String) = this()
    def this(s: js.typedarray.Uint8Array) = this()
    def this(s: String, clean: Boolean) = this()
    def this(s: js.typedarray.Uint8Array, clean: Boolean) = this()
  }
  /* static members */
  object Key {
    
    @JSImport("interface-datastore", "Key")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {*} other
      */
    inline def asKey(other: Any): typings.interfaceDatastore.keyMod.Key | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("asKey")(other.asInstanceOf[js.Any]).asInstanceOf[typings.interfaceDatastore.keyMod.Key | Null]
    
    /**
      * Returns a randomly (uuid) generated key.
      *
      * @returns {Key}
      *
      * @example
      * ```js
      * Key.random()
      * // => Key('/f98719ea086343f7b71f32ea9d9d521d')
      * ```
      */
    inline def random(): typings.interfaceDatastore.keyMod.Key = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[typings.interfaceDatastore.keyMod.Key]
    
    /**
      * Constructs a key out of a namespace array.
      *
      * @param {Array<string>} list - The array of namespaces
      * @returns {Key}
      *
      * @example
      * ```js
      * Key.withNamespaces(['one', 'two'])
      * // => Key('/one/two')
      * ```
      */
    inline def withNamespaces(list: js.Array[String]): typings.interfaceDatastore.keyMod.Key = ^.asInstanceOf[js.Dynamic].applyDynamic("withNamespaces")(list.asInstanceOf[js.Any]).asInstanceOf[typings.interfaceDatastore.keyMod.Key]
  }
  
  type Batch = typings.interfaceStore.mod.Batch[typings.interfaceDatastore.keyMod.Key, js.typedarray.Uint8Array]
  
  type Datastore = Store[typings.interfaceDatastore.keyMod.Key, js.typedarray.Uint8Array]
  
  type KeyQuery = typings.interfaceStore.mod.KeyQuery[typings.interfaceDatastore.keyMod.Key]
  
  type KeyQueryFilter = typings.interfaceStore.mod.KeyQueryFilter[typings.interfaceDatastore.keyMod.Key]
  
  type KeyQueryOrder = typings.interfaceStore.mod.KeyQueryOrder[typings.interfaceDatastore.keyMod.Key]
  
  type Options = typings.interfaceStore.mod.Options
  
  type Pair = typings.interfaceStore.mod.Pair[typings.interfaceDatastore.keyMod.Key, js.typedarray.Uint8Array]
  
  type Query = typings.interfaceStore.mod.Query[typings.interfaceDatastore.keyMod.Key, js.typedarray.Uint8Array]
  
  type QueryFilter = typings.interfaceStore.mod.QueryFilter[typings.interfaceDatastore.keyMod.Key, js.typedarray.Uint8Array]
  
  type QueryOrder = typings.interfaceStore.mod.QueryOrder[typings.interfaceDatastore.keyMod.Key, js.typedarray.Uint8Array]
}
