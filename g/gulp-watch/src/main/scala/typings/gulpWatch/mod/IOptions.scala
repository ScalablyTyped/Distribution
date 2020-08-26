package typings.gulpWatch.mod

import typings.vinylFs.mod.SrcOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends SrcOptions {
  var events: js.UndefOr[js.Array[String]] = js.native
  var ignoreInitial: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var readDelay: js.UndefOr[Double] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
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
    def setEventsVarargs(value: String*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[String]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setIgnoreInitial(value: Boolean): Self = this.set("ignoreInitial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreInitial: Self = this.set("ignoreInitial", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setReadDelay(value: Double): Self = this.set("readDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadDelay: Self = this.set("readDelay", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

