package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A note that indicates a type of analysis a provider would perform. This
  * note exists in a provider&#39;s project. A `Discovery` occurrence is
  * created in a consumer&#39;s project at the start of analysis.
  */
@js.native
trait SchemaDiscovery extends js.Object {
  
  /**
    * Required. Immutable. The kind of analysis that is handled by this
    * discovery.
    */
  var analysisKind: js.UndefOr[String] = js.native
}
object SchemaDiscovery {
  
  @scala.inline
  def apply(): SchemaDiscovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiscovery]
  }
  
  @scala.inline
  implicit class SchemaDiscoveryOps[Self <: SchemaDiscovery] (val x: Self) extends AnyVal {
    
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
    def setAnalysisKind(value: String): Self = this.set("analysisKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisKind: Self = this.set("analysisKind", js.undefined)
  }
}
