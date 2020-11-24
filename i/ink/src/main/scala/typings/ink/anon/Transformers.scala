package typings.ink.anon

import typings.ink.renderNodeToOutputMod.OutputTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transformers extends js.Object {
  
  var transformers: js.Array[OutputTransformer] = js.native
}
object Transformers {
  
  @scala.inline
  def apply(transformers: js.Array[OutputTransformer]): Transformers = {
    val __obj = js.Dynamic.literal(transformers = transformers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transformers]
  }
  
  @scala.inline
  implicit class TransformersOps[Self <: Transformers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTransformersVarargs(value: OutputTransformer*): Self = this.set("transformers", js.Array(value :_*))
    
    @scala.inline
    def setTransformers(value: js.Array[OutputTransformer]): Self = this.set("transformers", value.asInstanceOf[js.Any])
  }
}
