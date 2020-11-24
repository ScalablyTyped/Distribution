package typings.hexoUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hexo-util", "Pattern")
@js.native
class PatternCls[T] protected () extends Pattern[T] {
  def this(rule: js.Function1[/* str */ String, T]) = this()
  def this(rule: Pattern[T]) = this()
}
