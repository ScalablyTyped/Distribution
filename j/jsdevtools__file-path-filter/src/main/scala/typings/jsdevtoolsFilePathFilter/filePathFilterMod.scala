package typings.jsdevtoolsFilePathFilter

import typings.jsdevtoolsFilePathFilter.typesMod.AnyFilter
import typings.jsdevtoolsFilePathFilter.typesMod.FilterCriteria
import typings.jsdevtoolsFilePathFilter.typesMod.FilterCriterion
import typings.jsdevtoolsFilePathFilter.typesMod.FilterFunction
import typings.jsdevtoolsFilePathFilter.typesMod.Filters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jsdevtools/file-path-filter/lib/file-path-filter", JSImport.Namespace)
@js.native
object filePathFilterMod extends js.Object {
  def filePathFilter(criteria: FilterCriterion*): FilterFunction = js.native
  def filePathFilter(criteria: AnyFilter): FilterFunction = js.native
  def filePathFilter(filters: Filters[FilterCriteria]): FilterFunction = js.native
}

