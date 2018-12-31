package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighLevelConsumerOptions extends ConsumerOptions {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var maxNumSegments: js.UndefOr[scala.Double] = js.undefined
  var maxTickMessages: js.UndefOr[scala.Double] = js.undefined
  var rebalanceRetry: js.UndefOr[RetryOptions] = js.undefined
}

