package typings.handsontable.mod.Handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("handsontable", "Handsontable.validators")
@js.native
object validators extends js.Object {
  type Autocomplete = Base
  type Base = js.ThisFunction2[
    /* this */ CellProperties, 
    /* value */ CellValue, 
    /* callback */ js.Function1[/* valid */ Boolean, Unit], 
    Unit
  ]
  type Date = Base
  type Numeric = Base
  type Time = Base
}

