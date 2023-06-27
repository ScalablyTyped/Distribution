package typings.interfaceDatastore

import typings.uint8arrays.distSrcUtilBasesMod.SupportedEncodings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeyMod {
  
  @JSImport("interface-datastore/dist/src/key", "Key")
  @js.native
  open class Key protected () extends StObject {
    /**
      * @param {string | Uint8Array} s
      * @param {boolean} [clean]
      */
    def this(s: String) = this()
    def this(s: js.typedarray.Uint8Array) = this()
    def this(s: String, clean: Boolean) = this()
    def this(s: js.typedarray.Uint8Array, clean: Boolean) = this()
    
    /* private */ var _buf: Any = js.native
    
    /** Returns the "base" namespace of this key.
      *
      * @returns {string}
      *
      * @example
      * ```js
      * new Key('/Comedy/MontyPython/Actor:JohnCleese').baseNamespace()
      * // => 'Actor:JohnCleese'
      * ```
      */
    def baseNamespace(): String = js.native
    
    /**
      * Returns the `child` Key of this Key.
      *
      * @param {Key} key - The child Key to add
      * @returns {Key}
      *
      * @example
      * ```js
      * new Key('/Comedy/MontyPython').child(new Key('Actor:JohnCleese'))
      * // => Key('/Comedy/MontyPython/Actor:JohnCleese')
      * ```
      */
    def child(key: Key): Key = js.native
    
    /**
      * Cleanup the current key
      *
      * @returns {void}
      */
    def clean(): Unit = js.native
    
    /**
      * Concats one or more Keys into one new Key.
      *
      * @param {Array<Key>} keys - The array of keys to concatenate
      * @returns {Key}
      */
    def concat(keys: Key*): Key = js.native
    
    /**
      * Return string representation of the key
      *
      * @returns {string}
      */
    var get: Any = js.native
    
    /**
      * Returns an "instance" of this type key (appends value to namespace).
      *
      * @param {string} s - The string to append.
      * @returns {Key}
      *
      * @example
      * ```js
      * new Key('/Comedy/MontyPython/Actor').instance('JohnClesse')
      * // => Key('/Comedy/MontyPython/Actor:JohnCleese')
      * ```
      */
    def instance(s: String): Key = js.native
    
    /**
      * Returns whether this key is a prefix of `other`
      *
      * @param {Key} other - The other key to test against
      * @returns {boolean}
      *
      * @example
      * ```js
      * new Key('/Comedy').isAncestorOf('/Comedy/MontyPython')
      * // => true
      * ```
      */
    def isAncestorOf(other: Key): Boolean = js.native
    
    /**
      * Returns whether this key is a contains another as prefix.
      *
      * @param {Key} other - The other Key to test against
      * @returns {boolean}
      *
      * @example
      * ```js
      * new Key('/Comedy/MontyPython').isDecendantOf('/Comedy')
      * // => true
      * ```
      */
    def isDecendantOf(other: Key): Boolean = js.native
    
    /**
      * Checks if this key has only one namespace.
      *
      * @returns {boolean}
      */
    def isTopLevel(): Boolean = js.native
    
    /**
      * Check if the given key is sorted lower than ourself.
      *
      * @param {Key} key - The other Key to check against
      * @returns {boolean}
      */
    def less(key: Key): Boolean = js.native
    
    /**
      * Returns the `list` representation of this key.
      *
      * @returns {Array<string>}
      *
      * @example
      * ```js
      * new Key('/Comedy/MontyPython/Actor:JohnCleese').list()
      * // => ['Comedy', 'MontyPythong', 'Actor:JohnCleese']
      * ```
      */
    def list(): js.Array[String] = js.native
    
    /**
      * Returns the "name" of this key (field of last namespace).
      *
      * @returns {string}
      *
      * @example
      * ```js
      * new Key('/Comedy/MontyPython/Actor:JohnCleese').name()
      * // => 'JohnCleese'
      * ```
      */
    def name(): String = js.native
    
    /**
      * Returns the `namespaces` making up this Key.
      *
      * @returns {Array<string>}
      */
    def namespaces(): js.Array[String] = js.native
    
    /**
      * Returns the `parent` Key of this Key.
      *
      * @returns {Key}
      *
      * @example
      * ```js
      * new Key("/Comedy/MontyPython/Actor:JohnCleese").parent()
      * // => Key("/Comedy/MontyPython")
      * ```
      */
    def parent(): Key = js.native
    
    /**
      * Returns the "path" of this key (parent + type).
      *
      * @returns {Key}
      *
      * @example
      * ```js
      * new Key('/Comedy/MontyPython/Actor:JohnCleese').path()
      * // => Key('/Comedy/MontyPython/Actor')
      * ```
      */
    def path(): Key = js.native
    
    /**
      * Returns the key with all parts in reversed order.
      *
      * @returns {Key}
      *
      * @example
      * ```js
      * new Key('/Comedy/MontyPython/Actor:JohnCleese').reverse()
      * // => Key('/Actor:JohnCleese/MontyPython/Comedy')
      * ```
      */
    def reverse(): Key = js.native
    
    def toString(encoding: SupportedEncodings): String = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Function0[String] = js.native
    
    /**
      * Returns the "type" of this key (value of last namespace).
      *
      * @returns {string}
      *
      * @example
      * ```js
      * new Key('/Comedy/MontyPython/Actor:JohnCleese').type()
      * // => 'Actor'
      * ```
      */
    def `type`(): String = js.native
    
    /**
      * Return the Uint8Array representation of the key
      *
      * @returns {Uint8Array}
      */
    def uint8Array(): js.typedarray.Uint8Array = js.native
  }
  /* static members */
  object Key {
    
    @JSImport("interface-datastore/dist/src/key", "Key")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {*} other
      */
    inline def asKey(other: Any): Key | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("asKey")(other.asInstanceOf[js.Any]).asInstanceOf[Key | Null]
    
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
    inline def random(): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[Key]
    
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
    inline def withNamespaces(list: js.Array[String]): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("withNamespaces")(list.asInstanceOf[js.Any]).asInstanceOf[Key]
  }
}
