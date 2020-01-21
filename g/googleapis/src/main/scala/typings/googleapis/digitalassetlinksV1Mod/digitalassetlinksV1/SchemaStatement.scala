package typings.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a reliable statement that has been made about the relationship
  * between a source asset and a target asset.  Statements are always made by
  * the source asset, either directly or by delegating to a statement list that
  * is stored elsewhere.  For more detailed definitions of statements and
  * assets, please refer to our [API documentation landing
  * page](/digital-asset-links/v1/getting-started).
  */
@js.native
trait SchemaStatement extends js.Object {
  /**
    * The relation identifies the use of the statement as intended by the
    * source asset&#39;s owner (that is, the person or entity who issued the
    * statement). Every complete statement has a relation.  We identify
    * relations with strings of the format `&lt;kind&gt;/&lt;detail&gt;`, where
    * `&lt;kind&gt;` must be one of a set of pre-defined purpose categories,
    * and `&lt;detail&gt;` is a free-form lowercase alphanumeric string that
    * describes the specific use case of the statement.  Refer to [our API
    * documentation](/digital-asset-links/v1/relation-strings) for the current
    * list of supported relations.  Example:
    * `delegate_permission/common.handle_all_urls` REQUIRED
    */
  var relation: js.UndefOr[String] = js.native
  /**
    * Every statement has a source asset. REQUIRED
    */
  var source: js.UndefOr[SchemaAsset] = js.native
  /**
    * Every statement has a target asset. REQUIRED
    */
  var target: js.UndefOr[SchemaAsset] = js.native
}

object SchemaStatement {
  @scala.inline
  def apply(relation: String = null, source: SchemaAsset = null, target: SchemaAsset = null): SchemaStatement = {
    val __obj = js.Dynamic.literal()
    if (relation != null) __obj.updateDynamic("relation")(relation.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStatement]
  }
}

