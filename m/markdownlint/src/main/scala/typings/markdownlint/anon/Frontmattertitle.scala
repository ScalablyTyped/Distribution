package typings.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frontmattertitle extends js.Object {
  var front_matter_title: js.UndefOr[String] = js.native
  var level: js.UndefOr[Double] = js.native
}

object Frontmattertitle {
  @scala.inline
  def apply(): Frontmattertitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Frontmattertitle]
  }
  @scala.inline
  implicit class FrontmattertitleOps[Self <: Frontmattertitle] (val x: Self) extends AnyVal {
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
    def setFront_matter_title(value: String): Self = this.set("front_matter_title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFront_matter_title: Self = this.set("front_matter_title", js.undefined)
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
  
}

