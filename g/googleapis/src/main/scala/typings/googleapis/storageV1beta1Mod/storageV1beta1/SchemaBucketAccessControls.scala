package typings.googleapis.storageV1beta1Mod.storageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An access-control list.
  */
trait SchemaBucketAccessControls extends StObject {
  
  /**
    * The list of items.
    */
  var items: js.UndefOr[js.Array[SchemaBucketAccessControl]] = js.undefined
  
  /**
    * The kind of item this is. For lists of bucket access control entries,
    * this is always storage#bucketAccessControls.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaBucketAccessControls {
  
  @scala.inline
  def apply(): SchemaBucketAccessControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketAccessControls]
  }
  
  @scala.inline
  implicit class SchemaBucketAccessControlsMutableBuilder[Self <: SchemaBucketAccessControls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaBucketAccessControl]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaBucketAccessControl*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
