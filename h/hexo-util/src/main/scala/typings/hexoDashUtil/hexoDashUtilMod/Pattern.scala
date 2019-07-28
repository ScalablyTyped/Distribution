package typings.hexoDashUtil.hexoDashUtilMod

import org.scalablytyped.runtime.Instantiable1
import typings.hexoDashUtil.Anon_0
import typings.std.RegExp
import typings.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern[T] extends js.Object {
  def `match`(str: String): T
  def test(str: String): Boolean
}

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

@JSImport("hexo-util", "Pattern")
@js.native
object Pattern
  extends Instantiable1[
      (/* rule */ js.Function1[/* str */ String, js.Object]) | (/* rule */ Pattern[js.Object]) | (/* rule */ RegExp) | (/* rule */ String), 
      Pattern[js.UndefOr[Anon_0 | Null | js.Object | RegExpMatchArray]]
    ]

