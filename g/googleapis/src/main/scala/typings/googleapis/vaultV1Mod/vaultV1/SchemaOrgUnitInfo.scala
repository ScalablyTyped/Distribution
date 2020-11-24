package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Org Unit to search
  */
@js.native
trait SchemaOrgUnitInfo extends js.Object {
  
  /**
    * Org unit to search, as provided by the &lt;a
    * href=&quot;https://developers.google.com/admin-sdk/directory/&quot;&gt;Admin
    * SDK Directory API&lt;/a&gt;.
    */
  var orgUnitId: js.UndefOr[String] = js.native
}
object SchemaOrgUnitInfo {
  
  @scala.inline
  def apply(): SchemaOrgUnitInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrgUnitInfo]
  }
  
  @scala.inline
  implicit class SchemaOrgUnitInfoOps[Self <: SchemaOrgUnitInfo] (val x: Self) extends AnyVal {
    
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
    def setOrgUnitId(value: String): Self = this.set("orgUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrgUnitId: Self = this.set("orgUnitId", js.undefined)
  }
}
