package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteV1ApiCompatV1Action extends StObject {
  
  /** Confirmation dialog config. */
  var confirm: js.UndefOr[AppsDynamiteV1ApiCompatV1ActionConfirm] = js.undefined
  
  /** Unique identifier for this action. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Button style ("default", "primary", or "danger"). */
  var style: js.UndefOr[String] = js.undefined
  
  /** User-facing label for the action. */
  var text: js.UndefOr[String] = js.undefined
  
  /** Action type - currently only "button". */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Payload for this action. Will be sent to the action handler along with name. */
  var value: js.UndefOr[String] = js.undefined
}
object AppsDynamiteV1ApiCompatV1Action {
  
  inline def apply(): AppsDynamiteV1ApiCompatV1Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteV1ApiCompatV1Action]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteV1ApiCompatV1Action] (val x: Self) extends AnyVal {
    
    inline def setConfirm(value: AppsDynamiteV1ApiCompatV1ActionConfirm): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
