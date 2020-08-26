package typings.materialUiLab

import typings.materialUiLab.autocompleteAutocompleteMod.AutocompleteProps
import typings.materialUiLab.useAutocompleteUseAutocompleteMod.CreateFilterOptionsConfig
import typings.materialUiLab.useAutocompleteUseAutocompleteMod.FilterOptionsState
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/lab/Autocomplete", JSImport.Namespace)
@js.native
object autocompleteMod extends js.Object {
  def createFilterOptions[T](): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = js.native
  def createFilterOptions[T](config: CreateFilterOptionsConfig[T]): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = js.native
  def default[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: AutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): Element = js.native
}

