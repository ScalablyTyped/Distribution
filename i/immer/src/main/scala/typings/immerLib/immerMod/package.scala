package typings
package immerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object immerMod {
  type Draft[T] = T | immerLib.Anon_Readonly[T] | DraftTuple[T] | DraftArray[T]
  type DraftArray[T /* <: js.Array[_] */] = js.Array[
    /* import warning: ImportType.apply Failed type conversion: {[ P in immer.Indices<T> ]: immer.immer.Draft<T[P]>}[immer.Indices<T>] */ js.Any
  ]
  type DraftTuple[T /* <: js.Array[_] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: immer.immer.Draft<T[P]>}
    */ immerLib.immerLibStrings.DraftTuple with T
  type Immutable[T] = T | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: object}
    */ immerLib.immerLibStrings.Immutable with js.Any) | immerLib.ImmutableTuple[T] | (/* import warning: ImportType.apply Failed type conversion: {[ P in keyof T ]: std.ReadonlyArray<object>}[keyof T] */ js.Any)
  type PatchListener = js.Function2[/* patches */ js.Array[Patch], /* inversePatches */ js.Array[Patch], scala.Unit]
  type Produced[T, Return] = T | (immerLib.FromNothing[stdLib.Exclude[Return, scala.Unit]]) | immerLib.FromNothing[Return]
}
