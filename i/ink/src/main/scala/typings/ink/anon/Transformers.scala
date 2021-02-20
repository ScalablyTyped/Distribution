package typings.ink.anon

import typings.ink.renderNodeToOutputMod.OutputTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transformers extends StObject {
  
  var transformers: js.Array[OutputTransformer] = js.native
}
object Transformers {
  
  @scala.inline
  def apply(transformers: js.Array[OutputTransformer]): Transformers = {
    val __obj = js.Dynamic.literal(transformers = transformers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transformers]
  }
  
  @scala.inline
  implicit class TransformersMutableBuilder[Self <: Transformers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransformers(value: js.Array[OutputTransformer]): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformersVarargs(value: OutputTransformer*): Self = StObject.set(x, "transformers", js.Array(value :_*))
  }
}
