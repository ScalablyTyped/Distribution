package typings.jestValidate.typesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptions extends js.Object {
  var comment: js.UndefOr[String] = js.undefined
  var condition: js.UndefOr[js.Function2[/* option */ js.Any, /* validOption */ js.Any, Boolean]] = js.undefined
  var deprecate: js.UndefOr[
    js.Function4[
      /* config */ Record[String, _], 
      /* option */ String, 
      /* deprecatedOptions */ DeprecatedOptions, 
      /* options */ ValidationOptions, 
      Boolean
    ]
  ] = js.undefined
  var deprecatedConfig: js.UndefOr[DeprecatedOptions] = js.undefined
  var error: js.UndefOr[
    js.Function5[
      /* option */ String, 
      /* received */ js.Any, 
      /* defaultValue */ js.Any, 
      /* options */ ValidationOptions, 
      /* path */ js.UndefOr[js.Array[String]], 
      Unit
    ]
  ] = js.undefined
  var exampleConfig: Record[String, _]
  var recursive: js.UndefOr[Boolean] = js.undefined
  var recursiveBlacklist: js.UndefOr[js.Array[String]] = js.undefined
  var title: js.UndefOr[Title] = js.undefined
  var unknown: js.UndefOr[
    js.Function5[
      /* config */ Record[String, _], 
      /* exampleConfig */ Record[String, _], 
      /* option */ String, 
      /* options */ ValidationOptions, 
      /* path */ js.UndefOr[js.Array[String]], 
      Unit
    ]
  ] = js.undefined
}

object ValidationOptions {
  @scala.inline
  def apply(
    exampleConfig: Record[String, _],
    comment: String = null,
    condition: (/* option */ js.Any, /* validOption */ js.Any) => Boolean = null,
    deprecate: (/* config */ Record[String, _], /* option */ String, /* deprecatedOptions */ DeprecatedOptions, /* options */ ValidationOptions) => Boolean = null,
    deprecatedConfig: DeprecatedOptions = null,
    error: (/* option */ String, /* received */ js.Any, /* defaultValue */ js.Any, /* options */ ValidationOptions, /* path */ js.UndefOr[js.Array[String]]) => Unit = null,
    recursive: js.UndefOr[Boolean] = js.undefined,
    recursiveBlacklist: js.Array[String] = null,
    title: Title = null,
    unknown: (/* config */ Record[String, _], /* exampleConfig */ Record[String, _], /* option */ String, /* options */ ValidationOptions, /* path */ js.UndefOr[js.Array[String]]) => Unit = null
  ): ValidationOptions = {
    val __obj = js.Dynamic.literal(exampleConfig = exampleConfig.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction2(condition))
    if (deprecate != null) __obj.updateDynamic("deprecate")(js.Any.fromFunction4(deprecate))
    if (deprecatedConfig != null) __obj.updateDynamic("deprecatedConfig")(deprecatedConfig.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction5(error))
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    if (recursiveBlacklist != null) __obj.updateDynamic("recursiveBlacklist")(recursiveBlacklist.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(js.Any.fromFunction5(unknown))
    __obj.asInstanceOf[ValidationOptions]
  }
}

