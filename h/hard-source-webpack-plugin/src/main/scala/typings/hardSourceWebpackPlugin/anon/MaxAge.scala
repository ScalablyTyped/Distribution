package typings.hardSourceWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxAge extends js.Object {
  var maxAge: Double = js.native
  var sizeThreshold: Double = js.native
}

object MaxAge {
  @scala.inline
  def apply(maxAge: Double, sizeThreshold: Double): MaxAge = {
    val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any], sizeThreshold = sizeThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxAge]
  }
  @scala.inline
  implicit class MaxAgeOps[Self <: MaxAge] (val x: Self) extends AnyVal {
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
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizeThreshold(value: Double): Self = this.set("sizeThreshold", value.asInstanceOf[js.Any])
  }
  
}

