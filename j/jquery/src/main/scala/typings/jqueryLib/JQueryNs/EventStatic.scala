package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #endregion
// region Events
// #region Events
// region Event
// #region Event
// This should be a class but doesn't work correctly under the JQuery namespace. Event should be an inner class of jQuery.
// Static members
@js.native
trait EventStatic
  extends // tslint:disable-next-line:no-unnecessary-generics
ScalablyTyped.runtime.Instantiable2[
      /* event */ java.lang.String, 
      /* properties */ js.Object, 
      (Event[stdLib.EventTarget, scala.Null]) with js.Object
    ]
     with // tslint:disable-next-line:no-unnecessary-generics
ScalablyTyped.runtime.Instantiable1[
      (/* event */ java.lang.String) | (/* properties */ EventLike), 
      ((Event[stdLib.EventTarget, scala.Null]) with js.Object) | ((Event[stdLib.EventTarget, scala.Null]) with EventLike)
    ] {
  // tslint:disable-next-line:no-unnecessary-generics
  def apply[T /* <: js.Object */, TTarget /* <: stdLib.EventTarget */](event: java.lang.String): (Event[TTarget, scala.Null]) with T = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def apply[T /* <: js.Object */, TTarget /* <: stdLib.EventTarget */](event: java.lang.String, properties: T): (Event[TTarget, scala.Null]) with T = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def apply[T /* <: EventLike */, TTarget /* <: stdLib.EventTarget */](properties: T): (Event[TTarget, scala.Null]) with T = js.native
}

