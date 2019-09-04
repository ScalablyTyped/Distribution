package typings.atJestTypes.buildCircusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalErrorHandlers extends js.Object {
  var uncaughtException: js.Array[js.Function1[/* exception */ Exception, Unit]]
  var unhandledRejection: js.Array[js.Function2[/* exception */ Exception, /* promise */ js.Promise[_], Unit]]
}

object GlobalErrorHandlers {
  @scala.inline
  def apply(
    uncaughtException: js.Array[js.Function1[/* exception */ Exception, Unit]],
    unhandledRejection: js.Array[js.Function2[/* exception */ Exception, /* promise */ js.Promise[_], Unit]]
  ): GlobalErrorHandlers = {
    val __obj = js.Dynamic.literal(uncaughtException = uncaughtException, unhandledRejection = unhandledRejection)
  
    __obj.asInstanceOf[GlobalErrorHandlers]
  }
}

