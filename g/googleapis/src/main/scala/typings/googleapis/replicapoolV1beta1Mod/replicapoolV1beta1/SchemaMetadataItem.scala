package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Compute Engine metadata item, defined as a key:value pair. Identical to
  * the metadata on the corresponding Compute Engine resource.
  */
@js.native
trait SchemaMetadataItem extends StObject {
  
  /**
    * A metadata key.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * A metadata value.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaMetadataItem {
  
  @scala.inline
  def apply(): SchemaMetadataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadataItem]
  }
  
  @scala.inline
  implicit class SchemaMetadataItemMutableBuilder[Self <: SchemaMetadataItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
