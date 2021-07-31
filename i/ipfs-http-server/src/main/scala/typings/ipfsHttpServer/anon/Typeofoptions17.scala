package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofoptions17 extends StObject {
  
  val allowUnknown_8: Boolean
  
  val stripUnknown_8: Boolean
}
object Typeofoptions17 {
  
  @scala.inline
  def apply(allowUnknown_8: Boolean, stripUnknown_8: Boolean): Typeofoptions17 = {
    val __obj = js.Dynamic.literal(allowUnknown_8 = allowUnknown_8.asInstanceOf[js.Any], stripUnknown_8 = stripUnknown_8.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions17]
  }
  
  @scala.inline
  implicit class Typeofoptions17MutableBuilder[Self <: Typeofoptions17] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnknown_8(value: Boolean): Self = StObject.set(x, "allowUnknown_8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripUnknown_8(value: Boolean): Self = StObject.set(x, "stripUnknown_8", value.asInstanceOf[js.Any])
  }
}
