package typings.hapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collect extends StObject {
  
  var collect: Boolean
}
object Collect {
  
  inline def apply(collect: Boolean): Collect = {
    val __obj = js.Dynamic.literal(collect = collect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collect]
  }
  
  extension [Self <: Collect](x: Self) {
    
    inline def setCollect(value: Boolean): Self = StObject.set(x, "collect", value.asInstanceOf[js.Any])
  }
}
