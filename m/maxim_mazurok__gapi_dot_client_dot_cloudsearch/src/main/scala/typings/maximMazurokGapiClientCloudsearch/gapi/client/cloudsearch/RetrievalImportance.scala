package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetrievalImportance extends js.Object {
  
  /** Indicates the ranking importance given to property when it is matched during retrieval. Once set, the token importance of a property cannot be changed. */
  var importance: js.UndefOr[String] = js.native
}
object RetrievalImportance {
  
  @scala.inline
  def apply(): RetrievalImportance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrievalImportance]
  }
  
  @scala.inline
  implicit class RetrievalImportanceOps[Self <: RetrievalImportance] (val x: Self) extends AnyVal {
    
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
    def setImportance(value: String): Self = this.set("importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportance: Self = this.set("importance", js.undefined)
  }
}
