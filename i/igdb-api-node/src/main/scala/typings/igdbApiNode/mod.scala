package typings.igdbApiNode

import typings.apicalypse.mod.Apicalypse
import typings.apicalypse.mod.ApicalypseConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("igdb-api-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Apicalypse = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Apicalypse]
  inline def default(clientId: String): Apicalypse = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(clientId.asInstanceOf[js.Any]).asInstanceOf[Apicalypse]
  inline def default(clientId: String, appAccessToken: String): Apicalypse = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(clientId.asInstanceOf[js.Any], appAccessToken.asInstanceOf[js.Any])).asInstanceOf[Apicalypse]
  inline def default(clientId: String, appAccessToken: String, opts: ApicalypseConfig): Apicalypse = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(clientId.asInstanceOf[js.Any], appAccessToken.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Apicalypse]
  inline def default(clientId: String, appAccessToken: Unit, opts: ApicalypseConfig): Apicalypse = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(clientId.asInstanceOf[js.Any], appAccessToken.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Apicalypse]
  inline def default(clientId: Unit, appAccessToken: String): Apicalypse = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(clientId.asInstanceOf[js.Any], appAccessToken.asInstanceOf[js.Any])).asInstanceOf[Apicalypse]
  inline def default(clientId: Unit, appAccessToken: String, opts: ApicalypseConfig): Apicalypse = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(clientId.asInstanceOf[js.Any], appAccessToken.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Apicalypse]
  inline def default(clientId: Unit, appAccessToken: Unit, opts: ApicalypseConfig): Apicalypse = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(clientId.asInstanceOf[js.Any], appAccessToken.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Apicalypse]
  
  inline def getTagNumber(category: Double, id: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTagNumber")(category.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Double]
}
