package typings
package idyllDashCompilerLib.idyllDashCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
       * If false and there is no postprocessors, compiler returns the AST synchronously
       * Otherwise, a promise is returned
       *
       */
  var async: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * compiler plugins
       * If provided, compiler always compiles asynchronously
       */
  var postProcessors: js.UndefOr[js.Array[PostProcessor]] = js.undefined
  var smartquotes: js.UndefOr[scala.Boolean] = js.undefined
  var spellcheck: js.UndefOr[scala.Boolean] = js.undefined
}

