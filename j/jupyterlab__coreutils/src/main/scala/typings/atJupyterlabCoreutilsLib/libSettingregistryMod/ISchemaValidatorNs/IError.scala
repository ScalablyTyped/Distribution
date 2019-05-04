package typings
package atJupyterlabCoreutilsLib.libSettingregistryMod.ISchemaValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A schema validation error definition.
  */
trait IError extends js.Object {
  /**
    * The path in the data where the error occurred.
    */
  var dataPath: java.lang.String
  /**
    * The keyword whose validation failed.
    */
  var keyword: java.lang.String
  /**
    * The error message.
    */
  var message: java.lang.String
  /**
    * Optional parameter metadata that might be included in an error.
    */
  var params: js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject] = js.undefined
  /**
    * The path in the schema where the error occurred.
    */
  var schemaPath: java.lang.String
}

object IError {
  @scala.inline
  def apply(
    dataPath: java.lang.String,
    keyword: java.lang.String,
    message: java.lang.String,
    schemaPath: java.lang.String,
    params: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject = null
  ): IError = {
    val __obj = js.Dynamic.literal(dataPath = dataPath, keyword = keyword, message = message, schemaPath = schemaPath)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[IError]
  }
}

