package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofoptions7 extends StObject {
  
  val allowUnknown_3: Boolean
  
  val stripUnknown_3: Boolean
}
object Typeofoptions7 {
  
  @scala.inline
  def apply(allowUnknown_3: Boolean, stripUnknown_3: Boolean): Typeofoptions7 = {
    val __obj = js.Dynamic.literal(allowUnknown_3 = allowUnknown_3.asInstanceOf[js.Any], stripUnknown_3 = stripUnknown_3.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions7]
  }
  
  @scala.inline
  implicit class Typeofoptions7MutableBuilder[Self <: Typeofoptions7] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnknown_3(value: Boolean): Self = StObject.set(x, "allowUnknown_3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripUnknown_3(value: Boolean): Self = StObject.set(x, "stripUnknown_3", value.asInstanceOf[js.Any])
  }
}
