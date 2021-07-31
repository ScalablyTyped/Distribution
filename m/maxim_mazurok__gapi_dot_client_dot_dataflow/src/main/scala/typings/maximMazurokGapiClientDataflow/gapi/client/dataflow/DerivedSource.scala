package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DerivedSource extends StObject {
  
  /** What source to base the produced source on (if any). */
  var derivationMode: js.UndefOr[String] = js.undefined
  
  /** Specification of the source. */
  var source: js.UndefOr[Source] = js.undefined
}
object DerivedSource {
  
  @scala.inline
  def apply(): DerivedSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DerivedSource]
  }
  
  @scala.inline
  implicit class DerivedSourceMutableBuilder[Self <: DerivedSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDerivationMode(value: String): Self = StObject.set(x, "derivationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDerivationModeUndefined: Self = StObject.set(x, "derivationMode", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
