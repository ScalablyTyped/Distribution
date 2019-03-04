package typings
package jestDashValidateLib.jestDashValidateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptions extends js.Object {
  /**
    * optional string to be rendered below error/warning message.
    */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * an optional function with validation condition.
    */
  var condition: js.UndefOr[js.Function2[/* value */ js.Any, /* exampleValue */ js.Any, scala.Boolean]] = js.undefined
  /**
    * optional functions responsible for displaying warning and error messages.
    */
  var deprecate: js.UndefOr[
    js.Function4[
      /* config */ js.Object, 
      /* key */ java.lang.String, 
      /* deprecatedConfig */ DeprecatedConfig, 
      /* options */ this.type, 
      scala.Boolean
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
      /* key */ java.lang.String, 
      /* received */ js.Any, 
      /* exampleValue */ js.Any, 
      /* options */ this.type, 
      scala.Unit
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
      /* key */ java.lang.String, 
      /* options */ this.type, 
      scala.Unit
    ]
  ] = js.undefined
}

object ValidationOptions {
  @scala.inline
  def apply(
    exampleConfig: js.Object,
    comment: java.lang.String = null,
    condition: js.Function2[/* value */ js.Any, /* exampleValue */ js.Any, scala.Boolean] = null,
    deprecate: js.Function4[
      /* config */ js.Object, 
      /* key */ java.lang.String, 
      /* deprecatedConfig */ DeprecatedConfig, 
      ValidationOptions, 
      scala.Boolean
    ] = null,
    deprecatedConfig: DeprecatedConfig = null,
    error: js.Function4[
      /* key */ java.lang.String, 
      /* received */ js.Any, 
      /* exampleValue */ js.Any, 
      ValidationOptions, 
      scala.Unit
    ] = null,
    title: Title = null,
    unknown: js.Function4[
      /* config */ js.Object, 
      /* exampleConfig */ js.Object, 
      /* key */ java.lang.String, 
      ValidationOptions, 
      scala.Unit
    ] = null
  ): ValidationOptions = {
    val __obj = js.Dynamic.literal(exampleConfig = exampleConfig)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (deprecate != null) __obj.updateDynamic("deprecate")(deprecate)
    if (deprecatedConfig != null) __obj.updateDynamic("deprecatedConfig")(deprecatedConfig)
    if (error != null) __obj.updateDynamic("error")(error)
    if (title != null) __obj.updateDynamic("title")(title)
    if (unknown != null) __obj.updateDynamic("unknown")(unknown)
    __obj.asInstanceOf[ValidationOptions]
  }
}

