package typings.jotai.anon

import typings.jotai.vanillaUtilsAtomWithObservableMod.Observer
import typings.jotai.vanillaUtilsAtomWithObservableMod.Subscription
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1`[T] extends StObject {
  
  def subscribe(next: js.Function1[/* value */ T, Unit]): Subscription = js.native
  def subscribe(observer: Partial[Observer[T]]): Subscription = js.native
}
