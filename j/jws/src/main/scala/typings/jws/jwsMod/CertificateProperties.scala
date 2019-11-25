package typings.jws.jwsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateProperties extends PrivateProperties {
  var kid: js.UndefOr[String] = js.undefined
  var x5c: js.UndefOr[js.Array[String]] = js.undefined
  var x5t: js.UndefOr[String] = js.undefined
  var `x5t#S256`: js.UndefOr[String] = js.undefined
  var x5u: js.UndefOr[String] = js.undefined
}

object CertificateProperties {
  @scala.inline
  def apply(
    StringDictionary: StringDictionary[js.Any] = null,
    kid: String = null,
    x5c: js.Array[String] = null,
    x5t: String = null,
    `x5t#S256`: String = null,
    x5u: String = null
  ): CertificateProperties = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (kid != null) __obj.updateDynamic("kid")(kid.asInstanceOf[js.Any])
    if (x5c != null) __obj.updateDynamic("x5c")(x5c.asInstanceOf[js.Any])
    if (x5t != null) __obj.updateDynamic("x5t")(x5t.asInstanceOf[js.Any])
    if (`x5t#S256` != null) __obj.updateDynamic("x5t#S256")(`x5t#S256`.asInstanceOf[js.Any])
    if (x5u != null) __obj.updateDynamic("x5u")(x5u.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateProperties]
  }
}

