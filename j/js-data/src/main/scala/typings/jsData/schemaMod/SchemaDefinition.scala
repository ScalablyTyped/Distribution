package typings.jsData.schemaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDefinition extends js.Object {
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.native
  var additionalProperties: js.UndefOr[js.Any] = js.native
  var description: js.UndefOr[String] = js.native
  var `extends`: js.UndefOr[SchemaDefinition | Schema] = js.native
  var items: js.UndefOr[SchemaDefinition | Schema] = js.native
  var properties: js.UndefOr[StringDictionary[PropertyDefinition | js.Any]] = js.native
  var required: js.UndefOr[js.Array[String]] = js.native
  var title: js.UndefOr[String] = js.native
  var track: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
}

