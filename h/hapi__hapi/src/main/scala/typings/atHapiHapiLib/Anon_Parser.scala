package typings
package atHapiHapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Parser extends js.Object {
  /**
    * the method must return an object where each key is a parameter and matching value is the parameter value.
    * If the method throws, the error is used as the response or returned when `request.setUrl` is called.
    */
  def parser(raw: atHapiHapiLib.atHapiHapiMod.UtilNs.Dictionary[java.lang.String]): atHapiHapiLib.atHapiHapiMod.UtilNs.Dictionary[_]
}

object Anon_Parser {
  @scala.inline
  def apply(
    parser: atHapiHapiLib.atHapiHapiMod.UtilNs.Dictionary[java.lang.String] => atHapiHapiLib.atHapiHapiMod.UtilNs.Dictionary[_]
  ): Anon_Parser = {
    val __obj = js.Dynamic.literal(parser = js.Any.fromFunction1(parser))
  
    __obj.asInstanceOf[Anon_Parser]
  }
}

