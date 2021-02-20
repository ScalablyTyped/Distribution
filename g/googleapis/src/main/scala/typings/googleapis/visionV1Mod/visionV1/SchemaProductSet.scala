package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ProductSet contains Products. A ProductSet can contain a maximum of 1
  * million reference images. If the limit is exceeded, periodic indexing will
  * fail.
  */
@js.native
trait SchemaProductSet extends StObject {
  
  /**
    * The user-provided name for this ProductSet. Must not be empty. Must be at
    * most 4096 characters long.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Output only. If there was an error with indexing the product set, the
    * field is populated.  This field is ignored when creating a ProductSet.
    */
  var indexError: js.UndefOr[SchemaStatus] = js.native
  
  /**
    * Output only. The time at which this ProductSet was last indexed. Query
    * results will reflect all updates before this time. If this ProductSet has
    * never been indexed, this timestamp is the default value
    * &quot;1970-01-01T00:00:00Z&quot;.  This field is ignored when creating a
    * ProductSet.
    */
  var indexTime: js.UndefOr[String] = js.native
  
  /**
    * The resource name of the ProductSet.  Format is:
    * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.  This
    * field is ignored when creating a ProductSet.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaProductSet {
  
  @scala.inline
  def apply(): SchemaProductSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductSet]
  }
  
  @scala.inline
  implicit class SchemaProductSetMutableBuilder[Self <: SchemaProductSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setIndexError(value: SchemaStatus): Self = StObject.set(x, "indexError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexErrorUndefined: Self = StObject.set(x, "indexError", js.undefined)
    
    @scala.inline
    def setIndexTime(value: String): Self = StObject.set(x, "indexTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexTimeUndefined: Self = StObject.set(x, "indexTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
