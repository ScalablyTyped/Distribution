package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of applying a write.
  */
trait SchemaWriteResult extends StObject {
  
  /**
    * The results of applying each DocumentTransform.FieldTransform, in the
    * same order.
    */
  var transformResults: js.UndefOr[js.Array[SchemaValue]] = js.undefined
  
  /**
    * The last update time of the document after applying the write. Not set
    * after a `delete`.  If the write did not actually change the document,
    * this will be the previous update_time.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object SchemaWriteResult {
  
  inline def apply(): SchemaWriteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWriteResult]
  }
  
  extension [Self <: SchemaWriteResult](x: Self) {
    
    inline def setTransformResults(value: js.Array[SchemaValue]): Self = StObject.set(x, "transformResults", value.asInstanceOf[js.Any])
    
    inline def setTransformResultsUndefined: Self = StObject.set(x, "transformResults", js.undefined)
    
    inline def setTransformResultsVarargs(value: SchemaValue*): Self = StObject.set(x, "transformResults", js.Array(value :_*))
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
