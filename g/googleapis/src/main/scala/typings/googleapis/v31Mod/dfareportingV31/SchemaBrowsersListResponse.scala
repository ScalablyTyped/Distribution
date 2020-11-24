package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Browser List Response
  */
@js.native
trait SchemaBrowsersListResponse extends js.Object {
  
  /**
    * Browser collection.
    */
  var browsers: js.UndefOr[js.Array[SchemaBrowser]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#browsersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaBrowsersListResponse {
  
  @scala.inline
  def apply(): SchemaBrowsersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBrowsersListResponse]
  }
  
  @scala.inline
  implicit class SchemaBrowsersListResponseOps[Self <: SchemaBrowsersListResponse] (val x: Self) extends AnyVal {
    
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
    def setBrowsersVarargs(value: SchemaBrowser*): Self = this.set("browsers", js.Array(value :_*))
    
    @scala.inline
    def setBrowsers(value: js.Array[SchemaBrowser]): Self = this.set("browsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowsers: Self = this.set("browsers", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
