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
  def apply(): SchemaStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatement]
  }
  @scala.inline
  implicit class SchemaStatementOps[Self <: SchemaStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRelation(value: String): Self = this.set("relation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelation: Self = this.set("relation", js.undefined)
    @scala.inline
    def setSource(value: SchemaAsset): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTarget(value: SchemaAsset): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

