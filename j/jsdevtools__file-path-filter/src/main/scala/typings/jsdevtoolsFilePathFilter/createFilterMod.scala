package typings.jsdevtoolsFilePathFilter

import typings.jsdevtoolsFilePathFilter.typesMod.AnyFilter
import typings.jsdevtoolsFilePathFilter.typesMod.FilterCriteria
import typings.jsdevtoolsFilePathFilter.typesMod.FilterCriterion
import typings.jsdevtoolsFilePathFilter.typesMod.FilterFunction
import typings.jsdevtoolsFilePathFilter.typesMod.Filters
import typings.jsdevtoolsFilePathFilter.typesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createFilterMod {
  
  @JSImport("@jsdevtools/file-path-filter/lib/create-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFilter(options: Options, criteria: FilterCriterion*): FilterFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(options.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[FilterFunction]
  inline def createFilter(options: Options, criteria: AnyFilter): FilterFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(options.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[FilterFunction]
  inline def createFilter(options: Options, filters: Filters[FilterCriteria]): FilterFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(options.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[FilterFunction]
}
