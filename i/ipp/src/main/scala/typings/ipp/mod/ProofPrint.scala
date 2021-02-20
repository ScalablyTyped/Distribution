package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProofPrint extends StObject {
  
  var media: js.UndefOr[Media] = js.native
  
  var `media-col`: js.UndefOr[MediaInterface] = js.native
  
  var `proof-print-copies`: js.UndefOr[Double] = js.native
}
object ProofPrint {
  
  @scala.inline
  def apply(): ProofPrint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProofPrint]
  }
  
  @scala.inline
  implicit class ProofPrintMutableBuilder[Self <: ProofPrint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMedia(value: Media): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMedia-col`(value: MediaInterface): Self = StObject.set(x, "media-col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMedia-colUndefined`: Self = StObject.set(x, "media-col", js.undefined)
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def `setProof-print-copies`(value: Double): Self = StObject.set(x, "proof-print-copies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setProof-print-copiesUndefined`: Self = StObject.set(x, "proof-print-copies", js.undefined)
  }
}
