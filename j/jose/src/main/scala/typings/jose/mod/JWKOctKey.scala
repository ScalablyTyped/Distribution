package typings.jose.mod

import typings.jose.joseStrings.oct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWKOctKey
  extends _ProduceKeyInput
     with BasicParameters
     with JSONWebKey {
  var k: js.UndefOr[String] = js.native
  // no x5c
  var kty: oct = js.native
}

object JWKOctKey {
  @scala.inline
  def apply(kty: oct): JWKOctKey = {
    val __obj = js.Dynamic.literal(kty = kty.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWKOctKey]
  }
  @scala.inline
  implicit class JWKOctKeyOps[Self <: JWKOctKey] (val x: Self) extends AnyVal {
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
    def setKty(value: oct): Self = this.set("kty", value.asInstanceOf[js.Any])
    @scala.inline
    def setK(value: String): Self = this.set("k", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteK: Self = this.set("k", js.undefined)
  }
  
}

