package typings.koaHelmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KoaHelmetFeaturePolicyConfiguration extends js.Object {
  var features: KoaHelmetFeaturePolicyDirectives = js.native
}

object KoaHelmetFeaturePolicyConfiguration {
  @scala.inline
  def apply(features: KoaHelmetFeaturePolicyDirectives): KoaHelmetFeaturePolicyConfiguration = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[KoaHelmetFeaturePolicyConfiguration]
  }
  @scala.inline
  implicit class KoaHelmetFeaturePolicyConfigurationOps[Self <: KoaHelmetFeaturePolicyConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFeatures(value: KoaHelmetFeaturePolicyDirectives): Self = this.set("features", value.asInstanceOf[js.Any])
  }
  
}

