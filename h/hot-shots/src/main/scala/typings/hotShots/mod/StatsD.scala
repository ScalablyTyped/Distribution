package typings.hotShots.mod

import typings.node.dgramMod.Socket
import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hot-shots", "StatsD")
@js.native
class StatsD () extends js.Object {
  def this(options: ClientOptions) = this()
  
  var CHECKS: DatadogChecks = js.native
  
  def asyncDistTimer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncDistTimer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, callback: StatsCb): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncDistTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: String,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncDistTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: String,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: Tags
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncDistTimer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, sampleRate: Double): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncDistTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: String,
    sampleRate: Double,
    callback: StatsCb
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncDistTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: String,
    sampleRate: Double,
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncDistTimer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, sampleRate: Double, tags: Tags): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncDistTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: String,
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncDistTimer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, tags: Tags): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncDistTimer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: js.Array[String]): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncDistTimer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: js.Array[String], callback: StatsCb): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncDistTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: js.Array[String],
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncDistTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: js.Array[String],
    sampleRate: js.UndefOr[scala.Nothing],
    tags: Tags
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncDistTimer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: js.Array[String], sampleRate: Double): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncDistTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: js.Array[String],
    sampleRate: Double,
    callback: StatsCb
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncDistTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: js.Array[String],
    sampleRate: Double,
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncDistTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: js.Array[String],
    sampleRate: Double,
    tags: Tags
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncDistTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: js.Array[String],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncDistTimer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: js.Array[String], tags: Tags): js.Function1[/* args */ P, js.Promise[R]] = js.native
  
  def asyncTimer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncTimer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, callback: StatsCb): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: String,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: String,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: Tags
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncTimer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, sampleRate: Double): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: String,
    sampleRate: Double,
    callback: StatsCb
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: String,
    sampleRate: Double,
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncTimer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, sampleRate: Double, tags: Tags): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: String,
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncTimer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, tags: Tags): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncTimer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: js.Array[String]): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncTimer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: js.Array[String], callback: StatsCb): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: js.Array[String],
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: js.Array[String],
    sampleRate: js.UndefOr[scala.Nothing],
    tags: Tags
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncTimer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: js.Array[String], sampleRate: Double): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: js.Array[String],
    sampleRate: Double,
    callback: StatsCb
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: js.Array[String],
    sampleRate: Double,
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: js.Array[String],
    sampleRate: Double,
    tags: Tags
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncTimer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, js.Promise[R]],
    stat: js.Array[String],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): js.Function1[/* args */ P, js.Promise[R]] = js.native
  def asyncTimer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: js.Array[String], tags: Tags): js.Function1[/* args */ P, js.Promise[R]] = js.native
  
  def check(name: String, status: DatadogChecksValues): Unit = js.native
  def check(
    name: String,
    status: DatadogChecksValues,
    options: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def check(name: String, status: DatadogChecksValues, options: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def check(name: String, status: DatadogChecksValues, options: CheckOptions): Unit = js.native
  def check(
    name: String,
    status: DatadogChecksValues,
    options: CheckOptions,
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def check(name: String, status: DatadogChecksValues, options: CheckOptions, tags: Tags): Unit = js.native
  
  def childClient(): StatsD = js.native
  def childClient(options: ChildClientOptions): StatsD = js.native
  
  def close(callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  
  def decrement(stat: String): Unit = js.native
  def decrement(stat: String, value: Double): Unit = js.native
  def decrement(stat: String, value: Double, callback: StatsCb): Unit = js.native
  def decrement(
    stat: String,
    value: Double,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def decrement(stat: String, value: Double, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def decrement(stat: String, value: Double, sampleRate: Double): Unit = js.native
  def decrement(stat: String, value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
  def decrement(stat: String, value: Double, sampleRate: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def decrement(stat: String, value: Double, sampleRate: Double, tags: Tags): Unit = js.native
  def decrement(stat: String, value: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def decrement(stat: String, value: Double, tags: Tags): Unit = js.native
  def decrement(stat: js.Array[String], value: Double): Unit = js.native
  def decrement(stat: js.Array[String], value: Double, callback: StatsCb): Unit = js.native
  def decrement(
    stat: js.Array[String],
    value: Double,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def decrement(stat: js.Array[String], value: Double, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def decrement(stat: js.Array[String], value: Double, sampleRate: Double): Unit = js.native
  def decrement(stat: js.Array[String], value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
  def decrement(
    stat: js.Array[String],
    value: Double,
    sampleRate: Double,
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def decrement(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags): Unit = js.native
  def decrement(stat: js.Array[String], value: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def decrement(stat: js.Array[String], value: Double, tags: Tags): Unit = js.native
  
  def distribution(stat: String, value: Double): Unit = js.native
  def distribution(stat: String, value: Double, callback: StatsCb): Unit = js.native
  def distribution(
    stat: String,
    value: Double,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def distribution(stat: String, value: Double, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def distribution(stat: String, value: Double, sampleRate: Double): Unit = js.native
  def distribution(stat: String, value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
  def distribution(stat: String, value: Double, sampleRate: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def distribution(stat: String, value: Double, sampleRate: Double, tags: Tags): Unit = js.native
  def distribution(stat: String, value: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def distribution(stat: String, value: Double, tags: Tags): Unit = js.native
  def distribution(stat: js.Array[String], value: Double): Unit = js.native
  def distribution(stat: js.Array[String], value: Double, callback: StatsCb): Unit = js.native
  def distribution(
    stat: js.Array[String],
    value: Double,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def distribution(stat: js.Array[String], value: Double, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def distribution(stat: js.Array[String], value: Double, sampleRate: Double): Unit = js.native
  def distribution(stat: js.Array[String], value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
  def distribution(
    stat: js.Array[String],
    value: Double,
    sampleRate: Double,
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def distribution(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags): Unit = js.native
  def distribution(stat: js.Array[String], value: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def distribution(stat: js.Array[String], value: Double, tags: Tags): Unit = js.native
  
  def event(title: String): Unit = js.native
  def event(
    title: String,
    text: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: StatsCb
  ): Unit = js.native
  def event(
    title: String,
    text: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def event(title: String, text: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def event(title: String, text: js.UndefOr[scala.Nothing], options: EventOptions): Unit = js.native
  def event(title: String, text: js.UndefOr[scala.Nothing], options: EventOptions, callback: StatsCb): Unit = js.native
  def event(
    title: String,
    text: js.UndefOr[scala.Nothing],
    options: EventOptions,
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def event(title: String, text: js.UndefOr[scala.Nothing], options: EventOptions, tags: Tags): Unit = js.native
  def event(title: String, text: String): Unit = js.native
  def event(title: String, text: String, options: js.UndefOr[scala.Nothing], callback: StatsCb): Unit = js.native
  def event(
    title: String,
    text: String,
    options: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def event(title: String, text: String, options: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def event(title: String, text: String, options: EventOptions): Unit = js.native
  def event(title: String, text: String, options: EventOptions, callback: StatsCb): Unit = js.native
  def event(title: String, text: String, options: EventOptions, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def event(title: String, text: String, options: EventOptions, tags: Tags): Unit = js.native
  
  def gauge(stat: String, value: Double): Unit = js.native
  def gauge(stat: String, value: Double, callback: StatsCb): Unit = js.native
  def gauge(
    stat: String,
    value: Double,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def gauge(stat: String, value: Double, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def gauge(stat: String, value: Double, sampleRate: Double): Unit = js.native
  def gauge(stat: String, value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
  def gauge(stat: String, value: Double, sampleRate: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def gauge(stat: String, value: Double, sampleRate: Double, tags: Tags): Unit = js.native
  def gauge(stat: String, value: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def gauge(stat: String, value: Double, tags: Tags): Unit = js.native
  def gauge(stat: js.Array[String], value: Double): Unit = js.native
  def gauge(stat: js.Array[String], value: Double, callback: StatsCb): Unit = js.native
  def gauge(
    stat: js.Array[String],
    value: Double,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def gauge(stat: js.Array[String], value: Double, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def gauge(stat: js.Array[String], value: Double, sampleRate: Double): Unit = js.native
  def gauge(stat: js.Array[String], value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
  def gauge(
    stat: js.Array[String],
    value: Double,
    sampleRate: Double,
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def gauge(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags): Unit = js.native
  def gauge(stat: js.Array[String], value: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def gauge(stat: js.Array[String], value: Double, tags: Tags): Unit = js.native
  
  def histogram(stat: String, value: Double): Unit = js.native
  def histogram(stat: String, value: Double, callback: StatsCb): Unit = js.native
  def histogram(
    stat: String,
    value: Double,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def histogram(stat: String, value: Double, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def histogram(stat: String, value: Double, sampleRate: Double): Unit = js.native
  def histogram(stat: String, value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
  def histogram(stat: String, value: Double, sampleRate: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def histogram(stat: String, value: Double, sampleRate: Double, tags: Tags): Unit = js.native
  def histogram(stat: String, value: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def histogram(stat: String, value: Double, tags: Tags): Unit = js.native
  def histogram(stat: js.Array[String], value: Double): Unit = js.native
  def histogram(stat: js.Array[String], value: Double, callback: StatsCb): Unit = js.native
  def histogram(
    stat: js.Array[String],
    value: Double,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def histogram(stat: js.Array[String], value: Double, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def histogram(stat: js.Array[String], value: Double, sampleRate: Double): Unit = js.native
  def histogram(stat: js.Array[String], value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
  def histogram(
    stat: js.Array[String],
    value: Double,
    sampleRate: Double,
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def histogram(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags): Unit = js.native
  def histogram(stat: js.Array[String], value: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def histogram(stat: js.Array[String], value: Double, tags: Tags): Unit = js.native
  
  def increment(stat: String): Unit = js.native
  def increment(stat: String, tags: Tags): Unit = js.native
  def increment(stat: String, value: Double): Unit = js.native
  def increment(stat: String, value: Double, callback: StatsCb): Unit = js.native
  def increment(
    stat: String,
    value: Double,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def increment(stat: String, value: Double, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def increment(stat: String, value: Double, sampleRate: Double): Unit = js.native
  def increment(stat: String, value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
  def increment(stat: String, value: Double, sampleRate: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def increment(stat: String, value: Double, sampleRate: Double, tags: Tags): Unit = js.native
  def increment(stat: String, value: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def increment(stat: String, value: Double, tags: Tags): Unit = js.native
  def increment(stat: js.Array[String], value: Double): Unit = js.native
  def increment(stat: js.Array[String], value: Double, callback: StatsCb): Unit = js.native
  def increment(
    stat: js.Array[String],
    value: Double,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def increment(stat: js.Array[String], value: Double, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def increment(stat: js.Array[String], value: Double, sampleRate: Double): Unit = js.native
  def increment(stat: js.Array[String], value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
  def increment(
    stat: js.Array[String],
    value: Double,
    sampleRate: Double,
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def increment(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags): Unit = js.native
  def increment(stat: js.Array[String], value: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def increment(stat: js.Array[String], value: Double, tags: Tags): Unit = js.native
  
  var mockBuffer: js.UndefOr[js.Array[String]] = js.native
  
  def set(stat: String, value: String): Unit = js.native
  def set(stat: String, value: String, callback: StatsCb): Unit = js.native
  def set(
    stat: String,
    value: String,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def set(stat: String, value: String, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def set(stat: String, value: String, sampleRate: Double): Unit = js.native
  def set(stat: String, value: String, sampleRate: Double, callback: StatsCb): Unit = js.native
  def set(stat: String, value: String, sampleRate: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def set(stat: String, value: String, sampleRate: Double, tags: Tags): Unit = js.native
  def set(stat: String, value: String, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def set(stat: String, value: String, tags: Tags): Unit = js.native
  def set(stat: String, value: Double): Unit = js.native
  def set(stat: String, value: Double, callback: StatsCb): Unit = js.native
  def set(
    stat: String,
    value: Double,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def set(stat: String, value: Double, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def set(stat: String, value: Double, sampleRate: Double): Unit = js.native
  def set(stat: String, value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
  def set(stat: String, value: Double, sampleRate: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def set(stat: String, value: Double, sampleRate: Double, tags: Tags): Unit = js.native
  def set(stat: String, value: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def set(stat: String, value: Double, tags: Tags): Unit = js.native
  def set(stat: js.Array[String], value: String): Unit = js.native
  def set(stat: js.Array[String], value: String, callback: StatsCb): Unit = js.native
  def set(
    stat: js.Array[String],
    value: String,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def set(stat: js.Array[String], value: String, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def set(stat: js.Array[String], value: String, sampleRate: Double): Unit = js.native
  def set(stat: js.Array[String], value: String, sampleRate: Double, callback: StatsCb): Unit = js.native
  def set(
    stat: js.Array[String],
    value: String,
    sampleRate: Double,
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def set(stat: js.Array[String], value: String, sampleRate: Double, tags: Tags): Unit = js.native
  def set(stat: js.Array[String], value: String, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def set(stat: js.Array[String], value: String, tags: Tags): Unit = js.native
  def set(stat: js.Array[String], value: Double): Unit = js.native
  def set(stat: js.Array[String], value: Double, callback: StatsCb): Unit = js.native
  def set(
    stat: js.Array[String],
    value: Double,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def set(stat: js.Array[String], value: Double, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def set(stat: js.Array[String], value: Double, sampleRate: Double): Unit = js.native
  def set(stat: js.Array[String], value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
  def set(
    stat: js.Array[String],
    value: Double,
    sampleRate: Double,
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def set(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags): Unit = js.native
  def set(stat: js.Array[String], value: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def set(stat: js.Array[String], value: Double, tags: Tags): Unit = js.native
  
  var socket: Socket = js.native
  
  def timer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, R], stat: String): js.Function1[/* args */ P, R] = js.native
  def timer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, R], stat: String, callback: StatsCb): js.Function1[/* args */ P, R] = js.native
  def timer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, R],
    stat: String,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): js.Function1[/* args */ P, R] = js.native
  def timer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, R],
    stat: String,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: Tags
  ): js.Function1[/* args */ P, R] = js.native
  def timer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, R], stat: String, sampleRate: Double): js.Function1[/* args */ P, R] = js.native
  def timer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, R], stat: String, sampleRate: Double, callback: StatsCb): js.Function1[/* args */ P, R] = js.native
  def timer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, R],
    stat: String,
    sampleRate: Double,
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): js.Function1[/* args */ P, R] = js.native
  def timer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, R], stat: String, sampleRate: Double, tags: Tags): js.Function1[/* args */ P, R] = js.native
  def timer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, R], stat: String, tags: js.UndefOr[Tags], callback: StatsCb): js.Function1[/* args */ P, R] = js.native
  def timer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, R], stat: String, tags: Tags): js.Function1[/* args */ P, R] = js.native
  def timer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, R], stat: js.Array[String]): js.Function1[/* args */ P, R] = js.native
  def timer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, R], stat: js.Array[String], callback: StatsCb): js.Function1[/* args */ P, R] = js.native
  def timer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, R],
    stat: js.Array[String],
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): js.Function1[/* args */ P, R] = js.native
  def timer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, R],
    stat: js.Array[String],
    sampleRate: js.UndefOr[scala.Nothing],
    tags: Tags
  ): js.Function1[/* args */ P, R] = js.native
  def timer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, R], stat: js.Array[String], sampleRate: Double): js.Function1[/* args */ P, R] = js.native
  def timer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, R], stat: js.Array[String], sampleRate: Double, callback: StatsCb): js.Function1[/* args */ P, R] = js.native
  def timer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, R],
    stat: js.Array[String],
    sampleRate: Double,
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): js.Function1[/* args */ P, R] = js.native
  def timer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, R], stat: js.Array[String], sampleRate: Double, tags: Tags): js.Function1[/* args */ P, R] = js.native
  def timer[P /* <: js.Array[_] */, R](
    func: js.Function1[/* args */ P, R],
    stat: js.Array[String],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): js.Function1[/* args */ P, R] = js.native
  def timer[P /* <: js.Array[_] */, R](func: js.Function1[/* args */ P, R], stat: js.Array[String], tags: Tags): js.Function1[/* args */ P, R] = js.native
  
  def timing(stat: String, value: Double): Unit = js.native
  def timing(stat: String, value: Double, callback: StatsCb): Unit = js.native
  def timing(
    stat: String,
    value: Double,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def timing(stat: String, value: Double, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def timing(stat: String, value: Double, sampleRate: Double): Unit = js.native
  def timing(stat: String, value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
  def timing(stat: String, value: Double, sampleRate: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def timing(stat: String, value: Double, sampleRate: Double, tags: Tags): Unit = js.native
  def timing(stat: String, value: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def timing(stat: String, value: Double, tags: Tags): Unit = js.native
  def timing(stat: String, value: Date): Unit = js.native
  def timing(stat: String, value: Date, callback: StatsCb): Unit = js.native
  def timing(
    stat: String,
    value: Date,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def timing(stat: String, value: Date, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def timing(stat: String, value: Date, sampleRate: Double): Unit = js.native
  def timing(stat: String, value: Date, sampleRate: Double, callback: StatsCb): Unit = js.native
  def timing(stat: String, value: Date, sampleRate: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def timing(stat: String, value: Date, sampleRate: Double, tags: Tags): Unit = js.native
  def timing(stat: String, value: Date, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def timing(stat: String, value: Date, tags: Tags): Unit = js.native
  def timing(stat: js.Array[String], value: Double): Unit = js.native
  def timing(stat: js.Array[String], value: Double, callback: StatsCb): Unit = js.native
  def timing(
    stat: js.Array[String],
    value: Double,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def timing(stat: js.Array[String], value: Double, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def timing(stat: js.Array[String], value: Double, sampleRate: Double): Unit = js.native
  def timing(stat: js.Array[String], value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
  def timing(
    stat: js.Array[String],
    value: Double,
    sampleRate: Double,
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def timing(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags): Unit = js.native
  def timing(stat: js.Array[String], value: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def timing(stat: js.Array[String], value: Double, tags: Tags): Unit = js.native
  def timing(stat: js.Array[String], value: Date): Unit = js.native
  def timing(stat: js.Array[String], value: Date, callback: StatsCb): Unit = js.native
  def timing(
    stat: js.Array[String],
    value: Date,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def timing(stat: js.Array[String], value: Date, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def timing(stat: js.Array[String], value: Date, sampleRate: Double): Unit = js.native
  def timing(stat: js.Array[String], value: Date, sampleRate: Double, callback: StatsCb): Unit = js.native
  def timing(stat: js.Array[String], value: Date, sampleRate: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def timing(stat: js.Array[String], value: Date, sampleRate: Double, tags: Tags): Unit = js.native
  def timing(stat: js.Array[String], value: Date, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def timing(stat: js.Array[String], value: Date, tags: Tags): Unit = js.native
  
  def unique(stat: String, value: String): Unit = js.native
  def unique(stat: String, value: String, callback: StatsCb): Unit = js.native
  def unique(
    stat: String,
    value: String,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def unique(stat: String, value: String, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def unique(stat: String, value: String, sampleRate: Double): Unit = js.native
  def unique(stat: String, value: String, sampleRate: Double, callback: StatsCb): Unit = js.native
  def unique(stat: String, value: String, sampleRate: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def unique(stat: String, value: String, sampleRate: Double, tags: Tags): Unit = js.native
  def unique(stat: String, value: String, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def unique(stat: String, value: String, tags: Tags): Unit = js.native
  def unique(stat: String, value: Double): Unit = js.native
  def unique(stat: String, value: Double, callback: StatsCb): Unit = js.native
  def unique(
    stat: String,
    value: Double,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def unique(stat: String, value: Double, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def unique(stat: String, value: Double, sampleRate: Double): Unit = js.native
  def unique(stat: String, value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
  def unique(stat: String, value: Double, sampleRate: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def unique(stat: String, value: Double, sampleRate: Double, tags: Tags): Unit = js.native
  def unique(stat: String, value: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def unique(stat: String, value: Double, tags: Tags): Unit = js.native
  def unique(stat: js.Array[String], value: String): Unit = js.native
  def unique(stat: js.Array[String], value: String, callback: StatsCb): Unit = js.native
  def unique(
    stat: js.Array[String],
    value: String,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def unique(stat: js.Array[String], value: String, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def unique(stat: js.Array[String], value: String, sampleRate: Double): Unit = js.native
  def unique(stat: js.Array[String], value: String, sampleRate: Double, callback: StatsCb): Unit = js.native
  def unique(
    stat: js.Array[String],
    value: String,
    sampleRate: Double,
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def unique(stat: js.Array[String], value: String, sampleRate: Double, tags: Tags): Unit = js.native
  def unique(stat: js.Array[String], value: String, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def unique(stat: js.Array[String], value: String, tags: Tags): Unit = js.native
  def unique(stat: js.Array[String], value: Double): Unit = js.native
  def unique(stat: js.Array[String], value: Double, callback: StatsCb): Unit = js.native
  def unique(
    stat: js.Array[String],
    value: Double,
    sampleRate: js.UndefOr[scala.Nothing],
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def unique(stat: js.Array[String], value: Double, sampleRate: js.UndefOr[scala.Nothing], tags: Tags): Unit = js.native
  def unique(stat: js.Array[String], value: Double, sampleRate: Double): Unit = js.native
  def unique(stat: js.Array[String], value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
  def unique(
    stat: js.Array[String],
    value: Double,
    sampleRate: Double,
    tags: js.UndefOr[Tags],
    callback: StatsCb
  ): Unit = js.native
  def unique(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags): Unit = js.native
  def unique(stat: js.Array[String], value: Double, tags: js.UndefOr[Tags], callback: StatsCb): Unit = js.native
  def unique(stat: js.Array[String], value: Double, tags: Tags): Unit = js.native
}
