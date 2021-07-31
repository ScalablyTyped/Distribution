package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Failinfo extends StObject {
  
  var failinfo: js.UndefOr[NameParam | IntegerParam] = js.undefined
  
  var statstr: js.UndefOr[ArrayParam[String]] = js.undefined
  
  var status: NameParam
}
object Failinfo {
  
  @scala.inline
  def apply(status: NameParam): Failinfo = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failinfo]
  }
  
  @scala.inline
  implicit class FailinfoMutableBuilder[Self <: Failinfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailinfo(value: NameParam | IntegerParam): Self = StObject.set(x, "failinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailinfoUndefined: Self = StObject.set(x, "failinfo", js.undefined)
    
    @scala.inline
    def setStatstr(value: ArrayParam[String]): Self = StObject.set(x, "statstr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatstrUndefined: Self = StObject.set(x, "statstr", js.undefined)
    
    @scala.inline
    def setStatus(value: NameParam): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
