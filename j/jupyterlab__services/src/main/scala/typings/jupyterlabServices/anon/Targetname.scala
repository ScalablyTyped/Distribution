package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Targetname extends StObject {
  
  /**
    * The comm target name to filter returned comms
    */
  var target_name: js.UndefOr[String] = js.undefined
}
object Targetname {
  
  inline def apply(): Targetname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Targetname]
  }
  
  extension [Self <: Targetname](x: Self) {
    
    inline def setTarget_name(value: String): Self = StObject.set(x, "target_name", value.asInstanceOf[js.Any])
    
    inline def setTarget_nameUndefined: Self = StObject.set(x, "target_name", js.undefined)
  }
}
