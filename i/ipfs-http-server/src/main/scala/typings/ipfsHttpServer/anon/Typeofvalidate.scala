package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofvalidate extends StObject {
  
  val options_1: Typeofoptions1
  
  val query: js.Any
}
object Typeofvalidate {
  
  inline def apply(options_1: Typeofoptions1, query: js.Any): Typeofvalidate = {
    val __obj = js.Dynamic.literal(options_1 = options_1.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofvalidate]
  }
  
  extension [Self <: Typeofvalidate](x: Self) {
    
    inline def setOptions_1(value: Typeofoptions1): Self = StObject.set(x, "options_1", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
