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
    aggregateTemplate: js.Function0[java.lang.String],
    defaultCellTemplate: js.Function0[java.lang.String],
    defaultGridTemplate: js.Function0[java.lang.String],
    defaultHeaderCellTemplate: js.Function0[java.lang.String],
    defaultHeaderRowTemplate: js.Function0[java.lang.String],
    defaultRowTemplate: js.Function0[java.lang.String],
    domUtilityService: knockoutDotKogridLib.kgNs.DomUtilityService
  ): IKg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregateTemplate")(aggregateTemplate)
    __obj.updateDynamic("defaultCellTemplate")(defaultCellTemplate)
    __obj.updateDynamic("defaultGridTemplate")(defaultGridTemplate)
    __obj.updateDynamic("defaultHeaderCellTemplate")(defaultHeaderCellTemplate)
    __obj.updateDynamic("defaultHeaderRowTemplate")(defaultHeaderRowTemplate)
    __obj.updateDynamic("defaultRowTemplate")(defaultRowTemplate)
    __obj.updateDynamic("domUtilityService")(domUtilityService)
    __obj.asInstanceOf[IKg]
  }
}

