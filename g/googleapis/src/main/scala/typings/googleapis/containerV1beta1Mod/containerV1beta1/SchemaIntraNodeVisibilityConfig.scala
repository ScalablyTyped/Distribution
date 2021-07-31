package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IntraNodeVisibilityConfig contains the desired config of the intra-node
  * visibility on this cluster.
  */
trait SchemaIntraNodeVisibilityConfig extends StObject {
  
  /**
    * Enables intra node visibility for this cluster.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object SchemaIntraNodeVisibilityConfig {
  
  @scala.inline
  def apply(): SchemaIntraNodeVisibilityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntraNodeVisibilityConfig]
  }
  
  @scala.inline
  implicit class SchemaIntraNodeVisibilityConfigMutableBuilder[Self <: SchemaIntraNodeVisibilityConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
