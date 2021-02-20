package typings.jsforce.metadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeployOptions extends StObject {
  
  var allowMissingFiles: js.UndefOr[Boolean] = js.native
  
  var autoUpdatePackage: js.UndefOr[Boolean] = js.native
  
  var checkOnly: js.UndefOr[Boolean] = js.native
  
  var ignoreWarnings: js.UndefOr[Boolean] = js.native
  
  var performRetrieve: js.UndefOr[Boolean] = js.native
  
  var purgeOnDelete: js.UndefOr[Boolean] = js.native
  
  var rollbackOnError: js.UndefOr[Boolean] = js.native
  
  var runAllTests: js.UndefOr[Boolean] = js.native
  
  var runTests: js.UndefOr[js.Array[String]] = js.native
  
  var singlePackage: js.UndefOr[Boolean] = js.native
}
object DeployOptions {
  
  @scala.inline
  def apply(): DeployOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeployOptions]
  }
  
  @scala.inline
  implicit class DeployOptionsMutableBuilder[Self <: DeployOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowMissingFiles(value: Boolean): Self = StObject.set(x, "allowMissingFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMissingFilesUndefined: Self = StObject.set(x, "allowMissingFiles", js.undefined)
    
    @scala.inline
    def setAutoUpdatePackage(value: Boolean): Self = StObject.set(x, "autoUpdatePackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdatePackageUndefined: Self = StObject.set(x, "autoUpdatePackage", js.undefined)
    
    @scala.inline
    def setCheckOnly(value: Boolean): Self = StObject.set(x, "checkOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckOnlyUndefined: Self = StObject.set(x, "checkOnly", js.undefined)
    
    @scala.inline
    def setIgnoreWarnings(value: Boolean): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreWarningsUndefined: Self = StObject.set(x, "ignoreWarnings", js.undefined)
    
    @scala.inline
    def setPerformRetrieve(value: Boolean): Self = StObject.set(x, "performRetrieve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformRetrieveUndefined: Self = StObject.set(x, "performRetrieve", js.undefined)
    
    @scala.inline
    def setPurgeOnDelete(value: Boolean): Self = StObject.set(x, "purgeOnDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurgeOnDeleteUndefined: Self = StObject.set(x, "purgeOnDelete", js.undefined)
    
    @scala.inline
    def setRollbackOnError(value: Boolean): Self = StObject.set(x, "rollbackOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollbackOnErrorUndefined: Self = StObject.set(x, "rollbackOnError", js.undefined)
    
    @scala.inline
    def setRunAllTests(value: Boolean): Self = StObject.set(x, "runAllTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunAllTestsUndefined: Self = StObject.set(x, "runAllTests", js.undefined)
    
    @scala.inline
    def setRunTests(value: js.Array[String]): Self = StObject.set(x, "runTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunTestsUndefined: Self = StObject.set(x, "runTests", js.undefined)
    
    @scala.inline
    def setRunTestsVarargs(value: String*): Self = StObject.set(x, "runTests", js.Array(value :_*))
    
    @scala.inline
    def setSinglePackage(value: Boolean): Self = StObject.set(x, "singlePackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinglePackageUndefined: Self = StObject.set(x, "singlePackage", js.undefined)
  }
}
