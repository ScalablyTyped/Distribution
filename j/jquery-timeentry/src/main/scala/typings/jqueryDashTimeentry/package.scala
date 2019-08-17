package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jqueryDashTimeentry {
  import org.scalablytyped.runtime.StringDictionary

  type ITimeEntry = js.Function3[
    /* configOrFnName */ js.UndefOr[ITimeEntryOptions | String], 
    /* nameOrOption */ js.UndefOr[js.Any], 
    /* value */ js.UndefOr[js.Any], 
    js.Any
  ]
  type ITimeEntryLocales = StringDictionary[ITimeEntryRegionalOptions]
}
