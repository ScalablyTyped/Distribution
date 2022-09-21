package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPolicyControllerMembershipState extends StObject {
  
  /**
    * The user-defined name for the cluster used by ClusterSelectors to group clusters together. This should match Membership's membership_name, unless the user installed PC on the cluster manually prior to enabling the PC hub feature. Unique within a Policy Controller installation.
    */
  var clusterName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Currently these include (also serving as map keys): 1. "admission" 2. "audit" 3. "mutation" 4. "constraint template library"
    */
  var componentStates: js.UndefOr[StringDictionary[SchemaPolicyControllerOnClusterState] | Null] = js.undefined
  
  /**
    * The overall Policy Controller lifecycle state observed by the Hub Feature controller.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaPolicyControllerMembershipState {
  
  inline def apply(): SchemaPolicyControllerMembershipState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyControllerMembershipState]
  }
  
  extension [Self <: SchemaPolicyControllerMembershipState](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameNull: Self = StObject.set(x, "clusterName", null)
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setComponentStates(value: StringDictionary[SchemaPolicyControllerOnClusterState]): Self = StObject.set(x, "componentStates", value.asInstanceOf[js.Any])
    
    inline def setComponentStatesNull: Self = StObject.set(x, "componentStates", null)
    
    inline def setComponentStatesUndefined: Self = StObject.set(x, "componentStates", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
