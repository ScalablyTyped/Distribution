package typings.igdbApiNode

import typings.apicalypse.mod.Apicalypse
import typings.apicalypse.mod.ApicalypseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("igdb-api-node", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(): Apicalypse = js.native
  def default(
    clientId: js.UndefOr[scala.Nothing],
    appAccessToken: js.UndefOr[scala.Nothing],
    opts: ApicalypseConfig
  ): Apicalypse = js.native
  def default(clientId: js.UndefOr[scala.Nothing], appAccessToken: String): Apicalypse = js.native
  def default(clientId: js.UndefOr[scala.Nothing], appAccessToken: String, opts: ApicalypseConfig): Apicalypse = js.native
  def default(clientId: String): Apicalypse = js.native
  def default(clientId: String, appAccessToken: js.UndefOr[scala.Nothing], opts: ApicalypseConfig): Apicalypse = js.native
  def default(clientId: String, appAccessToken: String): Apicalypse = js.native
  def default(clientId: String, appAccessToken: String, opts: ApicalypseConfig): Apicalypse = js.native
  
  def getTagNumber(category: Double, id: Double): Double = js.native
}
