package typings.graphqlConfig

import org.scalablytyped.runtime.StringDictionary
import typings.graphqlConfig.typesMod.GraphQLResolvedConfigData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProjectName extends js.Object {
  var projects: js.UndefOr[StringDictionary[GraphQLResolvedConfigData]] = js.undefined
}

object AnonProjectName {
  @scala.inline
  def apply(projects: StringDictionary[GraphQLResolvedConfigData] = null): AnonProjectName = {
    val __obj = js.Dynamic.literal()
    if (projects != null) __obj.updateDynamic("projects")(projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProjectName]
  }
}

