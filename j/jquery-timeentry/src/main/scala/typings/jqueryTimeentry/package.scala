package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object jqueryTimeentry {
  
  type ITimeEntry = js.Function3[
    /* configOrFnName */ js.UndefOr[typings.jqueryTimeentry.ITimeEntryOptions | java.lang.String], 
    /* nameOrOption */ js.UndefOr[js.Any], 
    /* value */ js.UndefOr[js.Any], 
    js.Any
  ]
  
  type ITimeEntryLocales = org.scalablytyped.runtime.StringDictionary[typings.jqueryTimeentry.ITimeEntryRegionalOptions]
}
