package typings.hapiJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectPatternOptions extends StObject {
  
  var fallthrough: js.UndefOr[Boolean] = js.undefined
  
  var matches: SchemaLike | Reference
}
object ObjectPatternOptions {
  
  @scala.inline
  def apply(): ObjectPatternOptions = {
    val __obj = js.Dynamic.literal(matches = null)
    __obj.asInstanceOf[ObjectPatternOptions]
  }
  
  @scala.inline
  implicit class ObjectPatternOptionsMutableBuilder[Self <: ObjectPatternOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFallthrough(value: Boolean): Self = StObject.set(x, "fallthrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallthroughUndefined: Self = StObject.set(x, "fallthrough", js.undefined)
    
    @scala.inline
    def setMatches(value: SchemaLike | Reference): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesNull: Self = StObject.set(x, "matches", null)
  }
}
