package typings.handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Handsontable = typings.handsontable.mod._Handsontable.Core
  /**
    * @internal
    * Omit properties K from T
    */
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  type default = typings.handsontable.mod.default_
}
