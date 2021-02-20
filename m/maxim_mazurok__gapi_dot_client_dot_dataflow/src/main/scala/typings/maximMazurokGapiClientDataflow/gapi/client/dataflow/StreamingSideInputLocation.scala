package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamingSideInputLocation extends StObject {
  
  /** Identifies the state family where this side input is stored. */
  var stateFamily: js.UndefOr[String] = js.native
  
  /** Identifies the particular side input within the streaming Dataflow job. */
  var tag: js.UndefOr[String] = js.native
}
object StreamingSideInputLocation {
  
  @scala.inline
  def apply(): StreamingSideInputLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingSideInputLocation]
  }
  
  @scala.inline
  implicit class StreamingSideInputLocationMutableBuilder[Self <: StreamingSideInputLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStateFamily(value: String): Self = StObject.set(x, "stateFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateFamilyUndefined: Self = StObject.set(x, "stateFamily", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
