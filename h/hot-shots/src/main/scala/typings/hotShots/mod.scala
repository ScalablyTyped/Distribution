package typings.hotShots

import org.scalablytyped.runtime.StringDictionary
import typings.hotShots.anon.Buffer
import typings.hotShots.hotShotsNumbers.`0`
import typings.hotShots.hotShotsNumbers.`1`
import typings.hotShots.hotShotsNumbers.`2`
import typings.hotShots.hotShotsNumbers.`3`
import typings.hotShots.hotShotsStrings.error
import typings.hotShots.hotShotsStrings.info
import typings.hotShots.hotShotsStrings.low
import typings.hotShots.hotShotsStrings.normal
import typings.hotShots.hotShotsStrings.success
import typings.hotShots.hotShotsStrings.tcp
import typings.hotShots.hotShotsStrings.udp
import typings.hotShots.hotShotsStrings.uds
import typings.hotShots.hotShotsStrings.warning
import typings.node.dgramMod.Socket
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hot-shots", "StatsD")
  @js.native
  class StatsD () extends StObject {
    def this(options: ClientOptions) = this()
    
    var CHECKS: DatadogChecks = js.native
    
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, callback: StatsCb): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, sampleRate: Double): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: String,
      sampleRate: Double,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: String,
      sampleRate: Double,
      tags: Unit,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, sampleRate: Double, tags: Tags): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: String,
      sampleRate: Double,
      tags: Tags,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: String,
      sampleRate: Unit,
      tags: Unit,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, sampleRate: Unit, tags: Tags): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: String,
      sampleRate: Unit,
      tags: Tags,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, tags: Unit, callback: StatsCb): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, tags: Tags): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, tags: Tags, callback: StatsCb): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: js.Array[String]): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: js.Array[String], callback: StatsCb): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: js.Array[String], sampleRate: Double): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: js.Array[String],
      sampleRate: Double,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: js.Array[String],
      sampleRate: Double,
      tags: Unit,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: js.Array[String],
      sampleRate: Double,
      tags: Tags
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: js.Array[String],
      sampleRate: Double,
      tags: Tags,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: js.Array[String],
      sampleRate: Unit,
      tags: Unit,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: js.Array[String],
      sampleRate: Unit,
      tags: Tags
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: js.Array[String],
      sampleRate: Unit,
      tags: Tags,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: js.Array[String],
      tags: Unit,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: js.Array[String], tags: Tags): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncDistTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: js.Array[String],
      tags: Tags,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    
    def asyncTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, callback: StatsCb): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, sampleRate: Double): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: String,
      sampleRate: Double,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: String,
      sampleRate: Double,
      tags: Unit,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, sampleRate: Double, tags: Tags): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: String,
      sampleRate: Double,
      tags: Tags,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: String,
      sampleRate: Unit,
      tags: Unit,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, sampleRate: Unit, tags: Tags): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: String,
      sampleRate: Unit,
      tags: Tags,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, tags: Unit, callback: StatsCb): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, tags: Tags): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: String, tags: Tags, callback: StatsCb): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: js.Array[String]): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: js.Array[String], callback: StatsCb): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: js.Array[String], sampleRate: Double): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: js.Array[String],
      sampleRate: Double,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: js.Array[String],
      sampleRate: Double,
      tags: Unit,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: js.Array[String],
      sampleRate: Double,
      tags: Tags
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: js.Array[String],
      sampleRate: Double,
      tags: Tags,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: js.Array[String],
      sampleRate: Unit,
      tags: Unit,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: js.Array[String],
      sampleRate: Unit,
      tags: Tags
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: js.Array[String],
      sampleRate: Unit,
      tags: Tags,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: js.Array[String],
      tags: Unit,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, js.Promise[R]], stat: js.Array[String], tags: Tags): js.Function1[/* args */ P, js.Promise[R]] = js.native
    def asyncTimer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, js.Promise[R]],
      stat: js.Array[String],
      tags: Tags,
      callback: StatsCb
    ): js.Function1[/* args */ P, js.Promise[R]] = js.native
    
    def check(name: String, status: DatadogChecksValues): Unit = js.native
    def check(name: String, status: DatadogChecksValues, options: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def check(name: String, status: DatadogChecksValues, options: Unit, tags: Tags): Unit = js.native
    def check(name: String, status: DatadogChecksValues, options: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def check(name: String, status: DatadogChecksValues, options: CheckOptions): Unit = js.native
    def check(name: String, status: DatadogChecksValues, options: CheckOptions, tags: Unit, callback: StatsCb): Unit = js.native
    def check(name: String, status: DatadogChecksValues, options: CheckOptions, tags: Tags): Unit = js.native
    def check(name: String, status: DatadogChecksValues, options: CheckOptions, tags: Tags, callback: StatsCb): Unit = js.native
    
    def childClient(): StatsD = js.native
    def childClient(options: ChildClientOptions): StatsD = js.native
    
    def close(callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
    
    def decrement(stat: String): Unit = js.native
    def decrement(stat: String, value: Double): Unit = js.native
    def decrement(stat: String, value: Double, callback: StatsCb): Unit = js.native
    def decrement(stat: String, value: Double, sampleRate: Double): Unit = js.native
    def decrement(stat: String, value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
    def decrement(stat: String, value: Double, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def decrement(stat: String, value: Double, sampleRate: Double, tags: Tags): Unit = js.native
    def decrement(stat: String, value: Double, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def decrement(stat: String, value: Double, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def decrement(stat: String, value: Double, sampleRate: Unit, tags: Tags): Unit = js.native
    def decrement(stat: String, value: Double, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def decrement(stat: String, value: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def decrement(stat: String, value: Double, tags: Tags): Unit = js.native
    def decrement(stat: String, value: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def decrement(stat: js.Array[String], value: Double): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, callback: StatsCb): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, sampleRate: Double): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Tags): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, tags: Tags): Unit = js.native
    def decrement(stat: js.Array[String], value: Double, tags: Tags, callback: StatsCb): Unit = js.native
    
    def distribution(stat: String, value: Double): Unit = js.native
    def distribution(stat: String, value: Double, callback: StatsCb): Unit = js.native
    def distribution(stat: String, value: Double, sampleRate: Double): Unit = js.native
    def distribution(stat: String, value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
    def distribution(stat: String, value: Double, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def distribution(stat: String, value: Double, sampleRate: Double, tags: Tags): Unit = js.native
    def distribution(stat: String, value: Double, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def distribution(stat: String, value: Double, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def distribution(stat: String, value: Double, sampleRate: Unit, tags: Tags): Unit = js.native
    def distribution(stat: String, value: Double, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def distribution(stat: String, value: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def distribution(stat: String, value: Double, tags: Tags): Unit = js.native
    def distribution(stat: String, value: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def distribution(stat: js.Array[String], value: Double): Unit = js.native
    def distribution(stat: js.Array[String], value: Double, callback: StatsCb): Unit = js.native
    def distribution(stat: js.Array[String], value: Double, sampleRate: Double): Unit = js.native
    def distribution(stat: js.Array[String], value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
    def distribution(stat: js.Array[String], value: Double, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def distribution(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags): Unit = js.native
    def distribution(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def distribution(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def distribution(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Tags): Unit = js.native
    def distribution(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def distribution(stat: js.Array[String], value: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def distribution(stat: js.Array[String], value: Double, tags: Tags): Unit = js.native
    def distribution(stat: js.Array[String], value: Double, tags: Tags, callback: StatsCb): Unit = js.native
    
    def event(title: String): Unit = js.native
    def event(title: String, text: String): Unit = js.native
    def event(title: String, text: String, options: Unit, callback: StatsCb): Unit = js.native
    def event(title: String, text: String, options: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def event(title: String, text: String, options: Unit, tags: Tags): Unit = js.native
    def event(title: String, text: String, options: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def event(title: String, text: String, options: EventOptions): Unit = js.native
    def event(title: String, text: String, options: EventOptions, callback: StatsCb): Unit = js.native
    def event(title: String, text: String, options: EventOptions, tags: Unit, callback: StatsCb): Unit = js.native
    def event(title: String, text: String, options: EventOptions, tags: Tags): Unit = js.native
    def event(title: String, text: String, options: EventOptions, tags: Tags, callback: StatsCb): Unit = js.native
    def event(title: String, text: Unit, options: Unit, callback: StatsCb): Unit = js.native
    def event(title: String, text: Unit, options: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def event(title: String, text: Unit, options: Unit, tags: Tags): Unit = js.native
    def event(title: String, text: Unit, options: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def event(title: String, text: Unit, options: EventOptions): Unit = js.native
    def event(title: String, text: Unit, options: EventOptions, callback: StatsCb): Unit = js.native
    def event(title: String, text: Unit, options: EventOptions, tags: Unit, callback: StatsCb): Unit = js.native
    def event(title: String, text: Unit, options: EventOptions, tags: Tags): Unit = js.native
    def event(title: String, text: Unit, options: EventOptions, tags: Tags, callback: StatsCb): Unit = js.native
    
    def gauge(stat: String, value: Double): Unit = js.native
    def gauge(stat: String, value: Double, callback: StatsCb): Unit = js.native
    def gauge(stat: String, value: Double, sampleRate: Double): Unit = js.native
    def gauge(stat: String, value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
    def gauge(stat: String, value: Double, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def gauge(stat: String, value: Double, sampleRate: Double, tags: Tags): Unit = js.native
    def gauge(stat: String, value: Double, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def gauge(stat: String, value: Double, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def gauge(stat: String, value: Double, sampleRate: Unit, tags: Tags): Unit = js.native
    def gauge(stat: String, value: Double, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def gauge(stat: String, value: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def gauge(stat: String, value: Double, tags: Tags): Unit = js.native
    def gauge(stat: String, value: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def gauge(stat: js.Array[String], value: Double): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, callback: StatsCb): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, sampleRate: Double): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Tags): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, tags: Tags): Unit = js.native
    def gauge(stat: js.Array[String], value: Double, tags: Tags, callback: StatsCb): Unit = js.native
    
    def histogram(stat: String, value: Double): Unit = js.native
    def histogram(stat: String, value: Double, callback: StatsCb): Unit = js.native
    def histogram(stat: String, value: Double, sampleRate: Double): Unit = js.native
    def histogram(stat: String, value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
    def histogram(stat: String, value: Double, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def histogram(stat: String, value: Double, sampleRate: Double, tags: Tags): Unit = js.native
    def histogram(stat: String, value: Double, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def histogram(stat: String, value: Double, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def histogram(stat: String, value: Double, sampleRate: Unit, tags: Tags): Unit = js.native
    def histogram(stat: String, value: Double, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def histogram(stat: String, value: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def histogram(stat: String, value: Double, tags: Tags): Unit = js.native
    def histogram(stat: String, value: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def histogram(stat: js.Array[String], value: Double): Unit = js.native
    def histogram(stat: js.Array[String], value: Double, callback: StatsCb): Unit = js.native
    def histogram(stat: js.Array[String], value: Double, sampleRate: Double): Unit = js.native
    def histogram(stat: js.Array[String], value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
    def histogram(stat: js.Array[String], value: Double, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def histogram(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags): Unit = js.native
    def histogram(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def histogram(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def histogram(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Tags): Unit = js.native
    def histogram(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def histogram(stat: js.Array[String], value: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def histogram(stat: js.Array[String], value: Double, tags: Tags): Unit = js.native
    def histogram(stat: js.Array[String], value: Double, tags: Tags, callback: StatsCb): Unit = js.native
    
    def increment(stat: String): Unit = js.native
    def increment(stat: String, tags: Tags): Unit = js.native
    def increment(stat: String, value: Double): Unit = js.native
    def increment(stat: String, value: Double, callback: StatsCb): Unit = js.native
    def increment(stat: String, value: Double, sampleRate: Double): Unit = js.native
    def increment(stat: String, value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
    def increment(stat: String, value: Double, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def increment(stat: String, value: Double, sampleRate: Double, tags: Tags): Unit = js.native
    def increment(stat: String, value: Double, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def increment(stat: String, value: Double, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def increment(stat: String, value: Double, sampleRate: Unit, tags: Tags): Unit = js.native
    def increment(stat: String, value: Double, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def increment(stat: String, value: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def increment(stat: String, value: Double, tags: Tags): Unit = js.native
    def increment(stat: String, value: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def increment(stat: js.Array[String], value: Double): Unit = js.native
    def increment(stat: js.Array[String], value: Double, callback: StatsCb): Unit = js.native
    def increment(stat: js.Array[String], value: Double, sampleRate: Double): Unit = js.native
    def increment(stat: js.Array[String], value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
    def increment(stat: js.Array[String], value: Double, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def increment(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags): Unit = js.native
    def increment(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def increment(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def increment(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Tags): Unit = js.native
    def increment(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def increment(stat: js.Array[String], value: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def increment(stat: js.Array[String], value: Double, tags: Tags): Unit = js.native
    def increment(stat: js.Array[String], value: Double, tags: Tags, callback: StatsCb): Unit = js.native
    
    var mockBuffer: js.UndefOr[js.Array[String]] = js.native
    
    def set(stat: String, value: String): Unit = js.native
    def set(stat: String, value: String, callback: StatsCb): Unit = js.native
    def set(stat: String, value: String, sampleRate: Double): Unit = js.native
    def set(stat: String, value: String, sampleRate: Double, callback: StatsCb): Unit = js.native
    def set(stat: String, value: String, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def set(stat: String, value: String, sampleRate: Double, tags: Tags): Unit = js.native
    def set(stat: String, value: String, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def set(stat: String, value: String, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def set(stat: String, value: String, sampleRate: Unit, tags: Tags): Unit = js.native
    def set(stat: String, value: String, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def set(stat: String, value: String, tags: Unit, callback: StatsCb): Unit = js.native
    def set(stat: String, value: String, tags: Tags): Unit = js.native
    def set(stat: String, value: String, tags: Tags, callback: StatsCb): Unit = js.native
    def set(stat: String, value: Double): Unit = js.native
    def set(stat: String, value: Double, callback: StatsCb): Unit = js.native
    def set(stat: String, value: Double, sampleRate: Double): Unit = js.native
    def set(stat: String, value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
    def set(stat: String, value: Double, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def set(stat: String, value: Double, sampleRate: Double, tags: Tags): Unit = js.native
    def set(stat: String, value: Double, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def set(stat: String, value: Double, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def set(stat: String, value: Double, sampleRate: Unit, tags: Tags): Unit = js.native
    def set(stat: String, value: Double, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def set(stat: String, value: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def set(stat: String, value: Double, tags: Tags): Unit = js.native
    def set(stat: String, value: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def set(stat: js.Array[String], value: String): Unit = js.native
    def set(stat: js.Array[String], value: String, callback: StatsCb): Unit = js.native
    def set(stat: js.Array[String], value: String, sampleRate: Double): Unit = js.native
    def set(stat: js.Array[String], value: String, sampleRate: Double, callback: StatsCb): Unit = js.native
    def set(stat: js.Array[String], value: String, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def set(stat: js.Array[String], value: String, sampleRate: Double, tags: Tags): Unit = js.native
    def set(stat: js.Array[String], value: String, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def set(stat: js.Array[String], value: String, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def set(stat: js.Array[String], value: String, sampleRate: Unit, tags: Tags): Unit = js.native
    def set(stat: js.Array[String], value: String, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def set(stat: js.Array[String], value: String, tags: Unit, callback: StatsCb): Unit = js.native
    def set(stat: js.Array[String], value: String, tags: Tags): Unit = js.native
    def set(stat: js.Array[String], value: String, tags: Tags, callback: StatsCb): Unit = js.native
    def set(stat: js.Array[String], value: Double): Unit = js.native
    def set(stat: js.Array[String], value: Double, callback: StatsCb): Unit = js.native
    def set(stat: js.Array[String], value: Double, sampleRate: Double): Unit = js.native
    def set(stat: js.Array[String], value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
    def set(stat: js.Array[String], value: Double, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def set(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags): Unit = js.native
    def set(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def set(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def set(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Tags): Unit = js.native
    def set(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def set(stat: js.Array[String], value: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def set(stat: js.Array[String], value: Double, tags: Tags): Unit = js.native
    def set(stat: js.Array[String], value: Double, tags: Tags, callback: StatsCb): Unit = js.native
    
    var socket: Socket = js.native
    
    def timer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, R], stat: String): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, R], stat: String, callback: StatsCb): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, R], stat: String, sampleRate: Double): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, R], stat: String, sampleRate: Double, callback: StatsCb): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, R],
      stat: String,
      sampleRate: Double,
      tags: Unit,
      callback: StatsCb
    ): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, R], stat: String, sampleRate: Double, tags: Tags): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, R],
      stat: String,
      sampleRate: Double,
      tags: Tags,
      callback: StatsCb
    ): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, R], stat: String, sampleRate: Unit, tags: Unit, callback: StatsCb): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, R], stat: String, sampleRate: Unit, tags: Tags): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, R], stat: String, sampleRate: Unit, tags: Tags, callback: StatsCb): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, R], stat: String, tags: Unit, callback: StatsCb): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, R], stat: String, tags: Tags): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, R], stat: String, tags: Tags, callback: StatsCb): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, R], stat: js.Array[String]): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, R], stat: js.Array[String], callback: StatsCb): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, R], stat: js.Array[String], sampleRate: Double): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, R], stat: js.Array[String], sampleRate: Double, callback: StatsCb): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, R],
      stat: js.Array[String],
      sampleRate: Double,
      tags: Unit,
      callback: StatsCb
    ): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, R], stat: js.Array[String], sampleRate: Double, tags: Tags): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, R],
      stat: js.Array[String],
      sampleRate: Double,
      tags: Tags,
      callback: StatsCb
    ): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, R],
      stat: js.Array[String],
      sampleRate: Unit,
      tags: Unit,
      callback: StatsCb
    ): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, R], stat: js.Array[String], sampleRate: Unit, tags: Tags): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](
      func: js.Function1[/* args */ P, R],
      stat: js.Array[String],
      sampleRate: Unit,
      tags: Tags,
      callback: StatsCb
    ): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, R], stat: js.Array[String], tags: Unit, callback: StatsCb): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, R], stat: js.Array[String], tags: Tags): js.Function1[/* args */ P, R] = js.native
    def timer[P /* <: js.Array[js.Any] */, R](func: js.Function1[/* args */ P, R], stat: js.Array[String], tags: Tags, callback: StatsCb): js.Function1[/* args */ P, R] = js.native
    
    def timing(stat: String, value: Double): Unit = js.native
    def timing(stat: String, value: Double, callback: StatsCb): Unit = js.native
    def timing(stat: String, value: Double, sampleRate: Double): Unit = js.native
    def timing(stat: String, value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
    def timing(stat: String, value: Double, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def timing(stat: String, value: Double, sampleRate: Double, tags: Tags): Unit = js.native
    def timing(stat: String, value: Double, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def timing(stat: String, value: Double, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def timing(stat: String, value: Double, sampleRate: Unit, tags: Tags): Unit = js.native
    def timing(stat: String, value: Double, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def timing(stat: String, value: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def timing(stat: String, value: Double, tags: Tags): Unit = js.native
    def timing(stat: String, value: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def timing(stat: String, value: Date): Unit = js.native
    def timing(stat: String, value: Date, callback: StatsCb): Unit = js.native
    def timing(stat: String, value: Date, sampleRate: Double): Unit = js.native
    def timing(stat: String, value: Date, sampleRate: Double, callback: StatsCb): Unit = js.native
    def timing(stat: String, value: Date, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def timing(stat: String, value: Date, sampleRate: Double, tags: Tags): Unit = js.native
    def timing(stat: String, value: Date, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def timing(stat: String, value: Date, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def timing(stat: String, value: Date, sampleRate: Unit, tags: Tags): Unit = js.native
    def timing(stat: String, value: Date, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def timing(stat: String, value: Date, tags: Unit, callback: StatsCb): Unit = js.native
    def timing(stat: String, value: Date, tags: Tags): Unit = js.native
    def timing(stat: String, value: Date, tags: Tags, callback: StatsCb): Unit = js.native
    def timing(stat: js.Array[String], value: Double): Unit = js.native
    def timing(stat: js.Array[String], value: Double, callback: StatsCb): Unit = js.native
    def timing(stat: js.Array[String], value: Double, sampleRate: Double): Unit = js.native
    def timing(stat: js.Array[String], value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
    def timing(stat: js.Array[String], value: Double, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def timing(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags): Unit = js.native
    def timing(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def timing(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def timing(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Tags): Unit = js.native
    def timing(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def timing(stat: js.Array[String], value: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def timing(stat: js.Array[String], value: Double, tags: Tags): Unit = js.native
    def timing(stat: js.Array[String], value: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def timing(stat: js.Array[String], value: Date): Unit = js.native
    def timing(stat: js.Array[String], value: Date, callback: StatsCb): Unit = js.native
    def timing(stat: js.Array[String], value: Date, sampleRate: Double): Unit = js.native
    def timing(stat: js.Array[String], value: Date, sampleRate: Double, callback: StatsCb): Unit = js.native
    def timing(stat: js.Array[String], value: Date, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def timing(stat: js.Array[String], value: Date, sampleRate: Double, tags: Tags): Unit = js.native
    def timing(stat: js.Array[String], value: Date, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def timing(stat: js.Array[String], value: Date, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def timing(stat: js.Array[String], value: Date, sampleRate: Unit, tags: Tags): Unit = js.native
    def timing(stat: js.Array[String], value: Date, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def timing(stat: js.Array[String], value: Date, tags: Unit, callback: StatsCb): Unit = js.native
    def timing(stat: js.Array[String], value: Date, tags: Tags): Unit = js.native
    def timing(stat: js.Array[String], value: Date, tags: Tags, callback: StatsCb): Unit = js.native
    
    def unique(stat: String, value: String): Unit = js.native
    def unique(stat: String, value: String, callback: StatsCb): Unit = js.native
    def unique(stat: String, value: String, sampleRate: Double): Unit = js.native
    def unique(stat: String, value: String, sampleRate: Double, callback: StatsCb): Unit = js.native
    def unique(stat: String, value: String, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def unique(stat: String, value: String, sampleRate: Double, tags: Tags): Unit = js.native
    def unique(stat: String, value: String, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def unique(stat: String, value: String, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def unique(stat: String, value: String, sampleRate: Unit, tags: Tags): Unit = js.native
    def unique(stat: String, value: String, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def unique(stat: String, value: String, tags: Unit, callback: StatsCb): Unit = js.native
    def unique(stat: String, value: String, tags: Tags): Unit = js.native
    def unique(stat: String, value: String, tags: Tags, callback: StatsCb): Unit = js.native
    def unique(stat: String, value: Double): Unit = js.native
    def unique(stat: String, value: Double, callback: StatsCb): Unit = js.native
    def unique(stat: String, value: Double, sampleRate: Double): Unit = js.native
    def unique(stat: String, value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
    def unique(stat: String, value: Double, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def unique(stat: String, value: Double, sampleRate: Double, tags: Tags): Unit = js.native
    def unique(stat: String, value: Double, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def unique(stat: String, value: Double, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def unique(stat: String, value: Double, sampleRate: Unit, tags: Tags): Unit = js.native
    def unique(stat: String, value: Double, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def unique(stat: String, value: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def unique(stat: String, value: Double, tags: Tags): Unit = js.native
    def unique(stat: String, value: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def unique(stat: js.Array[String], value: String): Unit = js.native
    def unique(stat: js.Array[String], value: String, callback: StatsCb): Unit = js.native
    def unique(stat: js.Array[String], value: String, sampleRate: Double): Unit = js.native
    def unique(stat: js.Array[String], value: String, sampleRate: Double, callback: StatsCb): Unit = js.native
    def unique(stat: js.Array[String], value: String, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def unique(stat: js.Array[String], value: String, sampleRate: Double, tags: Tags): Unit = js.native
    def unique(stat: js.Array[String], value: String, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def unique(stat: js.Array[String], value: String, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def unique(stat: js.Array[String], value: String, sampleRate: Unit, tags: Tags): Unit = js.native
    def unique(stat: js.Array[String], value: String, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def unique(stat: js.Array[String], value: String, tags: Unit, callback: StatsCb): Unit = js.native
    def unique(stat: js.Array[String], value: String, tags: Tags): Unit = js.native
    def unique(stat: js.Array[String], value: String, tags: Tags, callback: StatsCb): Unit = js.native
    def unique(stat: js.Array[String], value: Double): Unit = js.native
    def unique(stat: js.Array[String], value: Double, callback: StatsCb): Unit = js.native
    def unique(stat: js.Array[String], value: Double, sampleRate: Double): Unit = js.native
    def unique(stat: js.Array[String], value: Double, sampleRate: Double, callback: StatsCb): Unit = js.native
    def unique(stat: js.Array[String], value: Double, sampleRate: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def unique(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags): Unit = js.native
    def unique(stat: js.Array[String], value: Double, sampleRate: Double, tags: Tags, callback: StatsCb): Unit = js.native
    def unique(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Unit, callback: StatsCb): Unit = js.native
    def unique(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Tags): Unit = js.native
    def unique(stat: js.Array[String], value: Double, sampleRate: Unit, tags: Tags, callback: StatsCb): Unit = js.native
    def unique(stat: js.Array[String], value: Double, tags: Unit, callback: StatsCb): Unit = js.native
    def unique(stat: js.Array[String], value: Double, tags: Tags): Unit = js.native
    def unique(stat: js.Array[String], value: Double, tags: Tags, callback: StatsCb): Unit = js.native
  }
  
  trait CheckOptions extends StObject {
    
    var date_happened: js.UndefOr[Date] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
  }
  object CheckOptions {
    
    @scala.inline
    def apply(): CheckOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckOptions]
    }
    
    @scala.inline
    implicit class CheckOptionsMutableBuilder[Self <: CheckOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate_happened(value: Date): Self = StObject.set(x, "date_happened", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate_happenedUndefined: Self = StObject.set(x, "date_happened", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  trait ChildClientOptions extends StObject {
    
    var globalTags: js.UndefOr[Tags] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
  }
  object ChildClientOptions {
    
    @scala.inline
    def apply(): ChildClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChildClientOptions]
    }
    
    @scala.inline
    implicit class ChildClientOptionsMutableBuilder[Self <: ChildClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalTags(value: Tags): Self = StObject.set(x, "globalTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTagsUndefined: Self = StObject.set(x, "globalTags", js.undefined)
      
      @scala.inline
      def setGlobalTagsVarargs(value: String*): Self = StObject.set(x, "globalTags", js.Array(value :_*))
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  trait ClientOptions extends StObject {
    
    var bufferFlushInterval: js.UndefOr[Double] = js.undefined
    
    var bufferHolder: js.UndefOr[Buffer] = js.undefined
    
    var cacheDns: js.UndefOr[Boolean] = js.undefined
    
    var cacheDnsTtl: js.UndefOr[Double] = js.undefined
    
    var errorHandler: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.undefined
    
    var globalTags: js.UndefOr[Tags] = js.undefined
    
    var globalize: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var isChild: js.UndefOr[Boolean] = js.undefined
    
    var maxBufferSize: js.UndefOr[Double] = js.undefined
    
    var mock: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var protocol: js.UndefOr[tcp | udp | uds] = js.undefined
    
    var sampleRate: js.UndefOr[Double] = js.undefined
    
    var socket: js.UndefOr[Socket] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
    
    var tagPrefix: js.UndefOr[String] = js.undefined
    
    var tagSeparator: js.UndefOr[String] = js.undefined
    
    var telegraf: js.UndefOr[Boolean] = js.undefined
    
    var udsGracefulErrorHandling: js.UndefOr[Boolean] = js.undefined
    
    var udsGracefulRestartRateLimit: js.UndefOr[Double] = js.undefined
    
    var useDefaultRoute: js.UndefOr[Boolean] = js.undefined
  }
  object ClientOptions {
    
    @scala.inline
    def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBufferFlushInterval(value: Double): Self = StObject.set(x, "bufferFlushInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferFlushIntervalUndefined: Self = StObject.set(x, "bufferFlushInterval", js.undefined)
      
      @scala.inline
      def setBufferHolder(value: Buffer): Self = StObject.set(x, "bufferHolder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferHolderUndefined: Self = StObject.set(x, "bufferHolder", js.undefined)
      
      @scala.inline
      def setCacheDns(value: Boolean): Self = StObject.set(x, "cacheDns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheDnsTtl(value: Double): Self = StObject.set(x, "cacheDnsTtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheDnsTtlUndefined: Self = StObject.set(x, "cacheDnsTtl", js.undefined)
      
      @scala.inline
      def setCacheDnsUndefined: Self = StObject.set(x, "cacheDns", js.undefined)
      
      @scala.inline
      def setErrorHandler(value: /* err */ Error => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      @scala.inline
      def setGlobalTags(value: Tags): Self = StObject.set(x, "globalTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTagsUndefined: Self = StObject.set(x, "globalTags", js.undefined)
      
      @scala.inline
      def setGlobalTagsVarargs(value: String*): Self = StObject.set(x, "globalTags", js.Array(value :_*))
      
      @scala.inline
      def setGlobalize(value: Boolean): Self = StObject.set(x, "globalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalizeUndefined: Self = StObject.set(x, "globalize", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setIsChild(value: Boolean): Self = StObject.set(x, "isChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsChildUndefined: Self = StObject.set(x, "isChild", js.undefined)
      
      @scala.inline
      def setMaxBufferSize(value: Double): Self = StObject.set(x, "maxBufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBufferSizeUndefined: Self = StObject.set(x, "maxBufferSize", js.undefined)
      
      @scala.inline
      def setMock(value: Boolean): Self = StObject.set(x, "mock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMockUndefined: Self = StObject.set(x, "mock", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setProtocol(value: tcp | udp | uds): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
      
      @scala.inline
      def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setTagPrefix(value: String): Self = StObject.set(x, "tagPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagPrefixUndefined: Self = StObject.set(x, "tagPrefix", js.undefined)
      
      @scala.inline
      def setTagSeparator(value: String): Self = StObject.set(x, "tagSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagSeparatorUndefined: Self = StObject.set(x, "tagSeparator", js.undefined)
      
      @scala.inline
      def setTelegraf(value: Boolean): Self = StObject.set(x, "telegraf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTelegrafUndefined: Self = StObject.set(x, "telegraf", js.undefined)
      
      @scala.inline
      def setUdsGracefulErrorHandling(value: Boolean): Self = StObject.set(x, "udsGracefulErrorHandling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUdsGracefulErrorHandlingUndefined: Self = StObject.set(x, "udsGracefulErrorHandling", js.undefined)
      
      @scala.inline
      def setUdsGracefulRestartRateLimit(value: Double): Self = StObject.set(x, "udsGracefulRestartRateLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUdsGracefulRestartRateLimitUndefined: Self = StObject.set(x, "udsGracefulRestartRateLimit", js.undefined)
      
      @scala.inline
      def setUseDefaultRoute(value: Boolean): Self = StObject.set(x, "useDefaultRoute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseDefaultRouteUndefined: Self = StObject.set(x, "useDefaultRoute", js.undefined)
    }
  }
  
  trait DatadogChecks extends StObject {
    
    var CRITICAL: `2`
    
    var OK: `0`
    
    var UNKNOWN: `3`
    
    var WARNING: `1`
  }
  object DatadogChecks {
    
    @scala.inline
    def apply(): DatadogChecks = {
      val __obj = js.Dynamic.literal(CRITICAL = 2, OK = 0, UNKNOWN = 3, WARNING = 1)
      __obj.asInstanceOf[DatadogChecks]
    }
    
    @scala.inline
    implicit class DatadogChecksMutableBuilder[Self <: DatadogChecks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCRITICAL(value: `2`): Self = StObject.set(x, "CRITICAL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOK(value: `0`): Self = StObject.set(x, "OK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUNKNOWN(value: `3`): Self = StObject.set(x, "UNKNOWN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWARNING(value: `1`): Self = StObject.set(x, "WARNING", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined hot-shots.hot-shots.unionFromInterfaceValues4<hot-shots.hot-shots.DatadogChecks, 'OK', 'WARNING', 'CRITICAL', 'UNKNOWN'> */
  /* Rewritten from type alias, can be one of: 
    - typings.hotShots.hotShotsNumbers.`0`
    - typings.hotShots.hotShotsNumbers.`1`
    - typings.hotShots.hotShotsNumbers.`2`
    - typings.hotShots.hotShotsNumbers.`3`
  */
  trait DatadogChecksValues extends StObject
  object DatadogChecksValues {
    
    @scala.inline
    def `0`: typings.hotShots.hotShotsNumbers.`0` = 0.asInstanceOf[typings.hotShots.hotShotsNumbers.`0`]
    
    @scala.inline
    def `1`: typings.hotShots.hotShotsNumbers.`1` = 1.asInstanceOf[typings.hotShots.hotShotsNumbers.`1`]
    
    @scala.inline
    def `2`: typings.hotShots.hotShotsNumbers.`2` = 2.asInstanceOf[typings.hotShots.hotShotsNumbers.`2`]
    
    @scala.inline
    def `3`: typings.hotShots.hotShotsNumbers.`3` = 3.asInstanceOf[typings.hotShots.hotShotsNumbers.`3`]
  }
  
  trait EventOptions extends StObject {
    
    var aggregation_key: js.UndefOr[String] = js.undefined
    
    var alert_type: js.UndefOr[info | warning | success | error] = js.undefined
    
    var date_happened: js.UndefOr[Date] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var priority: js.UndefOr[low | normal] = js.undefined
    
    var source_type_name: js.UndefOr[String] = js.undefined
  }
  object EventOptions {
    
    @scala.inline
    def apply(): EventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventOptions]
    }
    
    @scala.inline
    implicit class EventOptionsMutableBuilder[Self <: EventOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAggregation_key(value: String): Self = StObject.set(x, "aggregation_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggregation_keyUndefined: Self = StObject.set(x, "aggregation_key", js.undefined)
      
      @scala.inline
      def setAlert_type(value: info | warning | success | error): Self = StObject.set(x, "alert_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlert_typeUndefined: Self = StObject.set(x, "alert_type", js.undefined)
      
      @scala.inline
      def setDate_happened(value: Date): Self = StObject.set(x, "date_happened", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate_happenedUndefined: Self = StObject.set(x, "date_happened", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setPriority(value: low | normal): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setSource_type_name(value: String): Self = StObject.set(x, "source_type_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource_type_nameUndefined: Self = StObject.set(x, "source_type_name", js.undefined)
    }
  }
  
  type StatsCb = js.Function2[/* error */ js.UndefOr[Error], /* bytes */ js.Any, Unit]
  
  type Tags = StringDictionary[String] | js.Array[String]
  
  type unionFromInterfaceValues4[T, K1 /* <: /* keyof T */ String */, K2 /* <: /* keyof T */ String */, K3 /* <: /* keyof T */ String */, K4 /* <: /* keyof T */ String */] = /* import warning: importer.ImportType#apply Failed type conversion: T[K1] */ js.Any
}
