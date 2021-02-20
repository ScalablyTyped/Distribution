package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions19 extends StObject {
  
  val allowUnknown_9: Boolean = js.native
  
  val stripUnknown_9: Boolean = js.native
}
object Typeofoptions19 {
  
  @scala.inline
  def apply(allowUnknown_9: Boolean, stripUnknown_9: Boolean): Typeofoptions19 = {
    val __obj = js.Dynamic.literal(allowUnknown_9 = allowUnknown_9.asInstanceOf[js.Any], stripUnknown_9 = stripUnknown_9.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions19]
  }
  
  @scala.inline
  implicit class Typeofoptions19MutableBuilder[Self <: Typeofoptions19] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnknown_9(value: Boolean): Self = StObject.set(x, "allowUnknown_9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripUnknown_9(value: Boolean): Self = StObject.set(x, "stripUnknown_9", value.asInstanceOf[js.Any])
  }
}
