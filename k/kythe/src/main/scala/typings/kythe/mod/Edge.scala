package typings.kythe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edge extends Entry {
  
  var kind: String = js.native
  
  var target: VName = js.native
}
object Edge {
  
  @scala.inline
  def apply(kind: String, label: String, source: VName, target: VName): Edge = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
  
  @scala.inline
  implicit class EdgeMutableBuilder[Self <: Edge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: VName): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
