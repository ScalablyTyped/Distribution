package typings.hapiHapi.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parser extends StObject {
  
  /**
    * the method must return an object where each key is a parameter and matching value is the parameter value.
    * If the method throws, the error is used as the response or returned when `request.setUrl` is called.
    */
  def parser(raw: Record[String, String]): Record[String, Any]
}
object Parser {
  
  inline def apply(parser: Record[String, String] => Record[String, Any]): Parser = {
    val __obj = js.Dynamic.literal(parser = js.Any.fromFunction1(parser))
    __obj.asInstanceOf[Parser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parser] (val x: Self) extends AnyVal {
    
    inline def setParser(value: Record[String, String] => Record[String, Any]): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
  }
}
