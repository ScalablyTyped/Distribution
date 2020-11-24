package typings.lucene.mod

import typings.lucene.luceneStrings.LessthansignimplicitGreaterthansign
import typings.lucene.luceneStrings.both
import typings.lucene.luceneStrings.left
import typings.lucene.luceneStrings.none
import typings.lucene.luceneStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeRangedTerm
  extends NodeField
     with Node {
  
  var inclusive: both | none | left | right = js.native
  
  var term_max: String = js.native
  
  var term_min: String = js.native
}
object NodeRangedTerm {
  
  @scala.inline
  def apply(
    field: String | LessthansignimplicitGreaterthansign,
    inclusive: both | none | left | right,
    term_max: String,
    term_min: String
  ): NodeRangedTerm = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], inclusive = inclusive.asInstanceOf[js.Any], term_max = term_max.asInstanceOf[js.Any], term_min = term_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeRangedTerm]
  }
  
  @scala.inline
  implicit class NodeRangedTermOps[Self <: NodeRangedTerm] (val x: Self) extends AnyVal {
    
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
    def setInclusive(value: both | none | left | right): Self = this.set("inclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerm_max(value: String): Self = this.set("term_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerm_min(value: String): Self = this.set("term_min", value.asInstanceOf[js.Any])
  }
}
