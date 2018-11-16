package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jqueryDashTimeentryLib {
  type ITimeEntry = js.Function3[
    /* configOrFnName */ js.UndefOr[ITimeEntryOptions | java.lang.String], 
    /* nameOrOption */ js.UndefOr[js.Any], 
    /* value */ js.UndefOr[js.Any], 
    js.Any
  ]
}
