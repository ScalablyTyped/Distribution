package typings.googleapis.polyV1Mod.polyV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAssetsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Filter assets based on the specified category. Supported values are:
    * `animals`, `architecture`, `art`, `food`, `nature`, `objects`, `people`,
    * `scenes`, `technology`, and `transport`.
    */
  var category: js.UndefOr[String] = js.native
  /**
    * Return only assets that have been curated by the Poly team.
    */
  var curated: js.UndefOr[Boolean] = js.native
  /**
    * Return only assets with the matching format. Acceptable values are:
    * `BLOCKS`, `FBX`, `GLTF`, `GLTF2`, `OBJ`, `TILT`.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * One or more search terms to be matched against all text that Poly has
    * indexed for assets, which includes display_name, description, and tags.
    * Multiple keywords should be separated by spaces.
    */
  var keywords: js.UndefOr[String] = js.native
  /**
    * Returns assets that are of the specified complexity or less. Defaults to
    * COMPLEX. For example, a request for MEDIUM assets also includes SIMPLE
    * assets.
    */
  var maxComplexity: js.UndefOr[String] = js.native
  /**
    * Specifies an ordering for assets. Acceptable values are: `BEST`,
    * `NEWEST`, `OLDEST`. Defaults to `BEST`, which ranks assets based on a
    * combination of popularity and other features.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * The maximum number of assets to be returned. This value must be between
    * `1` and `100`. Defaults to `20`.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Specifies a continuation token from a previous search whose results were
    * split into multiple pages. To get the next page, submit the same request
    * specifying the value from next_page_token.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ParamsResourceAssetsList {
  @scala.inline
  def apply(): ParamsResourceAssetsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAssetsList]
  }
  @scala.inline
  implicit class ParamsResourceAssetsListOps[Self <: ParamsResourceAssetsList] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setCurated(value: Boolean): Self = this.set("curated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurated: Self = this.set("curated", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setKeywords(value: String): Self = this.set("keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    @scala.inline
    def setMaxComplexity(value: String): Self = this.set("maxComplexity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxComplexity: Self = this.set("maxComplexity", js.undefined)
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
  
}

