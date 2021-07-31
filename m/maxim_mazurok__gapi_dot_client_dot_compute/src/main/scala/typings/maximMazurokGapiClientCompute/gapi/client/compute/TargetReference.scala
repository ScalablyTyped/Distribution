package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetReference extends StObject {
  
  var target: js.UndefOr[String] = js.undefined
}
object TargetReference {
  
  @scala.inline
  def apply(): TargetReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetReference]
  }
  
  @scala.inline
  implicit class TargetReferenceMutableBuilder[Self <: TargetReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
