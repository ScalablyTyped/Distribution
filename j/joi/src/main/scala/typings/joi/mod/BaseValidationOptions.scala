package typings.joi.mod

import typings.joi.anon.Arrays
import typings.joi.joiStrings.date
import typings.joi.joiStrings.iso
import typings.joi.joiStrings.string
import typings.joi.joiStrings.time
import typings.joi.joiStrings.utc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseValidationOptions extends js.Object {
  
  /**
    * when true, stops validation on the first error, otherwise returns all the errors found.
    *
    * @default true
    */
  var abortEarly: js.UndefOr[Boolean] = js.native
  
  /**
    * when true, allows object to contain unknown keys which are ignored.
    *
    * @default false
    */
  var allowUnknown: js.UndefOr[Boolean] = js.native
  
  /**
    * when true, schema caching is enabled (for schemas with explicit caching rules).
    *
    * @default false
    */
  var cache: js.UndefOr[Boolean] = js.native
  
  /**
    * provides an external data set to be used in references
    */
  var context: js.UndefOr[Context] = js.native
  
  /**
    * when true, attempts to cast values to the required types (e.g. a string to a number).
    *
    * @default true
    */
  var convert: js.UndefOr[Boolean] = js.native
  
  /**
    * sets the string format used when converting dates to strings in error messages and casting.
    *
    * @default 'iso'
    */
  var dateFormat: js.UndefOr[date | iso | string | time | utc] = js.native
  
  /**
    * when true, valid results and throw errors are decorated with a debug property which includes an array of the validation steps used to generate the returned result.
    *
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * error formatting settings.
    */
  var errors: js.UndefOr[ErrorFormattingOptions] = js.native
  
  /**
    * if false, the external rules set with `any.external()` are ignored, which is required to ignore any external validations in synchronous mode (or an exception is thrown).
    *
    * @default true
    */
  var externals: js.UndefOr[Boolean] = js.native
  
  /**
    * when true, do not apply default values.
    *
    * @default false
    */
  var noDefaults: js.UndefOr[Boolean] = js.native
  
  /**
    * when true, inputs are shallow cloned to include non-enumerables properties.
    *
    * @default false
    */
  var nonEnumerables: js.UndefOr[Boolean] = js.native
  
  /**
    * sets the default presence requirements. Supported modes: 'optional', 'required', and 'forbidden'.
    *
    * @default 'optional'
    */
  var presence: js.UndefOr[PresenceMode] = js.native
  
  /**
    * when true, ignores unknown keys with a function value.
    *
    * @default false
    */
  var skipFunctions: js.UndefOr[Boolean] = js.native
  
  /**
    * remove unknown elements from objects and arrays.
    * - when true, all unknown elements will be removed
    * - when an object:
    *      - objects - set to true to remove unknown keys from objects
    *
    * @default false
    */
  var stripUnknown: js.UndefOr[Boolean | Arrays] = js.native
}
object BaseValidationOptions {
  
  @scala.inline
  def apply(): BaseValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseValidationOptions]
  }
  
  @scala.inline
  implicit class BaseValidationOptionsOps[Self <: BaseValidationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbortEarly(value: Boolean): Self = this.set("abortEarly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortEarly: Self = this.set("abortEarly", js.undefined)
    
    @scala.inline
    def setAllowUnknown(value: Boolean): Self = this.set("allowUnknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnknown: Self = this.set("allowUnknown", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setContext(value: Context): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setConvert(value: Boolean): Self = this.set("convert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvert: Self = this.set("convert", js.undefined)
    
    @scala.inline
    def setDateFormat(value: date | iso | string | time | utc): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setErrors(value: ErrorFormattingOptions): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setExternals(value: Boolean): Self = this.set("externals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternals: Self = this.set("externals", js.undefined)
    
    @scala.inline
    def setNoDefaults(value: Boolean): Self = this.set("noDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDefaults: Self = this.set("noDefaults", js.undefined)
    
    @scala.inline
    def setNonEnumerables(value: Boolean): Self = this.set("nonEnumerables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonEnumerables: Self = this.set("nonEnumerables", js.undefined)
    
    @scala.inline
    def setPresence(value: PresenceMode): Self = this.set("presence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresence: Self = this.set("presence", js.undefined)
    
    @scala.inline
    def setSkipFunctions(value: Boolean): Self = this.set("skipFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipFunctions: Self = this.set("skipFunctions", js.undefined)
    
    @scala.inline
    def setStripUnknown(value: Boolean | Arrays): Self = this.set("stripUnknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripUnknown: Self = this.set("stripUnknown", js.undefined)
  }
}
