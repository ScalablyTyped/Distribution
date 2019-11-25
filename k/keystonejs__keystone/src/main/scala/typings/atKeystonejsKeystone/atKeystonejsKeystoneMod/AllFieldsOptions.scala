package typings.atKeystonejsKeystone.atKeystonejsKeystoneMod

import typings.atKeystonejsFields.atKeystonejsFieldsMod.FieldType
import typings.atKeystonejsKeystone.Anon_Label
import typings.atKeystonejsKeystone.Anon_ResolvedData
import typings.atKeystonejsKeystone.atKeystonejsKeystoneStrings.ID
import typings.atKeystonejsKeystone.atKeystonejsKeystoneStrings.Int
import typings.atKeystonejsKeystone.atKeystonejsKeystoneStrings.lower
import typings.atKeystonejsKeystone.atKeystonejsKeystoneStrings.upper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.BaseFieldOptions
  - typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.AutoIncrementOptions
  - typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.CalendarDayOptions
  - typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.ContentOptions
  - typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.DateTimeOptions
  - typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.FileOptions
  - typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.LocationOptions
  - typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.OEmbedOptions
  - typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.PasswordOptions
  - typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.RelationshipOptions
  - typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.SelectOptions
  - typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.SlugOptions[FieldNames]
  - typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.UnsplashOptions
  - typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.UuidOptions
*/
trait AllFieldsOptions[FieldNames /* <: String */] extends js.Object

object AllFieldsOptions {
  @scala.inline
  def LocationOptions[FieldNames /* <: String */](
    googleMapsKey: String,
    `type`: FieldType,
    access: Access = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined
  ): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(googleMapsKey = googleMapsKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def FileOptions[FieldNames /* <: String */](
    `type`: FieldType,
    access: Access = null,
    adapter: js.Any = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined,
    route: String = null
  ): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (adapter != null) __obj.updateDynamic("adapter")(adapter.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def AutoIncrementOptions[FieldNames /* <: String */](
    `type`: FieldType,
    access: Access = null,
    gqlType: Int | ID = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined
  ): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (gqlType != null) __obj.updateDynamic("gqlType")(gqlType.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def DateTimeOptions[FieldNames /* <: String */](
    knexOptions: js.Any,
    `type`: FieldType,
    access: Access = null,
    format: String = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined,
    yearPickerType: String = null,
    yearRangeFrom: scala.Int | Double = null,
    yearRangeTo: scala.Int | Double = null
  ): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(knexOptions = knexOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique.asInstanceOf[js.Any])
    if (yearPickerType != null) __obj.updateDynamic("yearPickerType")(yearPickerType.asInstanceOf[js.Any])
    if (yearRangeFrom != null) __obj.updateDynamic("yearRangeFrom")(yearRangeFrom.asInstanceOf[js.Any])
    if (yearRangeTo != null) __obj.updateDynamic("yearRangeTo")(yearRangeTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def SelectOptions[FieldNames /* <: String */](
    options: String | (js.Array[Anon_Label | String]),
    `type`: FieldType,
    access: Access = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined
  ): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def UnsplashOptions[FieldNames /* <: String */](
    accessKey: String,
    secretKey: String,
    `type`: FieldType,
    access: Access = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined
  ): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def OEmbedOptions[FieldNames /* <: String */](
    adapter: js.Any,
    `type`: FieldType,
    access: Access = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined
  ): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def UuidOptions[FieldNames /* <: String */](
    caseTo: upper | lower,
    `type`: FieldType,
    access: Access = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined
  ): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(caseTo = caseTo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def SlugOptions[FieldNames /* <: String */](
    from: String,
    generate: Anon_ResolvedData[FieldNames] => String,
    `type`: FieldType,
    access: Access = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined
  ): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], generate = js.Any.fromFunction1(generate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def ContentOptions[FieldNames /* <: String */](
    blocks: js.Array[_],
    `type`: FieldType,
    access: Access = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined
  ): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def RelationshipOptions[FieldNames /* <: String */](
    many: Boolean,
    ref: String,
    `type`: FieldType,
    access: Access = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined
  ): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(many = many.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def BaseFieldOptions[FieldNames /* <: String */](
    `type`: FieldType,
    access: Access = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined
  ): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def CalendarDayOptions[FieldNames /* <: String */](
    `type`: FieldType,
    access: Access = null,
    format: String = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined,
    yearPickerType: String = null,
    yearRangeFrom: scala.Int | Double = null,
    yearRangeTo: scala.Int | Double = null
  ): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique.asInstanceOf[js.Any])
    if (yearPickerType != null) __obj.updateDynamic("yearPickerType")(yearPickerType.asInstanceOf[js.Any])
    if (yearRangeFrom != null) __obj.updateDynamic("yearRangeFrom")(yearRangeFrom.asInstanceOf[js.Any])
    if (yearRangeTo != null) __obj.updateDynamic("yearRangeTo")(yearRangeTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
  @scala.inline
  def PasswordOptions[FieldNames /* <: String */](
    minLength: Double,
    rejectCommon: Boolean,
    `type`: FieldType,
    workFactor: Double,
    access: Access = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined
  ): AllFieldsOptions[FieldNames] = {
    val __obj = js.Dynamic.literal(minLength = minLength.asInstanceOf[js.Any], rejectCommon = rejectCommon.asInstanceOf[js.Any], workFactor = workFactor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFieldsOptions[FieldNames]]
  }
}

