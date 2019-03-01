package typings
package httpDashAwsDashEsLib.httpDashAwsDashEsMod.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var awsConfig: js.UndefOr[awsDashSdkLib.awsDashSdkMod.Config] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(awsConfig: awsDashSdkLib.awsDashSdkMod.Config = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (awsConfig != null) __obj.updateDynamic("awsConfig")(awsConfig)
    __obj.asInstanceOf[ConfigOptions]
  }
}

