package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonDatetimeAttributes
  extends atIonicCoreLib.distTypesStencilDotCoreMod.JSXElementsNs.HTMLAttributes[stdLib.HTMLElement] {
  /**
    * The text to display on the picker's cancel button.
    */
  var cancelText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Full day of the week names. This can be used to provide locale names for each day in the week. Defaults to English.
    */
  var dayNames: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  /**
    * Short abbreviated day of the week names. This can be used to provide locale names for each day in the week. Defaults to English.
    */
  var dayShortNames: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  /**
    * Values used to create the list of selectable days. By default every day is shown for the given month. However, to control exactly which days of the month to display, the `dayValues` input can take a number, an array of numbers, or a string of comma separated numbers. Note that even if the array days have an invalid number for the selected month, like `31` in February, it will correctly not show days which are not valid for the selected month.
    */
  var dayValues: js.UndefOr[js.Array[scala.Double] | scala.Double | java.lang.String] = js.undefined
  /**
    * If `true`, the user cannot interact with the datetime.
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The display format of the date and time as text that shows within the item. When the `pickerFormat` input is not used, then the `displayFormat` is used for both display the formatted text, and determining the datetime picker's columns. See the `pickerFormat` input description for more info. Defaults to `MMM D, YYYY`.
    */
  var displayFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text to display on the picker's "Done" button.
    */
  var doneText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Values used to create the list of selectable hours. By default the hour values range from `0` to `23` for 24-hour, or `1` to `12` for 12-hour. However, to control exactly which hours to display, the `hourValues` input can take a number, an array of numbers, or a string of comma separated numbers.
    */
  var hourValues: js.UndefOr[js.Array[scala.Double] | scala.Double | java.lang.String] = js.undefined
  /**
    * The maximum datetime allowed. Value must be a date string following the [ISO 8601 datetime format standard](https://www.w3.org/TR/NOTE-datetime), `1996-12-19`. The format does not have to be specific to an exact datetime. For example, the maximum could just be the year, such as `1994`. Defaults to the end of this year.
    */
  var max: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The minimum datetime allowed. Value must be a date string following the [ISO 8601 datetime format standard](https://www.w3.org/TR/NOTE-datetime), such as `1996-12-19`. The format does not have to be specific to an exact datetime. For example, the minimum could just be the year, such as `1994`. Defaults to the beginning of the year, 100 years ago from today.
    */
  var min: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Values used to create the list of selectable minutes. By default the minutes range from `0` to `59`. However, to control exactly which minutes to display, the `minuteValues` input can take a number, an array of numbers, or a string of comma separated numbers. For example, if the minute selections should only be every 15 minutes, then this input value would be `minuteValues="0,15,30,45"`.
    */
  var minuteValues: js.UndefOr[js.Array[scala.Double] | scala.Double | java.lang.String] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  ] = js.undefined
  /**
    * Full names for each month name. This can be used to provide locale month names. Defaults to English.
    */
  var monthNames: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  /**
    * Short abbreviated names for each month name. This can be used to provide locale month names. Defaults to English.
    */
  var monthShortNames: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  /**
    * Values used to create the list of selectable months. By default the month values range from `1` to `12`. However, to control exactly which months to display, the `monthValues` input can take a number, an array of numbers, or a string of comma separated numbers. For example, if only summer months should be shown, then this input value would be `monthValues="6,7,8"`. Note that month numbers do *not* have a zero-based index, meaning January's value is `1`, and December's is `12`.
    */
  var monthValues: js.UndefOr[js.Array[scala.Double] | scala.Double | java.lang.String] = js.undefined
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Emitted when the datetime loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ stdLib.CustomEvent[scala.Unit], scala.Unit]] = js.undefined
  /**
    * Emitted when the datetime selection was cancelled.
    */
  var onIonCancel: js.UndefOr[js.Function1[/* event */ stdLib.CustomEvent[scala.Unit], scala.Unit]] = js.undefined
  /**
    * Emitted when the value (selected date) has changed.
    */
  var onIonChange: js.UndefOr[
    js.Function1[
      /* event */ stdLib.CustomEvent[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DatetimeChangeEventDetail */ _
      ], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Emitted when the datetime has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ stdLib.CustomEvent[scala.Unit], scala.Unit]] = js.undefined
  /**
    * The format of the date and time picker columns the user selects. A datetime input can have one or many datetime parts, each getting their own column which allow individual selection of that particular datetime part. For example, year and month columns are two individually selectable columns which help choose an exact date from the datetime picker. Each column follows the string parse format. Defaults to use `displayFormat`.
    */
  var pickerFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Any additional options that the picker interface can accept. See the [Picker API docs](../picker) for the picker options.
    */
  var pickerOptions: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DatetimeOptions */ js.Any
  ] = js.undefined
  /**
    * The text to display when there's no date selected yet. Using lowercase to match the input attribute
    */
  var placeholder: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * If `true`, the datetime appears normal but is not interactive.
    */
  var readonly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The value of the datetime as a valid ISO 8601 datetime string.
    */
  var value: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Values used to create the list of selectable years. By default the year values range between the `min` and `max` datetime inputs. However, to control exactly which years to display, the `yearValues` input can take a number, an array of numbers, or string of comma separated numbers. For example, to show upcoming and recent leap years, then this input's value would be `yearValues="2024,2020,2016,2012,2008"`.
    */
  var yearValues: js.UndefOr[js.Array[scala.Double] | scala.Double | java.lang.String] = js.undefined
}

object IonDatetimeAttributes {
  @scala.inline
  def apply(
    about: java.lang.String = null,
    accessKey: java.lang.String = null,
    autoCapitalize: java.lang.String = null,
    autoCorrect: java.lang.String = null,
    autoSave: java.lang.String = null,
    autocapitalize: java.lang.String = null,
    autocorrect: java.lang.String = null,
    autosave: java.lang.String = null,
    cancelText: java.lang.String = null,
    `class`: java.lang.String | org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    color: java.lang.String = null,
    contentEditable: scala.Boolean | java.lang.String = null,
    contenteditable: scala.Boolean | java.lang.String = null,
    contextMenu: java.lang.String = null,
    contextmenu: java.lang.String = null,
    datatype: java.lang.String = null,
    dayNames: js.Array[java.lang.String] | java.lang.String = null,
    dayShortNames: js.Array[java.lang.String] | java.lang.String = null,
    dayValues: js.Array[scala.Double] | scala.Double | java.lang.String = null,
    dir: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    displayFormat: java.lang.String = null,
    doneText: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    hourValues: js.Array[scala.Double] | scala.Double | java.lang.String = null,
    id: java.lang.String = null,
    inlist: js.Any = null,
    innerHTML: java.lang.String = null,
    inputMode: java.lang.String = null,
    inputmode: java.lang.String = null,
    is: java.lang.String = null,
    itemID: java.lang.String = null,
    itemProp: java.lang.String = null,
    itemRef: java.lang.String = null,
    itemScope: js.UndefOr[scala.Boolean] = js.undefined,
    itemType: java.lang.String = null,
    itemid: java.lang.String = null,
    itemprop: java.lang.String = null,
    itemref: java.lang.String = null,
    itemscope: js.UndefOr[scala.Boolean] = js.undefined,
    itemtype: java.lang.String = null,
    key: java.lang.String | scala.Double = null,
    lang: java.lang.String = null,
    max: java.lang.String = null,
    min: java.lang.String = null,
    minuteValues: js.Array[scala.Double] | scala.Double | java.lang.String = null,
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any = null,
    monthNames: js.Array[java.lang.String] | java.lang.String = null,
    monthShortNames: js.Array[java.lang.String] | java.lang.String = null,
    monthValues: js.Array[scala.Double] | scala.Double | java.lang.String = null,
    name: java.lang.String = null,
    onAnimationEnd: /* event */ stdLib.AnimationEvent => scala.Unit = null,
    onAnimationEndCapture: /* event */ stdLib.AnimationEvent => scala.Unit = null,
    onAnimationIteration: /* event */ stdLib.AnimationEvent => scala.Unit = null,
    onAnimationIterationCapture: /* event */ stdLib.AnimationEvent => scala.Unit = null,
    onAnimationStart: /* event */ stdLib.AnimationEvent => scala.Unit = null,
    onAnimationStartCapture: /* event */ stdLib.AnimationEvent => scala.Unit = null,
    onAuxClick: /* event */ stdLib.MouseEvent => scala.Unit = null,
    onBlur: /* event */ stdLib.FocusEvent => scala.Unit = null,
    onBlurCapture: /* event */ stdLib.FocusEvent => scala.Unit = null,
    onChange: /* event */ stdLib.Event => scala.Unit = null,
    onChangeCapture: /* event */ stdLib.Event => scala.Unit = null,
    onClick: /* event */ stdLib.MouseEvent => scala.Unit = null,
    onClickCapture: /* event */ stdLib.MouseEvent => scala.Unit = null,
    onCompositionEnd: /* event */ stdLib.CompositionEvent => scala.Unit = null,
    onCompositionEndCapture: /* event */ stdLib.CompositionEvent => scala.Unit = null,
    onCompositionStart: /* event */ stdLib.CompositionEvent => scala.Unit = null,
    onCompositionStartCapture: /* event */ stdLib.CompositionEvent => scala.Unit = null,
    onCompositionUpdate: /* event */ stdLib.CompositionEvent => scala.Unit = null,
    onCompositionUpdateCapture: /* event */ stdLib.CompositionEvent => scala.Unit = null,
    onContextMenu: /* event */ stdLib.MouseEvent => scala.Unit = null,
    onContextMenuCapture: /* event */ stdLib.MouseEvent => scala.Unit = null,
    onCopy: /* event */ stdLib.ClipboardEvent => scala.Unit = null,
    onCopyCapture: /* event */ stdLib.ClipboardEvent => scala.Unit = null,
    onCut: /* event */ stdLib.ClipboardEvent => scala.Unit = null,
    onCutCapture: /* event */ stdLib.ClipboardEvent => scala.Unit = null,
    onDblClick: /* event */ stdLib.MouseEvent => scala.Unit = null,
    onDblClickCapture: /* event */ stdLib.MouseEvent => scala.Unit = null,
    onDrag: /* event */ stdLib.DragEvent => scala.Unit = null,
    onDragCapture: /* event */ stdLib.DragEvent => scala.Unit = null,
    onDragEnd: /* event */ stdLib.DragEvent => scala.Unit = null,
    onDragEndCapture: /* event */ stdLib.DragEvent => scala.Unit = null,
    onDragEnter: /* event */ stdLib.DragEvent => scala.Unit = null,
    onDragEnterCapture: /* event */ stdLib.DragEvent => scala.Unit = null,
    onDragExit: /* event */ stdLib.DragEvent => scala.Unit = null,
    onDragExitCapture: /* event */ stdLib.DragEvent => scala.Unit = null,
    onDragLeave: /* event */ stdLib.DragEvent => scala.Unit = null,
    onDragLeaveCapture: /* event */ stdLib.DragEvent => scala.Unit = null,
    onDragOver: /* event */ stdLib.DragEvent => scala.Unit = null,
    onDragOverCapture: /* event */ stdLib.DragEvent => scala.Unit = null,
    onDragStart: /* event */ stdLib.DragEvent => scala.Unit = null,
    onDragStartCapture: /* event */ stdLib.DragEvent => scala.Unit = null,
    onDrop: /* event */ stdLib.DragEvent => scala.Unit = null,
    onDropCapture: /* event */ stdLib.DragEvent => scala.Unit = null,
    onError: /* event */ stdLib.Event => scala.Unit = null,
    onErrorCapture: /* event */ stdLib.Event => scala.Unit = null,
    onFocus: /* event */ stdLib.FocusEvent => scala.Unit = null,
    onFocusCapture: /* event */ stdLib.FocusEvent => scala.Unit = null,
    onInput: /* event */ stdLib.Event => scala.Unit = null,
    onInputCapture: /* event */ stdLib.Event => scala.Unit = null,
    onInvalid: /* event */ stdLib.Event => scala.Unit = null,
    onInvalidCapture: /* event */ stdLib.Event => scala.Unit = null,
    onIonBlur: /* event */ stdLib.CustomEvent[scala.Unit] => scala.Unit = null,
    onIonCancel: /* event */ stdLib.CustomEvent[scala.Unit] => scala.Unit = null,
    onIonChange: /* event */ stdLib.CustomEvent[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DatetimeChangeEventDetail */ _
    ] => scala.Unit = null,
    onIonFocus: /* event */ stdLib.CustomEvent[scala.Unit] => scala.Unit = null,
    onKeyDown: /* event */ stdLib.KeyboardEvent => scala.Unit = null,
    onKeyDownCapture: /* event */ stdLib.KeyboardEvent => scala.Unit = null,
    onKeyPress: /* event */ stdLib.KeyboardEvent => scala.Unit = null,
    onKeyPressCapture: /* event */ stdLib.KeyboardEvent => scala.Unit = null,
    onKeyUp: /* event */ stdLib.KeyboardEvent => scala.Unit = null,
    onKeyUpCapture: /* event */ stdLib.KeyboardEvent => scala.Unit = null,
    onLoad: /* event */ stdLib.Event => scala.Unit = null,
    onLoadCapture: /* event */ stdLib.Event => scala.Unit = null,
    onMouseDown: /* event */ stdLib.MouseEvent => scala.Unit = null,
    onMouseDownCapture: /* event */ stdLib.MouseEvent => scala.Unit = null,
    onMouseEnter: /* event */ stdLib.MouseEvent => scala.Unit = null,
    onMouseLeave: /* event */ stdLib.MouseEvent => scala.Unit = null,
    onMouseMove: /* event */ stdLib.MouseEvent => scala.Unit = null,
    onMouseMoveCapture: /* event */ stdLib.MouseEvent => scala.Unit = null,
    onMouseOut: /* event */ stdLib.MouseEvent => scala.Unit = null,
    onMouseOutCapture: /* event */ stdLib.MouseEvent => scala.Unit = null,
    onMouseOver: /* event */ stdLib.MouseEvent => scala.Unit = null,
    onMouseOverCapture: /* event */ stdLib.MouseEvent => scala.Unit = null,
    onMouseUp: /* event */ stdLib.MouseEvent => scala.Unit = null,
    onMouseUpCapture: /* event */ stdLib.MouseEvent => scala.Unit = null,
    onPaste: /* event */ stdLib.ClipboardEvent => scala.Unit = null,
    onPasteCapture: /* event */ stdLib.ClipboardEvent => scala.Unit = null,
    onReset: /* event */ stdLib.Event => scala.Unit = null,
    onResetCapture: /* event */ stdLib.Event => scala.Unit = null,
    onScroll: /* event */ stdLib.UIEvent => scala.Unit = null,
    onScrollCapture: /* event */ stdLib.UIEvent => scala.Unit = null,
    onSubmit: /* event */ stdLib.Event => scala.Unit = null,
    onSubmitCapture: /* event */ stdLib.Event => scala.Unit = null,
    onTouchCancel: /* event */ stdLib.TouchEvent => scala.Unit = null,
    onTouchCancelCapture: /* event */ stdLib.TouchEvent => scala.Unit = null,
    onTouchEnd: /* event */ stdLib.TouchEvent => scala.Unit = null,
    onTouchEndCapture: /* event */ stdLib.TouchEvent => scala.Unit = null,
    onTouchMove: /* event */ stdLib.TouchEvent => scala.Unit = null,
    onTouchMoveCapture: /* event */ stdLib.TouchEvent => scala.Unit = null,
    onTouchStart: /* event */ stdLib.TouchEvent => scala.Unit = null,
    onTouchStartCapture: /* event */ stdLib.TouchEvent => scala.Unit = null,
    onTransitionEnd: /* event */ stdLib.TransitionEvent => scala.Unit = null,
    onTransitionEndCapture: /* event */ stdLib.TransitionEvent => scala.Unit = null,
    onWheel: /* event */ stdLib.WheelEvent => scala.Unit = null,
    onWheelCapture: /* event */ stdLib.WheelEvent => scala.Unit = null,
    pickerFormat: java.lang.String = null,
    pickerOptions: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DatetimeOptions */ js.Any = null,
    placeholder: java.lang.String = null,
    prefix: java.lang.String = null,
    property: java.lang.String = null,
    radioGroup: java.lang.String = null,
    radiogroup: java.lang.String = null,
    readonly: js.UndefOr[scala.Boolean] = js.undefined,
    ref: /* elm */ js.UndefOr[stdLib.HTMLElement] => scala.Unit = null,
    resource: java.lang.String = null,
    results: scala.Int | scala.Double = null,
    role: java.lang.String = null,
    security: java.lang.String = null,
    slot: java.lang.String = null,
    spellCheck: js.UndefOr[scala.Boolean] = js.undefined,
    spellcheck: scala.Boolean | java.lang.String = null,
    style: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    tabIndex: scala.Int | scala.Double = null,
    tabindex: scala.Double | java.lang.String = null,
    title: java.lang.String = null,
    typeof: java.lang.String = null,
    unselectable: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String = null,
    vocab: java.lang.String = null,
    yearValues: js.Array[scala.Double] | scala.Double | java.lang.String = null
  ): IonDatetimeAttributes = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about)
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey)
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize)
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect)
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave)
    if (autocapitalize != null) __obj.updateDynamic("autocapitalize")(autocapitalize)
    if (autocorrect != null) __obj.updateDynamic("autocorrect")(autocorrect)
    if (autosave != null) __obj.updateDynamic("autosave")(autosave)
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText)
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (contentEditable != null) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contenteditable != null) __obj.updateDynamic("contenteditable")(contenteditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu)
    if (contextmenu != null) __obj.updateDynamic("contextmenu")(contextmenu)
    if (datatype != null) __obj.updateDynamic("datatype")(datatype)
    if (dayNames != null) __obj.updateDynamic("dayNames")(dayNames.asInstanceOf[js.Any])
    if (dayShortNames != null) __obj.updateDynamic("dayShortNames")(dayShortNames.asInstanceOf[js.Any])
    if (dayValues != null) __obj.updateDynamic("dayValues")(dayValues.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (displayFormat != null) __obj.updateDynamic("displayFormat")(displayFormat)
    if (doneText != null) __obj.updateDynamic("doneText")(doneText)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (hourValues != null) __obj.updateDynamic("hourValues")(hourValues.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (inlist != null) __obj.updateDynamic("inlist")(inlist)
    if (innerHTML != null) __obj.updateDynamic("innerHTML")(innerHTML)
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode)
    if (inputmode != null) __obj.updateDynamic("inputmode")(inputmode)
    if (is != null) __obj.updateDynamic("is")(is)
    if (itemID != null) __obj.updateDynamic("itemID")(itemID)
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp)
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef)
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope)
    if (itemType != null) __obj.updateDynamic("itemType")(itemType)
    if (itemid != null) __obj.updateDynamic("itemid")(itemid)
    if (itemprop != null) __obj.updateDynamic("itemprop")(itemprop)
    if (itemref != null) __obj.updateDynamic("itemref")(itemref)
    if (!js.isUndefined(itemscope)) __obj.updateDynamic("itemscope")(itemscope)
    if (itemtype != null) __obj.updateDynamic("itemtype")(itemtype)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (minuteValues != null) __obj.updateDynamic("minuteValues")(minuteValues.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames.asInstanceOf[js.Any])
    if (monthShortNames != null) __obj.updateDynamic("monthShortNames")(monthShortNames.asInstanceOf[js.Any])
    if (monthValues != null) __obj.updateDynamic("monthValues")(monthValues.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationEndCapture != null) __obj.updateDynamic("onAnimationEndCapture")(js.Any.fromFunction1(onAnimationEndCapture))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationIterationCapture != null) __obj.updateDynamic("onAnimationIterationCapture")(js.Any.fromFunction1(onAnimationIterationCapture))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAnimationStartCapture != null) __obj.updateDynamic("onAnimationStartCapture")(js.Any.fromFunction1(onAnimationStartCapture))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onBlurCapture != null) __obj.updateDynamic("onBlurCapture")(js.Any.fromFunction1(onBlurCapture))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeCapture != null) __obj.updateDynamic("onChangeCapture")(js.Any.fromFunction1(onChangeCapture))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClickCapture != null) __obj.updateDynamic("onClickCapture")(js.Any.fromFunction1(onClickCapture))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionEndCapture != null) __obj.updateDynamic("onCompositionEndCapture")(js.Any.fromFunction1(onCompositionEndCapture))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionStartCapture != null) __obj.updateDynamic("onCompositionStartCapture")(js.Any.fromFunction1(onCompositionStartCapture))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onCompositionUpdateCapture != null) __obj.updateDynamic("onCompositionUpdateCapture")(js.Any.fromFunction1(onCompositionUpdateCapture))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onContextMenuCapture != null) __obj.updateDynamic("onContextMenuCapture")(js.Any.fromFunction1(onContextMenuCapture))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCopyCapture != null) __obj.updateDynamic("onCopyCapture")(js.Any.fromFunction1(onCopyCapture))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onCutCapture != null) __obj.updateDynamic("onCutCapture")(js.Any.fromFunction1(onCutCapture))
    if (onDblClick != null) __obj.updateDynamic("onDblClick")(js.Any.fromFunction1(onDblClick))
    if (onDblClickCapture != null) __obj.updateDynamic("onDblClickCapture")(js.Any.fromFunction1(onDblClickCapture))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragCapture != null) __obj.updateDynamic("onDragCapture")(js.Any.fromFunction1(onDragCapture))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEndCapture != null) __obj.updateDynamic("onDragEndCapture")(js.Any.fromFunction1(onDragEndCapture))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragEnterCapture != null) __obj.updateDynamic("onDragEnterCapture")(js.Any.fromFunction1(onDragEnterCapture))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragExitCapture != null) __obj.updateDynamic("onDragExitCapture")(js.Any.fromFunction1(onDragExitCapture))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragLeaveCapture != null) __obj.updateDynamic("onDragLeaveCapture")(js.Any.fromFunction1(onDragLeaveCapture))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragOverCapture != null) __obj.updateDynamic("onDragOverCapture")(js.Any.fromFunction1(onDragOverCapture))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDragStartCapture != null) __obj.updateDynamic("onDragStartCapture")(js.Any.fromFunction1(onDragStartCapture))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDropCapture != null) __obj.updateDynamic("onDropCapture")(js.Any.fromFunction1(onDropCapture))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onErrorCapture != null) __obj.updateDynamic("onErrorCapture")(js.Any.fromFunction1(onErrorCapture))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onFocusCapture != null) __obj.updateDynamic("onFocusCapture")(js.Any.fromFunction1(onFocusCapture))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInputCapture != null) __obj.updateDynamic("onInputCapture")(js.Any.fromFunction1(onInputCapture))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onInvalidCapture != null) __obj.updateDynamic("onInvalidCapture")(js.Any.fromFunction1(onInvalidCapture))
    if (onIonBlur != null) __obj.updateDynamic("onIonBlur")(js.Any.fromFunction1(onIonBlur))
    if (onIonCancel != null) __obj.updateDynamic("onIonCancel")(js.Any.fromFunction1(onIonCancel))
    if (onIonChange != null) __obj.updateDynamic("onIonChange")(js.Any.fromFunction1(onIonChange))
    if (onIonFocus != null) __obj.updateDynamic("onIonFocus")(js.Any.fromFunction1(onIonFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyDownCapture != null) __obj.updateDynamic("onKeyDownCapture")(js.Any.fromFunction1(onKeyDownCapture))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyPressCapture != null) __obj.updateDynamic("onKeyPressCapture")(js.Any.fromFunction1(onKeyPressCapture))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onKeyUpCapture != null) __obj.updateDynamic("onKeyUpCapture")(js.Any.fromFunction1(onKeyUpCapture))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadCapture != null) __obj.updateDynamic("onLoadCapture")(js.Any.fromFunction1(onLoadCapture))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseDownCapture != null) __obj.updateDynamic("onMouseDownCapture")(js.Any.fromFunction1(onMouseDownCapture))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseMoveCapture != null) __obj.updateDynamic("onMouseMoveCapture")(js.Any.fromFunction1(onMouseMoveCapture))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOutCapture != null) __obj.updateDynamic("onMouseOutCapture")(js.Any.fromFunction1(onMouseOutCapture))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseOverCapture != null) __obj.updateDynamic("onMouseOverCapture")(js.Any.fromFunction1(onMouseOverCapture))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onMouseUpCapture != null) __obj.updateDynamic("onMouseUpCapture")(js.Any.fromFunction1(onMouseUpCapture))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPasteCapture != null) __obj.updateDynamic("onPasteCapture")(js.Any.fromFunction1(onPasteCapture))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onResetCapture != null) __obj.updateDynamic("onResetCapture")(js.Any.fromFunction1(onResetCapture))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onScrollCapture != null) __obj.updateDynamic("onScrollCapture")(js.Any.fromFunction1(onScrollCapture))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSubmitCapture != null) __obj.updateDynamic("onSubmitCapture")(js.Any.fromFunction1(onSubmitCapture))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchCancelCapture != null) __obj.updateDynamic("onTouchCancelCapture")(js.Any.fromFunction1(onTouchCancelCapture))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(onTouchEndCapture))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchMoveCapture != null) __obj.updateDynamic("onTouchMoveCapture")(js.Any.fromFunction1(onTouchMoveCapture))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTouchStartCapture != null) __obj.updateDynamic("onTouchStartCapture")(js.Any.fromFunction1(onTouchStartCapture))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onTransitionEndCapture != null) __obj.updateDynamic("onTransitionEndCapture")(js.Any.fromFunction1(onTransitionEndCapture))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (onWheelCapture != null) __obj.updateDynamic("onWheelCapture")(js.Any.fromFunction1(onWheelCapture))
    if (pickerFormat != null) __obj.updateDynamic("pickerFormat")(pickerFormat)
    if (pickerOptions != null) __obj.updateDynamic("pickerOptions")(pickerOptions)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (property != null) __obj.updateDynamic("property")(property)
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup)
    if (radiogroup != null) __obj.updateDynamic("radiogroup")(radiogroup)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (ref != null) __obj.updateDynamic("ref")(js.Any.fromFunction1(ref))
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role)
    if (security != null) __obj.updateDynamic("security")(security)
    if (slot != null) __obj.updateDynamic("slot")(slot)
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck)
    if (spellcheck != null) __obj.updateDynamic("spellcheck")(spellcheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (typeof != null) __obj.updateDynamic("typeof")(typeof)
    if (!js.isUndefined(unselectable)) __obj.updateDynamic("unselectable")(unselectable)
    if (value != null) __obj.updateDynamic("value")(value)
    if (vocab != null) __obj.updateDynamic("vocab")(vocab)
    if (yearValues != null) __obj.updateDynamic("yearValues")(yearValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonDatetimeAttributes]
  }
}

