package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the Application resource.
  */
@js.native
trait SchemaApplication extends js.Object {
  /**
    * The number of achievements visible to the currently authenticated player.
    */
  var achievement_count: js.UndefOr[Double] = js.native
  /**
    * The assets of the application.
    */
  var assets: js.UndefOr[js.Array[SchemaImageAsset]] = js.native
  /**
    * The author of the application.
    */
  var author: js.UndefOr[String] = js.native
  /**
    * The category of the application.
    */
  var category: js.UndefOr[SchemaApplicationCategory] = js.native
  /**
    * The description of the application.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A list of features that have been enabled for the application. Possible
    * values are:   - &quot;SNAPSHOTS&quot; - Snapshots has been enabled
    */
  var enabledFeatures: js.UndefOr[js.Array[String]] = js.native
  /**
    * The ID of the application.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The instances of the application.
    */
  var instances: js.UndefOr[js.Array[SchemaInstance]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#application.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The last updated timestamp of the application.
    */
  var lastUpdatedTimestamp: js.UndefOr[String] = js.native
  /**
    * The number of leaderboards visible to the currently authenticated player.
    */
  var leaderboard_count: js.UndefOr[Double] = js.native
  /**
    * The name of the application.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A hint to the client UI for what color to use as an app-themed color. The
    * color is given as an RGB triplet (e.g. &quot;E0E0E0&quot;).
    */
  var themeColor: js.UndefOr[String] = js.native
}

object SchemaApplication {
  @scala.inline
  def apply(
    achievement_count: js.UndefOr[Double] = js.undefined,
    assets: js.Array[SchemaImageAsset] = null,
    author: String = null,
    category: SchemaApplicationCategory = null,
    description: String = null,
    enabledFeatures: js.Array[String] = null,
    id: String = null,
    instances: js.Array[SchemaInstance] = null,
    kind: String = null,
    lastUpdatedTimestamp: String = null,
    leaderboard_count: js.UndefOr[Double] = js.undefined,
    name: String = null,
    themeColor: String = null
  ): SchemaApplication = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(achievement_count)) __obj.updateDynamic("achievement_count")(achievement_count.get.asInstanceOf[js.Any])
    if (assets != null) __obj.updateDynamic("assets")(assets.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enabledFeatures != null) __obj.updateDynamic("enabledFeatures")(enabledFeatures.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastUpdatedTimestamp != null) __obj.updateDynamic("lastUpdatedTimestamp")(lastUpdatedTimestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(leaderboard_count)) __obj.updateDynamic("leaderboard_count")(leaderboard_count.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (themeColor != null) __obj.updateDynamic("themeColor")(themeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApplication]
  }
}

