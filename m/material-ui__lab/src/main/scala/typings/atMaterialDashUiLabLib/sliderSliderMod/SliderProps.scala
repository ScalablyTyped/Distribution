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
  var thumb: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
  var valueReducer: js.UndefOr[ValueReducer] = js.undefined
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

