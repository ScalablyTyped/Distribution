package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions1 extends StObject {
  
  val allowUnknown: Boolean = js.native
  
  val stripUnknown: Boolean = js.native
}
object Typeofoptions1 {
  
  @scala.inline
  def apply(allowUnknown: Boolean, stripUnknown: Boolean): Typeofoptions1 = {
    val __obj = js.Dynamic.literal(allowUnknown = allowUnknown.asInstanceOf[js.Any], stripUnknown = stripUnknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions1]
  }
  
  @scala.inline
  implicit class Typeofoptions1MutableBuilder[Self <: Typeofoptions1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnknown(value: Boolean): Self = StObject.set(x, "allowUnknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripUnknown(value: Boolean): Self = StObject.set(x, "stripUnknown", value.asInstanceOf[js.Any])
  }
}
