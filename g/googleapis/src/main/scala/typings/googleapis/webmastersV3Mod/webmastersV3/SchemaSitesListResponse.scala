package typings.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of sites with access level information.
  */
@js.native
trait SchemaSitesListResponse extends js.Object {
  
  /**
    * Contains permission level information about a Search Console site. For
    * more information, see Permissions in Search Console.
    */
  var siteEntry: js.UndefOr[js.Array[SchemaWmxSite]] = js.native
}
object SchemaSitesListResponse {
  
  @scala.inline
  def apply(): SchemaSitesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSitesListResponse]
  }
  
  @scala.inline
  implicit class SchemaSitesListResponseOps[Self <: SchemaSitesListResponse] (val x: Self) extends AnyVal {
    
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
    def setSiteEntryVarargs(value: SchemaWmxSite*): Self = this.set("siteEntry", js.Array(value :_*))
    
    @scala.inline
    def setSiteEntry(value: js.Array[SchemaWmxSite]): Self = this.set("siteEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteEntry: Self = this.set("siteEntry", js.undefined)
  }
}
