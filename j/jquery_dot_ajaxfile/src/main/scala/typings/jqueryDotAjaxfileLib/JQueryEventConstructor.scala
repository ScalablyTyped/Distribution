package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * The interface used to construct jQuery events (with $.Event). It is
 * defined separately instead of inline in JQueryStatic to allow
 * overriding the construction function with specific strings
 * returning specific event objects.
 */
@js.native
trait JQueryEventConstructor
  extends org.scalablytyped.runtime.Instantiable1[/* name */ java.lang.String, JQueryEventObject]
     with org.scalablytyped.runtime.Instantiable2[/* name */ java.lang.String, /* eventProperties */ js.Any, JQueryEventObject] {
  def apply(name: java.lang.String): JQueryEventObject = js.native
  def apply(name: java.lang.String, eventProperties: js.Any): JQueryEventObject = js.native
}

