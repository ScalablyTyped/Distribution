package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentSource extends StObject {
  
  var fragmentSource: String
  
  var staticAttributes: js.Array[String]
  
  var staticUniforms: js.Array[String]
  
  var vertexSource: String
}
object FragmentSource {
  
  inline def apply(
    fragmentSource: String,
    staticAttributes: js.Array[String],
    staticUniforms: js.Array[String],
    vertexSource: String
  ): FragmentSource = {
    val __obj = js.Dynamic.literal(fragmentSource = fragmentSource.asInstanceOf[js.Any], staticAttributes = staticAttributes.asInstanceOf[js.Any], staticUniforms = staticUniforms.asInstanceOf[js.Any], vertexSource = vertexSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FragmentSource] (val x: Self) extends AnyVal {
    
    inline def setFragmentSource(value: String): Self = StObject.set(x, "fragmentSource", value.asInstanceOf[js.Any])
    
    inline def setStaticAttributes(value: js.Array[String]): Self = StObject.set(x, "staticAttributes", value.asInstanceOf[js.Any])
    
    inline def setStaticAttributesVarargs(value: String*): Self = StObject.set(x, "staticAttributes", js.Array(value*))
    
    inline def setStaticUniforms(value: js.Array[String]): Self = StObject.set(x, "staticUniforms", value.asInstanceOf[js.Any])
    
    inline def setStaticUniformsVarargs(value: String*): Self = StObject.set(x, "staticUniforms", js.Array(value*))
    
    inline def setVertexSource(value: String): Self = StObject.set(x, "vertexSource", value.asInstanceOf[js.Any])
  }
}
