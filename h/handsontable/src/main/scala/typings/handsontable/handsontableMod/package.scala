package typings.handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object handsontableMod {
  import typings.handsontable.handsontableMod._Handsontable.Core
  import typings.std.Pick

  type Handsontable = Core
  /**
    * @internal
    * Omit properties K from T
    */
  type Omit[T, K /* <: String */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  type default = default_
}
