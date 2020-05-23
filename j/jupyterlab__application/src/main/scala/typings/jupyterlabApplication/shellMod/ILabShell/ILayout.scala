package typings.jupyterlabApplication.shellMod.ILabShell

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
  val fresh: js.UndefOr[Boolean] = js.undefined
  /**
    * The left area of the user interface.
    */
  val leftArea: ISideArea | Null
  /**
    * The main area of the user interface.
    */
  val mainArea: IMainArea | Null
  /**
    * The right area of the user interface.
    */
  val rightArea: ISideArea | Null
}

object ILayout {
  @scala.inline
  def apply(
    fresh: js.UndefOr[Boolean] = js.undefined,
    leftArea: ISideArea = null,
    mainArea: IMainArea = null,
    rightArea: ISideArea = null
  ): ILayout = {
    val __obj = js.Dynamic.literal(leftArea = leftArea.asInstanceOf[js.Any], mainArea = mainArea.asInstanceOf[js.Any], rightArea = rightArea.asInstanceOf[js.Any])
    if (!js.isUndefined(fresh)) __obj.updateDynamic("fresh")(fresh.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILayout]
  }
}

