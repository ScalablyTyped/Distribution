package typings.jestReporters

import typings.istanbulLibReport.mod.Watermarks
import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters/build/get_watermarks", JSImport.Namespace)
@js.native
object getWatermarksMod extends js.Object {
  def default(config: GlobalConfig): Watermarks = js.native
}

