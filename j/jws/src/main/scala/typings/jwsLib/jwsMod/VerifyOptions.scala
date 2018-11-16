package typings
package jwsLib.jwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VerifyOptions extends js.Object {
  var algorithm: js.UndefOr[Algorithm | nodeLib.Buffer | nodeLib.streamMod.Readable] = js.undefined
  var encoding: js.UndefOr[java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable] = js.undefined
  var key: js.UndefOr[java.lang.String | nodeLib.streamMod.Readable | nodeLib.Buffer] = js.undefined
  var publicKey: js.UndefOr[java.lang.String | nodeLib.streamMod.Readable | nodeLib.Buffer] = js.undefined
  var secret: js.UndefOr[java.lang.String | nodeLib.streamMod.Readable | nodeLib.Buffer] = js.undefined
  var signature: js.UndefOr[java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable] = js.undefined
}

