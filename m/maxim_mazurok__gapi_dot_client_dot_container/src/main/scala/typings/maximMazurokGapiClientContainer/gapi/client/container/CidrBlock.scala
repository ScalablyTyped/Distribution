package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CidrBlock extends StObject {
  
  /** cidr_block must be specified in CIDR notation. */
  var cidrBlock: js.UndefOr[String] = js.undefined
  
  /** display_name is an optional field for users to identify CIDR blocks. */
  var displayName: js.UndefOr[String] = js.undefined
}
object CidrBlock {
  
  inline def apply(): CidrBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CidrBlock]
  }
  
  extension [Self <: CidrBlock](x: Self) {
    
    inline def setCidrBlock(value: String): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockUndefined: Self = StObject.set(x, "cidrBlock", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
