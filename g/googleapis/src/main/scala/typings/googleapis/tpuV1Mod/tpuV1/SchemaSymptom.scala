package typings.googleapis.tpuV1Mod.tpuV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSymptom extends StObject {
  
  /**
    * Timestamp when the Symptom is created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Detailed information of the current Symptom.
    */
  var details: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the Symptom.
    */
  var symptomType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A string used to uniquely distinguish a worker within a TPU node.
    */
  var workerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSymptom {
  
  inline def apply(): SchemaSymptom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSymptom]
  }
  
  extension [Self <: SchemaSymptom](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setSymptomType(value: String): Self = StObject.set(x, "symptomType", value.asInstanceOf[js.Any])
    
    inline def setSymptomTypeNull: Self = StObject.set(x, "symptomType", null)
    
    inline def setSymptomTypeUndefined: Self = StObject.set(x, "symptomType", js.undefined)
    
    inline def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    
    inline def setWorkerIdNull: Self = StObject.set(x, "workerId", null)
    
    inline def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
  }
}
