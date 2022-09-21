package typings.indySdk.anon

import typings.indySdk.mod.NonRevokedInterval
import typings.indySdk.mod.WalletQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var names: js.UndefOr[String] = js.undefined
  
  var non_revoked: js.UndefOr[NonRevokedInterval] = js.undefined
  
  var restrictions: js.UndefOr[js.Array[WalletQuery]] = js.undefined
}
object Name {
  
  inline def apply(): Name = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNames(value: String): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNon_revoked(value: NonRevokedInterval): Self = StObject.set(x, "non_revoked", value.asInstanceOf[js.Any])
    
    inline def setNon_revokedUndefined: Self = StObject.set(x, "non_revoked", js.undefined)
    
    inline def setRestrictions(value: js.Array[WalletQuery]): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    inline def setRestrictionsVarargs(value: WalletQuery*): Self = StObject.set(x, "restrictions", js.Array(value*))
  }
}
