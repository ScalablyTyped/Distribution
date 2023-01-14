package typings.indySdk.anon

import typings.indySdk.indySdkStrings.ISSUANCE_BY_DEFAULT
import typings.indySdk.indySdkStrings.ISSUANCE_ON_DEMAND
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Issuancetype extends StObject {
  
  var issuance_type: js.UndefOr[ISSUANCE_BY_DEFAULT | ISSUANCE_ON_DEMAND] = js.undefined
  
  var max_cred_num: js.UndefOr[Double] = js.undefined
}
object Issuancetype {
  
  inline def apply(): Issuancetype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Issuancetype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Issuancetype] (val x: Self) extends AnyVal {
    
    inline def setIssuance_type(value: ISSUANCE_BY_DEFAULT | ISSUANCE_ON_DEMAND): Self = StObject.set(x, "issuance_type", value.asInstanceOf[js.Any])
    
    inline def setIssuance_typeUndefined: Self = StObject.set(x, "issuance_type", js.undefined)
    
    inline def setMax_cred_num(value: Double): Self = StObject.set(x, "max_cred_num", value.asInstanceOf[js.Any])
    
    inline def setMax_cred_numUndefined: Self = StObject.set(x, "max_cred_num", js.undefined)
  }
}
