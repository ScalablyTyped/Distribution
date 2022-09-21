package typings.jestWorker.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseWithCustomMessage[T]
  extends js.Promise[T] {
  
  var UNSTABLE_onCustomMessage: js.UndefOr[js.Function1[/* listener */ OnCustomMessage, js.Function0[Unit]]] = js.native
}
