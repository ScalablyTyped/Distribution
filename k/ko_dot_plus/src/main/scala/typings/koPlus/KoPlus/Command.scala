package typings.koPlus.KoPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command extends js.Object {
  var canExecute: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any = js.native
  var completed: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
  var failed: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
  //
  // properties: https://github.com/stevegreatrex/ko.plus#properties
  //
  var isRunning: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
  // execute the command
  def apply(): Unit = js.native
  def always(callback: js.Function): Command = js.native
  //
  // functions
  // see https://github.com/stevegreatrex/ko.plus#functions
  //
  def done(callback: js.Function1[/* data */ js.Any, Unit]): Command = js.native
  def fail(
    callback: js.Function3[
      /* response */ js.Any, 
      /* status */ js.UndefOr[String], 
      /* statusText */ js.UndefOr[String], 
      Unit
    ]
  ): Command = js.native
  def `then`(resolve: js.Function, reject: js.Function): Command = js.native
}

