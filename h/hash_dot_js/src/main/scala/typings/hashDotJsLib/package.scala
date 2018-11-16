package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hashDotJsLib {
  type HmacConstructor = js.Function3[
    /* hash */ BlockHash[js.Any], 
    /* key */ js.Any, 
    /* enc */ js.UndefOr[hashDotJsLib.hashDotJsLibStrings.hex], 
    Hmac
  ]
  type Ripemd160Constructor = js.Function0[Ripemd160]
  type Sha1Constructor = js.Function0[Sha1]
  type Sha224Constructor = js.Function0[Sha224]
  type Sha256Constructor = js.Function0[Sha256]
  type Sha384Constructor = js.Function0[Sha384]
  type Sha512Constructor = js.Function0[Sha512]
}
