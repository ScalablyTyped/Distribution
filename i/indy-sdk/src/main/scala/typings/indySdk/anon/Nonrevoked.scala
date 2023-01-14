package typings.indySdk.anon

import typings.indySdk.indySdkStrings.Greaterthansign
import typings.indySdk.indySdkStrings.GreaterthansignEqualssign
import typings.indySdk.indySdkStrings.Lessthansign
import typings.indySdk.indySdkStrings.LessthansignEqualssign
import typings.indySdk.mod.NonRevokedInterval
import typings.indySdk.mod.WalletQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nonrevoked extends StObject {
  
  var name: String
  
  var non_revoked: js.UndefOr[NonRevokedInterval] = js.undefined
  
  var p_type: GreaterthansignEqualssign | Greaterthansign | LessthansignEqualssign | Lessthansign
  
  var p_value: Double
  
  var restrictions: js.UndefOr[js.Array[WalletQuery]] = js.undefined
}
object Nonrevoked {
  
  inline def apply(
    name: String,
    p_type: GreaterthansignEqualssign | Greaterthansign | LessthansignEqualssign | Lessthansign,
    p_value: Double
  ): Nonrevoked = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], p_type = p_type.asInstanceOf[js.Any], p_value = p_value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nonrevoked]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nonrevoked] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNon_revoked(value: NonRevokedInterval): Self = StObject.set(x, "non_revoked", value.asInstanceOf[js.Any])
    
    inline def setNon_revokedUndefined: Self = StObject.set(x, "non_revoked", js.undefined)
    
    inline def setP_type(value: GreaterthansignEqualssign | Greaterthansign | LessthansignEqualssign | Lessthansign): Self = StObject.set(x, "p_type", value.asInstanceOf[js.Any])
    
    inline def setP_value(value: Double): Self = StObject.set(x, "p_value", value.asInstanceOf[js.Any])
    
    inline def setRestrictions(value: js.Array[WalletQuery]): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    inline def setRestrictionsVarargs(value: WalletQuery*): Self = StObject.set(x, "restrictions", js.Array(value*))
  }
}
