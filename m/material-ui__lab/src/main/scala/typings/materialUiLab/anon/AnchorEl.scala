package typings.materialUiLab.anon

import typings.materialUiLab.useAutocompleteUseAutocompleteMod.AutocompleteFreeSoloValueMapping
import typings.materialUiLab.useAutocompleteUseAutocompleteMod.Value
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnchorEl[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] extends js.Object {
  
  var anchorEl: Null | HTMLElement = js.native
  
  var dirty: Boolean = js.native
  
  var focused: Boolean = js.native
  
  var focusedTag: Double = js.native
  
  def getClearProps(): js.Object = js.native
  
  def getInputLabelProps(): js.Object = js.native
  
  def getInputProps(): js.Object = js.native
  
  def getListboxProps(): js.Object = js.native
  
  def getOptionProps(hasOptionIndex: Option[T]): js.Object = js.native
  
  def getPopupIndicatorProps(): js.Object = js.native
  
  def getRootProps(): js.Object = js.native
  
  def getTagProps(hasIndex: Index): js.Object = js.native
  
  var groupedOptions: js.Array[T] = js.native
  
  var id: String = js.native
  
  var inputValue: String = js.native
  
  var popupOpen: Boolean = js.native
  
  def setAnchorEl(): Unit = js.native
  
  var value: Value[T, Multiple, DisableClearable, FreeSolo] = js.native
}
object AnchorEl {
  
  @scala.inline
  def apply[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](
    dirty: Boolean,
    focused: Boolean,
    focusedTag: Double,
    getClearProps: () => js.Object,
    getInputLabelProps: () => js.Object,
    getInputProps: () => js.Object,
    getListboxProps: () => js.Object,
    getOptionProps: Option[T] => js.Object,
    getPopupIndicatorProps: () => js.Object,
    getRootProps: () => js.Object,
    getTagProps: Index => js.Object,
    groupedOptions: js.Array[T],
    id: String,
    inputValue: String,
    popupOpen: Boolean,
    setAnchorEl: () => Unit
  ): AnchorEl[T, Multiple, DisableClearable, FreeSolo] = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], focusedTag = focusedTag.asInstanceOf[js.Any], getClearProps = js.Any.fromFunction0(getClearProps), getInputLabelProps = js.Any.fromFunction0(getInputLabelProps), getInputProps = js.Any.fromFunction0(getInputProps), getListboxProps = js.Any.fromFunction0(getListboxProps), getOptionProps = js.Any.fromFunction1(getOptionProps), getPopupIndicatorProps = js.Any.fromFunction0(getPopupIndicatorProps), getRootProps = js.Any.fromFunction0(getRootProps), getTagProps = js.Any.fromFunction1(getTagProps), groupedOptions = groupedOptions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], popupOpen = popupOpen.asInstanceOf[js.Any], setAnchorEl = js.Any.fromFunction0(setAnchorEl))
    __obj.asInstanceOf[AnchorEl[T, Multiple, DisableClearable, FreeSolo]]
  }
  
  @scala.inline
  implicit class AnchorElOps[Self <: AnchorEl[_, _, _, _], T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] (val x: Self with (AnchorEl[T, Multiple, DisableClearable, FreeSolo])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirty(value: Boolean): Self = this.set("dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusedTag(value: Double): Self = this.set("focusedTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetClearProps(value: () => js.Object): Self = this.set("getClearProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInputLabelProps(value: () => js.Object): Self = this.set("getInputLabelProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInputProps(value: () => js.Object): Self = this.set("getInputProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetListboxProps(value: () => js.Object): Self = this.set("getListboxProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOptionProps(value: Option[T] => js.Object): Self = this.set("getOptionProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPopupIndicatorProps(value: () => js.Object): Self = this.set("getPopupIndicatorProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRootProps(value: () => js.Object): Self = this.set("getRootProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTagProps(value: Index => js.Object): Self = this.set("getTagProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupedOptionsVarargs(value: T*): Self = this.set("groupedOptions", js.Array(value :_*))
    
    @scala.inline
    def setGroupedOptions(value: js.Array[T]): Self = this.set("groupedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupOpen(value: Boolean): Self = this.set("popupOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAnchorEl(value: () => Unit): Self = this.set("setAnchorEl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAnchorEl(value: HTMLElement): Self = this.set("anchorEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorElNull: Self = this.set("anchorEl", null)
    
    @scala.inline
    def setValueVarargs(value: (T | AutocompleteFreeSoloValueMapping[FreeSolo])*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Value[T, Multiple, DisableClearable, FreeSolo]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
