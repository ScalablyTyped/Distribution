package typings
package js2xmlparserLib.libOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormatOptions extends js.Object {
  /**
    * If `doubleQuotes` is `true`, double quotes are used in XML attributes.
    * Otherwise, single quotes are used in XML attributes. If left undefined,
    * the default value is `false`.
    */
  var doubleQuotes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The indent string used for pretty-printing. If left undefined, the
    * default value is four spaces.
    */
  var indent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The newline string used for pretty-printing. If left undefined, the
    * default value is `"\n"`.
    */
  var newline: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If `pretty` is `true`, pretty-printing is enabled. If left undefined,
    * the default value is `true`.
    */
  var pretty: js.UndefOr[scala.Boolean] = js.undefined
}

