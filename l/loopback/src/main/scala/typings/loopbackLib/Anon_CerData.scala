package typings
package loopbackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CerData extends js.Object {
  var cerData: java.lang.String
  var feedBackOptions: Anon_BatchFeedback
  var keyData: java.lang.String
  var production: scala.Boolean
  var pushOptions: Anon_Gateway
}

object Anon_CerData {
  @scala.inline
  def apply(
    cerData: java.lang.String,
    feedBackOptions: Anon_BatchFeedback,
    keyData: java.lang.String,
    production: scala.Boolean,
    pushOptions: Anon_Gateway
  ): Anon_CerData = {
    val __obj = js.Dynamic.literal(cerData = cerData, feedBackOptions = feedBackOptions, keyData = keyData, production = production, pushOptions = pushOptions)
  
    __obj.asInstanceOf[Anon_CerData]
  }
}

