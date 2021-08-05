package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceSplitShard extends StObject {
  
  /** DEPRECATED */
  var derivationMode: js.UndefOr[String] = js.undefined
  
  /** DEPRECATED */
  var source: js.UndefOr[Source] = js.undefined
}
object SourceSplitShard {
  
  inline def apply(): SourceSplitShard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSplitShard]
  }
  
  extension [Self <: SourceSplitShard](x: Self) {
    
    inline def setDerivationMode(value: String): Self = StObject.set(x, "derivationMode", value.asInstanceOf[js.Any])
    
    inline def setDerivationModeUndefined: Self = StObject.set(x, "derivationMode", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
