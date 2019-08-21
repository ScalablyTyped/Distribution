package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Certissuer extends js.Object {
  var certissuer: js.UndefOr[String] = js.undefined
  var certsubject: js.UndefOr[String] = js.undefined
}

object Anon_Certissuer {
  @scala.inline
  def apply(certissuer: String = null, certsubject: String = null): Anon_Certissuer = {
    val __obj = js.Dynamic.literal()
    if (certissuer != null) __obj.updateDynamic("certissuer")(certissuer)
    if (certsubject != null) __obj.updateDynamic("certsubject")(certsubject)
    __obj.asInstanceOf[Anon_Certissuer]
  }
}

