package typings.atJupyterlabStatusbar.libComponentsProgressBarMod.ProgressBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Props for the ProgressBar.
  */
trait IProps extends js.Object {
  /**
    * The current progress percentage, from 0 to 100
    */
  var percentage: Double
}

object IProps {
  @scala.inline
  def apply(percentage: Double): IProps = {
    val __obj = js.Dynamic.literal(percentage = percentage)
  
    __obj.asInstanceOf[IProps]
  }
}

