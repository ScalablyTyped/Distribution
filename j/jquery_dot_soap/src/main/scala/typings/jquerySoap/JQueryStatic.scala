package typings.jquerySoap

import typings.jquery.JQueryXHR
import typings.jquerySoap.JQuerySOAP.Options
import typings.jquerySoap.JQuerySOAP.SOAP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def soap(): JQueryXHR
  def soap(options: Options): JQueryXHR
  @JSName("soap")
  var soap_Original: SOAP
}
object JQueryStatic {
  
  inline def apply(soap: /* options */ js.UndefOr[Options] => JQueryXHR): JQueryStatic = {
    val __obj = js.Dynamic.literal(soap = js.Any.fromFunction1(soap))
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    inline def setSoap(value: /* options */ js.UndefOr[Options] => JQueryXHR): Self = StObject.set(x, "soap", js.Any.fromFunction1(value))
  }
}
