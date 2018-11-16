package typings
package lodashLib.lodashMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * By default, the template delimiters used by Lo-Dash are similar to those in embedded Ruby
    * (ERB). Change the following template settings to use alternative delimiters.
    **/

trait TemplateSettings extends js.Object {
  /**
          * The "escape" delimiter.
          **/
  var escape: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
          * The "evaluate" delimiter.
          **/
  var evaluate: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
          * An object to import into the template as local variables.
          **/
  var imports: js.UndefOr[Dictionary[_]] = js.undefined
  /**
          * The "interpolate" delimiter.
          **/
  var interpolate: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
          * Used to reference the data object in the template text.
          **/
  var variable: js.UndefOr[java.lang.String] = js.undefined
}

