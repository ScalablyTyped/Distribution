package typings.jsDashYaml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsDashYamlStrings {
  @js.native
  sealed trait mapping extends js.Object
  
  @js.native
  sealed trait scalar extends js.Object
  
  @js.native
  sealed trait sequence extends js.Object
  
  @scala.inline
  def mapping: mapping = "mapping".asInstanceOf[mapping]
  @scala.inline
  def scalar: scalar = "scalar".asInstanceOf[scalar]
  @scala.inline
  def sequence: sequence = "sequence".asInstanceOf[sequence]
}

