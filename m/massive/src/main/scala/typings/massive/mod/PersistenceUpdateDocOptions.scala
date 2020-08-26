package typings.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersistenceUpdateDocOptions extends js.Object {
  var body: js.UndefOr[String] = js.native
}

object PersistenceUpdateDocOptions {
  @scala.inline
  def apply(): PersistenceUpdateDocOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistenceUpdateDocOptions]
  }
  @scala.inline
  implicit class PersistenceUpdateDocOptionsOps[Self <: PersistenceUpdateDocOptions] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
  }
  
}

