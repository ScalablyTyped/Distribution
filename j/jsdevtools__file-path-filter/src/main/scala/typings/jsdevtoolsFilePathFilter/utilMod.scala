package typings.jsdevtoolsFilePathFilter

import typings.jsdevtoolsFilePathFilter.typesMod.FilterFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@jsdevtools/file-path-filter/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jsdevtools/file-path-filter/lib/util", "_filters")
  @js.native
  val filters: js.Symbol = js.native
  
  inline def isFilterCriterion(value: Any): /* is @jsdevtools/file-path-filter.@jsdevtools/file-path-filter/lib/types.FilterCriterion */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFilterCriterion")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @jsdevtools/file-path-filter.@jsdevtools/file-path-filter/lib/types.FilterCriterion */ Boolean]
  
  inline def isPathFilter(value: Any): /* is @jsdevtools/file-path-filter.@jsdevtools/file-path-filter/lib/util.PathFilter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPathFilter")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @jsdevtools/file-path-filter.@jsdevtools/file-path-filter/lib/util.PathFilter */ Boolean]
  
  @js.native
  trait PathFilter
    extends StObject
       with FilterFunction
}
