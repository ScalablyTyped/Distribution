package typings.joi.anon

import typings.joi.joiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Array extends StObject {
  
  /**
    * the characters used around array values. Defaults to `'[]'`
    *
    * @default '[]'
    */
  var array: js.UndefOr[String | `false`] = js.undefined
  
  /**
    * the characters used around `{#label}` references. Defaults to `'"'`.
    *
    * @default '"'
    */
  var label: js.UndefOr[String | `false`] = js.undefined
  
  /**
    * the characters used around array string values. Defaults to no wrapping.
    *
    * @default false
    */
  var string: js.UndefOr[String | `false`] = js.undefined
}
object Array {
  
  inline def apply(): Array = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Array]
  }
  
  extension [Self <: Array](x: Self) {
    
    inline def setArray(value: String | `false`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    inline def setLabel(value: String | `false`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setString(value: String | `false`): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
  }
}
