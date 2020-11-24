package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the analysis status of a discovered resource.
  */
@js.native
trait SchemaDiscovered extends js.Object {
  
  /**
    * The status of discovery for the resource.
    */
  var analysisStatus: js.UndefOr[String] = js.native
  
  /**
    * When an error is encountered this will contain a LocalizedMessage under
    * details to show to the user. The LocalizedMessage is output only and
    * populated by the API.
    */
  var analysisStatusError: js.UndefOr[SchemaStatus] = js.native
  
  /**
    * Whether the resource is continuously analyzed.
    */
  var continuousAnalysis: js.UndefOr[String] = js.native
  
  /**
    * The last time continuous analysis was done for this resource. Deprecated,
    * do not use.
    */
  var lastAnalysisTime: js.UndefOr[String] = js.native
}
object SchemaDiscovered {
  
  @scala.inline
  def apply(): SchemaDiscovered = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiscovered]
  }
  
  @scala.inline
  implicit class SchemaDiscoveredOps[Self <: SchemaDiscovered] (val x: Self) extends AnyVal {
    
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
    def setAnalysisStatus(value: String): Self = this.set("analysisStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisStatus: Self = this.set("analysisStatus", js.undefined)
    
    @scala.inline
    def setAnalysisStatusError(value: SchemaStatus): Self = this.set("analysisStatusError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisStatusError: Self = this.set("analysisStatusError", js.undefined)
    
    @scala.inline
    def setContinuousAnalysis(value: String): Self = this.set("continuousAnalysis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuousAnalysis: Self = this.set("continuousAnalysis", js.undefined)
    
    @scala.inline
    def setLastAnalysisTime(value: String): Self = this.set("lastAnalysisTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAnalysisTime: Self = this.set("lastAnalysisTime", js.undefined)
  }
}
