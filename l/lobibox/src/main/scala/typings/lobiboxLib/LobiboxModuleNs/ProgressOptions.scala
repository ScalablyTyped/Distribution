package typings
package lobiboxLib.LobiboxModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProgressOptions
  extends MessageBoxesOptions
     with ProgressMethods
     with ProgressEvents {
    // Show percentage of progress
  var label: js.UndefOr[java.lang.String] = js.undefined
  var progressCompleted: js.UndefOr[js.Any] = js.undefined
    // Show progress label
  var progressTpl: js.UndefOr[scala.Boolean] = js.undefined
    //Template of progress bar
  //Events
  @JSName("progressUpdated")
  var progressUpdated_ProgressOptions: js.UndefOr[js.Any] = js.undefined
  var showProgressLabel: js.UndefOr[scala.Boolean] = js.undefined
}

