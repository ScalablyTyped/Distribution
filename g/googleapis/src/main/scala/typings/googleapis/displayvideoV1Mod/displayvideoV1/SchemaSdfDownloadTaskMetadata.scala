package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSdfDownloadTaskMetadata extends StObject {
  
  /**
    * The time when the operation was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time when execution was completed.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The SDF version used to execute this download task.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaSdfDownloadTaskMetadata {
  
  inline def apply(): SchemaSdfDownloadTaskMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSdfDownloadTaskMetadata]
  }
  
  extension [Self <: SchemaSdfDownloadTaskMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
