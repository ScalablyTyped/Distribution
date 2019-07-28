package typings.indefiniteDashObservable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type Connect[T] = js.Function1[/* observer */ Observer[T], Disconnect]
  type Disconnect = js.Function0[Unit]
  type NextChannel[T] = js.Function1[/* value */ T, Unit]
  type ObserverOrNext[T] = Observer[T] | NextChannel[T]
  type Unsubscribe = js.Function0[Unit]
}
