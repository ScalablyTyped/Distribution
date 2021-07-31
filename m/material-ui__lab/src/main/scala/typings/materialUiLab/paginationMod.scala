package typings.materialUiLab

import typings.materialUiLab.paginationPaginationMod.PaginationProps
import typings.materialUiLab.usePaginationMod.UsePaginationProps
import typings.materialUiLab.usePaginationMod.UsePaginationResult
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationMod {
  
  @JSImport("@material-ui/lab/Pagination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: PaginationProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def usePagination(props: UsePaginationProps): UsePaginationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("usePagination")(props.asInstanceOf[js.Any]).asInstanceOf[UsePaginationResult]
}
