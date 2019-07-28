package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofjansson extends js.Object {
  def get(spath: String, sdoc: String, spv: String): Double
}

object Typeofjansson {
  @scala.inline
  def apply(get: (String, String, String) => Double): Typeofjansson = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get))
  
    __obj.asInstanceOf[Typeofjansson]
  }
}

