package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Secs extends StObject {
  
  var secs: js.Any
}
object Secs {
  
  inline def apply(secs: js.Any): Secs = {
    val __obj = js.Dynamic.literal(secs = secs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Secs]
  }
  
  extension [Self <: Secs](x: Self) {
    
    inline def setSecs(value: js.Any): Self = StObject.set(x, "secs", value.asInstanceOf[js.Any])
  }
}
