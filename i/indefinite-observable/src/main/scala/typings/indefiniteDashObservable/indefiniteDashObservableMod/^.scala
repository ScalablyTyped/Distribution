package typings.indefiniteDashObservable.indefiniteDashObservableMod

import typings.indefiniteDashObservable.distTypesMod.Observer
import typings.indefiniteDashObservable.distTypesMod.ObserverOrNext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("indefinite-observable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def wrapWithObserver[T](listener: ObserverOrNext[T]): Observer[T] = js.native
}

