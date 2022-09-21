package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFeatureResourceState extends StObject {
  
  /**
    * The current state of the Feature resource in the Hub API.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaFeatureResourceState {
  
  inline def apply(): SchemaFeatureResourceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatureResourceState]
  }
  
  extension [Self <: SchemaFeatureResourceState](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
