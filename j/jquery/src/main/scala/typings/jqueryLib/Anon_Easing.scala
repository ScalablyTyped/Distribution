package typings
package jqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Easing
  extends jqueryLib.JQueryNs._SpeedSettings[js.Any] {
  /**
    * A string indicating which easing function to use for the transition.
    */
  var easing: java.lang.String
}

object Anon_Easing {
  @scala.inline
  def apply(easing: java.lang.String): Anon_Easing = {
    val __obj = js.Dynamic.literal(easing = easing)
  
    __obj.asInstanceOf[Anon_Easing]
  }
}

