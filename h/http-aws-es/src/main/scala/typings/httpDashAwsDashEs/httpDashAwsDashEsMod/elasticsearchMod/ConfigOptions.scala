package typings.httpDashAwsDashEs.httpDashAwsDashEsMod.elasticsearchMod

import typings.awsDashSdk.awsDashSdkMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var awsConfig: js.UndefOr[Config] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(awsConfig: Config = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (awsConfig != null) __obj.updateDynamic("awsConfig")(awsConfig)
    __obj.asInstanceOf[ConfigOptions]
  }
}

