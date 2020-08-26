package typings.jestRunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jestRunnerStrings {
  @js.native
  sealed trait `test-case-result` extends js.Object
  
  @js.native
  sealed trait `test-file-failure` extends js.Object
  
  @js.native
  sealed trait `test-file-start` extends js.Object
  
  @js.native
  sealed trait `test-file-success` extends js.Object
  
  @scala.inline
  def `test-case-result`: `test-case-result` = "test-case-result".asInstanceOf[`test-case-result`]
  @scala.inline
  def `test-file-failure`: `test-file-failure` = "test-file-failure".asInstanceOf[`test-file-failure`]
  @scala.inline
  def `test-file-start`: `test-file-start` = "test-file-start".asInstanceOf[`test-file-start`]
  @scala.inline
  def `test-file-success`: `test-file-success` = "test-file-success".asInstanceOf[`test-file-success`]
}

