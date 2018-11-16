package typings
package helmetLib.helmetMod.helmetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IHelmetHpkpConfiguration extends js.Object {
  var includeSubdomains: js.UndefOr[scala.Boolean] = js.undefined
  var maxAge: scala.Double
  var reportOnly: js.UndefOr[scala.Boolean] = js.undefined
  var reportUri: js.UndefOr[java.lang.String] = js.undefined
  var setIf: js.UndefOr[IHelmetSetIfFunction] = js.undefined
  var sha256s: js.Array[java.lang.String]
}

