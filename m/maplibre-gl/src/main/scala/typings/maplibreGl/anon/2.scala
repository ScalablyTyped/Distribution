package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.move
import typings.maplibreGl.maplibreGlStrings.moveend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var `type`: move | moveend
}
object `2` {
  
  inline def apply(`type`: move | moveend): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setType(value: move | moveend): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
