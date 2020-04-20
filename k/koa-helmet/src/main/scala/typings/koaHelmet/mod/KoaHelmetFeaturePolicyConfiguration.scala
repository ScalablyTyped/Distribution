package typings.koaHelmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KoaHelmetFeaturePolicyConfiguration extends js.Object {
  var features: KoaHelmetFeaturePolicyDirectives
}

object KoaHelmetFeaturePolicyConfiguration {
  @scala.inline
  def apply(features: KoaHelmetFeaturePolicyDirectives): KoaHelmetFeaturePolicyConfiguration = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[KoaHelmetFeaturePolicyConfiguration]
  }
}

