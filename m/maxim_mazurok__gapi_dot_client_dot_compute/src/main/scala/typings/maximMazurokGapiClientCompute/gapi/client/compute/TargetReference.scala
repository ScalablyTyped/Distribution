package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetReference extends StObject {
  
  var target: js.UndefOr[String] = js.undefined
}
object TargetReference {
  
  inline def apply(): TargetReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetReference]
  }
  
  extension [Self <: TargetReference](x: Self) {
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
