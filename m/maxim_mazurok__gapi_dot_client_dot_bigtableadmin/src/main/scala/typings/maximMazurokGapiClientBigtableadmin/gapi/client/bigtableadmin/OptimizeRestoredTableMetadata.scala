package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimizeRestoredTableMetadata extends StObject {
  
  /** Name of the restored table being optimized. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The progress of the post-restore optimizations. */
  var progress: js.UndefOr[OperationProgress] = js.undefined
}
object OptimizeRestoredTableMetadata {
  
  inline def apply(): OptimizeRestoredTableMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptimizeRestoredTableMetadata]
  }
  
  extension [Self <: OptimizeRestoredTableMetadata](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProgress(value: OperationProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
