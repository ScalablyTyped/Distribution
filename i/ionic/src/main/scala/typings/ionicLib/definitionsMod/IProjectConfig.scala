package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProjectConfig extends js.Object {
  val hooks: js.UndefOr[
    stdLib.Record[HookName, js.UndefOr[java.lang.String | js.Array[java.lang.String]]]
  ] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  val integrations: ProjectIntegrations
  var name: java.lang.String
  var root: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[ProjectType] = js.undefined
}

