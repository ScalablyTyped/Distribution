package typings
package jsDashYamlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsDashYamlLibStrings {
  @js.native
  sealed trait mapping extends js.Object
  
  @js.native
  sealed trait scalar extends js.Object
  
  @js.native
  sealed trait sequence extends js.Object
  
  def mapping: mapping = "mapping".asInstanceOf[mapping]
  def scalar: scalar = "scalar".asInstanceOf[scalar]
  def sequence: sequence = "sequence".asInstanceOf[sequence]
}

