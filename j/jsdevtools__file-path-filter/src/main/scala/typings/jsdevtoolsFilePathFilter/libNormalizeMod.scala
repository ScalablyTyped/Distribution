package typings.jsdevtoolsFilePathFilter

import typings.jsdevtoolsFilePathFilter.libTypesMod.AnyFilter
import typings.jsdevtoolsFilePathFilter.libTypesMod.FilterFunction
import typings.jsdevtoolsFilePathFilter.libTypesMod.Filters
import typings.jsdevtoolsFilePathFilter.libTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNormalizeMod {
  
  @JSImport("@jsdevtools/file-path-filter/lib/normalize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalize(criteria: AnyFilter, opts: Options): Filters[js.Array[FilterFunction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(criteria.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Filters[js.Array[FilterFunction]]]
}
