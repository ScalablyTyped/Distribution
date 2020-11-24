package typings.heredatalens.H.datalens.QueryTileProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configures source query and data accessibility parameters for QueryTileProvider
  * Specifies the query credentials and dynamic parameters required for fetching tiled query data with the Data Lens REST API.
  * Other options from Provider.Options are available.
  */
@js.native
trait Options extends js.Object {
  
  /** The ID for the Data Lens REST API query */
  var queryId: String = js.native
  
  /** The query's dynamic parameters. The dynamic parameters can be used to filter data provided by the query. */
  var queryParams: js.UndefOr[String] = js.native
  
  /** Names of the URI parameters that control the x/y/z of a tiled query */
  var tileParamNames: TileParamNames = js.native
}
object Options {
  
  @scala.inline
  def apply(queryId: String, tileParamNames: TileParamNames): Options = {
    val __obj = js.Dynamic.literal(queryId = queryId.asInstanceOf[js.Any], tileParamNames = tileParamNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setQueryId(value: String): Self = this.set("queryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileParamNames(value: TileParamNames): Self = this.set("tileParamNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParams(value: String): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryParams: Self = this.set("queryParams", js.undefined)
  }
}
