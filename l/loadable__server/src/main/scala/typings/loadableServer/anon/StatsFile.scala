package typings.loadableServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatsFile extends js.Object {
  /**
    * Stats file path generated using `@loadable/webpack-plugin`
    */
  var statsFile: String = js.native
}

object StatsFile {
  @scala.inline
  def apply(statsFile: String): StatsFile = {
    val __obj = js.Dynamic.literal(statsFile = statsFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsFile]
  }
  @scala.inline
  implicit class StatsFileOps[Self <: StatsFile] (val x: Self) extends AnyVal {
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
    def setStatsFile(value: String): Self = this.set("statsFile", value.asInstanceOf[js.Any])
  }
  
}

