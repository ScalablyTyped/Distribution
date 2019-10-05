package typings.hexoDashUtil.hexoDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-util", "Pattern")
@js.native
class PatternCls[T] protected () extends Pattern[T] {
  def this(rule: js.Function1[/* str */ String, T]) = this()
  def this(rule: Pattern[T]) = this()
  /* CompleteClass */
  override def `match`(str: String): T = js.native
  /* CompleteClass */
  override def test(str: String): Boolean = js.native
}

