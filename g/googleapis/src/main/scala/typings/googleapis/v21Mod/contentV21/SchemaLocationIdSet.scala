package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocationIdSet extends StObject {
  
  /**
    * A non-empty list of location IDs. They must all be of the same location
    * type (e.g., state).
    */
  var locationIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaLocationIdSet {
  
  @scala.inline
  def apply(): SchemaLocationIdSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationIdSet]
  }
  
  @scala.inline
  implicit class SchemaLocationIdSetMutableBuilder[Self <: SchemaLocationIdSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocationIds(value: js.Array[String]): Self = StObject.set(x, "locationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationIdsUndefined: Self = StObject.set(x, "locationIds", js.undefined)
    
    @scala.inline
    def setLocationIdsVarargs(value: String*): Self = StObject.set(x, "locationIds", js.Array(value :_*))
  }
}
