package typings.hasha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[EncodingType] extends js.Object {
  
  /**
  		Values: `md5` `sha1` `sha256` `sha512` _([Platform dependent](https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm_options))_
  		_The `md5` algorithm is good for [file revving](https://github.com/sindresorhus/rev-hash), but you should never use `md5` or `sha1` for anything sensitive. [They're insecure.](https://security.googleblog.com/2014/09/gradually-sunsetting-sha-1.html)_
  		@default 'sha512'
  		*/
  val algorithm: js.UndefOr[AlgorithmName] = js.native
  
  /**
  		Encoding of the returned hash.
  		@default 'hex'
  		*/
  val encoding: js.UndefOr[EncodingType] = js.native
}
object Options {
  
  @scala.inline
  def apply[EncodingType](): Options[EncodingType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[EncodingType]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], EncodingType] (val x: Self with Options[EncodingType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlgorithm(value: AlgorithmName): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setEncoding(value: EncodingType): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
  }
}
