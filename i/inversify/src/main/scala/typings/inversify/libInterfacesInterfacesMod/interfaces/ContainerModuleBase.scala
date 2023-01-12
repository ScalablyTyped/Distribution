package typings.inversify.libInterfacesInterfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerModuleBase extends StObject {
  
  var id: Double
}
object ContainerModuleBase {
  
  inline def apply(id: Double): ContainerModuleBase = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerModuleBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerModuleBase] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
