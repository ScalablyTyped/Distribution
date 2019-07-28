package typings.atIonicAngular.distProvidersPlatformMod

import typings.rxjs.rxjsMod.Subject
import typings.rxjs.rxjsMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackButtonEmitter
  extends Subject[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BackButtonEventDetail */ js.Any
    ] {
  def subscribeWithPriority(priority: Double, callback: js.Function0[js.Promise[_] | Unit]): Subscription = js.native
}

