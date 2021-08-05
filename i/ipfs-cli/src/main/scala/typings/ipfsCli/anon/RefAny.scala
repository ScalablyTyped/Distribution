package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefAny extends StObject {
  
  var ref: js.Any
}
object RefAny {
  
  inline def apply(ref: js.Any): RefAny = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefAny]
  }
  
  extension [Self <: RefAny](x: Self) {
    
    inline def setRef(value: js.Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
