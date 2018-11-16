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

