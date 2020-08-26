package typings.jestEnvironment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jestEnvironmentStrings {
  @js.native
  sealed trait legacy extends js.Object
  
  @js.native
  sealed trait modern extends js.Object
  
  @scala.inline
  def legacy: legacy = "legacy".asInstanceOf[legacy]
  @scala.inline
  def modern: modern = "modern".asInstanceOf[modern]
}

