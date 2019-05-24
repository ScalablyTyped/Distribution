package typings
package hashaLib.hashaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[EncodingType] extends js.Object {
  /**
  		Values: `md5` `sha1` `sha256` `sha512` _([Platform dependent](https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm_options))_
  		_The `md5` algorithm is good for [file revving](https://github.com/sindresorhus/rev-hash), but you should never use `md5` or `sha1` for anything sensitive. [They're insecure.](http://googleonlinesecurity.blogspot.no/2014/09/gradually-sunsetting-sha-1.html)_
  		@default 'sha512'
  		*/
  val algorithm: js.UndefOr[AlgorithmName] = js.undefined
  /**
  		Encoding of the returned hash.
  		@default 'hex'
  		*/
  val encoding: js.UndefOr[EncodingType] = js.undefined
}

object Options {
  @scala.inline
  def apply[EncodingType](algorithm: AlgorithmName = null, encoding: EncodingType = null): Options[EncodingType] = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[EncodingType]]
  }
}

