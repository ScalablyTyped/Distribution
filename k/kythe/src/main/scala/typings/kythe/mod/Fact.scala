package typings.kythe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fact extends Entry {
  
  var value: String = js.native
}
object Fact {
  
  @scala.inline
  def apply(label: String, source: VName, value: String): Fact = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fact]
  }
  
  @scala.inline
  implicit class FactMutableBuilder[Self <: Fact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
