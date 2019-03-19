package typings
package graphqlDashConfigLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProjectName extends js.Object {
  var projects: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[graphqlDashConfigLib.libTypesMod.GraphQLResolvedConfigData]
  ] = js.undefined
}

object Anon_ProjectName {
  @scala.inline
  def apply(
    projects: org.scalablytyped.runtime.StringDictionary[graphqlDashConfigLib.libTypesMod.GraphQLResolvedConfigData] = null
  ): Anon_ProjectName = {
    val __obj = js.Dynamic.literal()
    if (projects != null) __obj.updateDynamic("projects")(projects)
    __obj.asInstanceOf[Anon_ProjectName]
  }
}

