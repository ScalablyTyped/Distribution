package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceCrowdingConfig extends js.Object {
  
  /** Maximum number of results allowed from a source. No limits will be set on results if this value is less than or equal to 0. */
  var numResults: js.UndefOr[Double] = js.native
  
  /** Maximum number of suggestions allowed from a source. No limits will be set on results if this value is less than or equal to 0. */
  var numSuggestions: js.UndefOr[Double] = js.native
}
object SourceCrowdingConfig {
  
  @scala.inline
  def apply(): SourceCrowdingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceCrowdingConfig]
  }
  
  @scala.inline
  implicit class SourceCrowdingConfigOps[Self <: SourceCrowdingConfig] (val x: Self) extends AnyVal {
    
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
    def setNumResults(value: Double): Self = this.set("numResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumResults: Self = this.set("numResults", js.undefined)
    
    @scala.inline
    def setNumSuggestions(value: Double): Self = this.set("numSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumSuggestions: Self = this.set("numSuggestions", js.undefined)
  }
}
