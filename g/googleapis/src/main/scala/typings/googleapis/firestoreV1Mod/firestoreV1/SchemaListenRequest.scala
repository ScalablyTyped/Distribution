package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListenRequest extends StObject {
  
  /**
    * A target to add to this stream.
    */
  var addTarget: js.UndefOr[SchemaTarget] = js.undefined
  
  /**
    * Labels associated with this target change.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The ID of a target to remove from this stream.
    */
  var removeTarget: js.UndefOr[Double | Null] = js.undefined
}
object SchemaListenRequest {
  
  inline def apply(): SchemaListenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListenRequest]
  }
  
  extension [Self <: SchemaListenRequest](x: Self) {
    
    inline def setAddTarget(value: SchemaTarget): Self = StObject.set(x, "addTarget", value.asInstanceOf[js.Any])
    
    inline def setAddTargetUndefined: Self = StObject.set(x, "addTarget", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setRemoveTarget(value: Double): Self = StObject.set(x, "removeTarget", value.asInstanceOf[js.Any])
    
    inline def setRemoveTargetNull: Self = StObject.set(x, "removeTarget", null)
    
    inline def setRemoveTargetUndefined: Self = StObject.set(x, "removeTarget", js.undefined)
  }
}
