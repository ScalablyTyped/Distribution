package typings.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeployOptions extends js.Object {
  
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
  implicit class DeployOptionsOps[Self <: DeployOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowMissingFiles(value: Boolean): Self = this.set("allowMissingFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMissingFiles: Self = this.set("allowMissingFiles", js.undefined)
    
    @scala.inline
    def setAutoUpdatePackage(value: Boolean): Self = this.set("autoUpdatePackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoUpdatePackage: Self = this.set("autoUpdatePackage", js.undefined)
    
    @scala.inline
    def setCheckOnly(value: Boolean): Self = this.set("checkOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckOnly: Self = this.set("checkOnly", js.undefined)
    
    @scala.inline
    def setIgnoreWarnings(value: Boolean): Self = this.set("ignoreWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreWarnings: Self = this.set("ignoreWarnings", js.undefined)
    
    @scala.inline
    def setPerformRetrieve(value: Boolean): Self = this.set("performRetrieve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformRetrieve: Self = this.set("performRetrieve", js.undefined)
    
    @scala.inline
    def setPurgeOnDelete(value: Boolean): Self = this.set("purgeOnDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurgeOnDelete: Self = this.set("purgeOnDelete", js.undefined)
    
    @scala.inline
    def setRollbackOnError(value: Boolean): Self = this.set("rollbackOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollbackOnError: Self = this.set("rollbackOnError", js.undefined)
    
    @scala.inline
    def setRunAllTests(value: Boolean): Self = this.set("runAllTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunAllTests: Self = this.set("runAllTests", js.undefined)
    
    @scala.inline
    def setRunTestsVarargs(value: String*): Self = this.set("runTests", js.Array(value :_*))
    
    @scala.inline
    def setRunTests(value: js.Array[String]): Self = this.set("runTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunTests: Self = this.set("runTests", js.undefined)
    
    @scala.inline
    def setSinglePackage(value: Boolean): Self = this.set("singlePackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSinglePackage: Self = this.set("singlePackage", js.undefined)
  }
}
