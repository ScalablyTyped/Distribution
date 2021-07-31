package typings.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hash
  extends StObject
     with Node {
  
  var pairs: js.Array[HashPair]
  
  @JSName("type")
  var type_Hash: typings.handlebars.handlebarsStrings.Hash
}
object Hash {
  
  @scala.inline
  def apply(loc: SourceLocation, pairs: js.Array[HashPair]): Hash = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Hash")
    __obj.asInstanceOf[Hash]
  }
  
  @scala.inline
  implicit class HashMutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPairs(value: js.Array[HashPair]): Self = StObject.set(x, "pairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPairsVarargs(value: HashPair*): Self = StObject.set(x, "pairs", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.handlebars.handlebarsStrings.Hash): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
