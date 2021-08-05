package typings.ink.anon

import typings.ink.renderNodeToOutputMod.OutputTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transformers extends StObject {
  
  var transformers: js.Array[OutputTransformer]
}
object Transformers {
  
  inline def apply(transformers: js.Array[OutputTransformer]): Transformers = {
    val __obj = js.Dynamic.literal(transformers = transformers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transformers]
  }
  
  extension [Self <: Transformers](x: Self) {
    
    inline def setTransformers(value: js.Array[OutputTransformer]): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
    
    inline def setTransformersVarargs(value: OutputTransformer*): Self = StObject.set(x, "transformers", js.Array(value :_*))
  }
}
