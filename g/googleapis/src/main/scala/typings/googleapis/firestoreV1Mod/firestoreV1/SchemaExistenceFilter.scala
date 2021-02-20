package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A digest of all the documents that match a given target.
  */
@js.native
trait SchemaExistenceFilter extends StObject {
  
  /**
    * The total count of documents that match target_id.  If different from the
    * count of documents in the client that match, the client must manually
    * determine which documents no longer match the target.
    */
  var count: js.UndefOr[Double] = js.native
  
  /**
    * The target ID to which this filter applies.
    */
  var targetId: js.UndefOr[Double] = js.native
}
object SchemaExistenceFilter {
  
  @scala.inline
  def apply(): SchemaExistenceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExistenceFilter]
  }
  
  @scala.inline
  implicit class SchemaExistenceFilterMutableBuilder[Self <: SchemaExistenceFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setTargetId(value: Double): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
  }
}
