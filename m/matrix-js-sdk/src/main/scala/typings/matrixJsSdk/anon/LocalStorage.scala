package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalStorage extends js.Object {
  var localStorage: js.UndefOr[js.Any] = js.native
}

object LocalStorage {
  @scala.inline
  def apply(): LocalStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalStorage]
  }
  @scala.inline
  implicit class LocalStorageOps[Self <: LocalStorage] (val x: Self) extends AnyVal {
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
    def setLocalStorage(value: js.Any): Self = this.set("localStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalStorage: Self = this.set("localStorage", js.undefined)
  }
  
}

