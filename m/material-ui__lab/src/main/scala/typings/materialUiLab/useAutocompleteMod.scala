package typings.materialUiLab

import typings.materialUiLab.anon.AnchorEl
import typings.materialUiLab.useAutocompleteUseAutocompleteMod.CreateFilterOptionsConfig
import typings.materialUiLab.useAutocompleteUseAutocompleteMod.FilterOptionsState
import typings.materialUiLab.useAutocompleteUseAutocompleteMod.UseAutocompleteProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useAutocompleteMod {
  
  @JSImport("@material-ui/lab/useAutocomplete", JSImport.Default)
  @js.native
  def default[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: UseAutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): AnchorEl[T, Multiple, DisableClearable, FreeSolo] = js.native
  
  @JSImport("@material-ui/lab/useAutocomplete", "createFilterOptions")
  @js.native
  def createFilterOptions[T](): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = js.native
  @JSImport("@material-ui/lab/useAutocomplete", "createFilterOptions")
  @js.native
  def createFilterOptions[T](config: CreateFilterOptionsConfig[T]): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = js.native
}
