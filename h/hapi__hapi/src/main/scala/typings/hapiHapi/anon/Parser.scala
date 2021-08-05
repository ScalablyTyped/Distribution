package typings.hapiHapi.anon

import typings.hapiHapi.mod.Util.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parser extends StObject {
  
  /**
    * the method must return an object where each key is a parameter and matching value is the parameter value.
    * If the method throws, the error is used as the response or returned when `request.setUrl` is called.
    */
  def parser(raw: Dictionary[String]): Dictionary[js.Any]
}
object Parser {
  
  inline def apply(parser: Dictionary[String] => Dictionary[js.Any]): Parser = {
    val __obj = js.Dynamic.literal(parser = js.Any.fromFunction1(parser))
    __obj.asInstanceOf[Parser]
  }
  
  extension [Self <: Parser](x: Self) {
    
    inline def setParser(value: Dictionary[String] => Dictionary[js.Any]): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
  }
}
