package typings.indefiniteObservable.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Observer[T] extends js.Object {
  
  def next(value: T): Unit = js.native
  @JSName("next")
  var next_Original: NextChannel[T] = js.native
}
