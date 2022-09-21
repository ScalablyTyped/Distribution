package typings.intlifyMessageCompiler.mod

import typings.intlifyMessageCompiler.intlifyMessageCompilerNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceNode
  extends StObject
     with Node2 {
  
  var body: MessageNode | PluralNode
  
  var helpers: js.UndefOr[js.Array[String]] = js.undefined
  
  @JSName("type")
  var type_ResourceNode: `0`
}
object ResourceNode {
  
  inline def apply(body: MessageNode | PluralNode, end: Double, start: Double): ResourceNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0)
    __obj.asInstanceOf[ResourceNode]
  }
  
  extension [Self <: ResourceNode](x: Self) {
    
    inline def setBody(value: MessageNode | PluralNode): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHelpers(value: js.Array[String]): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
    
    inline def setHelpersUndefined: Self = StObject.set(x, "helpers", js.undefined)
    
    inline def setHelpersVarargs(value: String*): Self = StObject.set(x, "helpers", js.Array(value*))
    
    inline def setType(value: `0`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
