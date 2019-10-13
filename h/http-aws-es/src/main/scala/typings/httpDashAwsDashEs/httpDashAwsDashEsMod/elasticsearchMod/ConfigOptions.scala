package typings.httpDashAwsDashEs.httpDashAwsDashEsMod.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var awsConfig: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.Config */ js.Any
  ] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    awsConfig: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.Config */ js.Any = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (awsConfig != null) __obj.updateDynamic("awsConfig")(awsConfig)
    __obj.asInstanceOf[ConfigOptions]
  }
}

