package typings.loopback.mod

import typings.loopback.loopbackStrings.Array
import typings.loopback.loopbackStrings.Buffer
import typings.loopback.loopbackStrings.Date
import typings.loopback.loopbackStrings.GeoPoint
import typings.loopback.loopbackStrings.Number
import typings.loopback.loopbackStrings.Object
import typings.loopback.loopbackStrings.`null`
import typings.loopback.loopbackStrings.any
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
trait RemoteMethodArgument extends js.Object {
  
  /**
    *     Argument name
    */
  var arg: String = js.native
  
  /**
    *    Default value that will be used to populate loopback-explorer input fields and swagger documentation.
    *    Note: This value will not be passed into remote methods function if argument is not present.
    */
  var default: js.UndefOr[String] = js.native
  
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
  implicit class RemoteMethodArgumentOps[Self <: RemoteMethodArgument] (val x: Self) extends AnyVal {
    
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
    def setArg(value: String): Self = this.set("arg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: any | Array | typings.loopback.loopbackStrings.Boolean | Buffer | Date | GeoPoint | `null` | Number | Object | typings.loopback.loopbackStrings.String
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDescriptionVarargs(value: String*): Self = this.set("description", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String | js.Array[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setHttp(value: RemoteHttpOptions): Self = this.set("http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setRoot(value: Boolean): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
