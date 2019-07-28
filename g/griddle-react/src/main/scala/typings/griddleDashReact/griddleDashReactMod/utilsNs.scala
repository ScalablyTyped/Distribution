package typings.griddleDashReact.griddleDashReactMod

import typings.griddleDashReact.griddleDashReactMod.utilsNs.SortProperties
import typings.reactDashRedux.reactDashReduxMod.Connect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("griddle-react", "utils")
@js.native
object utilsNs extends js.Object {
  trait SortProperties extends js.Object {
    var columnId: String
    var sortProperty: GriddleSortKey
    def setSortColumn(sortProperties: js.Function1[/* key */ GriddleSortKey, Unit]): Unit
  }
  
  val columnUtils: PropertyBag[js.Function] = js.native
  val compositionUtils: PropertyBag[js.Function] = js.native
  val connect: Connect = js.native
  val dataUtils: PropertyBag[js.Function] = js.native
  val rowUtils: PropertyBag[js.Function] = js.native
  @JSName("sortUtils")
  @js.native
  object sortUtilsNs extends js.Object {
    def defaultSort(data: js.Array[_], column: String): Double = js.native
    def defaultSort(data: js.Array[_], column: String, sortAscending: Boolean): Double = js.native
    def setSortProperties(sortProperties: SortProperties): js.Function0[Unit] = js.native
  }
  
}

