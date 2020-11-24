package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A organizational unit being held in a particular hold. This structure is
  * immutable.
  */
@js.native
trait SchemaHeldOrgUnit extends js.Object {
  
  /**
    * When the org unit was put on hold. This property is immutable.
    */
  var holdTime: js.UndefOr[String] = js.native
  
  /**
    * The org unit&#39;s immutable ID as provided by the Admin SDK.
    */
  var orgUnitId: js.UndefOr[String] = js.native
}
object SchemaHeldOrgUnit {
  
  @scala.inline
  def apply(): SchemaHeldOrgUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeldOrgUnit]
  }
  
  @scala.inline
  implicit class SchemaHeldOrgUnitOps[Self <: SchemaHeldOrgUnit] (val x: Self) extends AnyVal {
    
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
    def setHoldTime(value: String): Self = this.set("holdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoldTime: Self = this.set("holdTime", js.undefined)
    
    @scala.inline
    def setOrgUnitId(value: String): Self = this.set("orgUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrgUnitId: Self = this.set("orgUnitId", js.undefined)
  }
}
