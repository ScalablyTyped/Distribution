package typings.localforage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalForageDbInstanceOptions extends js.Object {
  var name: js.UndefOr[String] = js.native
  var storeName: js.UndefOr[String] = js.native
}

object LocalForageDbInstanceOptions {
  @scala.inline
  def apply(): LocalForageDbInstanceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalForageDbInstanceOptions]
  }
  @scala.inline
  implicit class LocalForageDbInstanceOptionsOps[Self <: LocalForageDbInstanceOptions] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStoreName(value: String): Self = this.set("storeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoreName: Self = this.set("storeName", js.undefined)
  }
  
}

