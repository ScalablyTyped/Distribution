package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for the legacy Attribute Based Access Control authorization
  * mode.
  */
trait SchemaLegacyAbac extends StObject {
  
  /**
    * Whether the ABAC authorizer is enabled for this cluster. When enabled,
    * identities in the system, including service accounts, nodes, and
    * controllers, will have statically granted permissions beyond those
    * provided by the RBAC configuration or IAM.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object SchemaLegacyAbac {
  
  @scala.inline
  def apply(): SchemaLegacyAbac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLegacyAbac]
  }
  
  @scala.inline
  implicit class SchemaLegacyAbacMutableBuilder[Self <: SchemaLegacyAbac] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
