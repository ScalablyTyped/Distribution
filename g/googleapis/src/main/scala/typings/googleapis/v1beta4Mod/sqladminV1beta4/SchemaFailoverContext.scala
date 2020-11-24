package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database instance failover context.
  */
@js.native
trait SchemaFailoverContext extends js.Object {
  
  /**
    * This is always sql#failoverContext.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The current settings version of this instance. Request will be rejected
    * if this version doesn&#39;t match the current settings version.
    */
  var settingsVersion: js.UndefOr[String] = js.native
}
object SchemaFailoverContext {
  
  @scala.inline
  def apply(): SchemaFailoverContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailoverContext]
  }
  
  @scala.inline
  implicit class SchemaFailoverContextOps[Self <: SchemaFailoverContext] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setSettingsVersion(value: String): Self = this.set("settingsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsVersion: Self = this.set("settingsVersion", js.undefined)
  }
}
