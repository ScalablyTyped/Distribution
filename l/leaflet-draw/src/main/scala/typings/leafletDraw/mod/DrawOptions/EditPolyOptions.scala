package typings.leafletDraw.mod.DrawOptions

import typings.leaflet.mod.FeatureGroup_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditPolyOptions extends js.Object {
  
  /**
    * Determines if line segments can cross
    *
    * @default true
    */
  var allowIntersection: Boolean = js.native
  
  /**
    * Edit handler options. Set to false to disable handler.
    */
  var edit: EditHandlerOptions = js.native
  
  /**
    * This is the FeatureGroup that stores all editable shapes
    * THIS IS REQUIRED FOR THE EDIT TOOLBAR TO WORK
    */
  var featureGroup: FeatureGroup_[_] = js.native
  
  /**
    * Set polygon editing options
    */
  var poly: EditPolyOptions = js.native
  
  /**
    * Delete handler options. Set to false to disable handler.
    */
  var remove: js.Any = js.native
}
object EditPolyOptions {
  
  @scala.inline
  def apply(
    allowIntersection: Boolean,
    edit: EditHandlerOptions,
    featureGroup: FeatureGroup_[_],
    poly: EditPolyOptions,
    remove: js.Any
  ): EditPolyOptions = {
    val __obj = js.Dynamic.literal(allowIntersection = allowIntersection.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], featureGroup = featureGroup.asInstanceOf[js.Any], poly = poly.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditPolyOptions]
  }
  
  @scala.inline
  implicit class EditPolyOptionsOps[Self <: EditPolyOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowIntersection(value: Boolean): Self = this.set("allowIntersection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdit(value: EditHandlerOptions): Self = this.set("edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureGroup(value: FeatureGroup_[_]): Self = this.set("featureGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoly(value: EditPolyOptions): Self = this.set("poly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: js.Any): Self = this.set("remove", value.asInstanceOf[js.Any])
  }
}
