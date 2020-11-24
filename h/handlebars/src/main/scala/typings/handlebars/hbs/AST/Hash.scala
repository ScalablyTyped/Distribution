package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hash extends Node {
  
  var pairs: js.Array[HashPair] = js.native
  
  @JSName("type")
  var type_Hash: typings.handlebars.handlebarsStrings.Hash = js.native
}
object Hash {
  
  @scala.inline
  def apply(loc: SourceLocation, pairs: js.Array[HashPair], `type`: typings.handlebars.handlebarsStrings.Hash): Hash = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
  
  @scala.inline
  implicit class HashOps[Self <: Hash] (val x: Self) extends AnyVal {
    
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
    def setPairsVarargs(value: HashPair*): Self = this.set("pairs", js.Array(value :_*))
    
    @scala.inline
    def setPairs(value: js.Array[HashPair]): Self = this.set("pairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.handlebars.handlebarsStrings.Hash): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
