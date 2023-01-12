package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodePoolAutoConfig extends StObject {
  
  /**
    * The list of instance tags applied to all nodes. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during cluster creation.
    * Each tag within the list must comply with RFC1035.
    */
  var networkTags: js.UndefOr[NetworkTags] = js.undefined
}
object NodePoolAutoConfig {
  
  inline def apply(): NodePoolAutoConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodePoolAutoConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodePoolAutoConfig] (val x: Self) extends AnyVal {
    
    inline def setNetworkTags(value: NetworkTags): Self = StObject.set(x, "networkTags", value.asInstanceOf[js.Any])
    
    inline def setNetworkTagsUndefined: Self = StObject.set(x, "networkTags", js.undefined)
  }
}
