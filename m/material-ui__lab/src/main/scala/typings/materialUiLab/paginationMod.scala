package typings.materialUiLab

import typings.materialUiLab.paginationUsePaginationMod.UsePaginationProps
import typings.materialUiLab.paginationUsePaginationMod.UsePaginationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationMod {
  
  @JSImport("@material-ui/lab/Pagination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: UsePaginationProps): UsePaginationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[UsePaginationResult]
  
  inline def usePagination(props: UsePaginationProps): UsePaginationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("usePagination")(props.asInstanceOf[js.Any]).asInstanceOf[UsePaginationResult]
}
