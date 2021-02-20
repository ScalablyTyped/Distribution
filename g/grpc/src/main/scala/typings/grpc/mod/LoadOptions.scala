package typings.grpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadOptions extends StObject {
  
  /**
    * Deserialize bytes values as base64 strings instead of Buffers.
    * Defaults to `false`.
    */
  var binaryAsBase64: js.UndefOr[Boolean] = js.native
  
  /**
    * Load this file with field names in camel case instead of their original case.
    * Defaults to `false`.
    */
  var convertFieldsToCamelCase: js.UndefOr[Boolean] = js.native
  
  /**
    * Use the beta method argument order for client methods, with optional
    * arguments after the callback. This option is only a temporary stopgap
    * measure to smooth an API breakage. It is deprecated, and new code
    * should not use it.
    * Defaults to `false`
    */
  var deprecatedArgumentOrder: js.UndefOr[Boolean] = js.native
  
  /**
    * Deserialize long values as strings instead of objects.
    * Defaults to `true`.
    */
  var longsAsStrings: js.UndefOr[Boolean] = js.native
}
object LoadOptions {
  
  @scala.inline
  def apply(): LoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadOptions]
  }
  
  @scala.inline
  implicit class LoadOptionsMutableBuilder[Self <: LoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinaryAsBase64(value: Boolean): Self = StObject.set(x, "binaryAsBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryAsBase64Undefined: Self = StObject.set(x, "binaryAsBase64", js.undefined)
    
    @scala.inline
    def setConvertFieldsToCamelCase(value: Boolean): Self = StObject.set(x, "convertFieldsToCamelCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertFieldsToCamelCaseUndefined: Self = StObject.set(x, "convertFieldsToCamelCase", js.undefined)
    
    @scala.inline
    def setDeprecatedArgumentOrder(value: Boolean): Self = StObject.set(x, "deprecatedArgumentOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedArgumentOrderUndefined: Self = StObject.set(x, "deprecatedArgumentOrder", js.undefined)
    
    @scala.inline
    def setLongsAsStrings(value: Boolean): Self = StObject.set(x, "longsAsStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongsAsStringsUndefined: Self = StObject.set(x, "longsAsStrings", js.undefined)
  }
}
