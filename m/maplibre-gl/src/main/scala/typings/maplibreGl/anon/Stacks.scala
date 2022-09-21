package typings.maplibreGl.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stacks extends StObject {
  
  var stacks: StringDictionary[js.Array[Double]]
}
object Stacks {
  
  inline def apply(stacks: StringDictionary[js.Array[Double]]): Stacks = {
    val __obj = js.Dynamic.literal(stacks = stacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stacks]
  }
  
  extension [Self <: Stacks](x: Self) {
    
    inline def setStacks(value: StringDictionary[js.Array[Double]]): Self = StObject.set(x, "stacks", value.asInstanceOf[js.Any])
  }
}
