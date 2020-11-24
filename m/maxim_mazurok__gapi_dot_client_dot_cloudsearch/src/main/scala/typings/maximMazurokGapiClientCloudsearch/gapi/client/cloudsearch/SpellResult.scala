package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpellResult extends js.Object {
  
  /** The suggested spelling of the query. */
  var suggestedQuery: js.UndefOr[String] = js.native
}
object SpellResult {
  
  @scala.inline
  def apply(): SpellResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpellResult]
  }
  
  @scala.inline
  implicit class SpellResultOps[Self <: SpellResult] (val x: Self) extends AnyVal {
    
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
    def setSuggestedQuery(value: String): Self = this.set("suggestedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedQuery: Self = this.set("suggestedQuery", js.undefined)
  }
}
