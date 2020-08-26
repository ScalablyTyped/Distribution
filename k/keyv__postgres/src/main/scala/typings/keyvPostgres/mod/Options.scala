package typings.keyvPostgres.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var keySize: js.UndefOr[Double] = js.native
  var table: js.UndefOr[String] = js.native
  var uri: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setKeySize(value: Double): Self = this.set("keySize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeySize: Self = this.set("keySize", js.undefined)
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

