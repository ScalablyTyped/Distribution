package typings.iotaLibJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Addresses extends StObject {
  
  var addresses: js.UndefOr[js.Array[String]] = js.undefined
  
  var approvees: js.UndefOr[js.Array[String]] = js.undefined
  
  var bundles: js.UndefOr[js.Array[String]] = js.undefined
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object Addresses {
  
  @scala.inline
  def apply(): Addresses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Addresses]
  }
  
  @scala.inline
  implicit class AddressesMutableBuilder[Self <: Addresses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    @scala.inline
    def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    @scala.inline
    def setApprovees(value: js.Array[String]): Self = StObject.set(x, "approvees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproveesUndefined: Self = StObject.set(x, "approvees", js.undefined)
    
    @scala.inline
    def setApproveesVarargs(value: String*): Self = StObject.set(x, "approvees", js.Array(value :_*))
    
    @scala.inline
    def setBundles(value: js.Array[String]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
    
    @scala.inline
    def setBundlesVarargs(value: String*): Self = StObject.set(x, "bundles", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
