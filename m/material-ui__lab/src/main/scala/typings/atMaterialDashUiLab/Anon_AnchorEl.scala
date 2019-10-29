package typings.atMaterialDashUiLab

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnchorEl extends js.Object {
  var anchorEl: Null | HTMLElement
  var dirty: Boolean
  var focused: Boolean
  var focusedTag: Double
  var groupedOptions: js.Array[_]
  var id: String
  var popupOpen: Boolean
  var value: js.Any
  def getClearProps(): js.Object
  def getInputLabelProps(): js.Object
  def getInputProps(): js.Object
  def getListboxProps(): js.Object
  def getOptionProps(hasOptionIndex: Anon_Index): js.Object
  def getPopupIndicatorProps(): js.Object
  def getPopupProps(): js.Object
  def getRootProps(): js.Object
  def getTagProps(): js.Object
  def setAnchorEl(): Unit
}

object Anon_AnchorEl {
  @scala.inline
  def apply(
    dirty: Boolean,
    focused: Boolean,
    focusedTag: Double,
    getClearProps: () => js.Object,
    getInputLabelProps: () => js.Object,
    getInputProps: () => js.Object,
    getListboxProps: () => js.Object,
    getOptionProps: Anon_Index => js.Object,
    getPopupIndicatorProps: () => js.Object,
    getPopupProps: () => js.Object,
    getRootProps: () => js.Object,
    getTagProps: () => js.Object,
    groupedOptions: js.Array[_],
    id: String,
    popupOpen: Boolean,
    setAnchorEl: () => Unit,
    value: js.Any,
    anchorEl: HTMLElement = null
  ): Anon_AnchorEl = {
    val __obj = js.Dynamic.literal(dirty = dirty, focused = focused, focusedTag = focusedTag, getClearProps = js.Any.fromFunction0(getClearProps), getInputLabelProps = js.Any.fromFunction0(getInputLabelProps), getInputProps = js.Any.fromFunction0(getInputProps), getListboxProps = js.Any.fromFunction0(getListboxProps), getOptionProps = js.Any.fromFunction1(getOptionProps), getPopupIndicatorProps = js.Any.fromFunction0(getPopupIndicatorProps), getPopupProps = js.Any.fromFunction0(getPopupProps), getRootProps = js.Any.fromFunction0(getRootProps), getTagProps = js.Any.fromFunction0(getTagProps), groupedOptions = groupedOptions, id = id, popupOpen = popupOpen, setAnchorEl = js.Any.fromFunction0(setAnchorEl), value = value)
    if (anchorEl != null) __obj.updateDynamic("anchorEl")(anchorEl)
    __obj.asInstanceOf[Anon_AnchorEl]
  }
}

