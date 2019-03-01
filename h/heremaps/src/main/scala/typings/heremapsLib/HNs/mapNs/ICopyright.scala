package typings
package heremapsLib.HNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface to specify a copyright note
  * @property label {string} - A short textual representation of the copyright note, e.g. "DigitalGlobe 2009"
  * @property alt {string} - A detailed textual representation of the copyright note, e.g. "copyright 2009 DigitalGlobe, Inc."
  */
trait ICopyright extends js.Object {
  var alt: java.lang.String
  var label: java.lang.String
}

object ICopyright {
  @scala.inline
  def apply(alt: java.lang.String, label: java.lang.String): ICopyright = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alt")(alt)
    __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[ICopyright]
  }
}

