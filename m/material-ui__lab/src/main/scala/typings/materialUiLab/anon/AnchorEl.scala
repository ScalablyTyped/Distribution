package typings.materialUiLab.anon

import typings.materialUiLab.useAutocompleteUseAutocompleteMod.AutocompleteFreeSoloValueMapping
import typings.materialUiLab.useAutocompleteUseAutocompleteMod.Value
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnchorEl[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] extends StObject {
  
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
  implicit class AnchorElMutableBuilder[Self <: AnchorEl[_, _, _, _], T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] (val x: Self with (AnchorEl[T, Multiple, DisableClearable, FreeSolo])) extends AnyVal {
    
    @scala.inline
    def setAnchorEl(value: HTMLElement): Self = StObject.set(x, "anchorEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorElNull: Self = StObject.set(x, "anchorEl", null)
    
    @scala.inline
    def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusedTag(value: Double): Self = StObject.set(x, "focusedTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetClearProps(value: () => js.Object): Self = StObject.set(x, "getClearProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInputLabelProps(value: () => js.Object): Self = StObject.set(x, "getInputLabelProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInputProps(value: () => js.Object): Self = StObject.set(x, "getInputProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetListboxProps(value: () => js.Object): Self = StObject.set(x, "getListboxProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOptionProps(value: Option[T] => js.Object): Self = StObject.set(x, "getOptionProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPopupIndicatorProps(value: () => js.Object): Self = StObject.set(x, "getPopupIndicatorProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRootProps(value: () => js.Object): Self = StObject.set(x, "getRootProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTagProps(value: Index => js.Object): Self = StObject.set(x, "getTagProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupedOptions(value: js.Array[T]): Self = StObject.set(x, "groupedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupedOptionsVarargs(value: T*): Self = StObject.set(x, "groupedOptions", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupOpen(value: Boolean): Self = StObject.set(x, "popupOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAnchorEl(value: () => Unit): Self = StObject.set(x, "setAnchorEl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValue(value: Value[T, Multiple, DisableClearable, FreeSolo]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueVarargs(value: (T | AutocompleteFreeSoloValueMapping[FreeSolo])*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
