package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofoptions15 extends StObject {
  
  val allowUnknown_7: Boolean
  
  val stripUnknown_7: Boolean
}
object Typeofoptions15 {
  
  @scala.inline
  def apply(allowUnknown_7: Boolean, stripUnknown_7: Boolean): Typeofoptions15 = {
    val __obj = js.Dynamic.literal(allowUnknown_7 = allowUnknown_7.asInstanceOf[js.Any], stripUnknown_7 = stripUnknown_7.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions15]
  }
  
  @scala.inline
  implicit class Typeofoptions15MutableBuilder[Self <: Typeofoptions15] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnknown_7(value: Boolean): Self = StObject.set(x, "allowUnknown_7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripUnknown_7(value: Boolean): Self = StObject.set(x, "stripUnknown_7", value.asInstanceOf[js.Any])
  }
}
