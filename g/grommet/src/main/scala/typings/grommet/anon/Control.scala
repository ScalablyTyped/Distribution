package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import typings.grommet.grommetStrings.key
import typings.grommet.grommetStrings.ref
import typings.grommet.utilsMod.BackgroundType
import typings.react.mod.ComponentProps
import typings.react.mod.ReactComponentElement
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Control extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var container: js.UndefOr[Extend] = js.undefined
  var control: js.UndefOr[Open] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var icons: js.UndefOr[Up] = js.undefined
  var options: js.UndefOr[ContainerText] = js.undefined
  // https://github.com/DefinitelyTyped/DefinitelyTyped/issues/37506
  var searchInput: js.UndefOr[
    ReactComponentElement[
      _, 
      Pick[
        ComponentProps[_], 
        Exclude[/* keyof react.react.ComponentProps<any> */ String, key | ref]
      ]
    ]
  ] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object Control {
  @scala.inline
  def apply(
    background: BackgroundType = null,
    container: Extend = null,
    control: Open = null,
    extend: ExtendType = null,
    icons: Up = null,
    options: ContainerText = null,
    searchInput: ReactComponentElement[
      _, 
      Pick[
        ComponentProps[_], 
        Exclude[/* keyof react.react.ComponentProps<any> */ String, key | ref]
      ]
    ] = null,
    step: js.UndefOr[Double] = js.undefined
  ): Control = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (searchInput != null) __obj.updateDynamic("searchInput")(searchInput.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Control]
  }
}

