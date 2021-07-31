package typings.maximMazurokGapiClientDiscovery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref extends StObject {
  
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  
  var type_value: js.UndefOr[String] = js.undefined
}
object Ref {
  
  @scala.inline
  def apply(): Ref = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ref]
  }
  
  @scala.inline
  implicit class RefMutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
    
    @scala.inline
    def setType_value(value: String): Self = StObject.set(x, "type_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType_valueUndefined: Self = StObject.set(x, "type_value", js.undefined)
  }
}
