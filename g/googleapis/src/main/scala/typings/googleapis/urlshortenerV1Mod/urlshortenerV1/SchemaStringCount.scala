package typings.googleapis.urlshortenerV1Mod.urlshortenerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaStringCount extends js.Object {
  /**
    * Number of clicks for this top entry, e.g. for this particular country or
    * browser.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * Label assigned to this top entry, e.g. &quot;US&quot; or
    * &quot;Chrome&quot;.
    */
  var id: js.UndefOr[String] = js.native
}

object SchemaStringCount {
  @scala.inline
  def apply(): SchemaStringCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStringCount]
  }
  @scala.inline
  implicit class SchemaStringCountOps[Self <: SchemaStringCount] (val x: Self) extends AnyVal {
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
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

