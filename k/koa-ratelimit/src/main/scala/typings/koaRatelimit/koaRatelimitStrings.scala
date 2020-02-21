package typings.koaRatelimit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object koaRatelimitStrings {
  @js.native
  sealed trait memory extends js.Object
  
  @js.native
  sealed trait redis extends js.Object
  
  @scala.inline
  def memory: memory = "memory".asInstanceOf[memory]
  @scala.inline
  def redis: redis = "redis".asInstanceOf[redis]
}

