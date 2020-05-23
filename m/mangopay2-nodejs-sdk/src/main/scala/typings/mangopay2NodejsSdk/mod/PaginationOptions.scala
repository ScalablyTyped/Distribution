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
  def apply(Page: js.UndefOr[Double] = js.undefined, Per_Page: js.UndefOr[Double] = js.undefined): PaginationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Page)) __obj.updateDynamic("Page")(Page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Per_Page)) __obj.updateDynamic("Per_Page")(Per_Page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationOptions]
  }
}

