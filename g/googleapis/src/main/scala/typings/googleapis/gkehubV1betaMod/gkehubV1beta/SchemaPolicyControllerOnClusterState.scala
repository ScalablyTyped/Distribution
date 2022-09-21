package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPolicyControllerOnClusterState extends StObject {
  
  /**
    * Surface potential errors or information logs.
    */
  var details: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The lifecycle state of this component.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaPolicyControllerOnClusterState {
  
  inline def apply(): SchemaPolicyControllerOnClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyControllerOnClusterState]
  }
  
  extension [Self <: SchemaPolicyControllerOnClusterState](x: Self) {
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
