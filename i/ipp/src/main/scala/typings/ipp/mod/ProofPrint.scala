package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProofPrint extends StObject {
  
  var media: js.UndefOr[Media] = js.undefined
  
  var `media-col`: js.UndefOr[MediaInterface] = js.undefined
  
  var `proof-print-copies`: js.UndefOr[Double] = js.undefined
}
object ProofPrint {
  
  inline def apply(): ProofPrint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProofPrint]
  }
  
  extension [Self <: ProofPrint](x: Self) {
    
    inline def setMedia(value: Media): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def `setMedia-col`(value: MediaInterface): Self = StObject.set(x, "media-col", value.asInstanceOf[js.Any])
    
    inline def `setMedia-colUndefined`: Self = StObject.set(x, "media-col", js.undefined)
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def `setProof-print-copies`(value: Double): Self = StObject.set(x, "proof-print-copies", value.asInstanceOf[js.Any])
    
    inline def `setProof-print-copiesUndefined`: Self = StObject.set(x, "proof-print-copies", js.undefined)
  }
}
