package typings.googleapis.dnsV1Mod.dnsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaManagedZoneDnsSecConfig extends js.Object {
  
  var defaultKeySpecs: js.UndefOr[js.Array[SchemaDnsKeySpec]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZoneDnsSecConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  var nonExistence: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[String] = js.native
}
object SchemaManagedZoneDnsSecConfig {
  
  @scala.inline
  def apply(): SchemaManagedZoneDnsSecConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZoneDnsSecConfig]
  }
  
  @scala.inline
  implicit class SchemaManagedZoneDnsSecConfigOps[Self <: SchemaManagedZoneDnsSecConfig] (val x: Self) extends AnyVal {
    
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
    def setDefaultKeySpecsVarargs(value: SchemaDnsKeySpec*): Self = this.set("defaultKeySpecs", js.Array(value :_*))
    
    @scala.inline
    def setDefaultKeySpecs(value: js.Array[SchemaDnsKeySpec]): Self = this.set("defaultKeySpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultKeySpecs: Self = this.set("defaultKeySpecs", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNonExistence(value: String): Self = this.set("nonExistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonExistence: Self = this.set("nonExistence", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
