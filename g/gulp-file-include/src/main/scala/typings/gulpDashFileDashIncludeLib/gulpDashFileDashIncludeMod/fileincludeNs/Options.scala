package typings
package gulpDashFileDashIncludeLib.gulpDashFileDashIncludeMod.fileincludeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
           * Can be "@file" or "@root" or some base path.
           * default: "@file"
           */
  var basepath: js.UndefOr[
    gulpDashFileDashIncludeLib.gulpDashFileDashIncludeLibStrings.`@file` | gulpDashFileDashIncludeLib.gulpDashFileDashIncludeLibStrings.`@root` | java.lang.String
  ] = js.undefined
  /**
           * Effectively a context for variables used in 'if' statements.
           */
  var context: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
           * Filters basically look like functions that get passed into '@@include'.
           * When one of these functions is called, something of that name is looked
           * up in this object and called to get the contents of that include.
           */
  var filters: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[js.Function1[/* arg */ js.Any, java.lang.String]]
  ] = js.undefined
  /**
           * default: false
           */
  var indent: js.UndefOr[scala.Boolean] = js.undefined
  /** default: "@@" */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /** default: "" */
  var suffix: js.UndefOr[java.lang.String] = js.undefined
}

