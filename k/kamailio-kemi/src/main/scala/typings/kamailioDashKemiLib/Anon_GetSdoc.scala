package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetSdoc extends js.Object {
  def get(spath: java.lang.String, sdoc: java.lang.String, spv: java.lang.String): scala.Double
}

object Anon_GetSdoc {
  @scala.inline
  def apply(get: (java.lang.String, java.lang.String, java.lang.String) => scala.Double): Anon_GetSdoc = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get))
  
    __obj.asInstanceOf[Anon_GetSdoc]
  }
}

