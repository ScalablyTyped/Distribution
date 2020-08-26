package typings.guacamoleClient.clientMod.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.guacamoleClient.clientMod.Client.ExportLayerBase
  - typings.guacamoleClient.anon.ExportLayerBasexnumberynu
*/
trait ExportLayer extends js.Object

object ExportLayer {
  @scala.inline
  def ExportLayerBase(height: Double, width: Double): ExportLayer = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportLayer]
  }
  @scala.inline
  def ExportLayerBasexnumberynu(
    alpha: Double,
    height: Double,
    matrix: js.Any,
    parent: js.Any,
    width: Double,
    x: Double,
    y: Double,
    z: Double
  ): ExportLayer = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportLayer]
  }
}

