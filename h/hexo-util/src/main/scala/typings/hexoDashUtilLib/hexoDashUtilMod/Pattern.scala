package typings
package hexoDashUtilLib.hexoDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern[T] extends js.Object {
  def `match`(str: java.lang.String): T
  def test(str: java.lang.String): scala.Boolean
}

@JSImport("hexo-util", "Pattern")
@js.native
class PatternCls[T] protected () extends Pattern[T] {
  def this(rule: Pattern[T]) = this()
  def this(rule: js.Function1[/* str */ java.lang.String, T]) = this()
  /* CompleteClass */
  override def `match`(str: java.lang.String): T = js.native
  /* CompleteClass */
  override def test(str: java.lang.String): scala.Boolean = js.native
}

object Pattern {
  @scala.inline
  def apply[T](`match`: java.lang.String => T, test: java.lang.String => scala.Boolean): Pattern[T] = {
    val __obj = js.Dynamic.literal(test = js.Any.fromFunction1(test))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Pattern[T]]
  }
}

