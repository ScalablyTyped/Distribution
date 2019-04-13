package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Record[TProps /* <: js.Object */] extends js.Object {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[
    stdLib.IterableIterator[
      js.Tuple2[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: TProps[keyof TProps] */ js.Any
      ]
    ]
  ] = js.native
  /**
    * @see `Map#asImmutable`
    */
  def asImmutable(): this.type = js.native
  /**
    * @see `Map#asMutable`
    */
  def asMutable(): this.type = js.native
  /**
    * Returns a new instance of this Record type with all values set
    * to their default values.
    */
  def clear(): this.type = js.native
  /**
    * Returns a new instance of this Record type with the value for the
    * specific key set to its default value.
    *
    * @alias remove
    */
  def delete[K /* <: java.lang.String */](key: K): this.type = js.native
  /**
    * @alias removeIn
    */
  def deleteIn(keyPath: stdLib.Iterable[_]): this.type = js.native
  // Value equality
  def equals(other: js.Any): scala.Boolean = js.native
  /**
    * Returns the value associated with the provided key, which may be the
    * default value defined when creating the Record factory function.
    *
    * If the requested key is not defined by this Record type, then
    * notSetValue will be returned if provided. Note that this scenario would
    * produce an error when using Flow or TypeScript.
    */
  def get[K /* <: java.lang.String */](key: K): /* import warning: ImportType.apply Failed type conversion: TProps[K] */ js.Any = js.native
  def get[K /* <: java.lang.String */](key: K, notSetValue: js.Any): /* import warning: ImportType.apply Failed type conversion: TProps[K] */ js.Any = js.native
  def get[T](key: java.lang.String, notSetValue: T): T = js.native
  def getIn(keyPath: stdLib.Iterable[_]): js.Any = js.native
  // Reading values
  def has(key: java.lang.String): scala.Boolean = js.native
  // Reading deep values
  def hasIn(keyPath: stdLib.Iterable[_]): scala.Boolean = js.native
  def merge(collections: (stdLib.Partial[TProps] | (stdLib.Iterable[js.Tuple2[java.lang.String, _]]))*): this.type = js.native
  def mergeDeep(collections: (stdLib.Partial[TProps] | (stdLib.Iterable[js.Tuple2[java.lang.String, _]]))*): this.type = js.native
  def mergeDeepIn(keyPath: stdLib.Iterable[_], collections: js.Any*): this.type = js.native
  def mergeDeepWith(
    merger: js.Function3[/* oldVal */ js.Any, /* newVal */ js.Any, /* key */ js.Any, _],
    collections: (stdLib.Partial[TProps] | (stdLib.Iterable[js.Tuple2[java.lang.String, _]]))*
  ): this.type = js.native
  def mergeIn(keyPath: stdLib.Iterable[_], collections: js.Any*): this.type = js.native
  def mergeWith(
    merger: js.Function3[/* oldVal */ js.Any, /* newVal */ js.Any, /* key */ java.lang.String, _],
    collections: (stdLib.Partial[TProps] | (stdLib.Iterable[js.Tuple2[java.lang.String, _]]))*
  ): this.type = js.native
  def remove[K /* <: java.lang.String */](key: K): this.type = js.native
  def removeIn(keyPath: stdLib.Iterable[_]): this.type = js.native
  // Persistent changes
  def set[K /* <: java.lang.String */](key: K, value: /* import warning: ImportType.apply Failed type conversion: TProps[K] */ js.Any): this.type = js.native
  // Deep persistent changes
  def setIn(keyPath: stdLib.Iterable[_], value: js.Any): this.type = js.native
  // Conversion to JavaScript types
  /**
    * Deeply converts this Record to equivalent native JavaScript Object.
    *
    * Note: This method may not be overridden. Objects with custom
    * serialization to plain JS may override toJSON() instead.
    */
  def toJS(): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TProps ]: any}
    */ immutableLib.immutableLibStrings.Record with js.Any = js.native
  /**
    * Shallowly converts this Record to equivalent native JavaScript Object.
    */
  def toJSON(): TProps = js.native
  /**
    * Shallowly converts this Record to equivalent JavaScript Object.
    */
  def toObject(): TProps = js.native
  // Sequence algorithms
  def toSeq(): immutableLib.immutableMod.SeqNs.Keyed[
    java.lang.String, 
    /* import warning: ImportType.apply Failed type conversion: TProps[keyof TProps] */ js.Any
  ] = js.native
  def update[K /* <: java.lang.String */](
    key: K,
    updater: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: TProps[K] */ /* value */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: TProps[K] */ js.Any
    ]
  ): this.type = js.native
  def updateIn(keyPath: stdLib.Iterable[_], updater: js.Function1[/* value */ js.Any, _]): this.type = js.native
  /**
    * @see `Map#wasAltered`
    */
  def wasAltered(): scala.Boolean = js.native
  // Transient changes
  /**
    * Note: Not all methods can be used on a mutable collection or within
    * `withMutations`! Only `set` may be used mutatively.
    *
    * @see `Map#withMutations`
    */
  def withMutations(mutator: js.Function1[/* mutable */ this.type, _]): this.type = js.native
}

