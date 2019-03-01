package typings
package graphqlDashToolsLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnectors[TContext]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[IConnector[TContext]]

object IConnectors {
  @scala.inline
  def apply[TContext](
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[IConnector[TContext]] = null
  ): IConnectors[TContext] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IConnectors[TContext]]
  }
}

