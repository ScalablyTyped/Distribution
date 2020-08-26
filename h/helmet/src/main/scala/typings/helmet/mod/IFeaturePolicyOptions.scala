package typings.helmet.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFeaturePolicyOptions extends js.Object {
  var features: StringDictionary[js.Array[String]] = js.native
}

object IFeaturePolicyOptions {
  @scala.inline
  def apply(features: StringDictionary[js.Array[String]]): IFeaturePolicyOptions = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFeaturePolicyOptions]
  }
  @scala.inline
  implicit class IFeaturePolicyOptionsOps[Self <: IFeaturePolicyOptions] (val x: Self) extends AnyVal {
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
    def setFeatures(value: StringDictionary[js.Array[String]]): Self = this.set("features", value.asInstanceOf[js.Any])
  }
  
}

