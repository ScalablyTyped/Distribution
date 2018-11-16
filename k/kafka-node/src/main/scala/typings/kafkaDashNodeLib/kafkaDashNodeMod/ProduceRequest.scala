package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProduceRequest extends js.Object {
  var attributes: js.UndefOr[scala.Double] = js.undefined
   // string[] | Array<KeyedMessage> | string | KeyedMessage
  var key: js.UndefOr[js.Any] = js.undefined
  var messages: js.Any
  var partition: js.UndefOr[scala.Double] = js.undefined
  var topic: java.lang.String
}

