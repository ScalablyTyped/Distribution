package typings.interfaceDatastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object keyMod {
  
  @JSImport("interface-datastore/key", "Key")
  @js.native
  open class Key protected ()
    extends typings.interfaceDatastore.distSrcKeyMod.Key {
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
    
    @JSImport("interface-datastore/key", "Key")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {*} other
      */
    inline def asKey(other: Any): typings.interfaceDatastore.distSrcKeyMod.Key | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("asKey")(other.asInstanceOf[js.Any]).asInstanceOf[typings.interfaceDatastore.distSrcKeyMod.Key | Null]
    
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
    inline def random(): typings.interfaceDatastore.distSrcKeyMod.Key = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[typings.interfaceDatastore.distSrcKeyMod.Key]
    
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
    inline def withNamespaces(list: js.Array[String]): typings.interfaceDatastore.distSrcKeyMod.Key = ^.asInstanceOf[js.Dynamic].applyDynamic("withNamespaces")(list.asInstanceOf[js.Any]).asInstanceOf[typings.interfaceDatastore.distSrcKeyMod.Key]
  }
}
