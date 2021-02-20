package typings.jsdevtoolsFilePathFilter

import typings.jsdevtoolsFilePathFilter.typesMod.AnyFilter
import typings.jsdevtoolsFilePathFilter.typesMod.FilterCriteria
import typings.jsdevtoolsFilePathFilter.typesMod.FilterCriterion
import typings.jsdevtoolsFilePathFilter.typesMod.FilterFunction
import typings.jsdevtoolsFilePathFilter.typesMod.Filters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filePathFilterMod {
  
  @JSImport("@jsdevtools/file-path-filter/lib/file-path-filter", "filePathFilter")
  @js.native
  def filePathFilter(criteria: FilterCriterion*): FilterFunction = js.native
  @JSImport("@jsdevtools/file-path-filter/lib/file-path-filter", "filePathFilter")
  @js.native
  def filePathFilter(criteria: AnyFilter): FilterFunction = js.native
  @JSImport("@jsdevtools/file-path-filter/lib/file-path-filter", "filePathFilter")
  @js.native
  def filePathFilter(filters: Filters[FilterCriteria]): FilterFunction = js.native
}
