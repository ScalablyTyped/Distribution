package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeqMapTaskOutputInfo extends StObject {
  
  /** The sink to write the output value to. */
  var sink: js.UndefOr[Sink] = js.undefined
  
  /** The id of the TupleTag the user code will tag the output value by. */
  var tag: js.UndefOr[String] = js.undefined
}
object SeqMapTaskOutputInfo {
  
  inline def apply(): SeqMapTaskOutputInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeqMapTaskOutputInfo]
  }
  
  extension [Self <: SeqMapTaskOutputInfo](x: Self) {
    
    inline def setSink(value: Sink): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
    
    inline def setSinkUndefined: Self = StObject.set(x, "sink", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
