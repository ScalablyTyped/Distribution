package typings.kythe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONFact extends StObject {
  
  var fact_name: FactName = js.native
  
  var fact_value: String = js.native
  
  var source: VName = js.native
}
object JSONFact {
  
  @scala.inline
  def apply(fact_name: FactName, fact_value: String, source: VName): JSONFact = {
    val __obj = js.Dynamic.literal(fact_name = fact_name.asInstanceOf[js.Any], fact_value = fact_value.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONFact]
  }
  
  @scala.inline
  implicit class JSONFactMutableBuilder[Self <: JSONFact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFact_name(value: FactName): Self = StObject.set(x, "fact_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFact_value(value: String): Self = StObject.set(x, "fact_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: VName): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
