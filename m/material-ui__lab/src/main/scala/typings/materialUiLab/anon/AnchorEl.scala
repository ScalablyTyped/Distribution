package typings.materialUiLab.anon

import typings.materialUiLab.useAutocompleteUseAutocompleteMod.AutocompleteFreeSoloValueMapping
import typings.materialUiLab.useAutocompleteUseAutocompleteMod.Value
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnchorEl[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] extends StObject {
  
  var anchorEl: Null | HTMLElement
  
  var dirty: Boolean
  
  var focused: Boolean
  
  var focusedTag: Double
  
  def getClearProps(): js.Object
  
  def getInputLabelProps(): js.Object
  
  def getInputProps(): js.Object
  
  def getListboxProps(): js.Object
  
  def getOptionProps(hasOptionIndex: Option[T]): js.Object
  
  def getPopupIndicatorProps(): js.Object
  
  def getRootProps(): js.Object
  
  def getTagProps(hasIndex: Index): js.Object
  
  var groupedOptions: js.Array[T]
  
  var id: String
  
  var inputValue: String
  
  var popupOpen: Boolean
  
  def setAnchorEl(): Unit
  
  var value: Value[T, Multiple, DisableClearable, FreeSolo]
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
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], focusedTag = focusedTag.asInstanceOf[js.Any], getClearProps = js.Any.fromFunction0(getClearProps), getInputLabelProps = js.Any.fromFunction0(getInputLabelProps), getInputProps = js.Any.fromFunction0(getInputProps), getListboxProps = js.Any.fromFunction0(getListboxProps), getOptionProps = js.Any.fromFunction1(getOptionProps), getPopupIndicatorProps = js.Any.fromFunction0(getPopupIndicatorProps), getRootProps = js.Any.fromFunction0(getRootProps), getTagProps = js.Any.fromFunction1(getTagProps), groupedOptions = groupedOptions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], popupOpen = popupOpen.asInstanceOf[js.Any], setAnchorEl = js.Any.fromFunction0(setAnchorEl), anchorEl = null, value = null)
    __obj.asInstanceOf[AnchorEl[T, Multiple, DisableClearable, FreeSolo]]
  }
  
  @scala.inline
  implicit class AnchorElMutableBuilder[Self <: AnchorEl[?, ?, ?, ?], T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] (val x: Self & (AnchorEl[T, Multiple, DisableClearable, FreeSolo])) extends AnyVal {
    
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
