package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the retry policy in case of function&#39;s execution failure. A
  * function execution will be retried on any failure. A failed execution will
  * be retried up to 7 days with an exponential backoff (capped at 10 seconds).
  * Retried execution is charged as any other execution.
  */
@js.native
trait SchemaRetry extends js.Object

