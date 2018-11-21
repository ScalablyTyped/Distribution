package typings
package griddleDashReactLib.griddleDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GriddleEvents extends GriddleActions {
  var onFilter: js.UndefOr[js.Function1[/* filterText */ java.lang.String, scala.Unit]] = js.undefined
  var setSortProperties: js.UndefOr[
    js.Function1[
      /* sortProperties */ griddleDashReactLib.griddleDashReactMod.utilsNs.SortProperties, 
      js.Function0[scala.Unit]
    ]
  ] = js.undefined
}

