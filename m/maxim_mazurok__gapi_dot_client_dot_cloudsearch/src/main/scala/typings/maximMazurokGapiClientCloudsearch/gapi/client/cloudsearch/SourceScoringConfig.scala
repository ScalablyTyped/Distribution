package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceScoringConfig extends js.Object {
  
  /** Importance of the source. */
  var sourceImportance: js.UndefOr[String] = js.native
}
object SourceScoringConfig {
  
  @scala.inline
  def apply(): SourceScoringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceScoringConfig]
  }
  
  @scala.inline
  implicit class SourceScoringConfigOps[Self <: SourceScoringConfig] (val x: Self) extends AnyVal {
    
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
    def setSourceImportance(value: String): Self = this.set("sourceImportance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceImportance: Self = this.set("sourceImportance", js.undefined)
  }
}
