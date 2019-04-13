package typings
package hexoLib.hexoMod.extendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  def register(
    name: java.lang.String,
    fn: js.Function2[
      /* args */ js.Array[java.lang.String], 
      /* content */ js.UndefOr[java.lang.String], 
      java.lang.String
    ]
  ): scala.Unit = js.native
  def register(
    name: java.lang.String,
    fn: js.Function2[
      /* args */ js.Array[java.lang.String], 
      /* content */ js.UndefOr[java.lang.String], 
      java.lang.String
    ],
    options: hexoLib.hexoMod.extendNs.TagNs.Options
  ): scala.Unit = js.native
}

