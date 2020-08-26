package typings.luminoPolling.ratelimiterMod.Throttler

import typings.luminoPolling.luminoPollingStrings.leading
import typings.luminoPolling.luminoPollingStrings.trailing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instantiation options for a `Throttler`.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * Whether to invoke at the leading or trailing edge of throttle cycle.
    * Defaults to `leading`.
    */
  var edge: js.UndefOr[leading | trailing] = js.native
  /**
    * The throttling limit; defaults to 500ms.
    */
  var limit: js.UndefOr[Double] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEdge(value: leading | trailing): Self = this.set("edge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdge: Self = this.set("edge", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
  }
  
}

