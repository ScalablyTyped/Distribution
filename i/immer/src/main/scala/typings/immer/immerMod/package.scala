package typings.immer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object immerMod {
  import typings.immer.Anon_Readonly
  import typings.std.Date
  import typings.std.Exclude
  import typings.std.Map
  import typings.std.Number
  import typings.std.RegExp
  import typings.std.Set
  import typings.std.WeakMap
  import typings.std.WeakSet

  type AtomicObject = js.Function | (Map[js.Any, js.Any]) | (WeakMap[js.Any, js.Any]) | Set[js.Any] | WeakSet[js.Any] | js.Promise[js.Any] | Date | RegExp | Boolean | Number | String
  type Draft[T] = T | Anon_Readonly[T] | DraftTuple[T] | DraftArray[T]
  type DraftArray[T /* <: js.Array[_] */] = js.Array[
    /* import warning: ImportType.apply Failed type conversion: {[ P in immer.Indices<T> ]: immer.immer.Draft<T[P]>}[immer.Indices<T>] */ js.Any
  ]
  type DraftTuple[T /* <: js.Array[_] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: P extends immer.Indices<T>? immer.immer.Draft<T[P]> : never}
    */ typings.immer.immerStrings.DraftTuple with T
  /** Converts `nothing` into `undefined` */
  type FromNothing[T] = js.UndefOr[T | (Exclude[T, Nothing])]
  type PatchListener = js.Function2[/* patches */ js.Array[Patch], /* inversePatches */ js.Array[Patch], Unit]
  /** The inferred return type of `produce` */
  type Produced[Base, Return] = (FromNothing[(Exclude[Return, Unit]) | Return]) | Base
}
