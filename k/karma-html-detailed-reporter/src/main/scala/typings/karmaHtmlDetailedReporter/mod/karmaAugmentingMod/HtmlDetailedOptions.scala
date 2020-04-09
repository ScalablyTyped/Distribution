package typings.karmaHtmlDetailedReporter.mod.karmaAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * see {@link https://github.com/a11smiles/karma-html-detailed-reporter#options}
  */
trait HtmlDetailedOptions extends js.Object {
  /**
    * Enables/disables the refresh to start automatically
    * @default true
    */
  var autoReload: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the reports output base path
    * @default './_reports'
    */
  var dir: js.UndefOr[String] = js.undefined
  /**
    * Sets the refresh timeout (in milliseconds) for the page
    * @default 1000
    */
  var refreshTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Determines whether the detailed results of the failed tests are default shown or hidden in the browser (you are able to toggle live in the browser)
    * @default true
    */
  var showFailed: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines whether the detailed results of the skipped tests are default shown or hidden in the browser (you are able to toggle live in the browser)
    * @default true
    */
  var showSkipped: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines whether the detailed results of the successfull tests are default shown or hidden in the browser (you are able to toggle live in the browser)
    * @default true
    */
  var showSuccess: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines whether the results are split into a separate file for each browser
    * @default true
    */
  var splitResults: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines whether to use the hosted versions of Boostrap and jQuery. If testing within a CI build (e.g. TFS, Jenkins, TeamCity),
    * setting this to true would allow you to see the reports while the builders do not maintain node modules.
    * @default false
    */
  var useHostedBootstrap: js.UndefOr[Boolean] = js.undefined
}

object HtmlDetailedOptions {
  @scala.inline
  def apply(
    autoReload: js.UndefOr[Boolean] = js.undefined,
    dir: String = null,
    refreshTimeout: Int | Double = null,
    showFailed: js.UndefOr[Boolean] = js.undefined,
    showSkipped: js.UndefOr[Boolean] = js.undefined,
    showSuccess: js.UndefOr[Boolean] = js.undefined,
    splitResults: js.UndefOr[Boolean] = js.undefined,
    useHostedBootstrap: js.UndefOr[Boolean] = js.undefined
  ): HtmlDetailedOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoReload)) __obj.updateDynamic("autoReload")(autoReload.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (refreshTimeout != null) __obj.updateDynamic("refreshTimeout")(refreshTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(showFailed)) __obj.updateDynamic("showFailed")(showFailed.asInstanceOf[js.Any])
    if (!js.isUndefined(showSkipped)) __obj.updateDynamic("showSkipped")(showSkipped.asInstanceOf[js.Any])
    if (!js.isUndefined(showSuccess)) __obj.updateDynamic("showSuccess")(showSuccess.asInstanceOf[js.Any])
    if (!js.isUndefined(splitResults)) __obj.updateDynamic("splitResults")(splitResults.asInstanceOf[js.Any])
    if (!js.isUndefined(useHostedBootstrap)) __obj.updateDynamic("useHostedBootstrap")(useHostedBootstrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlDetailedOptions]
  }
}

