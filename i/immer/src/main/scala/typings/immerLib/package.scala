package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object immerLib {
  type ArrayMethod = stdLib.Exclude[java.lang.String, scala.Double]
  type AtomicObject = js.Function | (stdLib.Map[js.Any, js.Any]) | (stdLib.WeakMap[js.Any, js.Any]) | stdLib.Set[js.Any] | stdLib.WeakSet[js.Any] | js.Promise[js.Any] | stdLib.Date | stdLib.RegExp | scala.Boolean | stdLib.Number | java.lang.String
  /** Converts `nothing` into `undefined` */
  type FromNothing[T] = js.UndefOr[
    T | (stdLib.Exclude[
      T, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Nothing */ js.Any
    ])
  ]
  type ImmutableTuple[T /* <: js.Array[_] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: any}
    */ immerLib.immerLibStrings.ImmutableTuple with js.Any
  type Indices[T] = stdLib.Exclude[java.lang.String, ArrayMethod]
}
