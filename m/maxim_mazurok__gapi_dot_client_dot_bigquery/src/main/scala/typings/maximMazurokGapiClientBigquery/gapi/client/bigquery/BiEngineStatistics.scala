package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiEngineStatistics extends StObject {
  
  /** [Output-only] Specifies which mode of BI Engine acceleration was performed (if any). */
  var biEngineMode: js.UndefOr[String] = js.undefined
  
  /**
    * In case of DISABLED or PARTIAL bi_engine_mode, these contain the explanatory reasons as to why BI Engine could not accelerate. In case the full query was accelerated, this field is
    * not populated.
    */
  var biEngineReasons: js.UndefOr[js.Array[BiEngineReason]] = js.undefined
}
object BiEngineStatistics {
  
  inline def apply(): BiEngineStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BiEngineStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BiEngineStatistics] (val x: Self) extends AnyVal {
    
    inline def setBiEngineMode(value: String): Self = StObject.set(x, "biEngineMode", value.asInstanceOf[js.Any])
    
    inline def setBiEngineModeUndefined: Self = StObject.set(x, "biEngineMode", js.undefined)
    
    inline def setBiEngineReasons(value: js.Array[BiEngineReason]): Self = StObject.set(x, "biEngineReasons", value.asInstanceOf[js.Any])
    
    inline def setBiEngineReasonsUndefined: Self = StObject.set(x, "biEngineReasons", js.undefined)
    
    inline def setBiEngineReasonsVarargs(value: BiEngineReason*): Self = StObject.set(x, "biEngineReasons", js.Array(value*))
  }
}
