package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofoptions11 extends StObject {
  
  val allowUnknown_5: Boolean
  
  val stripUnknown_5: Boolean
}
object Typeofoptions11 {
  
  @scala.inline
  def apply(allowUnknown_5: Boolean, stripUnknown_5: Boolean): Typeofoptions11 = {
    val __obj = js.Dynamic.literal(allowUnknown_5 = allowUnknown_5.asInstanceOf[js.Any], stripUnknown_5 = stripUnknown_5.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions11]
  }
  
  @scala.inline
  implicit class Typeofoptions11MutableBuilder[Self <: Typeofoptions11] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnknown_5(value: Boolean): Self = StObject.set(x, "allowUnknown_5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripUnknown_5(value: Boolean): Self = StObject.set(x, "stripUnknown_5", value.asInstanceOf[js.Any])
  }
}
