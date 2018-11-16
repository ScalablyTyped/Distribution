package typings
package graphqlDashToolsLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Request extends js.Object {
  var document: graphqlLib.languageAstMod.DocumentNode
  var extensions: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var variables: stdLib.Record[java.lang.String, _]
}

