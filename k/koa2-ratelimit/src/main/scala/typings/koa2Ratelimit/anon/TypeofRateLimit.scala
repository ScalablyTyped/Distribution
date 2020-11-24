package typings.koa2Ratelimit.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.koa2Ratelimit.mod.TimeKeyObject
import typings.koa2Ratelimit.rateLimitMod.RateLimit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRateLimit
  extends Instantiable0[RateLimit]
     with Instantiable1[/* options */ PartialRateLimitOptions, RateLimit] {
  
  def timeToMs(time: Double): Double = js.native
  def timeToMs(time: TimeKeyObject): Double = js.native
}
