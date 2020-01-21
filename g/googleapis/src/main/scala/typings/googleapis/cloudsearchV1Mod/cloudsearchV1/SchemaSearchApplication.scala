package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchApplication
  */
@js.native
trait SchemaSearchApplication extends js.Object {
  /**
    * Retrictions applied to the configurations. The maximum number of elements
    * is 10.
    */
  var dataSourceRestrictions: js.UndefOr[js.Array[SchemaDataSourceRestriction]] = js.native
  /**
    * The default fields for returning facet results. The sources specified
    * here also have been included in data_source_restrictions above.
    */
  var defaultFacetOptions: js.UndefOr[js.Array[SchemaFacetOptions]] = js.native
  /**
    * The default options for sorting the search results
    */
  var defaultSortOptions: js.UndefOr[SchemaSortOptions] = js.native
  /**
    * Display name of the Search Application. The maximum length is 300
    * characters.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Name of the Search Application. &lt;br /&gt;Format:
    * searchapplications/{application_id}.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * IDs of the Long Running Operations (LROs) currently running for this
    * schema. Output only field.
    */
  var operationIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Configuration for ranking results.
    */
  var scoringConfig: js.UndefOr[SchemaScoringConfig] = js.native
  /**
    * Configuration for a sources specified in data_source_restrictions.
    */
  var sourceConfig: js.UndefOr[js.Array[SchemaSourceConfig]] = js.native
}

object SchemaSearchApplication {
  @scala.inline
  def apply(
    dataSourceRestrictions: js.Array[SchemaDataSourceRestriction] = null,
    defaultFacetOptions: js.Array[SchemaFacetOptions] = null,
    defaultSortOptions: SchemaSortOptions = null,
    displayName: String = null,
    name: String = null,
    operationIds: js.Array[String] = null,
    scoringConfig: SchemaScoringConfig = null,
    sourceConfig: js.Array[SchemaSourceConfig] = null
  ): SchemaSearchApplication = {
    val __obj = js.Dynamic.literal()
    if (dataSourceRestrictions != null) __obj.updateDynamic("dataSourceRestrictions")(dataSourceRestrictions.asInstanceOf[js.Any])
    if (defaultFacetOptions != null) __obj.updateDynamic("defaultFacetOptions")(defaultFacetOptions.asInstanceOf[js.Any])
    if (defaultSortOptions != null) __obj.updateDynamic("defaultSortOptions")(defaultSortOptions.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operationIds != null) __obj.updateDynamic("operationIds")(operationIds.asInstanceOf[js.Any])
    if (scoringConfig != null) __obj.updateDynamic("scoringConfig")(scoringConfig.asInstanceOf[js.Any])
    if (sourceConfig != null) __obj.updateDynamic("sourceConfig")(sourceConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSearchApplication]
  }
}

