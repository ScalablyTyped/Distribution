package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Selectors
  extends sizzleLib.sizzleMod.SizzleNs.Selectors {
  /**
           * @deprecated ​ Deprecated since 3.0. Use \`{@link Selectors#pseudos }\`.
           *
           * **Cause**: The standard way to add new custom selectors through jQuery is `jQuery.expr.pseudos`. These two other aliases are deprecated, although they still work as of jQuery 3.0.
           *
           * **Solution**: Rename any of the older usage to `jQuery.expr.pseudos`. The functionality is identical.
           */
  var `:`: sizzleLib.sizzleMod.SizzleNs.SelectorsNs.PseudoFunctions
}

