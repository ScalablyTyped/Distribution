package typings.hapiWreck.mod.Client

import typings.hapiWreck.hapiWreckStrings.force
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typings.hapiWreck.mod.Client.request.Options
     with typings.hapiWreck.mod.Client.read.Options {
  /**
    * An object containing the node agents used for pooling connections for `http` and `https`.
    */
  val agents: js.UndefOr[Agents] = js.native
  /**
    * Enables events.
    * 
    * @default false
    */
  val events: js.UndefOr[Boolean] = js.native
  /**
    * Determines how to handle gzipped payloads.
    *
    * @default false
    */
  /* InferMemberOverrides */
  override val gunzip: js.UndefOr[Boolean | force] = js.native
  /**
    * The number of milliseconds to wait while reading data before aborting handling of the response.
    * 
    * @default 0
    */
  /* InferMemberOverrides */
  override val timeout: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAgents(value: Agents): Self = this.set("agents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgents: Self = this.set("agents", js.undefined)
    @scala.inline
    def setEvents(value: Boolean): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setGunzip(value: Boolean | force): Self = this.set("gunzip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGunzip: Self = this.set("gunzip", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

