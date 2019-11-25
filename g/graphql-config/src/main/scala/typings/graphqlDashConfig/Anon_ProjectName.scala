package typings.graphqlDashConfig

import org.scalablytyped.runtime.StringDictionary
import typings.graphqlDashConfig.libTypesMod.GraphQLResolvedConfigData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProjectName extends js.Object {
  var projects: js.UndefOr[StringDictionary[GraphQLResolvedConfigData]] = js.undefined
}

object Anon_ProjectName {
  @scala.inline
  def apply(projects: StringDictionary[GraphQLResolvedConfigData] = null): Anon_ProjectName = {
    val __obj = js.Dynamic.literal()
    if (projects != null) __obj.updateDynamic("projects")(projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ProjectName]
  }
}

