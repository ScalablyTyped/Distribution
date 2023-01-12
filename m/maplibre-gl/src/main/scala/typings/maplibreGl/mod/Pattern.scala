package typings.maplibreGl.mod

import typings.potpack.mod.PotpackBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pattern extends StObject {
  
  var bin: PotpackBox
  
  var position: ImagePosition
}
object Pattern {
  
  inline def apply(bin: PotpackBox, position: ImagePosition): Pattern = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pattern] (val x: Self) extends AnyVal {
    
    inline def setBin(value: PotpackBox): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: ImagePosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
