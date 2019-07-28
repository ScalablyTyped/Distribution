package typings.loopback.loopbackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @interface
  * @property {RemoteMethodArgument[]} accepts Defines arguments that the remote method accepts
  * @property {string|string[]} description Text description of the method
  * @property {RemoteHttpOptions} http The HTTP options for the remote method
  * @property {boolean} isStatic Whether the method is static (eg. `MyModel.myMethod`)
  * @property {string | string[]} notes Additional notes, used by API documentation generators like Swagger.
  * @property {RemoteMethodArgument} returns Describes the remote method's callback arguments
  */
trait RemoteMethodOptions extends js.Object {
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
  var accepts: js.UndefOr[js.Array[RemoteMethodArgument]] = js.undefined
  /**
    * Text description of the method, used by API documentation generators such as Swagger.
    You can put long strings in an array if needed (see note below).
    */
  var description: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    *
    */
  var http: js.UndefOr[RemoteHttpOptions] = js.undefined
  /**
    *
    * boolean. Whether the method is static (eg. `MyModel.myMethod`). Use `false` to define the method on the prototype (for example, `MyModel.prototype.myMethod`). Default is true.
    * default: true
    */
  var isStatic: js.UndefOr[Boolean] = js.undefined
  /**
    *
    Additional notes, used by API documentation generators like Swagger.
    You can put long strings in an array if needed (see note below).
    */
  var notes: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Describes the remote method's callback arguments; See Argument descriptions. The err argument is assumed; do not specify.
    * Default if not provided is the empty array,  [].
    * ```
    * returns: {arg: 'greeting', type: 'string'}`
    * ```
    */
  var returns: js.UndefOr[RemoteMethodArgument] = js.undefined
}

object RemoteMethodOptions {
  @scala.inline
  def apply(
    accepts: js.Array[RemoteMethodArgument] = null,
    description: String | js.Array[String] = null,
    http: RemoteHttpOptions = null,
    isStatic: js.UndefOr[Boolean] = js.undefined,
    notes: String | js.Array[String] = null,
    returns: RemoteMethodArgument = null
  ): RemoteMethodOptions = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(accepts)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (http != null) __obj.updateDynamic("http")(http)
    if (!js.isUndefined(isStatic)) __obj.updateDynamic("isStatic")(isStatic)
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (returns != null) __obj.updateDynamic("returns")(returns)
    __obj.asInstanceOf[RemoteMethodOptions]
  }
}

