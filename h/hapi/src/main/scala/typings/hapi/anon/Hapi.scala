package typings.hapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hapi extends StObject {
  
  var hapi: js.UndefOr[String] = js.undefined
  
  var node: js.UndefOr[String] = js.undefined
}
object Hapi {
  
  @scala.inline
  def apply(): Hapi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hapi]
  }
  
  @scala.inline
  implicit class HapiMutableBuilder[Self <: Hapi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHapi(value: String): Self = StObject.set(x, "hapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHapiUndefined: Self = StObject.set(x, "hapi", js.undefined)
    
    @scala.inline
    def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
  }
}
