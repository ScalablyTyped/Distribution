package typings.iotaLibJs.anon

import typings.iotaLibJs.mod.InputObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Balance extends StObject {
  
  var addresses: js.Array[String]
  
  var balance: Double
  
  var inputs: js.Array[InputObject]
  
  var latestAddress: String
  
  var transfers: js.Array[String]
}
object Balance {
  
  inline def apply(
    addresses: js.Array[String],
    balance: Double,
    inputs: js.Array[InputObject],
    latestAddress: String,
    transfers: js.Array[String]
  ): Balance = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], latestAddress = latestAddress.asInstanceOf[js.Any], transfers = transfers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Balance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Balance] (val x: Self) extends AnyVal {
    
    inline def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setBalance(value: Double): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: js.Array[InputObject]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: InputObject*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setLatestAddress(value: String): Self = StObject.set(x, "latestAddress", value.asInstanceOf[js.Any])
    
    inline def setTransfers(value: js.Array[String]): Self = StObject.set(x, "transfers", value.asInstanceOf[js.Any])
    
    inline def setTransfersVarargs(value: String*): Self = StObject.set(x, "transfers", js.Array(value*))
  }
}
