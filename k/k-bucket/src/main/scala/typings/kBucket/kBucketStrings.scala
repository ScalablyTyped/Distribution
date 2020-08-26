package typings.kBucket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object kBucketStrings {
  @js.native
  sealed trait added extends js.Object
  
  @js.native
  sealed trait ping extends js.Object
  
  @js.native
  sealed trait removed extends js.Object
  
  @js.native
  sealed trait updated extends js.Object
  
  @scala.inline
  def added: added = "added".asInstanceOf[added]
  @scala.inline
  def ping: ping = "ping".asInstanceOf[ping]
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
  @scala.inline
  def updated: updated = "updated".asInstanceOf[updated]
}

