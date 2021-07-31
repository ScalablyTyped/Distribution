package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomEventClickAnnotation extends StObject {
  
  /** The Google click ID. Use this field to annotate the click associated with the gclid. */
  var gclid: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#customEventClickAnnotation". */
  var kind: js.UndefOr[String] = js.undefined
}
object CustomEventClickAnnotation {
  
  @scala.inline
  def apply(): CustomEventClickAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomEventClickAnnotation]
  }
  
  @scala.inline
  implicit class CustomEventClickAnnotationMutableBuilder[Self <: CustomEventClickAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGclid(value: String): Self = StObject.set(x, "gclid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGclidUndefined: Self = StObject.set(x, "gclid", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
