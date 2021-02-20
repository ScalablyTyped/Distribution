package typings.knockoutKogrid

import typings.knockoutKogrid.kg.DomUtilityService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKg extends StObject {
  
  /** Default aggregate template */
  def aggregateTemplate(): String = js.native
  
  /** Default cell template. Can be overriden in GridOptions.cellTemplate */
  def defaultCellTemplate(): String = js.native
  
  /** Default grid template */
  def defaultGridTemplate(): String = js.native
  
  /** Default headercell template. Can be overriden in GridOptions.headerCellTemplate */
  def defaultHeaderCellTemplate(): String = js.native
  
  /** Default headerrow template. Can be overriden in GridOptions.headerRowTemplate */
  def defaultHeaderRowTemplate(): String = js.native
  
  /** Default row template. Can be overriden in GridOptions.rowTemplate */
  def defaultRowTemplate(): String = js.native
  
  var domUtilityService: DomUtilityService = js.native
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
  
  @scala.inline
  implicit class IKgMutableBuilder[Self <: IKg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregateTemplate(value: () => String): Self = StObject.set(x, "aggregateTemplate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultCellTemplate(value: () => String): Self = StObject.set(x, "defaultCellTemplate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultGridTemplate(value: () => String): Self = StObject.set(x, "defaultGridTemplate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultHeaderCellTemplate(value: () => String): Self = StObject.set(x, "defaultHeaderCellTemplate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultHeaderRowTemplate(value: () => String): Self = StObject.set(x, "defaultHeaderRowTemplate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultRowTemplate(value: () => String): Self = StObject.set(x, "defaultRowTemplate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDomUtilityService(value: DomUtilityService): Self = StObject.set(x, "domUtilityService", value.asInstanceOf[js.Any])
  }
}
