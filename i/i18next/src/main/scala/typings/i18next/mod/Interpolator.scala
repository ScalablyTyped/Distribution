package typings.i18next.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interpolator extends js.Object {
  def init(options: InterpolationOptions, reset: Boolean): js.UndefOr[scala.Nothing]
  def interpolate(str: String, data: js.Object, lng: String, options: InterpolationOptions): String
  def nest(str: String, fc: js.Function1[/* repeated */ js.Any, _], options: InterpolationOptions): String
  def reset(): js.UndefOr[scala.Nothing]
  def resetRegExp(): js.UndefOr[scala.Nothing]
}

object Interpolator {
  @scala.inline
  def apply(
    init: (InterpolationOptions, Boolean) => js.UndefOr[scala.Nothing],
    interpolate: (String, js.Object, String, InterpolationOptions) => String,
    nest: (String, js.Function1[/* repeated */ js.Any, _], InterpolationOptions) => String,
    reset: () => js.UndefOr[scala.Nothing],
    resetRegExp: () => js.UndefOr[scala.Nothing]
  ): Interpolator = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction2(init), interpolate = js.Any.fromFunction4(interpolate), nest = js.Any.fromFunction3(nest), reset = js.Any.fromFunction0(reset), resetRegExp = js.Any.fromFunction0(resetRegExp))
  
    __obj.asInstanceOf[Interpolator]
  }
}

