package typings
package isLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Is extends IsStatic {
  var all: IsStaticApi = js.native
  var any: IsStaticApi = js.native
  var not: IsStatic = js.native
  /**
    * Change namespace of library to prevent name collisions.
    */
  def setNamespace(): Is = js.native
  /**
    * Override RegExps if you think they suck.
    */
  def setRegexp(value: stdLib.RegExp, regexp: java.lang.String): scala.Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_affirmative(value: stdLib.RegExp, regexp: isLib.isLibStrings.affirmative): scala.Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_alphaNumeric(value: stdLib.RegExp, regexp: isLib.isLibStrings.alphaNumeric): scala.Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_caPostalCode(value: stdLib.RegExp, regexp: isLib.isLibStrings.caPostalCode): scala.Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_creditCard(value: stdLib.RegExp, regexp: isLib.isLibStrings.creditCard): scala.Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_dateString(value: stdLib.RegExp, regexp: isLib.isLibStrings.dateString): scala.Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_email(value: stdLib.RegExp, regexp: isLib.isLibStrings.email): scala.Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_eppPhone(value: stdLib.RegExp, regexp: isLib.isLibStrings.eppPhone): scala.Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_hexColor(value: stdLib.RegExp, regexp: isLib.isLibStrings.hexColor): scala.Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_hexadecimal(value: stdLib.RegExp, regexp: isLib.isLibStrings.hexadecimal): scala.Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_ip(value: stdLib.RegExp, regexp: isLib.isLibStrings.ip): scala.Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_ipv6(value: stdLib.RegExp, regexp: isLib.isLibStrings.ipv6): scala.Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_nanpPhone(value: stdLib.RegExp, regexp: isLib.isLibStrings.nanpPhone): scala.Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_timeString(value: stdLib.RegExp, regexp: isLib.isLibStrings.timeString): scala.Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_url(value: stdLib.RegExp, regexp: isLib.isLibStrings.url): scala.Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_usZipCode(value: stdLib.RegExp, regexp: isLib.isLibStrings.usZipCode): scala.Boolean = js.native
}

