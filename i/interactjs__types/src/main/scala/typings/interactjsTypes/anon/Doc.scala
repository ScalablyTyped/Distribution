package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Doc extends StObject {
  
  var doc: typings.std.Document
  
  var options: Any
}
object Doc {
  
  inline def apply(doc: typings.std.Document, options: Any): Doc = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Doc]
  }
  
  extension [Self <: Doc](x: Self) {
    
    inline def setDoc(value: typings.std.Document): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
