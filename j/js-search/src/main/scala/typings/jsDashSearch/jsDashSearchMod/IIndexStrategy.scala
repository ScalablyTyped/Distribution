package typings.jsDashSearch.jsDashSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndexStrategy extends js.Object {
  def expandToken(token: String): js.Array[String]
}

object IIndexStrategy {
  @scala.inline
  def apply(expandToken: String => js.Array[String]): IIndexStrategy = {
    val __obj = js.Dynamic.literal(expandToken = js.Any.fromFunction1(expandToken))
  
    __obj.asInstanceOf[IIndexStrategy]
  }
}

