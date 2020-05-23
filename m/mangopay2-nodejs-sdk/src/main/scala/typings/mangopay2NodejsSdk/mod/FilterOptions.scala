package typings.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ trait FilterOptions extends js.Object {
  /**
    * To return only resources that have CreationDate AFTER this date
    */
  var AfterDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * To return only resources that have CreationDate BEFORE this date
    */
  var BeforeDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The column to sort against and direction - only CreationDate (or Date for the events) is available and ASC or DESC for the direction
    */
  var Sort: js.UndefOr[ColumnAndDirection] = js.undefined
}

object FilterOptions {
  @scala.inline
  def apply(
    AfterDate: js.UndefOr[Timestamp] = js.undefined,
    BeforeDate: js.UndefOr[Timestamp] = js.undefined,
    Sort: ColumnAndDirection = null
  ): FilterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AfterDate)) __obj.updateDynamic("AfterDate")(AfterDate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(BeforeDate)) __obj.updateDynamic("BeforeDate")(BeforeDate.get.asInstanceOf[js.Any])
    if (Sort != null) __obj.updateDynamic("Sort")(Sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptions]
  }
}

