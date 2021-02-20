package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Compute Engine metadata entry. Identical to the metadata on the
  * corresponding Compute Engine resource.
  */
@js.native
trait SchemaMetadata extends StObject {
  
  /**
    * The fingerprint of the metadata. Required for updating the metadata
    * entries for this instance.
    */
  var fingerPrint: js.UndefOr[String] = js.native
  
  /**
    * A list of metadata items.
    */
  var items: js.UndefOr[js.Array[SchemaMetadataItem]] = js.native
}
object SchemaMetadata {
  
  @scala.inline
  def apply(): SchemaMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadata]
  }
  
  @scala.inline
  implicit class SchemaMetadataMutableBuilder[Self <: SchemaMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFingerPrint(value: String): Self = StObject.set(x, "fingerPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerPrintUndefined: Self = StObject.set(x, "fingerPrint", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaMetadataItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaMetadataItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
