package typings.jasmineNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @scala.inline
  def it(
    expectation: String,
    assertion: js.Function1[/* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit]
  ): Unit = (js.Dynamic.global.applyDynamic("it")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def it(
    expectation: String,
    assertion: js.Function1[/* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], Unit],
    timeout: Double
  ): Unit = (js.Dynamic.global.applyDynamic("it")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
