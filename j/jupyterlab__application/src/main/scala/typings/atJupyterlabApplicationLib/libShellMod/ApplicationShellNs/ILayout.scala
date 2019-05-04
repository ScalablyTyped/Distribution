package typings
package atJupyterlabApplicationLib.libShellMod.ApplicationShellNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of the application's user interface layout.
  */
trait ILayout extends js.Object {
  /**
    * Indicates whether fetched session restore data was actually retrieved
    * from the state database or whether it is a fresh blank slate.
    *
    * #### Notes
    * This attribute is only relevant when the layout data is retrieved via a
    * `fetch` call. If it is set when being passed into `save`, it will be
    * ignored.
    */
  val fresh: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The left area of the user interface.
    */
  val leftArea: ISideArea | scala.Null
  /**
    * The main area of the user interface.
    */
  val mainArea: IMainArea | scala.Null
  /**
    * The right area of the user interface.
    */
  val rightArea: ISideArea | scala.Null
}

object ILayout {
  @scala.inline
  def apply(
    fresh: js.UndefOr[scala.Boolean] = js.undefined,
    leftArea: ISideArea = null,
    mainArea: IMainArea = null,
    rightArea: ISideArea = null
  ): ILayout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fresh)) __obj.updateDynamic("fresh")(fresh)
    if (leftArea != null) __obj.updateDynamic("leftArea")(leftArea)
    if (mainArea != null) __obj.updateDynamic("mainArea")(mainArea)
    if (rightArea != null) __obj.updateDynamic("rightArea")(rightArea)
    __obj.asInstanceOf[ILayout]
  }
}

