package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Locations where the results of running the test are stored.
  */
trait SchemaResultStorage extends StObject {
  
  /**
    * Required.
    */
  var googleCloudStorage: js.UndefOr[SchemaGoogleCloudStorage] = js.undefined
  
  /**
    * Output only. The tool results execution that results are written to.
    */
  var toolResultsExecution: js.UndefOr[SchemaToolResultsExecution] = js.undefined
  
  /**
    * The tool results history that contains the tool results execution that
    * results are written to.  If not provided, the service will choose an
    * appropriate value.
    */
  var toolResultsHistory: js.UndefOr[SchemaToolResultsHistory] = js.undefined
}
object SchemaResultStorage {
  
  inline def apply(): SchemaResultStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultStorage]
  }
  
  extension [Self <: SchemaResultStorage](x: Self) {
    
    inline def setGoogleCloudStorage(value: SchemaGoogleCloudStorage): Self = StObject.set(x, "googleCloudStorage", value.asInstanceOf[js.Any])
    
    inline def setGoogleCloudStorageUndefined: Self = StObject.set(x, "googleCloudStorage", js.undefined)
    
    inline def setToolResultsExecution(value: SchemaToolResultsExecution): Self = StObject.set(x, "toolResultsExecution", value.asInstanceOf[js.Any])
    
    inline def setToolResultsExecutionUndefined: Self = StObject.set(x, "toolResultsExecution", js.undefined)
    
    inline def setToolResultsHistory(value: SchemaToolResultsHistory): Self = StObject.set(x, "toolResultsHistory", value.asInstanceOf[js.Any])
    
    inline def setToolResultsHistoryUndefined: Self = StObject.set(x, "toolResultsHistory", js.undefined)
  }
}
