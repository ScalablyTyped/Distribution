package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedDateTimePicker extends StObject {
  
  /** The label for the field that displays to the user. */
  var label: js.UndefOr[String] = js.undefined
  
  /** The name of the text input that's used in formInput, and uniquely identifies this input. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Triggered when the user clicks Save or Clear from the date/time picker dialog. This is only triggered if the value changed as a result of the Save/Clear operation. */
  var onChangeAction: js.UndefOr[AppsDynamiteSharedAction] = js.undefined
  
  /**
    * The number representing the time zone offset from UTC, in minutes. If set, the `value_ms_epoch` is displayed in the specified time zone. If not set, it uses the user's time zone
    * setting on the client side.
    */
  var timezoneOffsetDate: js.UndefOr[Double] = js.undefined
  
  /** The type of the date/time picker. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The value to display as the default value before user input or previous user input. It is represented in milliseconds (Epoch time). For `DATE_AND_TIME` type, the full epoch value is
    * used. For `DATE_ONLY` type, only date of the epoch time is used. For `TIME_ONLY` type, only time of the epoch time is used. For example, you can set epoch time to `3 * 60 * 60 *
    * 1000` to represent 3am.
    */
  var valueMsEpoch: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedDateTimePicker {
  
  inline def apply(): AppsDynamiteSharedDateTimePicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedDateTimePicker]
  }
  
  extension [Self <: AppsDynamiteSharedDateTimePicker](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChangeAction(value: AppsDynamiteSharedAction): Self = StObject.set(x, "onChangeAction", value.asInstanceOf[js.Any])
    
    inline def setOnChangeActionUndefined: Self = StObject.set(x, "onChangeAction", js.undefined)
    
    inline def setTimezoneOffsetDate(value: Double): Self = StObject.set(x, "timezoneOffsetDate", value.asInstanceOf[js.Any])
    
    inline def setTimezoneOffsetDateUndefined: Self = StObject.set(x, "timezoneOffsetDate", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValueMsEpoch(value: String): Self = StObject.set(x, "valueMsEpoch", value.asInstanceOf[js.Any])
    
    inline def setValueMsEpochUndefined: Self = StObject.set(x, "valueMsEpoch", js.undefined)
  }
}
