package typings.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationOptions extends js.Object {
  /**
    * The page number of results you wish to return
    * @default 1
    */
  var Page: js.UndefOr[Double] = js.undefined
  /**
    * The number of results to return per page: Max 100;
    * @default 10
    */
  var Per_Page: js.UndefOr[Double] = js.undefined
}

object PaginationOptions {
  @scala.inline
  def apply(Page: Int | Double = null, Per_Page: Int | Double = null): PaginationOptions = {
    val __obj = js.Dynamic.literal()
    if (Page != null) __obj.updateDynamic("Page")(Page.asInstanceOf[js.Any])
    if (Per_Page != null) __obj.updateDynamic("Per_Page")(Per_Page.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationOptions]
  }
}

