package typings.igdbApiNode

import typings.apicalypse.mod.Apicalypse
import typings.apicalypse.mod.ApicalypseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("igdb-api-node", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default(): Apicalypse = js.native
  def default(apiKey: String): Apicalypse = js.native
  def default(apiKey: String, opts: ApicalypseConfig): Apicalypse = js.native
  def getTagNumber(category: Double, id: Double): Double = js.native
}

