package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailureTrace extends StObject {
  
  var frames: js.UndefOr[js.Array[Frame]] = js.native
}
object FailureTrace {
  
  @scala.inline
  def apply(): FailureTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureTrace]
  }
  
  @scala.inline
  implicit class FailureTraceMutableBuilder[Self <: FailureTrace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrames(value: js.Array[Frame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    @scala.inline
    def setFramesVarargs(value: Frame*): Self = StObject.set(x, "frames", js.Array(value :_*))
  }
}
