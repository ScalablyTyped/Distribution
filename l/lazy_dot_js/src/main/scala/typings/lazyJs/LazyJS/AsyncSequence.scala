package typings.lazyJs.LazyJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncSequence[T] extends SequenceBase[T] {
  
  def each(callback: ValueCallback[T]): AsyncHandle[T] = js.native
}
