package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOptimizeRestoredDatabaseMetadata extends StObject {
  
  /**
    * Name of the restored database being optimized.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The progress of the post-restore optimizations.
    */
  var progress: js.UndefOr[SchemaOperationProgress] = js.undefined
}
object SchemaOptimizeRestoredDatabaseMetadata {
  
  inline def apply(): SchemaOptimizeRestoredDatabaseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOptimizeRestoredDatabaseMetadata]
  }
  
  extension [Self <: SchemaOptimizeRestoredDatabaseMetadata](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProgress(value: SchemaOperationProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
