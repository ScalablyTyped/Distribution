package typings
package inflationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object inflationLibStrings {
  @js.native
  sealed trait deflate extends js.Object
  
  @js.native
  sealed trait gzip extends js.Object
  
  @js.native
  sealed trait identity extends js.Object
  
  @scala.inline
  def deflate: deflate = "deflate".asInstanceOf[deflate]
  @scala.inline
  def gzip: gzip = "gzip".asInstanceOf[gzip]
  @scala.inline
  def identity: identity = "identity".asInstanceOf[identity]
}

