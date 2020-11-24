package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A model is a composite object which may contain an array of paths, or an array of models recursively.
  *
  * Example:
  * ```
  * var m = {
  *   paths: {
  *     "line1": { type: 'line', origin: [0, 0], end: [1, 1] },
  *     "line2": { type: 'line', origin: [0, 0], end: [-1, -1] }
  *   }
  * };
  * ```
  */
@js.native
trait IModel extends js.Object {
  
  /**
    * Optional exporter options for this model.
    */
  var exporterOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Optional layer of this model.
    */
  var layer: js.UndefOr[String] = js.native
  
  /**
    * Optional array of models within this model.
    */
  var models: js.UndefOr[IModelMap] = js.native
  
  /**
    * An author may wish to add notes to this model instance.
    */
  var notes: js.UndefOr[String] = js.native
  
  /**
    * Optional origin location of this model.
    */
  var origin: js.UndefOr[IPoint] = js.native
  
  /**
    * Optional array of path objects in this model.
    */
  var paths: js.UndefOr[IPathMap] = js.native
  
  /**
    * A model may want to specify its type, but this value is not employed yet.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Optional unit system of this model. See UnitType for possible values.
    */
  var units: js.UndefOr[String] = js.native
}
object IModel {
  
  @scala.inline
  def apply(): IModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModel]
  }
  
  @scala.inline
  implicit class IModelOps[Self <: IModel] (val x: Self) extends AnyVal {
    
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
    def setExporterOptions(value: StringDictionary[js.Any]): Self = this.set("exporterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExporterOptions: Self = this.set("exporterOptions", js.undefined)
    
    @scala.inline
    def setLayer(value: String): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    
    @scala.inline
    def setModels(value: IModelMap): Self = this.set("models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModels: Self = this.set("models", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setOrigin(value: IPoint): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setPaths(value: IPathMap): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnits(value: String): Self = this.set("units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
  }
}
