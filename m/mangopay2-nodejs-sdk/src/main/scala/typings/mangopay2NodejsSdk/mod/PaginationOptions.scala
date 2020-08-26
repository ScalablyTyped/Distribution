package typings.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationOptions extends js.Object {
  /**
    * The page number of results you wish to return
    * @default 1
    */
  var Page: js.UndefOr[Double] = js.native
  /**
    * The number of results to return per page: Max 100;
    * @default 10
    */
  var Per_Page: js.UndefOr[Double] = js.native
}

object PaginationOptions {
  @scala.inline
  def apply(): PaginationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationOptions]
  }
  @scala.inline
  implicit class PaginationOptionsOps[Self <: PaginationOptions] (val x: Self) extends AnyVal {
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
    def setPage(value: Double): Self = this.set("Page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("Page", js.undefined)
    @scala.inline
    def setPer_Page(value: Double): Self = this.set("Per_Page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePer_Page: Self = this.set("Per_Page", js.undefined)
  }
  
}

