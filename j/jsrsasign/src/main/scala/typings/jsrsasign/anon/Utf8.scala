package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utf8 extends StObject {
  
  var utf8: String = js.native
}
object Utf8 {
  
  @scala.inline
  def apply(utf8: String): Utf8 = {
    val __obj = js.Dynamic.literal(utf8 = utf8.asInstanceOf[js.Any])
    __obj.asInstanceOf[Utf8]
  }
  
  @scala.inline
  implicit class Utf8MutableBuilder[Self <: Utf8] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUtf8(value: String): Self = StObject.set(x, "utf8", value.asInstanceOf[js.Any])
  }
}
