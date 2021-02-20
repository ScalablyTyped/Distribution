package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Placement Tag
  */
@js.native
trait SchemaPlacementTag extends StObject {
  
  /**
    * Placement ID
    */
  var placementId: js.UndefOr[String] = js.native
  
  /**
    * Tags generated for this placement.
    */
  var tagDatas: js.UndefOr[js.Array[SchemaTagData]] = js.native
}
object SchemaPlacementTag {
  
  @scala.inline
  def apply(): SchemaPlacementTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementTag]
  }
  
  @scala.inline
  implicit class SchemaPlacementTagMutableBuilder[Self <: SchemaPlacementTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlacementId(value: String): Self = StObject.set(x, "placementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementIdUndefined: Self = StObject.set(x, "placementId", js.undefined)
    
    @scala.inline
    def setTagDatas(value: js.Array[SchemaTagData]): Self = StObject.set(x, "tagDatas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagDatasUndefined: Self = StObject.set(x, "tagDatas", js.undefined)
    
    @scala.inline
    def setTagDatasVarargs(value: SchemaTagData*): Self = StObject.set(x, "tagDatas", js.Array(value :_*))
  }
}
