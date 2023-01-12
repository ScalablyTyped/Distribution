package typings.intlifyMessageCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node2 extends StObject {
  
  var end: Double
  
  var loc: js.UndefOr[SourceLocation] = js.undefined
  
  var start: Double
  
  var `type`: NodeTypes
}
object Node2 {
  
  inline def apply(end: Double, start: Double, `type`: NodeTypes): Node2 = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Node2] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setType(value: NodeTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
