package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBlueGreenInfo extends StObject {
  
  /**
    * The resource URLs of the [managed instance groups] (/compute/docs/instance-groups/creating-groups-of-managed-instances) associated with blue pool.
    */
  var blueInstanceGroupUrls: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Time to start deleting blue pool to complete blue-green upgrade, in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var bluePoolDeletionStartTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource URLs of the [managed instance groups] (/compute/docs/instance-groups/creating-groups-of-managed-instances) associated with green pool.
    */
  var greenInstanceGroupUrls: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Version of green pool.
    */
  var greenPoolVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Current blue-green upgrade phase.
    */
  var phase: js.UndefOr[String | Null] = js.undefined
}
object SchemaBlueGreenInfo {
  
  inline def apply(): SchemaBlueGreenInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBlueGreenInfo]
  }
  
  extension [Self <: SchemaBlueGreenInfo](x: Self) {
    
    inline def setBlueInstanceGroupUrls(value: js.Array[String]): Self = StObject.set(x, "blueInstanceGroupUrls", value.asInstanceOf[js.Any])
    
    inline def setBlueInstanceGroupUrlsNull: Self = StObject.set(x, "blueInstanceGroupUrls", null)
    
    inline def setBlueInstanceGroupUrlsUndefined: Self = StObject.set(x, "blueInstanceGroupUrls", js.undefined)
    
    inline def setBlueInstanceGroupUrlsVarargs(value: String*): Self = StObject.set(x, "blueInstanceGroupUrls", js.Array(value*))
    
    inline def setBluePoolDeletionStartTime(value: String): Self = StObject.set(x, "bluePoolDeletionStartTime", value.asInstanceOf[js.Any])
    
    inline def setBluePoolDeletionStartTimeNull: Self = StObject.set(x, "bluePoolDeletionStartTime", null)
    
    inline def setBluePoolDeletionStartTimeUndefined: Self = StObject.set(x, "bluePoolDeletionStartTime", js.undefined)
    
    inline def setGreenInstanceGroupUrls(value: js.Array[String]): Self = StObject.set(x, "greenInstanceGroupUrls", value.asInstanceOf[js.Any])
    
    inline def setGreenInstanceGroupUrlsNull: Self = StObject.set(x, "greenInstanceGroupUrls", null)
    
    inline def setGreenInstanceGroupUrlsUndefined: Self = StObject.set(x, "greenInstanceGroupUrls", js.undefined)
    
    inline def setGreenInstanceGroupUrlsVarargs(value: String*): Self = StObject.set(x, "greenInstanceGroupUrls", js.Array(value*))
    
    inline def setGreenPoolVersion(value: String): Self = StObject.set(x, "greenPoolVersion", value.asInstanceOf[js.Any])
    
    inline def setGreenPoolVersionNull: Self = StObject.set(x, "greenPoolVersion", null)
    
    inline def setGreenPoolVersionUndefined: Self = StObject.set(x, "greenPoolVersion", js.undefined)
    
    inline def setPhase(value: String): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPhaseNull: Self = StObject.set(x, "phase", null)
    
    inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
  }
}
