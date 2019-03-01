package typings
package griddleDashReactLib.griddleDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("griddle-react", "utils")
@js.native
object utilsNs extends js.Object {
  trait SortProperties extends js.Object {
    var columnId: java.lang.String
    var sortProperty: griddleDashReactLib.griddleDashReactMod.GriddleSortKey
    def setSortColumn(
      sortProperties: js.Function1[/* key */ griddleDashReactLib.griddleDashReactMod.GriddleSortKey, scala.Unit]
    ): scala.Unit
  }
  
  val columnUtils: griddleDashReactLib.griddleDashReactMod.PropertyBag[js.Function] = js.native
  val compositionUtils: griddleDashReactLib.griddleDashReactMod.PropertyBag[js.Function] = js.native
  val connect: reactDashReduxLib.reactDashReduxMod.Connect = js.native
  val dataUtils: griddleDashReactLib.griddleDashReactMod.PropertyBag[js.Function] = js.native
  val rowUtils: griddleDashReactLib.griddleDashReactMod.PropertyBag[js.Function] = js.native
  @JSName("sortUtils")
  @js.native
  object sortUtilsNs extends js.Object {
    def defaultSort(data: js.Array[_], column: java.lang.String): scala.Double = js.native
    def defaultSort(data: js.Array[_], column: java.lang.String, sortAscending: scala.Boolean): scala.Double = js.native
    def setSortProperties(sortProperties: griddleDashReactLib.griddleDashReactMod.utilsNs.SortProperties): js.Function0[scala.Unit] = js.native
  }
  
}

