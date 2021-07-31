package typings.jsuite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Iconfig extends StObject {
  
  var columns: js.UndefOr[String] = js.undefined
  
  var end: js.UndefOr[Double] = js.undefined
  
  var filterExpression: js.UndefOr[js.Any] = js.undefined
  
  var logging: js.UndefOr[Boolean] = js.undefined
  
  var maxUnitsUsage: js.UndefOr[Double] = js.undefined
  
  var recordType: js.UndefOr[String] = js.undefined
  
  var searchId: js.UndefOr[String] = js.undefined
  
  var smartConvert: js.UndefOr[Boolean] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
}
object Iconfig {
  
  @scala.inline
  def apply(): Iconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Iconfig]
  }
  
  @scala.inline
  implicit class IconfigMutableBuilder[Self <: Iconfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: String): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setFilterExpression(value: js.Any): Self = StObject.set(x, "filterExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterExpressionUndefined: Self = StObject.set(x, "filterExpression", js.undefined)
    
    @scala.inline
    def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setMaxUnitsUsage(value: Double): Self = StObject.set(x, "maxUnitsUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUnitsUsageUndefined: Self = StObject.set(x, "maxUnitsUsage", js.undefined)
    
    @scala.inline
    def setRecordType(value: String): Self = StObject.set(x, "recordType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordTypeUndefined: Self = StObject.set(x, "recordType", js.undefined)
    
    @scala.inline
    def setSearchId(value: String): Self = StObject.set(x, "searchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchIdUndefined: Self = StObject.set(x, "searchId", js.undefined)
    
    @scala.inline
    def setSmartConvert(value: Boolean): Self = StObject.set(x, "smartConvert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartConvertUndefined: Self = StObject.set(x, "smartConvert", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
