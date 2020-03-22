package typings.karmaViewport.mod.karmaAugmentingMod

import typings.karmaViewport.PartialViewportConfigurat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var viewport: js.UndefOr[PartialViewportConfigurat] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(viewport: PartialViewportConfigurat = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

