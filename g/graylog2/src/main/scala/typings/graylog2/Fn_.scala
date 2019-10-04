package typings.graylog2

import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_ extends js.Object {
  def apply(message: String): Unit = js.native
  def apply(
    message: String,
    `_`: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def apply(message: String, `_`: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def apply(
    message: String,
    `_`: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def apply(message: String, additionalFields: Record[String, _]): Unit = js.native
  def apply(
    message: String,
    additionalFields: Record[String, _],
    `_`: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def apply(message: String, fullMessage: String): Unit = js.native
  def apply(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
  def apply(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
  def apply(message: Error): Unit = js.native
  def apply(
    message: Error,
    `_`: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def apply(message: Error, `_`: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def apply(
    message: Error,
    `_`: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def apply(message: Error, additionalFields: Record[String, _]): Unit = js.native
  def apply(
    message: Error,
    additionalFields: Record[String, _],
    `_`: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def apply(message: Record[String, _]): Unit = js.native
  def apply(
    message: Record[String, _],
    `_`: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def apply(message: Record[String, _], `_`: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def apply(
    message: Record[String, _],
    `_`: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
}

