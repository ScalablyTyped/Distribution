package typings
package insertDashModuleDashGlobalsLib.insertDashModuleDashGlobalsMod.InsertModuleGlobalsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
           * When opts.always is true, wrap every file with all the global variables without parsing.
           * This is handy because parsing the scope can take a long time, so you can prioritize fast builds over saving bytes in the final output.
           * When opts.always is truthy but not true, avoid parsing but perform a quick test to determine if wrapping should be skipped.
           */
  var always: js.UndefOr[scala.Boolean] = js.undefined
  var basedir: js.UndefOr[java.lang.String] = js.undefined
  /**
           * If opts.debug is true, an inline source map will be generated to compensate for the extra lines.
           */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Use opts.vars to override the default inserted variables, or set opts.vars[name] to undefined to not insert a variable which would otherwise be inserted.
           *
           * opts.vars properties with a . in their name will be executed instead of the parent object if ONLY that property is used.
           * For example, "Buffer.isBuffer" will mask "Buffer" only when there is a Buffer.isBuffer() call in a file and no other references to Buffer.
           */
  var vars: js.UndefOr[VarsOption] = js.undefined
}

