package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PosStore extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#posStore`" */
  var kind: js.UndefOr[String] = js.native
  
  /** Required. The street address of the store. */
  var storeAddress: js.UndefOr[String] = js.native
  
  /** Required. A store identifier that is unique for the given merchant. */
  var storeCode: js.UndefOr[String] = js.native
}
object PosStore {
  
  @scala.inline
  def apply(): PosStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PosStore]
  }
  
  @scala.inline
  implicit class PosStoreMutableBuilder[Self <: PosStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setStoreAddress(value: String): Self = StObject.set(x, "storeAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreAddressUndefined: Self = StObject.set(x, "storeAddress", js.undefined)
    
    @scala.inline
    def setStoreCode(value: String): Self = StObject.set(x, "storeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreCodeUndefined: Self = StObject.set(x, "storeCode", js.undefined)
  }
}
