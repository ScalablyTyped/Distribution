package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions3 extends StObject {
  
  val allowUnknown_1: Boolean = js.native
  
  val stripUnknown_1: Boolean = js.native
}
object Typeofoptions3 {
  
  @scala.inline
  def apply(allowUnknown_1: Boolean, stripUnknown_1: Boolean): Typeofoptions3 = {
    val __obj = js.Dynamic.literal(allowUnknown_1 = allowUnknown_1.asInstanceOf[js.Any], stripUnknown_1 = stripUnknown_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions3]
  }
  
  @scala.inline
  implicit class Typeofoptions3MutableBuilder[Self <: Typeofoptions3] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnknown_1(value: Boolean): Self = StObject.set(x, "allowUnknown_1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripUnknown_1(value: Boolean): Self = StObject.set(x, "stripUnknown_1", value.asInstanceOf[js.Any])
  }
}
