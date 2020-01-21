package typings.knockoutKogrid

import typings.knockoutKogrid.kg.DomUtilityService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKg extends js.Object {
  var domUtilityService: DomUtilityService
  /** Default aggregate template */
  def aggregateTemplate(): String
  /** Default cell template. Can be overriden in GridOptions.cellTemplate */
  def defaultCellTemplate(): String
  /** Default grid template */
  def defaultGridTemplate(): String
  /** Default headercell template. Can be overriden in GridOptions.headerCellTemplate */
  def defaultHeaderCellTemplate(): String
  /** Default headerrow template. Can be overriden in GridOptions.headerRowTemplate */
  def defaultHeaderRowTemplate(): String
  /** Default row template. Can be overriden in GridOptions.rowTemplate */
  def defaultRowTemplate(): String
}

object IKg {
  @scala.inline
  def apply(
    aggregateTemplate: () => String,
    defaultCellTemplate: () => String,
    defaultGridTemplate: () => String,
    defaultHeaderCellTemplate: () => String,
    defaultHeaderRowTemplate: () => String,
    defaultRowTemplate: () => String,
    domUtilityService: DomUtilityService
  ): IKg = {
    val __obj = js.Dynamic.literal(aggregateTemplate = js.Any.fromFunction0(aggregateTemplate), defaultCellTemplate = js.Any.fromFunction0(defaultCellTemplate), defaultGridTemplate = js.Any.fromFunction0(defaultGridTemplate), defaultHeaderCellTemplate = js.Any.fromFunction0(defaultHeaderCellTemplate), defaultHeaderRowTemplate = js.Any.fromFunction0(defaultHeaderRowTemplate), defaultRowTemplate = js.Any.fromFunction0(defaultRowTemplate), domUtilityService = domUtilityService.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IKg]
  }
}

