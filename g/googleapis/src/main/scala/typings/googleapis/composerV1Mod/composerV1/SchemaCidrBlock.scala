package typings.googleapis.composerV1Mod.composerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCidrBlock extends StObject {
  
  /**
    * CIDR block that must be specified in CIDR notation.
    */
  var cidrBlock: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User-defined name that identifies the CIDR block.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
}
object SchemaCidrBlock {
  
  inline def apply(): SchemaCidrBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCidrBlock]
  }
  
  extension [Self <: SchemaCidrBlock](x: Self) {
    
    inline def setCidrBlock(value: String): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockNull: Self = StObject.set(x, "cidrBlock", null)
    
    inline def setCidrBlockUndefined: Self = StObject.set(x, "cidrBlock", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
