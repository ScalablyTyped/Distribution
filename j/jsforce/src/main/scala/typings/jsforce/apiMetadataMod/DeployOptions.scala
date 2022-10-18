package typings.jsforce.apiMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeployOptions extends StObject {
  
  var allowMissingFiles: js.UndefOr[Boolean] = js.undefined
  
  var autoUpdatePackage: js.UndefOr[Boolean] = js.undefined
  
  var checkOnly: js.UndefOr[Boolean] = js.undefined
  
  var ignoreWarnings: js.UndefOr[Boolean] = js.undefined
  
  var performRetrieve: js.UndefOr[Boolean] = js.undefined
  
  var purgeOnDelete: js.UndefOr[Boolean] = js.undefined
  
  var rollbackOnError: js.UndefOr[Boolean] = js.undefined
  
  var runAllTests: js.UndefOr[Boolean] = js.undefined
  
  var runTests: js.UndefOr[js.Array[String]] = js.undefined
  
  var singlePackage: js.UndefOr[Boolean] = js.undefined
}
object DeployOptions {
  
  inline def apply(): DeployOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeployOptions]
  }
  
  extension [Self <: DeployOptions](x: Self) {
    
    inline def setAllowMissingFiles(value: Boolean): Self = StObject.set(x, "allowMissingFiles", value.asInstanceOf[js.Any])
    
    inline def setAllowMissingFilesUndefined: Self = StObject.set(x, "allowMissingFiles", js.undefined)
    
    inline def setAutoUpdatePackage(value: Boolean): Self = StObject.set(x, "autoUpdatePackage", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdatePackageUndefined: Self = StObject.set(x, "autoUpdatePackage", js.undefined)
    
    inline def setCheckOnly(value: Boolean): Self = StObject.set(x, "checkOnly", value.asInstanceOf[js.Any])
    
    inline def setCheckOnlyUndefined: Self = StObject.set(x, "checkOnly", js.undefined)
    
    inline def setIgnoreWarnings(value: Boolean): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
    
    inline def setIgnoreWarningsUndefined: Self = StObject.set(x, "ignoreWarnings", js.undefined)
    
    inline def setPerformRetrieve(value: Boolean): Self = StObject.set(x, "performRetrieve", value.asInstanceOf[js.Any])
    
    inline def setPerformRetrieveUndefined: Self = StObject.set(x, "performRetrieve", js.undefined)
    
    inline def setPurgeOnDelete(value: Boolean): Self = StObject.set(x, "purgeOnDelete", value.asInstanceOf[js.Any])
    
    inline def setPurgeOnDeleteUndefined: Self = StObject.set(x, "purgeOnDelete", js.undefined)
    
    inline def setRollbackOnError(value: Boolean): Self = StObject.set(x, "rollbackOnError", value.asInstanceOf[js.Any])
    
    inline def setRollbackOnErrorUndefined: Self = StObject.set(x, "rollbackOnError", js.undefined)
    
    inline def setRunAllTests(value: Boolean): Self = StObject.set(x, "runAllTests", value.asInstanceOf[js.Any])
    
    inline def setRunAllTestsUndefined: Self = StObject.set(x, "runAllTests", js.undefined)
    
    inline def setRunTests(value: js.Array[String]): Self = StObject.set(x, "runTests", value.asInstanceOf[js.Any])
    
    inline def setRunTestsUndefined: Self = StObject.set(x, "runTests", js.undefined)
    
    inline def setRunTestsVarargs(value: String*): Self = StObject.set(x, "runTests", js.Array(value*))
    
    inline def setSinglePackage(value: Boolean): Self = StObject.set(x, "singlePackage", value.asInstanceOf[js.Any])
    
    inline def setSinglePackageUndefined: Self = StObject.set(x, "singlePackage", js.undefined)
  }
}
