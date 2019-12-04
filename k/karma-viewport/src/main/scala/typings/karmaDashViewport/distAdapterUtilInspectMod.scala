package typings.karmaDashViewport

import typings.karmaDashViewport.distAdapterUtilInspectMod.InspectFunction
import typings.karmaDashViewport.distAdapterUtilInspectMod.InspectValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("karma-viewport/dist/adapter/util/inspect", JSImport.Namespace)
@js.native
object distAdapterUtilInspectMod extends js.Object {
  def inspect(value: InspectValue): String = js.native
  type InspectFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type InspectValue = js.UndefOr[Null | Double | String | js.Object | InspectFunction]
}

