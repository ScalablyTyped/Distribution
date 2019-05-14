package typings
package immerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object immerMod {
  type AtomicObject = js.Function | (stdLib.Map[js.Any, js.Any]) | (stdLib.WeakMap[js.Any, js.Any]) | stdLib.Set[js.Any] | stdLib.WeakSet[js.Any] | js.Promise[js.Any] | stdLib.Date | stdLib.RegExp | scala.Boolean | stdLib.Number | java.lang.String
  type Draft[T] = T | immerLib.Anon_Readonly[T] | DraftTuple[T] | DraftArray[T]
  type DraftArray[T /* <: js.Array[_] */] = js.Array[
    /* import warning: ImportType.apply Failed type conversion: {[ P in immer.Indices<T> ]: immer.immer.Draft<T[P]>}[immer.Indices<T>] */ js.Any
  ]
  type DraftTuple[T /* <: js.Array[_] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: P extends immer.Indices<T>? immer.immer.Draft<T[P]> : never}
    */ immerLib.immerLibStrings.DraftTuple with T
  /** Converts `nothing` into `undefined` */
  type FromNothing[T] = js.UndefOr[T | (stdLib.Exclude[T, Nothing])]
  type Immutable[T] = T | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: object}
    */ immerLib.immerLibStrings.Immutable with js.Any) | ImmutableTuple[T] | (/* import warning: ImportType.apply Failed type conversion: {[ P in keyof T ]: std.ReadonlyArray<object>}[keyof T] */ js.Any)
  type ImmutableTuple[T /* <: js.Array[_] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: immer.immer.Immutable<T[P]>}
    */ immerLib.immerLibStrings.ImmutableTuple with T
  type PatchListener = js.Function2[/* patches */ js.Array[Patch], /* inversePatches */ js.Array[Patch], scala.Unit]
  type Produced[T, Return] = T | (FromNothing[stdLib.Exclude[Return, scala.Unit]]) | FromNothing[Return]
}
