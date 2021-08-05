package typings.maximMazurokGapiClientDiscovery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resumable extends StObject {
  
  /** Supports the Resumable Media Upload protocol. */
  var resumable: js.UndefOr[Multipart] = js.undefined
  
  /** Supports uploading as a single HTTP request. */
  var simple: js.UndefOr[Multipart] = js.undefined
}
object Resumable {
  
  inline def apply(): Resumable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resumable]
  }
  
  extension [Self <: Resumable](x: Self) {
    
    inline def setResumable(value: Multipart): Self = StObject.set(x, "resumable", value.asInstanceOf[js.Any])
    
    inline def setResumableUndefined: Self = StObject.set(x, "resumable", js.undefined)
    
    inline def setSimple(value: Multipart): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
    
    inline def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
  }
}
