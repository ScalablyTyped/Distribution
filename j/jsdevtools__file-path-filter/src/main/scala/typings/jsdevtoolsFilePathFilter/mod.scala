package typings.jsdevtoolsFilePathFilter

import typings.jsdevtoolsFilePathFilter.typesMod.AnyFilter
import typings.jsdevtoolsFilePathFilter.typesMod.FilterCriteria
import typings.jsdevtoolsFilePathFilter.typesMod.FilterCriterion
import typings.jsdevtoolsFilePathFilter.typesMod.FilterFunction
import typings.jsdevtoolsFilePathFilter.typesMod.Filters
import typings.jsdevtoolsFilePathFilter.typesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jsdevtools/file-path-filter", JSImport.Default)
  @js.native
  def default(criteria: FilterCriterion*): FilterFunction = js.native
  @JSImport("@jsdevtools/file-path-filter", JSImport.Default)
  @js.native
  def default(criteria: AnyFilter): FilterFunction = js.native
  @JSImport("@jsdevtools/file-path-filter", JSImport.Default)
  @js.native
  def default(filters: Filters[FilterCriteria]): FilterFunction = js.native
  
  @JSImport("@jsdevtools/file-path-filter", "createFilter")
  @js.native
  def createFilter(options: Options, criteria: FilterCriterion*): FilterFunction = js.native
  @JSImport("@jsdevtools/file-path-filter", "createFilter")
  @js.native
  def createFilter(options: Options, criteria: AnyFilter): FilterFunction = js.native
  @JSImport("@jsdevtools/file-path-filter", "createFilter")
  @js.native
  def createFilter(options: Options, filters: Filters[FilterCriteria]): FilterFunction = js.native
  
  @JSImport("@jsdevtools/file-path-filter", "filePathFilter")
  @js.native
  def filePathFilter(criteria: FilterCriterion*): FilterFunction = js.native
  @JSImport("@jsdevtools/file-path-filter", "filePathFilter")
  @js.native
  def filePathFilter(criteria: AnyFilter): FilterFunction = js.native
  @JSImport("@jsdevtools/file-path-filter", "filePathFilter")
  @js.native
  def filePathFilter(filters: Filters[FilterCriteria]): FilterFunction = js.native
}
