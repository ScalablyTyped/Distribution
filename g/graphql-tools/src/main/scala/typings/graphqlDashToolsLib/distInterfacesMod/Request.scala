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

object Request {
  @scala.inline
  def apply(
    document: graphqlLib.languageAstMod.DocumentNode,
    variables: stdLib.Record[java.lang.String, _],
    extensions: stdLib.Record[java.lang.String, _] = null
  ): Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("document")(document)
    __obj.updateDynamic("variables")(variables)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    __obj.asInstanceOf[Request]
  }
}

