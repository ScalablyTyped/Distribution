package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlacementTag extends StObject {
  
  /**
    * Placement ID
    */
  var placementId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tags generated for this placement.
    */
  var tagDatas: js.UndefOr[js.Array[SchemaTagData]] = js.undefined
}
object SchemaPlacementTag {
  
  inline def apply(): SchemaPlacementTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementTag]
  }
  
  extension [Self <: SchemaPlacementTag](x: Self) {
    
    inline def setPlacementId(value: String): Self = StObject.set(x, "placementId", value.asInstanceOf[js.Any])
    
    inline def setPlacementIdNull: Self = StObject.set(x, "placementId", null)
    
    inline def setPlacementIdUndefined: Self = StObject.set(x, "placementId", js.undefined)
    
    inline def setTagDatas(value: js.Array[SchemaTagData]): Self = StObject.set(x, "tagDatas", value.asInstanceOf[js.Any])
    
    inline def setTagDatasUndefined: Self = StObject.set(x, "tagDatas", js.undefined)
    
    inline def setTagDatasVarargs(value: SchemaTagData*): Self = StObject.set(x, "tagDatas", js.Array(value*))
  }
}
