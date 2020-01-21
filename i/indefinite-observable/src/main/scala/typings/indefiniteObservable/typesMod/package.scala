package typings.indefiniteObservable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Connect[T] = js.Function1[
    /* observer */ typings.indefiniteObservable.typesMod.Observer[T], 
    typings.indefiniteObservable.typesMod.Disconnect
  ]
  type Disconnect = js.Function0[scala.Unit]
  type NextChannel[T] = js.Function1[/* value */ T, scala.Unit]
  type ObserverOrNext[T] = typings.indefiniteObservable.typesMod.Observer[T] | typings.indefiniteObservable.typesMod.NextChannel[T]
  type Unsubscribe = js.Function0[scala.Unit]
}
