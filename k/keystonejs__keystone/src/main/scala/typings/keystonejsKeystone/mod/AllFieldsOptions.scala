package typings.keystonejsKeystone.mod

import typings.keystonejsFields.mod.FieldType
import typings.keystonejsKeystone.anon.Label
import typings.keystonejsKeystone.anon.ResolvedData
import typings.keystonejsKeystone.keystonejsKeystoneStrings.lower
import typings.keystonejsKeystone.keystonejsKeystoneStrings.upper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.keystonejsKeystone.mod.BaseFieldOptions
  - typings.keystonejsKeystone.mod.AutoIncrementOptions
  - typings.keystonejsKeystone.mod.CalendarDayOptions
  - typings.keystonejsKeystone.mod.ContentOptions
  - typings.keystonejsKeystone.mod.DateTimeOptions
  - typings.keystonejsKeystone.mod.FileOptions
  - typings.keystonejsKeystone.mod.LocationOptions
  - typings.keystonejsKeystone.mod.OEmbedOptions
  - typings.keystonejsKeystone.mod.PasswordOptions
  - typings.keystonejsKeystone.mod.RelationshipOptions
  - typings.keystonejsKeystone.mod.SelectOptions
  - typings.keystonejsKeystone.mod.SlugOptions[FieldNames]
  - typings.keystonejsKeystone.mod.UnsplashOptions
  - typings.keystonejsKeystone.mod.UuidOptions
*/
trait AllFieldsOptions[FieldNames /* <: String */] extends js.Object

object AllFieldsOptions {
  @scala.inline
  def RelationshipOptions[/* <: java.lang.String */ FieldNames](many: Boolean, ref: String, `type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(many = many.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def SelectOptions[/* <: java.lang.String */ FieldNames](options: String | (js.Array[Label | String]), `type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def UuidOptions[/* <: java.lang.String */ FieldNames](caseTo: upper | lower, `type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(caseTo = caseTo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def ContentOptions[/* <: java.lang.String */ FieldNames](blocks: js.Array[_], `type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def SlugOptions[/* <: java.lang.String */ FieldNames](from: String, generate: ResolvedData[FieldNames] => String, `type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], generate = js.Any.fromFunction1(generate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def FileOptions[/* <: java.lang.String */ FieldNames](`type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def UnsplashOptions[/* <: java.lang.String */ FieldNames](accessKey: String, secretKey: String, `type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def AutoIncrementOptions[/* <: java.lang.String */ FieldNames](`type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def LocationOptions[/* <: java.lang.String */ FieldNames](googleMapsKey: String, `type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(googleMapsKey = googleMapsKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def OEmbedOptions[/* <: java.lang.String */ FieldNames](adapter: js.Any, `type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def PasswordOptions[/* <: java.lang.String */ FieldNames](minLength: Double, rejectCommon: Boolean, `type`: FieldType, workFactor: Double): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(minLength = minLength.asInstanceOf[js.Any], rejectCommon = rejectCommon.asInstanceOf[js.Any], workFactor = workFactor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def BaseFieldOptions[/* <: java.lang.String */ FieldNames](`type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def CalendarDayOptions[/* <: java.lang.String */ FieldNames](`type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def DateTimeOptions[/* <: java.lang.String */ FieldNames](knexOptions: js.Any, `type`: FieldType): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(knexOptions = knexOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
}

