package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var highWaterOffset: js.UndefOr[scala.Double] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var partition: js.UndefOr[scala.Double] = js.undefined
  var topic: java.lang.String
  var value: java.lang.String | nodeLib.Buffer
}

