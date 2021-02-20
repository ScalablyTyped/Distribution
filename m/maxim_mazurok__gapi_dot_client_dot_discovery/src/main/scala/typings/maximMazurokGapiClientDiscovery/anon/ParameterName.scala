package typings.maximMazurokGapiClientDiscovery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterName extends StObject {
  
  /** Schema ID for the request schema. */
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  
  /** parameter name. */
  var parameterName: js.UndefOr[String] = js.native
}
object ParameterName {
  
  @scala.inline
  def apply(): ParameterName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterName]
  }
  
  @scala.inline
  implicit class ParameterNameMutableBuilder[Self <: ParameterName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
    
    @scala.inline
    def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterNameUndefined: Self = StObject.set(x, "parameterName", js.undefined)
  }
}
