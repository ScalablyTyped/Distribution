package typings.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HashPair extends Node {
  
  var key: String = js.native
  
  @JSName("type")
  var type_HashPair: typings.handlebars.handlebarsStrings.HashPair = js.native
  
  var value: Expression = js.native
}
object HashPair {
  
  @scala.inline
  def apply(
    key: String,
    loc: SourceLocation,
    `type`: typings.handlebars.handlebarsStrings.HashPair,
    value: Expression
  ): HashPair = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashPair]
  }
  
  @scala.inline
  implicit class HashPairMutableBuilder[Self <: HashPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.handlebars.handlebarsStrings.HashPair): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
