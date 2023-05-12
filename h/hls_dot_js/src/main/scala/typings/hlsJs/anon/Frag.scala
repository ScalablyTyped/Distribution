package typings.hlsJs.anon

import typings.hlsJs.mod.Fragment
import typings.hlsJs.mod.Level
import typings.hlsJs.mod.Part
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Frag extends StObject {
  
  var frag: Fragment
  
  var level: Level
  
  var part: Part | Null
}
object Frag {
  
  inline def apply(frag: Fragment, level: Level): Frag = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], part = null)
    __obj.asInstanceOf[Frag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Frag] (val x: Self) extends AnyVal {
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setPart(value: Part): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartNull: Self = StObject.set(x, "part", null)
  }
}
