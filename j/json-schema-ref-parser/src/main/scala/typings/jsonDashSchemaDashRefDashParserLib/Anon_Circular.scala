package typings
package jsonDashSchemaDashRefDashParserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Circular extends js.Object {
  /**
    * Determines whether circular `$ref` pointers are handled.
    *
    * If set to `false`, then a `ReferenceError` will be thrown if the schema contains any circular references.
    *
    * If set to `"ignore"`, then circular references will simply be ignored. No error will be thrown, but the `$Refs.circular` property will still be set to `true`.
    */
  var circular: js.UndefOr[
    scala.Boolean | jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserLibStrings.ignore
  ] = js.undefined
}

