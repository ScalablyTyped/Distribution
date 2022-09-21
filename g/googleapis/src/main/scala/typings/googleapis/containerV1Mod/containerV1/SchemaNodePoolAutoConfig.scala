package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodePoolAutoConfig extends StObject {
  
  /**
    * The list of instance tags applied to all nodes. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during cluster creation. Each tag within the list must comply with RFC1035.
    */
  var networkTags: js.UndefOr[SchemaNetworkTags] = js.undefined
}
object SchemaNodePoolAutoConfig {
  
  inline def apply(): SchemaNodePoolAutoConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodePoolAutoConfig]
  }
  
  extension [Self <: SchemaNodePoolAutoConfig](x: Self) {
    
    inline def setNetworkTags(value: SchemaNetworkTags): Self = StObject.set(x, "networkTags", value.asInstanceOf[js.Any])
    
    inline def setNetworkTagsUndefined: Self = StObject.set(x, "networkTags", js.undefined)
  }
}
