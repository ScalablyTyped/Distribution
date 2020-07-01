package typings.karmaNotifyReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * Report test results using OSX Notification Center, Growl or notify-send.
    * {@link https://github.com/jdcataldo/karma-notify-reporter#karma-notify-reporter}
    */
  var notifyReporter: js.UndefOr[NotifyReporterOptions] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(notifyReporter: NotifyReporterOptions = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (notifyReporter != null) __obj.updateDynamic("notifyReporter")(notifyReporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

