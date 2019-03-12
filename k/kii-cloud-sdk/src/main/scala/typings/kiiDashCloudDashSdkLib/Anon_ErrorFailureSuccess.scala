package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureSuccess extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(thing: kiiDashCloudDashSdkLib.KiiCloudNs.KiiThing): js.Any
}

object Anon_ErrorFailureSuccess {
  @scala.inline
  def apply(failure: stdLib.Error => js.Any, success: kiiDashCloudDashSdkLib.KiiCloudNs.KiiThing => js.Any): Anon_ErrorFailureSuccess = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureSuccess]
  }
}

