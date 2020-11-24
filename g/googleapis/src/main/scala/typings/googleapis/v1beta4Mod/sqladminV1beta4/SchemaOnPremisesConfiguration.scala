package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * On-premises instance configuration.
  */
@js.native
trait SchemaOnPremisesConfiguration extends js.Object {
  
  /**
    * The host and port of the on-premises instance in host:port format
    */
  var hostPort: js.UndefOr[String] = js.native
  
  /**
    * This is always sql#onPremisesConfiguration.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaOnPremisesConfiguration {
  
  @scala.inline
  def apply(): SchemaOnPremisesConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOnPremisesConfiguration]
  }
  
  @scala.inline
  implicit class SchemaOnPremisesConfigurationOps[Self <: SchemaOnPremisesConfiguration] (val x: Self) extends AnyVal {
    
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
    def setHostPort(value: String): Self = this.set("hostPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostPort: Self = this.set("hostPort", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
