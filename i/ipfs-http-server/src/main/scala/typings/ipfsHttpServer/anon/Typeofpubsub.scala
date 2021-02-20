package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpubsub extends StObject {
  
  val cancel: Typeofcancel = js.native
  
  val state: Typeofstate = js.native
  
  val subs: Typeofsubs = js.native
}
object Typeofpubsub {
  
  @scala.inline
  def apply(cancel: Typeofcancel, state: Typeofstate, subs: Typeofsubs): Typeofpubsub = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], subs = subs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofpubsub]
  }
  
  @scala.inline
  implicit class TypeofpubsubMutableBuilder[Self <: Typeofpubsub] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Typeofcancel): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Typeofstate): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubs(value: Typeofsubs): Self = StObject.set(x, "subs", value.asInstanceOf[js.Any])
  }
}
