package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sn extends StObject {
  
  var sn: IntegerParam = js.native
  
  var time: StringParam = js.native
}
object Sn {
  
  @scala.inline
  def apply(sn: IntegerParam, time: StringParam): Sn = {
    val __obj = js.Dynamic.literal(sn = sn.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sn]
  }
  
  @scala.inline
  implicit class SnMutableBuilder[Self <: Sn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSn(value: IntegerParam): Self = StObject.set(x, "sn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: StringParam): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
