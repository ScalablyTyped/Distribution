package typings
package karmaLib.karmaMod.karmaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FilePattern extends js.Object {
  /**
           * @default true
           * @description Should the files be included in the browser using <script> tag? Use false if you want to
           * load them manually, eg. using Require.js.
           */
  var included: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * @default false
           * @description Should the files be served from disk on each request by Karma's webserver?
           */
  var nocache: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The pattern to use for matching. This property is mandatory.
           */
  var pattern: java.lang.String
  /**
           * @default true
           * @description Should the files be served by Karma's webserver?
           */
  var served: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * @default true
           * @description If <code>autoWatch</code> is true all files that have set watched to true will be watched
           * for changes.
           */
  var watched: js.UndefOr[scala.Boolean] = js.undefined
}

