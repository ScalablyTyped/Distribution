package typings.interfaceStore

import typings.std.AbortSignal
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait AbortOptions extends StObject {
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object AbortOptions {
    
    inline def apply(): AbortOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbortOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbortOptions] (val x: Self) extends AnyVal {
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  type Await[T] = js.Promise[T] | T
  
  type AwaitIterable[T] = js.Iterable[T] | AsyncIterable[T]
  
  @js.native
  trait Store[Key, Value, Pair, HasOptionsExtension, PutOptionsExtension, PutManyOptionsExtension, GetOptionsExtension, GetManyOptionsExtension, DeleteOptionsExtension, DeleteManyOptionsExtension] extends StObject {
    
    /**
      * Remove the record for the passed key
      *
      * @example
      *
      * ```js
      * await store.delete(new Key('awesome'))
      * console.log('deleted awesome content :(')
      * ```
      */
    def delete(key: Key): Await[Unit] = js.native
    def delete(key: Key, options: AbortOptions & DeleteOptionsExtension): Await[Unit] = js.native
    
    /**
      * Remove values for the passed keys
      *
      * @example
      *
      * ```js
      * const source = [new Key('awesome')]
      *
      * for await (const key of store.deleteMany(source)) {
      *   console.log(`deleted content with key ${key}`)
      * }
      * ```
      */
    def deleteMany(source: AwaitIterable[Key]): AwaitIterable[Key] = js.native
    def deleteMany(source: AwaitIterable[Key], options: AbortOptions & DeleteManyOptionsExtension): AwaitIterable[Key] = js.native
    
    /**
      * Retrieve the value stored under the given key
      *
      * @example
      * ```js
      * const value = await store.get(new Key('awesome'))
      * console.log('got content: %s', value.toString('utf8'))
      * // => got content: datastore
      * ```
      */
    def get(key: Key): Await[Value] = js.native
    def get(key: Key, options: AbortOptions & GetOptionsExtension): Await[Value] = js.native
    
    /**
      * Retrieve values for the passed keys
      *
      * @example
      * ```js
      * for await (const { key, value } of store.getMany([new Key('awesome')])) {
      *   console.log(`got "${key}" = "${new TextDecoder('utf8').decode(value)}"`')
      *   // => got "/awesome" = "datastore"
      * }
      * ```
      */
    def getMany(source: AwaitIterable[Key]): AwaitIterable[Pair] = js.native
    def getMany(source: AwaitIterable[Key], options: AbortOptions & GetManyOptionsExtension): AwaitIterable[Pair] = js.native
    
    /**
      * Check for the existence of a value for the passed key
      *
      * @example
      * ```js
      *const exists = await store.has(new Key('awesome'))
      *
      *if (exists) {
      *  console.log('it is there')
      *} else {
      *  console.log('it is not there')
      *}
      *```
      */
    def has(key: Key): Await[Boolean] = js.native
    def has(key: Key, options: AbortOptions & HasOptionsExtension): Await[Boolean] = js.native
    
    /**
      * Store the passed value under the passed key
      *
      * @example
      *
      * ```js
      * await store.put([{ key: new Key('awesome'), value: new Uint8Array([0, 1, 2, 3]) }])
      * ```
      */
    def put(key: Key, `val`: Value): Await[Key] = js.native
    def put(key: Key, `val`: Value, options: AbortOptions & PutOptionsExtension): Await[Key] = js.native
    
    /**
      * Store the given key/value pairs
      *
      * @example
      * ```js
      * const source = [{ key: new Key('awesome'), value: new Uint8Array([0, 1, 2, 3]) }]
      *
      * for await (const { key, value } of store.putMany(source)) {
      *   console.info(`put content for key ${key}`)
      * }
      * ```
      */
    def putMany(source: AwaitIterable[Pair]): AwaitIterable[Key] = js.native
    def putMany(source: AwaitIterable[Pair], options: AbortOptions & PutManyOptionsExtension): AwaitIterable[Key] = js.native
  }
}
