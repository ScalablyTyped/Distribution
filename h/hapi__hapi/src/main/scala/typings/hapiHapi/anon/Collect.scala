package typings.hapiHapi.anon

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Collect] (val x: Self) extends AnyVal {
    
    inline def setCollect(value: Boolean): Self = StObject.set(x, "collect", value.asInstanceOf[js.Any])
  }
}
