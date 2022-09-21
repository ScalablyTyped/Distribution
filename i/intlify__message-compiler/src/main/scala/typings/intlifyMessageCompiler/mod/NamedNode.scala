package typings.intlifyMessageCompiler.mod

import typings.intlifyMessageCompiler.intlifyMessageCompilerNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedNode
  extends StObject
     with Node2
     with MessageElementNode {
  
  var key: Identifier
  
  @JSName("type")
  var type_NamedNode: `4`
}
object NamedNode {
  
  inline def apply(end: Double, key: Identifier, start: Double): NamedNode = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(4)
    __obj.asInstanceOf[NamedNode]
  }
  
  extension [Self <: NamedNode](x: Self) {
    
    inline def setKey(value: Identifier): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: `4`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
