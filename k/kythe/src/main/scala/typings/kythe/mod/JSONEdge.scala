package typings.kythe.mod

import typings.kythe.kytheStrings.Slash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONEdge extends StObject {
  
  var edge_kind: EdgeKind | OrdinalEdge = js.native
  
  var fact_name: Slash = js.native
  
  var source: VName = js.native
  
  var target: VName = js.native
}
object JSONEdge {
  
  @scala.inline
  def apply(edge_kind: EdgeKind | OrdinalEdge, fact_name: Slash, source: VName, target: VName): JSONEdge = {
    val __obj = js.Dynamic.literal(edge_kind = edge_kind.asInstanceOf[js.Any], fact_name = fact_name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEdge]
  }
  
  @scala.inline
  implicit class JSONEdgeMutableBuilder[Self <: JSONEdge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdge_kind(value: EdgeKind | OrdinalEdge): Self = StObject.set(x, "edge_kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFact_name(value: Slash): Self = StObject.set(x, "fact_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: VName): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: VName): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
