package typings.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ @js.native
trait FilterOptions extends js.Object {
  /**
    * To return only resources that have CreationDate AFTER this date
    */
  var AfterDate: js.UndefOr[Timestamp] = js.native
  /**
    * To return only resources that have CreationDate BEFORE this date
    */
  var BeforeDate: js.UndefOr[Timestamp] = js.native
  /**
    * The column to sort against and direction - only CreationDate (or Date for the events) is available and ASC or DESC for the direction
    */
  var Sort: js.UndefOr[ColumnAndDirection] = js.native
}

object FilterOptions {
  @scala.inline
  def apply(): FilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOptions]
  }
  @scala.inline
  implicit class FilterOptionsOps[Self <: FilterOptions] (val x: Self) extends AnyVal {
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
    def setAfterDate(value: Timestamp): Self = this.set("AfterDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterDate: Self = this.set("AfterDate", js.undefined)
    @scala.inline
    def setBeforeDate(value: Timestamp): Self = this.set("BeforeDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeDate: Self = this.set("BeforeDate", js.undefined)
    @scala.inline
    def setSort(value: ColumnAndDirection): Self = this.set("Sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("Sort", js.undefined)
  }
  
}

