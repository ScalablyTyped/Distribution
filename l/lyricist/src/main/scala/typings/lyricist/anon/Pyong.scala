package typings.lyricist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pyong extends StObject {
  
  var pyong: Boolean
}
object Pyong {
  
  inline def apply(pyong: Boolean): Pyong = {
    val __obj = js.Dynamic.literal(pyong = pyong.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pyong]
  }
  
  extension [Self <: Pyong](x: Self) {
    
    inline def setPyong(value: Boolean): Self = StObject.set(x, "pyong", value.asInstanceOf[js.Any])
  }
}
