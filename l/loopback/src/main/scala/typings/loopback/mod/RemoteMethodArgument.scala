package typings.loopback.mod

import typings.loopback.loopbackStrings.Array
import typings.loopback.loopbackStrings.Buffer
import typings.loopback.loopbackStrings.Date
import typings.loopback.loopbackStrings.GeoPoint
import typings.loopback.loopbackStrings.Number
import typings.loopback.loopbackStrings.Object
import typings.loopback.loopbackStrings.`null`
import typings.loopback.loopbackStrings.any
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @interface
  * @property {string} arg    Argument name
  * @property {string | string[]} description A text description of the argument.
  * @property {any} http http    Object or Function    For input arguments: a function or an object describing mapping from HTTP request to the argument value.
  * @property {boolean} required    True if argument is required; false otherwise.
  * @property {boolean} root For callback arguments: set this property to true if your function has a single callback argument. Otherwise the root object returned is an object
  * @property {"any" | "Array" | "Boolean" | "Buffer" | "Date" | "GeoPoint" | "null" | "Number" | "Object" | "String"} type
  * @property {string} default Default value that will be used to populate loopback-explorer input fields and swagger documentation
  */
@js.native
trait RemoteMethodArgument extends StObject {
  
  /**
    *    Default value that will be used to populate loopback-explorer input fields and swagger documentation.
    *    Note: This value will not be passed into remote methods function if argument is not present.
    */
  var default: js.UndefOr[String] = js.native
  
  /**
    *     Argument name
    */
  var arg: String = js.native
  
  /**
    * A text description of the argument. This is used by API documentation generators like Swagger.
    You can split long descriptions into arrays of strings (lines) to keep line lengths manageable.
    ```
    [
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit,"
    "sed do eiusmod tempor incididunt ut labore et dolore",
    "magna aliqua."
    ]
    ```
    */
  var description: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * http    Object or Function    For input arguments: a function or an object describing mapping from HTTP request to the argument value. See HTTP mapping of input arguments below.
    * http.target
    * Map the callback argument value to the HTTP response object. The following values are supported.
    * * status sets the res.statusCode to the provided value
    * * header sets the http.header or arg named header to the value
    */
  var http: js.UndefOr[RemoteHttpOptions] = js.native
  
  /**
    *     True if argument is required; false otherwise.
    */
  var required: js.UndefOr[Boolean] = js.native
  
  /**
    *     For callback arguments: set this property to true if your function has a single callback argument to use as the root object returned to remote caller.
    *    Otherwise the root object returned is a map (argument-name to argument-value).
    */
  var root: js.UndefOr[Boolean] = js.native
  
  /**
    *     Argument datatype; must be a Loopback type. Additionally, callback arguments allow a special type "file"; see below.
    */
  var `type`: any | Array | typings.loopback.loopbackStrings.Boolean | Buffer | Date | GeoPoint | `null` | Number | Object | typings.loopback.loopbackStrings.String = js.native
}
object RemoteMethodArgument {
  
  @scala.inline
  def apply(
    arg: String,
    `type`: any | Array | typings.loopback.loopbackStrings.Boolean | Buffer | Date | GeoPoint | `null` | Number | Object | typings.loopback.loopbackStrings.String
  ): RemoteMethodArgument = {
    val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteMethodArgument]
  }
  
  @scala.inline
  implicit class RemoteMethodArgumentMutableBuilder[Self <: RemoteMethodArgument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArg(value: String): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setDescription(value: String | js.Array[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDescriptionVarargs(value: String*): Self = StObject.set(x, "description", js.Array(value :_*))
    
    @scala.inline
    def setHttp(value: RemoteHttpOptions): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setType(
      value: any | Array | typings.loopback.loopbackStrings.Boolean | Buffer | Date | GeoPoint | `null` | Number | Object | typings.loopback.loopbackStrings.String
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
