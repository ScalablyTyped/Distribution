package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Parser extends js.Object {
  /**
    * the method must return an object where each key is a parameter and matching value is the parameter value.
    * If the method throws, the error is used as the response or returned when `request.setUrl` is called.
    */
  def parser(raw: hapiLib.hapiMod.UtilNs.Dictionary[java.lang.String]): hapiLib.hapiMod.UtilNs.Dictionary[_]
}

