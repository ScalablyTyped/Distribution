package typings.jqueryAjaxfile.anon

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictindex
  extends StObject
     with /* index */ NumberDictionary[Node] {
  
  var length: Double
}
object Dictindex {
  
  @scala.inline
  def apply(length: Double): Dictindex = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictindex]
  }
  
  @scala.inline
  implicit class DictindexMutableBuilder[Self <: Dictindex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
