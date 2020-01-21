package typings.jestValidate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptions extends js.Object {
  /**
    * optional string to be rendered below error/warning message.
    */
  var comment: js.UndefOr[String] = js.undefined
  /**
    * an optional function with validation condition.
    */
  var condition: js.UndefOr[js.Function2[/* value */ js.Any, /* exampleValue */ js.Any, Boolean]] = js.undefined
  /**
    * optional functions responsible for displaying warning and error messages.
    */
  var deprecate: js.UndefOr[
    js.Function4[
      /* config */ js.Object, 
      /* key */ String, 
      /* deprecatedConfig */ DeprecatedConfig, 
      /* options */ this.type, 
      Boolean
    ]
  ] = js.undefined
  /**
    * optional object with deprecated config keys.
    */
  var deprecatedConfig: js.UndefOr[DeprecatedConfig] = js.undefined
  /**
    * optional functions responsible for displaying warning and error messages.
    */
  var error: js.UndefOr[
    js.Function4[
      /* key */ String, 
      /* received */ js.Any, 
      /* exampleValue */ js.Any, 
      /* options */ this.type, 
      Unit
    ]
  ] = js.undefined
  /**
    * the only **required** option with configuration against which you'd like to test.
    */
  var exampleConfig: js.Object
  /**
    * optional object of titles for errors and messages.
    */
  var title: js.UndefOr[Title] = js.undefined
  /**
    * optional functions responsible for displaying warning and error messages.
    */
  var unknown: js.UndefOr[
    js.Function4[
      /* config */ js.Object, 
      /* exampleConfig */ js.Object, 
      /* key */ String, 
      /* options */ this.type, 
      Unit
    ]
  ] = js.undefined
}

object ValidationOptions {
  @scala.inline
  def apply(
    exampleConfig: js.Object,
    comment: String = null,
    condition: (/* value */ js.Any, /* exampleValue */ js.Any) => Boolean = null,
    deprecate: (/* config */ js.Object, /* key */ String, /* deprecatedConfig */ DeprecatedConfig, ValidationOptions) => Boolean = null,
    deprecatedConfig: DeprecatedConfig = null,
    error: (/* key */ String, /* received */ js.Any, /* exampleValue */ js.Any, ValidationOptions) => Unit = null,
    title: Title = null,
    unknown: (/* config */ js.Object, /* exampleConfig */ js.Object, /* key */ String, ValidationOptions) => Unit = null
  ): ValidationOptions = {
    val __obj = js.Dynamic.literal(exampleConfig = exampleConfig.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction2(condition))
    if (deprecate != null) __obj.updateDynamic("deprecate")(js.Any.fromFunction4(deprecate))
    if (deprecatedConfig != null) __obj.updateDynamic("deprecatedConfig")(deprecatedConfig.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction4(error))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(js.Any.fromFunction4(unknown))
    __obj.asInstanceOf[ValidationOptions]
  }
}

