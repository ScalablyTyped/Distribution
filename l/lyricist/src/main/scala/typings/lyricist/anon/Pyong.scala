package typings.lyricist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pyong extends StObject {
  
  var pyong: Boolean = js.native
}
object Pyong {
  
  @scala.inline
  def apply(pyong: Boolean): Pyong = {
    val __obj = js.Dynamic.literal(pyong = pyong.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pyong]
  }
  
  @scala.inline
  implicit class PyongMutableBuilder[Self <: Pyong] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPyong(value: Boolean): Self = StObject.set(x, "pyong", value.asInstanceOf[js.Any])
  }
}
