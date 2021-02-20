package typings.jsdevtoolsFilePathFilter

import typings.jsdevtoolsFilePathFilter.typesMod.FilterFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@jsdevtools/file-path-filter/lib/util", "_filters")
  @js.native
  val filters: js.Symbol = js.native
  
  @JSImport("@jsdevtools/file-path-filter/lib/util", "isFilterCriterion")
  @js.native
  def isFilterCriterion(value: js.Any): /* is @jsdevtools/file-path-filter.@jsdevtools/file-path-filter/lib/types.FilterCriterion */ Boolean = js.native
  
  @JSImport("@jsdevtools/file-path-filter/lib/util", "isPathFilter")
  @js.native
  def isPathFilter(value: js.Any): /* is @jsdevtools/file-path-filter.@jsdevtools/file-path-filter/lib/util.PathFilter */ Boolean = js.native
  
  @js.native
  trait PathFilter extends FilterFunction
}
