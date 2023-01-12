package typings.maplibreGl.mod

import typings.maplibreGl.anon.PartialUniformany
import typings.std.WebGLUniformLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniformBinder extends StObject {
  
  def getBinding(context: Context, location: WebGLUniformLocation, name: String): PartialUniformany
  
  def setUniform(
    uniform: Uniform[Any],
    globals: GlobalProperties,
    currentValue: PossiblyEvaluatedPropertyValue[Any],
    uniformName: String
  ): scala.Unit
  
  var uniformNames: js.Array[String]
}
object UniformBinder {
  
  inline def apply(
    getBinding: (Context, WebGLUniformLocation, String) => PartialUniformany,
    setUniform: (Uniform[Any], GlobalProperties, PossiblyEvaluatedPropertyValue[Any], String) => scala.Unit,
    uniformNames: js.Array[String]
  ): UniformBinder = {
    val __obj = js.Dynamic.literal(getBinding = js.Any.fromFunction3(getBinding), setUniform = js.Any.fromFunction4(setUniform), uniformNames = uniformNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniformBinder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UniformBinder] (val x: Self) extends AnyVal {
    
    inline def setGetBinding(value: (Context, WebGLUniformLocation, String) => PartialUniformany): Self = StObject.set(x, "getBinding", js.Any.fromFunction3(value))
    
    inline def setSetUniform(value: (Uniform[Any], GlobalProperties, PossiblyEvaluatedPropertyValue[Any], String) => scala.Unit): Self = StObject.set(x, "setUniform", js.Any.fromFunction4(value))
    
    inline def setUniformNames(value: js.Array[String]): Self = StObject.set(x, "uniformNames", value.asInstanceOf[js.Any])
    
    inline def setUniformNamesVarargs(value: String*): Self = StObject.set(x, "uniformNames", js.Array(value*))
  }
}
