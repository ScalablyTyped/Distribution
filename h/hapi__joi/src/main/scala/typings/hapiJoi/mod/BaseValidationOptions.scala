package typings.hapiJoi.mod

import typings.hapiJoi.anon.Arrays
import typings.hapiJoi.hapiJoiStrings.date
import typings.hapiJoi.hapiJoiStrings.iso
import typings.hapiJoi.hapiJoiStrings.string
import typings.hapiJoi.hapiJoiStrings.time
import typings.hapiJoi.hapiJoiStrings.utc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseValidationOptions extends StObject {
  
  /**
    * when true, stops validation on the first error, otherwise returns all the errors found.
    *
    * @default true
    */
  var abortEarly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * when true, allows object to contain unknown keys which are ignored.
    *
    * @default false
    */
  var allowUnknown: js.UndefOr[Boolean] = js.undefined
  
  /**
    * when true, schema caching is enabled (for schemas with explicit caching rules).
    *
    * @default false
    */
  var cache: js.UndefOr[Boolean] = js.undefined
  
  /**
    * provides an external data set to be used in references
    */
  var context: js.UndefOr[Context] = js.undefined
  
  /**
    * when true, attempts to cast values to the required types (e.g. a string to a number).
    *
    * @default true
    */
  var convert: js.UndefOr[Boolean] = js.undefined
  
  /**
    * sets the string format used when converting dates to strings in error messages and casting.
    *
    * @default 'iso'
    */
  var dateFormat: js.UndefOr[date | iso | string | time | utc] = js.undefined
  
  /**
    * when true, valid results and throw errors are decorated with a debug property which includes an array of the validation steps used to generate the returned result.
    *
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  
  /**
    * error formatting settings.
    */
  var errors: js.UndefOr[ErrorFormattingOptions] = js.undefined
  
  /**
    * if false, the external rules set with `any.external()` are ignored, which is required to ignore any external validations in synchronous mode (or an exception is thrown).
    *
    * @default true
    */
  var externals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * when true, do not apply default values.
    *
    * @default false
    */
  var noDefaults: js.UndefOr[Boolean] = js.undefined
  
  /**
    * when true, inputs are shallow cloned to include non-enumerables properties.
    *
    * @default false
    */
  var nonEnumerables: js.UndefOr[Boolean] = js.undefined
  
  /**
    * sets the default presence requirements. Supported modes: 'optional', 'required', and 'forbidden'.
    *
    * @default 'optional'
    */
  var presence: js.UndefOr[PresenceMode] = js.undefined
  
  /**
    * when true, ignores unknown keys with a function value.
    *
    * @default false
    */
  var skipFunctions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * remove unknown elements from objects and arrays.
    * - when true, all unknown elements will be removed
    * - when an object:
    *      - objects - set to true to remove unknown keys from objects
    *
    * @default false
    */
  var stripUnknown: js.UndefOr[Boolean | Arrays] = js.undefined
}
object BaseValidationOptions {
  
  inline def apply(): BaseValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseValidationOptions]
  }
  
  extension [Self <: BaseValidationOptions](x: Self) {
    
    inline def setAbortEarly(value: Boolean): Self = StObject.set(x, "abortEarly", value.asInstanceOf[js.Any])
    
    inline def setAbortEarlyUndefined: Self = StObject.set(x, "abortEarly", js.undefined)
    
    inline def setAllowUnknown(value: Boolean): Self = StObject.set(x, "allowUnknown", value.asInstanceOf[js.Any])
    
    inline def setAllowUnknownUndefined: Self = StObject.set(x, "allowUnknown", js.undefined)
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    inline def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    inline def setDateFormat(value: date | iso | string | time | utc): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setErrors(value: ErrorFormattingOptions): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setExternals(value: Boolean): Self = StObject.set(x, "externals", value.asInstanceOf[js.Any])
    
    inline def setExternalsUndefined: Self = StObject.set(x, "externals", js.undefined)
    
    inline def setNoDefaults(value: Boolean): Self = StObject.set(x, "noDefaults", value.asInstanceOf[js.Any])
    
    inline def setNoDefaultsUndefined: Self = StObject.set(x, "noDefaults", js.undefined)
    
    inline def setNonEnumerables(value: Boolean): Self = StObject.set(x, "nonEnumerables", value.asInstanceOf[js.Any])
    
    inline def setNonEnumerablesUndefined: Self = StObject.set(x, "nonEnumerables", js.undefined)
    
    inline def setPresence(value: PresenceMode): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
    
    inline def setPresenceUndefined: Self = StObject.set(x, "presence", js.undefined)
    
    inline def setSkipFunctions(value: Boolean): Self = StObject.set(x, "skipFunctions", value.asInstanceOf[js.Any])
    
    inline def setSkipFunctionsUndefined: Self = StObject.set(x, "skipFunctions", js.undefined)
    
    inline def setStripUnknown(value: Boolean | Arrays): Self = StObject.set(x, "stripUnknown", value.asInstanceOf[js.Any])
    
    inline def setStripUnknownUndefined: Self = StObject.set(x, "stripUnknown", js.undefined)
  }
}
