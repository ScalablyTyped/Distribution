package typings
package atMaterialDashUiLabLib.sliderSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLDivElement>, 'classes' | 'onChange'> ]: react.react.HTMLAttributes<react.HTMLDivElement>[P]} */ trait SliderProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[SliderClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], 
      /* value */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var onDragEnd: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], scala.Unit]
  ] = js.undefined
  var onDragStart: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], scala.Unit]
  ] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var thumb: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
  var valueReducer: js.UndefOr[ValueReducer] = js.undefined
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[SliderClassKey]] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    onChange: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], 
      /* value */ scala.Double, 
      scala.Unit
    ] = null,
    onDragEnd: js.Function1[/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], scala.Unit] = null,
    onDragStart: js.Function1[/* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], scala.Unit] = null,
    step: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    thumb: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    value: scala.Int | scala.Double = null,
    valueReducer: ValueReducer = null,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
  ): SliderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (thumb != null) __obj.updateDynamic("thumb")(thumb)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueReducer != null) __obj.updateDynamic("valueReducer")(valueReducer)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[SliderProps]
  }
}

