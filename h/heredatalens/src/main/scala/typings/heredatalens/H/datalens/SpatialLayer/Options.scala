package typings.heredatalens.H.datalens.SpatialLayer

import typings.heredatalens.H.datalens.QueryTileProvider.X
import typings.heredatalens.H.datalens.QueryTileProvider.Y
import typings.heredatalens.H.datalens.QueryTileProvider.Zoom
import typings.heredatalens.H.datalens.Service.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines data processing and rendering options for SpatialLayer
  * The initial step of rendering is to split the tile data by rows, where each row represents a bucket.
  * By default this step is processed with SpatialLayer.defaultDataToRows. This behavior can be changed by defining the dataToRows callback.
  */
@js.native
trait Options extends js.Object {
  
  /** Defines how the input tile data is split by rows. You can specify this callback to define client-side aggregation and filtering. This callback is called for each tile. */
  var dataToRows: js.UndefOr[js.Function4[/* data */ Data, /* x */ X, /* y */ Y, /* z */ Zoom, js.Array[Row]]] = js.native
  
  /** Defines the default map object style. */
  def defaultStyle(z: Zoom, styleState: StyleState): js.Any = js.native
  
  /** Defines how to get the spatial ID from a geometry feature. This callback is called for each geometry feature in the vector tile. */
  def featureToSpatialId(feature: Feature): String = js.native
  
  /** Defines how to get the spatial ID from a data row. This callback is called for each row that is returned from dataToRows. */
  def rowToSpatialId(row: Row): String = js.native
  
  /** Defines how the row is translated to map object style. This callback is called for each row that is returned from dataToRows. */
  def rowToStyle(row: Row, z: Zoom, styleState: StyleState): js.Any = js.native
  
  /** Defines how to transform the features. */
  var transformFeature: typings.heredatalens.H.datalens.SpatialLayer.transformFeature = js.native
}
object Options {
  
  @scala.inline
  def apply(
    defaultStyle: (Zoom, StyleState) => js.Any,
    featureToSpatialId: Feature => String,
    rowToSpatialId: Row => String,
    rowToStyle: (Row, Zoom, StyleState) => js.Any,
    transformFeature: transformFeature
  ): Options = {
    val __obj = js.Dynamic.literal(defaultStyle = js.Any.fromFunction2(defaultStyle), featureToSpatialId = js.Any.fromFunction1(featureToSpatialId), rowToSpatialId = js.Any.fromFunction1(rowToSpatialId), rowToStyle = js.Any.fromFunction3(rowToStyle), transformFeature = transformFeature.asInstanceOf[js.Any])
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
    def setDefaultStyle(value: (Zoom, StyleState) => js.Any): Self = this.set("defaultStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFeatureToSpatialId(value: Feature => String): Self = this.set("featureToSpatialId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowToSpatialId(value: Row => String): Self = this.set("rowToSpatialId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowToStyle(value: (Row, Zoom, StyleState) => js.Any): Self = this.set("rowToStyle", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTransformFeature(value: transformFeature): Self = this.set("transformFeature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataToRows(value: (/* data */ Data, /* x */ X, /* y */ Y, /* z */ Zoom) => js.Array[Row]): Self = this.set("dataToRows", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteDataToRows: Self = this.set("dataToRows", js.undefined)
  }
}
