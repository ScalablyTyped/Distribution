package typings.lucene.mod

import typings.lucene.anon.Start
import typings.lucene.luceneStrings.LessthansignimplicitGreaterthansign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeTerm
  extends NodeField
     with Node {
  
  var boost: Null | Double = js.native
  
  var prefix: Null | String = js.native
  
  var quoted: Boolean = js.native
  
  var regex: Boolean = js.native
  
  var similarity: Null | Double = js.native
  
  var term: String = js.native
  
  var termLocation: Start = js.native
}
object NodeTerm {
  
  @scala.inline
  def apply(
    field: String | LessthansignimplicitGreaterthansign,
    quoted: Boolean,
    regex: Boolean,
    term: String,
    termLocation: Start
  ): NodeTerm = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], termLocation = termLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeTerm]
  }
  
  @scala.inline
  implicit class NodeTermOps[Self <: NodeTerm] (val x: Self) extends AnyVal {
    
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
    def setQuoted(value: Boolean): Self = this.set("quoted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegex(value: Boolean): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerm(value: String): Self = this.set("term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermLocation(value: Start): Self = this.set("termLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoost(value: Double): Self = this.set("boost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoostNull: Self = this.set("boost", null)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixNull: Self = this.set("prefix", null)
    
    @scala.inline
    def setSimilarity(value: Double): Self = this.set("similarity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimilarityNull: Self = this.set("similarity", null)
  }
}
