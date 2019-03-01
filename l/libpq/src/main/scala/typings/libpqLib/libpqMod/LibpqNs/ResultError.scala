package typings
package libpqLib.libpqMod.LibpqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultError extends js.Object {
  var constraintName: js.UndefOr[java.lang.String] = js.undefined
  var context: js.UndefOr[java.lang.String] = js.undefined
  var dataTypeName: js.UndefOr[java.lang.String] = js.undefined
  var internalPosition: js.UndefOr[java.lang.String] = js.undefined
  var internalQuery: js.UndefOr[java.lang.String] = js.undefined
  var messageDetail: js.UndefOr[java.lang.String] = js.undefined
  var messageHint: js.UndefOr[java.lang.String] = js.undefined
  var messagePrimary: java.lang.String
  var schemaName: js.UndefOr[java.lang.String] = js.undefined
  var severity: java.lang.String
  var sourceFile: java.lang.String
  var sourceFunction: java.lang.String
  var sourceLine: java.lang.String
  var sqlState: java.lang.String
  var statementPosition: js.UndefOr[java.lang.String] = js.undefined
  var tableName: js.UndefOr[java.lang.String] = js.undefined
}

object ResultError {
  @scala.inline
  def apply(
    messagePrimary: java.lang.String,
    severity: java.lang.String,
    sourceFile: java.lang.String,
    sourceFunction: java.lang.String,
    sourceLine: java.lang.String,
    sqlState: java.lang.String,
    constraintName: java.lang.String = null,
    context: java.lang.String = null,
    dataTypeName: java.lang.String = null,
    internalPosition: java.lang.String = null,
    internalQuery: java.lang.String = null,
    messageDetail: java.lang.String = null,
    messageHint: java.lang.String = null,
    schemaName: java.lang.String = null,
    statementPosition: java.lang.String = null,
    tableName: java.lang.String = null
  ): ResultError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("messagePrimary")(messagePrimary)
    __obj.updateDynamic("severity")(severity)
    __obj.updateDynamic("sourceFile")(sourceFile)
    __obj.updateDynamic("sourceFunction")(sourceFunction)
    __obj.updateDynamic("sourceLine")(sourceLine)
    __obj.updateDynamic("sqlState")(sqlState)
    if (constraintName != null) __obj.updateDynamic("constraintName")(constraintName)
    if (context != null) __obj.updateDynamic("context")(context)
    if (dataTypeName != null) __obj.updateDynamic("dataTypeName")(dataTypeName)
    if (internalPosition != null) __obj.updateDynamic("internalPosition")(internalPosition)
    if (internalQuery != null) __obj.updateDynamic("internalQuery")(internalQuery)
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail)
    if (messageHint != null) __obj.updateDynamic("messageHint")(messageHint)
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName)
    if (statementPosition != null) __obj.updateDynamic("statementPosition")(statementPosition)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    __obj.asInstanceOf[ResultError]
  }
}

