package typings.jsdevtoolsFilePathFilter

import typings.jsdevtoolsFilePathFilter.libTypesMod.AnyFilter
import typings.jsdevtoolsFilePathFilter.libTypesMod.FilterCriteria
import typings.jsdevtoolsFilePathFilter.libTypesMod.FilterCriterion
import typings.jsdevtoolsFilePathFilter.libTypesMod.FilterFunction
import typings.jsdevtoolsFilePathFilter.libTypesMod.Filters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFilePathFilterMod {
  
  @JSImport("@jsdevtools/file-path-filter/lib/file-path-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filePathFilter(criteria: FilterCriterion*): FilterFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("filePathFilter")(criteria.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FilterFunction]
  inline def filePathFilter(criteria: AnyFilter): FilterFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("filePathFilter")(criteria.asInstanceOf[js.Any]).asInstanceOf[FilterFunction]
  inline def filePathFilter(filters: Filters[FilterCriteria]): FilterFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("filePathFilter")(filters.asInstanceOf[js.Any]).asInstanceOf[FilterFunction]
}
