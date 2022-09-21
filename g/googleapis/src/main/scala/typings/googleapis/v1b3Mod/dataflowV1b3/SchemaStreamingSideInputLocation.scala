package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStreamingSideInputLocation extends StObject {
  
  /**
    * Identifies the state family where this side input is stored.
    */
  var stateFamily: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies the particular side input within the streaming Dataflow job.
    */
  var tag: js.UndefOr[String | Null] = js.undefined
}
object SchemaStreamingSideInputLocation {
  
  inline def apply(): SchemaStreamingSideInputLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingSideInputLocation]
  }
  
  extension [Self <: SchemaStreamingSideInputLocation](x: Self) {
    
    inline def setStateFamily(value: String): Self = StObject.set(x, "stateFamily", value.asInstanceOf[js.Any])
    
    inline def setStateFamilyNull: Self = StObject.set(x, "stateFamily", null)
    
    inline def setStateFamilyUndefined: Self = StObject.set(x, "stateFamily", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagNull: Self = StObject.set(x, "tag", null)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
