package typings.karmaHtmlDetailedReporter.mod.karmaAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * The reporter provides a dashboard detailing specification runs
    * see {@link https://github.com/a11smiles/karma-html-detailed-reporter#options}
    */
  var htmlDetailed: js.UndefOr[HtmlDetailedOptions] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(htmlDetailed: HtmlDetailedOptions = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (htmlDetailed != null) __obj.updateDynamic("htmlDetailed")(htmlDetailed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

