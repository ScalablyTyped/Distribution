package typings.libp2pInterfacePeerStore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressBookEntry extends StObject {
  
  var addresses: js.Array[Address]
  
  var record: CertifiedRecord
}
object AddressBookEntry {
  
  inline def apply(addresses: js.Array[Address], record: CertifiedRecord): AddressBookEntry = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressBookEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddressBookEntry] (val x: Self) extends AnyVal {
    
    inline def setAddresses(value: js.Array[Address]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesVarargs(value: Address*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setRecord(value: CertifiedRecord): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
  }
}
