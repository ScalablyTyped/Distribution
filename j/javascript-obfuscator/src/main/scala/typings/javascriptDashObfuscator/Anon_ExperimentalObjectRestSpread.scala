package typings.javascriptDashObfuscator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExperimentalObjectRestSpread extends js.Object {
  var experimentalObjectRestSpread: js.UndefOr[Boolean] = js.undefined
  var globalReturn: js.UndefOr[Boolean] = js.undefined
  var impliedStrict: js.UndefOr[Boolean] = js.undefined
  var jsx: js.UndefOr[Boolean] = js.undefined
}

object Anon_ExperimentalObjectRestSpread {
  @scala.inline
  def apply(
    experimentalObjectRestSpread: js.UndefOr[Boolean] = js.undefined,
    globalReturn: js.UndefOr[Boolean] = js.undefined,
    impliedStrict: js.UndefOr[Boolean] = js.undefined,
    jsx: js.UndefOr[Boolean] = js.undefined
  ): Anon_ExperimentalObjectRestSpread = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(experimentalObjectRestSpread)) __obj.updateDynamic("experimentalObjectRestSpread")(experimentalObjectRestSpread.asInstanceOf[js.Any])
    if (!js.isUndefined(globalReturn)) __obj.updateDynamic("globalReturn")(globalReturn.asInstanceOf[js.Any])
    if (!js.isUndefined(impliedStrict)) __obj.updateDynamic("impliedStrict")(impliedStrict.asInstanceOf[js.Any])
    if (!js.isUndefined(jsx)) __obj.updateDynamic("jsx")(jsx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExperimentalObjectRestSpread]
  }
}

