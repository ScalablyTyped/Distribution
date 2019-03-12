package typings
package knockoutDotKogridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKg extends js.Object {
  var domUtilityService: knockoutDotKogridLib.kgNs.DomUtilityService
  /** Default aggregate template */
  def aggregateTemplate(): java.lang.String
  /** Default cell template. Can be overriden in GridOptions.cellTemplate */
  def defaultCellTemplate(): java.lang.String
  /** Default grid template */
  def defaultGridTemplate(): java.lang.String
  /** Default headercell template. Can be overriden in GridOptions.headerCellTemplate */
  def defaultHeaderCellTemplate(): java.lang.String
  /** Default headerrow template. Can be overriden in GridOptions.headerRowTemplate */
  def defaultHeaderRowTemplate(): java.lang.String
  /** Default row template. Can be overriden in GridOptions.rowTemplate */
  def defaultRowTemplate(): java.lang.String
}

object IKg {
  @scala.inline
  def apply(
    aggregateTemplate: () => java.lang.String,
    defaultCellTemplate: () => java.lang.String,
    defaultGridTemplate: () => java.lang.String,
    defaultHeaderCellTemplate: () => java.lang.String,
    defaultHeaderRowTemplate: () => java.lang.String,
    defaultRowTemplate: () => java.lang.String,
    domUtilityService: knockoutDotKogridLib.kgNs.DomUtilityService
  ): IKg = {
    val __obj = js.Dynamic.literal(aggregateTemplate = js.Any.fromFunction0(aggregateTemplate), defaultCellTemplate = js.Any.fromFunction0(defaultCellTemplate), defaultGridTemplate = js.Any.fromFunction0(defaultGridTemplate), defaultHeaderCellTemplate = js.Any.fromFunction0(defaultHeaderCellTemplate), defaultHeaderRowTemplate = js.Any.fromFunction0(defaultHeaderRowTemplate), defaultRowTemplate = js.Any.fromFunction0(defaultRowTemplate), domUtilityService = domUtilityService)
  
    __obj.asInstanceOf[IKg]
  }
}

