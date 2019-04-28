package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  type DeepFreeze = js.Function1[/* obj */ js.Object, DeepReadonly[js.Object]]
  type DeepReadonly[T /* <: js.Object */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ K in keyof T ]: T[K]}
    */ grommetLib.grommetLibStrings.DeepReadonly with T
  type NonUndefined[T] = T
  type NonUndefinedProps[T /* <: js.Object */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? grommet.grommet/utils.NonUndefined<T[K]>}
    */ grommetLib.grommetLibStrings.NonUndefinedProps with T
  type Omit[T, K] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type PolymorphicType = java.lang.String
}
