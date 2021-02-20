package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * On-premises instance configuration.
  */
@js.native
trait SchemaOnPremisesConfiguration extends StObject {
  
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
  implicit class SchemaOnPremisesConfigurationMutableBuilder[Self <: SchemaOnPremisesConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostPort(value: String): Self = StObject.set(x, "hostPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPortUndefined: Self = StObject.set(x, "hostPort", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
