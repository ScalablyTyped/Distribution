package typings.lie

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("lie", JSImport.Default)
  @js.native
  val default: PromiseConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("lie", JSImport.Default)
  @js.native
  open class defaultCls[T] protected ()
    extends StObject
       with Promise[T] {
    /**
      * Creates a new Promise.
      * @param executor A callback used to initialize the promise. This callback is passed two arguments:
      * a resolve callback used resolve the promise with a value or the result of another promise,
      * and a reject callback used to reject the promise with a provided reason or error.
      */
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
            Unit
          ]) = this()
  }
  
  /**
    * Represents the completion of an asynchronous operation
    */
  @js.native
  trait Promise[T] extends StObject {
    
    /**
      * Attaches a callback for only the rejection of the Promise.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of the callback.
      */
    def `catch`[TResult](): Promise[T | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ Any, TResult | js.Thenable[TResult]]): Promise[T | TResult] = js.native
    
    /**
      * When the promise is settled, whether fulfilled or rejected, execute the
      * specified callback function. This provides a way for code that must be
      * executed once the Promise has been dealt with to be run whether the promise
      * was fulfilled successfully or rejected.
      * @param onfinally Function called when the Promise is settled
      * @returns A Promise whose finally handler is set to the specified function, onfinally.
      */
    def `finally`[TResult](): Promise[T | TResult] = js.native
    def `finally`[TResult](onfinally: js.Function0[TResult | js.Thenable[TResult]]): Promise[T | TResult] = js.native
    
    /**
      * Attaches callbacks for the resolution and/or rejection of the Promise.
      * @param onfulfilled The callback to execute when the Promise is resolved.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of which ever callback is executed.
      */
    def `then`[TResult1, TResult2](): Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]]): Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ Any, TResult2 | js.Thenable[TResult2]]
    ): Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ Any, TResult2 | js.Thenable[TResult2]]): Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, TResult2 | js.Thenable[TResult2]]): Promise[TResult1 | TResult2] = js.native
  }
  
  @js.native
  trait PromiseConstructor
    extends StObject
       with /**
    * Creates a new Promise.
    * @param executor A callback used to initialize the promise. This callback is passed two arguments:
    * a resolve callback used resolve the promise with a value or the result of another promise,
    * and a reject callback used to reject the promise with a provided reason or error.
    */
  Instantiable1[
          /* executor */ js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[js.Object | js.Thenable[js.Object]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
            Unit
          ], 
          Promise[js.Object]
        ] {
    
    /**
      * Creates a Promise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any Promise is rejected.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def all[T](values: js.Array[T | js.Thenable[T]]): Promise[js.Array[T]] = js.native
    /**
      * Creates a Promise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any Promise is rejected.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def all[T1, T2](values: js.Tuple2[T1 | js.Thenable[T1], T2 | js.Thenable[T2]]): Promise[js.Tuple2[T1, T2]] = js.native
    /**
      * Creates a Promise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any Promise is rejected.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def all[T1, T2, T3](values: js.Tuple3[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3]]): Promise[js.Tuple3[T1, T2, T3]] = js.native
    /**
      * Creates a Promise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any Promise is rejected.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def all[T1, T2, T3, T4](
      values: js.Tuple4[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3], T4 | js.Thenable[T4]]
    ): Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
    /**
      * Creates a Promise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any Promise is rejected.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def all[T1, T2, T3, T4, T5](
      values: js.Tuple5[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5]
        ]
    ): Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
    /**
      * Creates a Promise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any Promise is rejected.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def all[T1, T2, T3, T4, T5, T6](
      values: js.Tuple6[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6]
        ]
    ): Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
    /**
      * Creates a Promise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any Promise is rejected.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def all[T1, T2, T3, T4, T5, T6, T7](
      values: js.Tuple7[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7]
        ]
    ): Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
    /**
      * Creates a Promise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any Promise is rejected.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def all[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8]
        ]
    ): Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
    /**
      * Creates a Promise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any Promise is rejected.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8], 
          T9 | js.Thenable[T9]
        ]
    ): Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
    /**
      * Creates a Promise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any Promise is rejected.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8], 
          T9 | js.Thenable[T9], 
          T10 | js.Thenable[T10]
        ]
    ): Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
    
    /**
      * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def race[T](values: js.Array[T | js.Thenable[T]]): Promise[T] = js.native
    /**
      * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def race[T1, T2](values: js.Tuple2[T1 | js.Thenable[T1], T2 | js.Thenable[T2]]): Promise[T1 | T2] = js.native
    /**
      * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def race[T1, T2, T3](values: js.Tuple3[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3]]): Promise[T1 | T2 | T3] = js.native
    /**
      * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def race[T1, T2, T3, T4](
      values: js.Tuple4[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3], T4 | js.Thenable[T4]]
    ): Promise[T1 | T2 | T3 | T4] = js.native
    /**
      * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def race[T1, T2, T3, T4, T5](
      values: js.Tuple5[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5]
        ]
    ): Promise[T1 | T2 | T3 | T4 | T5] = js.native
    /**
      * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def race[T1, T2, T3, T4, T5, T6](
      values: js.Tuple6[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6]
        ]
    ): Promise[T1 | T2 | T3 | T4 | T5 | T6] = js.native
    /**
      * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def race[T1, T2, T3, T4, T5, T6, T7](
      values: js.Tuple7[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7]
        ]
    ): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
    /**
      * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def race[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8]
        ]
    ): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
    /**
      * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def race[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8], 
          T9 | js.Thenable[T9]
        ]
    ): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
    /**
      * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    def race[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8], 
          T9 | js.Thenable[T9], 
          T10 | js.Thenable[T10]
        ]
    ): Promise[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
    
    /**
      * Creates a new rejected promise for the provided reason.
      * @param reason The reason the promise was rejected.
      * @returns A new rejected Promise.
      */
    def reject(reason: Any): Promise[scala.Nothing] = js.native
    /**
      * Creates a new rejected promise for the provided reason.
      * @param reason The reason the promise was rejected.
      * @returns A new rejected Promise.
      */
    @JSName("reject")
    def reject_T[T](reason: Any): Promise[T] = js.native
    
    /**
      * Creates a new resolved promise .
      * @returns A resolved promise.
      */
    def resolve(): Promise[Unit] = js.native
    /**
      * Creates a new resolved promise for the provided value.
      * @param value A promise.
      * @returns A promise whose internal state matches the provided promise.
      */
    def resolve[T](value: T): Promise[T] = js.native
    def resolve[T](value: js.Thenable[T]): Promise[T] = js.native
  }
  
  type _To = PromiseConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PromiseConstructor = default
}
