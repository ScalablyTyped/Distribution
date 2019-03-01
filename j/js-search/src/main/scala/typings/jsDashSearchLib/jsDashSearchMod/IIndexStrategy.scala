package typings
package jsDashSearchLib.jsDashSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndexStrategy extends js.Object {
  def expandToken(token: java.lang.String): js.Array[java.lang.String]
}

object IIndexStrategy {
  @scala.inline
  def apply(expandToken: js.Function1[java.lang.String, js.Array[java.lang.String]]): IIndexStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expandToken")(expandToken)
    __obj.asInstanceOf[IIndexStrategy]
  }
}

