package typings.is

import typings.is.isStrings.affirmative
import typings.is.isStrings.alphaNumeric
import typings.is.isStrings.caPostalCode
import typings.is.isStrings.creditCard
import typings.is.isStrings.dateString
import typings.is.isStrings.email
import typings.is.isStrings.eppPhone
import typings.is.isStrings.hexColor
import typings.is.isStrings.hexadecimal
import typings.is.isStrings.ip
import typings.is.isStrings.ipv6
import typings.is.isStrings.nanpPhone
import typings.is.isStrings.timeString
import typings.is.isStrings.url
import typings.is.isStrings.usZipCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Is
  extends StObject
     with IsStatic {
  
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
  def setRegexp(value: js.RegExp, regexp: String): Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_affirmative(value: js.RegExp, regexp: affirmative): Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_alphaNumeric(value: js.RegExp, regexp: alphaNumeric): Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_caPostalCode(value: js.RegExp, regexp: caPostalCode): Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_creditCard(value: js.RegExp, regexp: creditCard): Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_dateString(value: js.RegExp, regexp: dateString): Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_email(value: js.RegExp, regexp: email): Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_eppPhone(value: js.RegExp, regexp: eppPhone): Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_hexColor(value: js.RegExp, regexp: hexColor): Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_hexadecimal(value: js.RegExp, regexp: hexadecimal): Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_ip(value: js.RegExp, regexp: ip): Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_ipv6(value: js.RegExp, regexp: ipv6): Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_nanpPhone(value: js.RegExp, regexp: nanpPhone): Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_timeString(value: js.RegExp, regexp: timeString): Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_url(value: js.RegExp, regexp: url): Boolean = js.native
  /**
    * Override RegExps if you think they suck.
    */
  @JSName("setRegexp")
  def setRegexp_usZipCode(value: js.RegExp, regexp: usZipCode): Boolean = js.native
}
