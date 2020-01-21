package typings.mailgunJs.mod

import typings.mailgunJs.mod.messages.BatchData
import typings.mailgunJs.mod.messages.SendData
import typings.mailgunJs.mod.messages.SendResponse
import typings.mailgunJs.mod.messages.SendTemplateData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messages_ extends js.Object {
  def send(data: SendData | SendTemplateData): js.Promise[SendResponse] = js.native
  def send(
    data: SendData | SendTemplateData,
    callback: js.Function2[/* error */ Error, /* body */ SendResponse, Unit]
  ): js.Promise[SendResponse] = js.native
  def send(data: BatchData): js.Promise[SendResponse] = js.native
  def send(data: BatchData, callback: js.Function2[/* error */ Error, /* body */ SendResponse, Unit]): js.Promise[SendResponse] = js.native
}

