package typings.makerJs.MakerJs.exporter

import typings.makerJs.MakerJs.IFindLoopsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OpenJsCad export options.
  */
@js.native
trait IOpenJsCadOptions extends IFindLoopsOptions {
  /**
    * Optional depth of 3D extrusion.
    */
  var extrusion: js.UndefOr[Double] = js.native
  /**
    * Optional size of curve facets.
    */
  var facetSize: js.UndefOr[Double] = js.native
  /**
    * Optional override of function name, default is "main".
    */
  var functionName: js.UndefOr[String] = js.native
  /**
    * Optional options applied to specific first-child models by model id.
    */
  var modelMap: js.UndefOr[IOpenJsCadOptionsMap] = js.native
}

object IOpenJsCadOptions {
  @scala.inline
  def apply(): IOpenJsCadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOpenJsCadOptions]
  }
  @scala.inline
  implicit class IOpenJsCadOptionsOps[Self <: IOpenJsCadOptions] (val x: Self) extends AnyVal {
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
    def setExtrusion(value: Double): Self = this.set("extrusion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtrusion: Self = this.set("extrusion", js.undefined)
    @scala.inline
    def setFacetSize(value: Double): Self = this.set("facetSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacetSize: Self = this.set("facetSize", js.undefined)
    @scala.inline
    def setFunctionName(value: String): Self = this.set("functionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionName: Self = this.set("functionName", js.undefined)
    @scala.inline
    def setModelMap(value: IOpenJsCadOptionsMap): Self = this.set("modelMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelMap: Self = this.set("modelMap", js.undefined)
  }
  
}

