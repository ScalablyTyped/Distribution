package typings.itPushable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("it-pushable", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[T](): Pushable[T] = js.native
  def apply[T](options: Options): Pushable[T] = js.native
  def apply[T](options: OptionsV): PushableV[T] = js.native
}
