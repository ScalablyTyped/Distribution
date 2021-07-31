package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofoptions13 extends StObject {
  
  val allowUnknown_6: Boolean
  
  val stripUnknown_6: Boolean
}
object Typeofoptions13 {
  
  @scala.inline
  def apply(allowUnknown_6: Boolean, stripUnknown_6: Boolean): Typeofoptions13 = {
    val __obj = js.Dynamic.literal(allowUnknown_6 = allowUnknown_6.asInstanceOf[js.Any], stripUnknown_6 = stripUnknown_6.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions13]
  }
  
  @scala.inline
  implicit class Typeofoptions13MutableBuilder[Self <: Typeofoptions13] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnknown_6(value: Boolean): Self = StObject.set(x, "allowUnknown_6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripUnknown_6(value: Boolean): Self = StObject.set(x, "stripUnknown_6", value.asInstanceOf[js.Any])
  }
}
