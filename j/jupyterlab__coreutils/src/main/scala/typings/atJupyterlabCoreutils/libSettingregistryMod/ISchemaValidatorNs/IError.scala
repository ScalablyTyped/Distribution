package typings.atJupyterlabCoreutils.libSettingregistryMod.ISchemaValidatorNs

import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
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
  var dataPath: String
  /**
    * The keyword whose validation failed.
    */
  var keyword: String
  /**
    * The error message.
    */
  var message: String
  /**
    * Optional parameter metadata that might be included in an error.
    */
  var params: js.UndefOr[ReadonlyJSONObject] = js.undefined
  /**
    * The path in the schema where the error occurred.
    */
  var schemaPath: String
}

object IError {
  @scala.inline
  def apply(
    dataPath: String,
    keyword: String,
    message: String,
    schemaPath: String,
    params: ReadonlyJSONObject = null
  ): IError = {
    val __obj = js.Dynamic.literal(dataPath = dataPath, keyword = keyword, message = message, schemaPath = schemaPath)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[IError]
  }
}

