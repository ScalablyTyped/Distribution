package typings
package gotLib.gotMod.gotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GotJSONOptions
  extends GotOptions[java.lang.String | scala.Null] {
  // Body must be an object or array. See https://github.com/sindresorhus/got/issues/511
  var body: js.UndefOr[js.Object] = js.undefined
  var form: js.UndefOr[scala.Boolean] = js.undefined
  var hooks: js.UndefOr[Hooks[GotJSONOptions]] = js.undefined
  var json: gotLib.gotLibNumbers.`true`
}

