package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectOptions extends js.Object {
  
  /** Options that determine how the object is displayed in the Cloud Search results page. */
  var displayOptions: js.UndefOr[ObjectDisplayOptions] = js.native
  
  /** The freshness options for an object. */
  var freshnessOptions: js.UndefOr[FreshnessOptions] = js.native
}
object ObjectOptions {
  
  @scala.inline
  def apply(): ObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectOptions]
  }
  
  @scala.inline
  implicit class ObjectOptionsOps[Self <: ObjectOptions] (val x: Self) extends AnyVal {
    
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
    def setDisplayOptions(value: ObjectDisplayOptions): Self = this.set("displayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayOptions: Self = this.set("displayOptions", js.undefined)
    
    @scala.inline
    def setFreshnessOptions(value: FreshnessOptions): Self = this.set("freshnessOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreshnessOptions: Self = this.set("freshnessOptions", js.undefined)
  }
}
