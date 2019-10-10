package typings.atHapiJoi.atHapiJoiMod

import typings.atHapiJoi.Anon_Build
import typings.atHapiJoi.Anon_FromHelpers
import typings.std.Record
import typings.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extension extends js.Object {
  var args: js.UndefOr[js.Function1[/* repeated */ SchemaLike, Schema]] = js.undefined
  var base: js.UndefOr[Schema] = js.undefined
  /**
    * undocumented options
    */
  var cast: js.UndefOr[Record[String, Anon_FromHelpers]] = js.undefined
  var coerce: js.UndefOr[CoerceFunction | CoerceObject] = js.undefined
  var flags: js.UndefOr[Record[String, ExtensionFlag]] = js.undefined
  var manifest: js.UndefOr[Anon_Build] = js.undefined
  var messages: js.UndefOr[LanguageMessages | String] = js.undefined
  var modifiers: js.UndefOr[Record[String, js.Function2[/* rule */ _, /* enabled */ js.UndefOr[Boolean], _]]] = js.undefined
  var overrides: js.UndefOr[Record[String, js.Function1[/* value */ _, Schema]]] = js.undefined
  var prepare: js.UndefOr[js.Function2[/* value */ js.Any, /* helpers */ CustomHelpers[_], _]] = js.undefined
  var properties: js.UndefOr[Record[String, _]] = js.undefined
  var rebuild: js.UndefOr[js.Function1[/* schema */ ExtensionBoundSchema, Unit]] = js.undefined
  var rules: js.UndefOr[Record[String, ExtensionRule with ThisType[SchemaInternals]]] = js.undefined
  var terms: js.UndefOr[Record[String, ExtensionTerm]] = js.undefined
  var `type`: String
  var validate: js.UndefOr[js.Function2[/* value */ js.Any, /* helpers */ CustomHelpers[_], _]] = js.undefined
}

object Extension {
  @scala.inline
  def apply(
    `type`: String,
    args: /* repeated */ SchemaLike => Schema = null,
    base: Schema = null,
    cast: Record[String, Anon_FromHelpers] = null,
    coerce: CoerceFunction | CoerceObject = null,
    flags: Record[String, ExtensionFlag] = null,
    manifest: Anon_Build = null,
    messages: LanguageMessages | String = null,
    modifiers: Record[String, js.Function2[/* rule */ _, /* enabled */ js.UndefOr[Boolean], _]] = null,
    overrides: Record[String, js.Function1[/* value */ _, Schema]] = null,
    prepare: (/* value */ js.Any, /* helpers */ CustomHelpers[_]) => _ = null,
    properties: Record[String, _] = null,
    rebuild: /* schema */ ExtensionBoundSchema => Unit = null,
    rules: Record[String, ExtensionRule with ThisType[SchemaInternals]] = null,
    terms: Record[String, ExtensionTerm] = null,
    validate: (/* value */ js.Any, /* helpers */ CustomHelpers[_]) => _ = null
  ): Extension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (args != null) __obj.updateDynamic("args")(js.Any.fromFunction1(args))
    if (base != null) __obj.updateDynamic("base")(base)
    if (cast != null) __obj.updateDynamic("cast")(cast)
    if (coerce != null) __obj.updateDynamic("coerce")(coerce.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (manifest != null) __obj.updateDynamic("manifest")(manifest)
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (prepare != null) __obj.updateDynamic("prepare")(js.Any.fromFunction2(prepare))
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (rebuild != null) __obj.updateDynamic("rebuild")(js.Any.fromFunction1(rebuild))
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (terms != null) __obj.updateDynamic("terms")(terms)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    __obj.asInstanceOf[Extension]
  }
}

