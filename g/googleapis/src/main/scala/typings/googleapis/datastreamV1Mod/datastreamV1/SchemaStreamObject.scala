package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStreamObject extends StObject {
  
  /**
    * The latest backfill job that was initiated for the stream object.
    */
  var backfillJob: js.UndefOr[SchemaBackfillJob] = js.undefined
  
  /**
    * Output only. The creation time of the object.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Active errors on the object.
    */
  var errors: js.UndefOr[js.Array[SchemaError]] = js.undefined
  
  /**
    * Output only. The object resource's name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The object identifier in the data source.
    */
  var sourceObject: js.UndefOr[SchemaSourceObjectIdentifier] = js.undefined
  
  /**
    * Output only. The last update time of the object.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaStreamObject {
  
  inline def apply(): SchemaStreamObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamObject]
  }
  
  extension [Self <: SchemaStreamObject](x: Self) {
    
    inline def setBackfillJob(value: SchemaBackfillJob): Self = StObject.set(x, "backfillJob", value.asInstanceOf[js.Any])
    
    inline def setBackfillJobUndefined: Self = StObject.set(x, "backfillJob", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setErrors(value: js.Array[SchemaError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSourceObject(value: SchemaSourceObjectIdentifier): Self = StObject.set(x, "sourceObject", value.asInstanceOf[js.Any])
    
    inline def setSourceObjectUndefined: Self = StObject.set(x, "sourceObject", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
