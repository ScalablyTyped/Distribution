package typings.heremaps.H.map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface to specify a copyright note
  * @property label {string} - A short textual representation of the copyright note, e.g. "DigitalGlobe 2009"
  * @property alt {string} - A detailed textual representation of the copyright note, e.g. "copyright 2009 DigitalGlobe, Inc."
  */
trait ICopyright extends js.Object {
  var alt: String
  var label: String
}

object ICopyright {
  @scala.inline
  def apply(alt: String, label: String): ICopyright = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICopyright]
  }
}

