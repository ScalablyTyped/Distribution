package typings.interfaceDatastore.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("interface-datastore", "Key")
@js.native
class Key protected () extends js.Object {
  def this(s: String) = this()
  def this(s: Buffer) = this()
  def this(s: String, clean: Boolean) = this()
  def this(s: Buffer, clean: Boolean) = this()
  /**
    * Return string representation of the key
    */
  var get: js.Any = js.native
  @JSName(scala.scalajs.js.Symbol.toStringTag)
  var toStringTag: js.Function0[String] = js.native
  /**
    * Returns the "base" namespace of this key.
    *
    * @example
    * new Key('/Comedy/MontyPython/Actor:JohnCleese').baseNamespace()
    * // => 'Actor:JohnCleese'
    */
  def baseNamespace(): String = js.native
  /**
    * Returns the `child` Key of this Key.
    *
    * @param key The child Key to add
    *
    * @example
    * new Key('/Comedy/MontyPython').child(new Key('Actor:JohnCleese'))
    * // => Key('/Comedy/MontyPython/Actor:JohnCleese')
    */
  def child(key: Key): Key = js.native
  /**
    * Cleanup the current key
    */
  def clean(): Unit = js.native
  /**
    * Concats one or more Keys into one new Key.
    *
    * @param keys The array of keys to concatenate
    */
  def concat(keys: Key*): Key = js.native
  /**
    * Returns an "instance" of this type key (appends value to namespace).
    *
    * @param str The string to append
    *
    * @example
    * new Key('/Comedy/MontyPython/Actor').instance('JohnClesse')
    * // => Key('/Comedy/MontyPython/Actor:JohnCleese')
    */
  def instance(str: String): Key = js.native
  /**
    * Returns whether this key is a prefix of `other`
    *
    * @param other The other key to test against
    *
    * @example
    * new Key('/Comedy').isAncestorOf('/Comedy/MontyPython')
    * // => true
    */
  def isAncestorOf(other: Key): Boolean = js.native
  /**
    * Returns whether this key is a contains another as prefix.
    *
    * @param other The other Key to test against
    *
    * @example
    * new Key('/Comedy/MontyPython').isDecendantOf('/Comedy')
    * // => true
    */
  def isDecendantOf(other: Key): Boolean = js.native
  /**
    * Returns wether this key has only one namespace.
    */
  def isTopLevel(): Boolean = js.native
  /**
    * Check if the given key is sorted lower than ourself.
    *
    * @param key The other Key to check against
    */
  def less(key: Key): Boolean = js.native
  /**
    * Returns the `list` representation of this key.
    *
    * @example
    * new Key('/Comedy/MontyPython/Actor:JohnCleese').list()
    * // => ['Comedy', 'MontyPythong', 'Actor:JohnCleese']
    */
  def list(): js.Array[String] = js.native
  /**
    * Returns the "name" of this key (field of last namespace).
    *
    * @example
    * new Key('/Comedy/MontyPython/Actor:JohnCleese').name()
    * // => 'JohnCleese'
    */
  def name(): String = js.native
  /**
    * Returns the `namespaces` making up this Key.
    */
  def namespaces(): js.Array[String] = js.native
  /**
    * Returns the `parent` Key of this Key.
    *
    * @example
    * new Key("/Comedy/MontyPython/Actor:JohnCleese").parent()
    * // => Key("/Comedy/MontyPython")
    */
  def parent(): Key = js.native
  /**
    * Returns the "path" of this key (parent + type).
    *
    * @example
    * new Key('/Comedy/MontyPython/Actor:JohnCleese').path()
    * // => Key('/Comedy/MontyPython/Actor')
    */
  def path(): Key = js.native
  /**
    * Returns the key with all parts in reversed order.
    *
    * @example
    * new Key('/Comedy/MontyPython/Actor:JohnCleese').reverse()
    * // => Key('/Actor:JohnCleese/MontyPython/Comedy')
    */
  def reverse(): Key = js.native
  /**
    * Return the buffer representation of the key
    */
  def toBuffer(): Buffer = js.native
  def toString(encoding: String): String = js.native
  /**
    * Returns the "type" of this key (value of last namespace).
    *
    * @example
    * new Key('/Comedy/MontyPython/Actor:JohnCleese').type()
    * // => 'Actor'
    */
  def `type`(): String = js.native
}

/* static members */
@JSImport("interface-datastore", "Key")
@js.native
object Key extends js.Object {
  /**
    * Returns whether the input is a valid Key.
    */
  def isKey(key: js.Any): Boolean = js.native
  /**
    * Returns a randomly (uuid) generated key.
    *
    * @example
    * Key.random()
    * // => Key('/f98719ea086343f7b71f32ea9d9d521d')
    *
    */
  def random(): Key = js.native
  /**
    * Constructs a key out of a namespace array.
    *
    * @param list The array of namespaces
    *
    * @example
    * Key.withNamespaces(['one', 'two'])
    * // => Key('/one/two')
    */
  def withNamespaces(list: js.Array[String]): Key = js.native
}

