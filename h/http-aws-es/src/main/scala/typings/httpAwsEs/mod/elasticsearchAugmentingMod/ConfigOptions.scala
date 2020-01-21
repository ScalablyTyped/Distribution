package typings.httpAwsEs.mod.elasticsearchAugmentingMod

import typings.awsSdk.mod.Config_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var awsConfig: js.UndefOr[Config_] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(awsConfig: Config_ = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (awsConfig != null) __obj.updateDynamic("awsConfig")(awsConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

