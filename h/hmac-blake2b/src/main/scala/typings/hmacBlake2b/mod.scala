package typings.hmacBlake2b

import typings.hmacBlake2b.hmacBlake2bNumbers.`128`
import typings.hmacBlake2b.hmacBlake2bNumbers.`64`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    out: js.typedarray.Uint8Array,
    data: js.Array[js.typedarray.Uint8Array],
    key: js.typedarray.Uint8Array
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(out.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Computes a HMAC from `data` with `key` and writes it into `out`.
    *
    * @param out The buffer to write the result to. Must be of length `hmac.BYTES`.
    * @param data The data for which the HMAC should be generated.
    * @param key Per the HMAC spec `key` can be as small as 1 byte, in which case it is right-padded
    * with `NUL` bytes, or any size larger than `hmac.KEYBYTES` in which case it is hashed down to fit.
    * The recommended size by the spec is `hmac.KEYBYTES`
    *
    * @example
    * import { randombytes_buf } from 'sodium-native'
    * import hmac = require('hmac-blake2b')
    *
    * const mac = Buffer.alloc(hmac.BYTES)
    * const key = Buffer.alloc(hmac.KEYBYTES)
    * randombytes_buf(key)
    *
    * const data = Buffer.from('some data')
    *
    * hmac(mac, data, key)
    */
  inline def apply(out: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].apply(out.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("hmac-blake2b", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Size of the output MAC in bytes */
  @JSImport("hmac-blake2b", "BYTES")
  @js.native
  val BYTES: `64` = js.native
  
  /** [RFC2104](https://www.ietf.org/rfc/rfc2104.txt) recommended size of the key in bytes. */
  @JSImport("hmac-blake2b", "KEYBYTES")
  @js.native
  val KEYBYTES: `128` = js.native
}
