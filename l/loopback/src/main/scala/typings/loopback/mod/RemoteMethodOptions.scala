package typings.loopback.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @interface
  * @property {RemoteMethodArgument[]} accepts Defines arguments that the remote method accepts
  * @property {string|string[]} description Text description of the method
  * @property {RemoteHttpOptions} http The HTTP options for the remote method
  * @property {boolean} isStatic Whether the method is static (eg. `MyModel.myMethod`)
  * @property {string | string[]} notes Additional notes, used by API documentation generators like Swagger.
  * @property {RemoteMethodArgument} returns Describes the remote method's callback arguments
  */
@js.native
trait RemoteMethodOptions extends StObject {
  
  /**
    * Defines arguments that the remote method accepts. These arguments map to the static method you define. For the example above, you can see the function signature:
    Person.greet(name, age, callback)...
    `name` is the first argument, `age` is the second argument and callback is automatically provided by LoopBack (do not specify it in your `accepts` array).
    For more info, see Argument descriptions.
    Default if not provided is the empty array, [].
    {  ...
    accepts: [
    {arg: 'name', type: 'string'},
    {arg: 'age', type: 'number'},...],
    ... }
    */
  var accepts: js.UndefOr[js.Array[RemoteMethodArgument]] = js.native
  
  /**
    * Text description of the method, used by API documentation generators such as Swagger.
    You can put long strings in an array if needed (see note below).
    */
  var description: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    *
    */
  var http: js.UndefOr[RemoteHttpOptions] = js.native
  
  /**
    *
    * boolean. Whether the method is static (eg. `MyModel.myMethod`). Use `false` to define the method on the prototype (for example, `MyModel.prototype.myMethod`). Default is true.
    * default: true
    */
  var isStatic: js.UndefOr[Boolean] = js.native
  
  /**
    *
    Additional notes, used by API documentation generators like Swagger.
    You can put long strings in an array if needed (see note below).
    */
  var notes: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Describes the remote method's callback arguments; See Argument descriptions. The err argument is assumed; do not specify.
    * Default if not provided is the empty array,  [].
    * ```
    * returns: {arg: 'greeting', type: 'string'}`
    * ```
    */
  var returns: js.UndefOr[RemoteMethodArgument] = js.native
}
object RemoteMethodOptions {
  
  @scala.inline
  def apply(): RemoteMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteMethodOptions]
  }
  
  @scala.inline
  implicit class RemoteMethodOptionsMutableBuilder[Self <: RemoteMethodOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccepts(value: js.Array[RemoteMethodArgument]): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
    
    @scala.inline
    def setAcceptsVarargs(value: RemoteMethodArgument*): Self = StObject.set(x, "accepts", js.Array(value :_*))
    
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
    def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStaticUndefined: Self = StObject.set(x, "isStatic", js.undefined)
    
    @scala.inline
    def setNotes(value: String | js.Array[String]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setNotesVarargs(value: String*): Self = StObject.set(x, "notes", js.Array(value :_*))
    
    @scala.inline
    def setReturns(value: RemoteMethodArgument): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnsUndefined: Self = StObject.set(x, "returns", js.undefined)
  }
}
