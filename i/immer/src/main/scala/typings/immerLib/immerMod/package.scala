package typings
package immerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object immerMod {
  /* Rewritten from type alias, can be one of: 
    - T
    - immerLib.Anon_Readonly[T]
    - DraftTuple[T]
    - DraftArray[T]
  */
  type Draft[T] = _Draft[T] | T | DraftArray[T]
  type DraftArray[T /* <: js.Array[_] */] = js.Array[
    /* import warning: ImportType.apply Failed type conversion: {[ P in immer.Indices<T> ]: immer.immer.Draft<T[P]>}[immer.Indices<T>] */ js.Any
  ]
  type Immutable[T] = T | (/* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: object}
    */ immerLib.immerLibStrings.Immutable with js.Any) | immerLib.ImmutableTuple[T] | (/* import warning: ImportType.apply Failed type conversion: {[ P in keyof T ]: std.ReadonlyArray<object>}[keyof T] */ js.Any)
  type PatchListener = js.Function2[/* patches */ js.Array[Patch], /* inversePatches */ js.Array[Patch], scala.Unit]
  type Produced[T, Return] = T | (immerLib.FromNothing[stdLib.Exclude[Return, scala.Unit]]) | immerLib.FromNothing[Return]
}
