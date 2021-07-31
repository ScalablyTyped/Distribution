package typings.jsdevtoolsFilePathFilter

import typings.jsdevtoolsFilePathFilter.typesMod.AnyFilter
import typings.jsdevtoolsFilePathFilter.typesMod.FilterFunction
import typings.jsdevtoolsFilePathFilter.typesMod.Filters
import typings.jsdevtoolsFilePathFilter.typesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizeMod {
  
  @JSImport("@jsdevtools/file-path-filter/lib/normalize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def normalize(criteria: AnyFilter, opts: Options): Filters[js.Array[FilterFunction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(criteria.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Filters[js.Array[FilterFunction]]]
}
