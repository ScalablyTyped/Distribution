package typings.ionicReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ios extends js.Object {
  var ios: String = js.native
  var md: String = js.native
}

object Ios {
  @scala.inline
  def apply(ios: String, md: String): Ios = {
    val __obj = js.Dynamic.literal(ios = ios.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ios]
  }
  @scala.inline
  implicit class IosOps[Self <: Ios] (val x: Self) extends AnyVal {
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
    def setIos(value: String): Self = this.set("ios", value.asInstanceOf[js.Any])
    @scala.inline
    def setMd(value: String): Self = this.set("md", value.asInstanceOf[js.Any])
  }
  
}

