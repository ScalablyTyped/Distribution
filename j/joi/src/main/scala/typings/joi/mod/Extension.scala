package typings.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extension extends js.Object {
  var base: js.UndefOr[Schema] = js.undefined
  var coerce: js.UndefOr[
    js.ThisFunction3[
      /* this */ ExtensionBoundSchema, 
      /* value */ js.Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      _
    ]
  ] = js.undefined
  var describe: js.UndefOr[
    js.ThisFunction1[/* this */ Schema, /* description */ Description_, Description_]
  ] = js.undefined
  var language: js.UndefOr[LanguageOptions] = js.undefined
  var name: String
  var pre: js.UndefOr[
    js.ThisFunction3[
      /* this */ ExtensionBoundSchema, 
      /* value */ js.Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      _
    ]
  ] = js.undefined
  var rules: js.UndefOr[js.Array[Rules[_]]] = js.undefined
}

object Extension {
  @scala.inline
  def apply(
    name: String,
    base: Schema = null,
    coerce: js.ThisFunction3[
      /* this */ ExtensionBoundSchema, 
      /* value */ js.Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      _
    ] = null,
    describe: js.ThisFunction1[/* this */ Schema, /* description */ Description_, Description_] = null,
    language: js.UndefOr[Null | LanguageOptions] = js.undefined,
    pre: js.ThisFunction3[
      /* this */ ExtensionBoundSchema, 
      /* value */ js.Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      _
    ] = null,
    rules: js.Array[Rules[_]] = null
  ): Extension = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (coerce != null) __obj.updateDynamic("coerce")(coerce.asInstanceOf[js.Any])
    if (describe != null) __obj.updateDynamic("describe")(describe.asInstanceOf[js.Any])
    if (!js.isUndefined(language)) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (pre != null) __obj.updateDynamic("pre")(pre.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
}

