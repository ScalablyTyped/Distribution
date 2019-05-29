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

@JSImport("hexo-util", "Pattern")
@js.native
object Pattern
  extends org.scalablytyped.runtime.Instantiable1[
      (/* rule */ js.Function1[/* str */ java.lang.String, js.Object]) | (/* rule */ Pattern[js.Object]) | (/* rule */ stdLib.RegExp) | (/* rule */ java.lang.String), 
      Pattern[
        (hexoDashUtilLib.Anon_0 with js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]]) | scala.Null | js.Object | stdLib.RegExpMatchArray
      ]
    ]

