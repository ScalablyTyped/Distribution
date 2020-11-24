package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Locations where the results of running the test are stored.
  */
@js.native
trait SchemaResultStorage extends js.Object {
  
  /**
    * Required.
    */
  var googleCloudStorage: js.UndefOr[SchemaGoogleCloudStorage] = js.native
  
  /**
    * Output only. The tool results execution that results are written to.
    */
  var toolResultsExecution: js.UndefOr[SchemaToolResultsExecution] = js.native
  
  /**
    * The tool results history that contains the tool results execution that
    * results are written to.  If not provided, the service will choose an
    * appropriate value.
    */
  var toolResultsHistory: js.UndefOr[SchemaToolResultsHistory] = js.native
}
object SchemaResultStorage {
  
  @scala.inline
  def apply(): SchemaResultStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultStorage]
  }
  
  @scala.inline
  implicit class SchemaResultStorageOps[Self <: SchemaResultStorage] (val x: Self) extends AnyVal {
    
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
    def setGoogleCloudStorage(value: SchemaGoogleCloudStorage): Self = this.set("googleCloudStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleCloudStorage: Self = this.set("googleCloudStorage", js.undefined)
    
    @scala.inline
    def setToolResultsExecution(value: SchemaToolResultsExecution): Self = this.set("toolResultsExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolResultsExecution: Self = this.set("toolResultsExecution", js.undefined)
    
    @scala.inline
    def setToolResultsHistory(value: SchemaToolResultsHistory): Self = this.set("toolResultsHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolResultsHistory: Self = this.set("toolResultsHistory", js.undefined)
  }
}
