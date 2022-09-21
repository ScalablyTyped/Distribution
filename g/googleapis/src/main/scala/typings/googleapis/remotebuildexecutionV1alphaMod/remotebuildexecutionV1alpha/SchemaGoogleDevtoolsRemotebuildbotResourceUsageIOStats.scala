package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemotebuildbotResourceUsageIOStats extends StObject {
  
  var readBytesCount: js.UndefOr[String | Null] = js.undefined
  
  var readCount: js.UndefOr[String | Null] = js.undefined
  
  var readTimeMs: js.UndefOr[String | Null] = js.undefined
  
  var writeBytesCount: js.UndefOr[String | Null] = js.undefined
  
  var writeCount: js.UndefOr[String | Null] = js.undefined
  
  var writeTimeMs: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildbotResourceUsageIOStats {
  
  inline def apply(): SchemaGoogleDevtoolsRemotebuildbotResourceUsageIOStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildbotResourceUsageIOStats]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemotebuildbotResourceUsageIOStats](x: Self) {
    
    inline def setReadBytesCount(value: String): Self = StObject.set(x, "readBytesCount", value.asInstanceOf[js.Any])
    
    inline def setReadBytesCountNull: Self = StObject.set(x, "readBytesCount", null)
    
    inline def setReadBytesCountUndefined: Self = StObject.set(x, "readBytesCount", js.undefined)
    
    inline def setReadCount(value: String): Self = StObject.set(x, "readCount", value.asInstanceOf[js.Any])
    
    inline def setReadCountNull: Self = StObject.set(x, "readCount", null)
    
    inline def setReadCountUndefined: Self = StObject.set(x, "readCount", js.undefined)
    
    inline def setReadTimeMs(value: String): Self = StObject.set(x, "readTimeMs", value.asInstanceOf[js.Any])
    
    inline def setReadTimeMsNull: Self = StObject.set(x, "readTimeMs", null)
    
    inline def setReadTimeMsUndefined: Self = StObject.set(x, "readTimeMs", js.undefined)
    
    inline def setWriteBytesCount(value: String): Self = StObject.set(x, "writeBytesCount", value.asInstanceOf[js.Any])
    
    inline def setWriteBytesCountNull: Self = StObject.set(x, "writeBytesCount", null)
    
    inline def setWriteBytesCountUndefined: Self = StObject.set(x, "writeBytesCount", js.undefined)
    
    inline def setWriteCount(value: String): Self = StObject.set(x, "writeCount", value.asInstanceOf[js.Any])
    
    inline def setWriteCountNull: Self = StObject.set(x, "writeCount", null)
    
    inline def setWriteCountUndefined: Self = StObject.set(x, "writeCount", js.undefined)
    
    inline def setWriteTimeMs(value: String): Self = StObject.set(x, "writeTimeMs", value.asInstanceOf[js.Any])
    
    inline def setWriteTimeMsNull: Self = StObject.set(x, "writeTimeMs", null)
    
    inline def setWriteTimeMsUndefined: Self = StObject.set(x, "writeTimeMs", js.undefined)
  }
}
