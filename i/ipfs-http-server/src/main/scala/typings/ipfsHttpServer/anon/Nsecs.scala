package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nsecs extends StObject {
  
  var nsecs: js.Any = js.native
  
  var secs: js.Any = js.native
}
object Nsecs {
  
  @scala.inline
  def apply(nsecs: js.Any, secs: js.Any): Nsecs = {
    val __obj = js.Dynamic.literal(nsecs = nsecs.asInstanceOf[js.Any], secs = secs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nsecs]
  }
  
  @scala.inline
  implicit class NsecsMutableBuilder[Self <: Nsecs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNsecs(value: js.Any): Self = StObject.set(x, "nsecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecs(value: js.Any): Self = StObject.set(x, "secs", value.asInstanceOf[js.Any])
  }
}
