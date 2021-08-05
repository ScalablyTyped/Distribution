package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasignStrings.gen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jsrsasign.jsrsasign.KJUR.asn1.StringParam & {  type :'gen' | undefined} */
trait StringParamtypegenundefin extends StObject {
  
  var str: String
  
  var `type`: js.UndefOr[gen] = js.undefined
}
object StringParamtypegenundefin {
  
  inline def apply(str: String): StringParamtypegenundefin = {
    val __obj = js.Dynamic.literal(str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringParamtypegenundefin]
  }
  
  extension [Self <: StringParamtypegenundefin](x: Self) {
    
    inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
    
    inline def setType(value: gen): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
