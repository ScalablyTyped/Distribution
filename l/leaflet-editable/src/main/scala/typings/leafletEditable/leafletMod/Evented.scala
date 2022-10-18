package typings.leafletEditable.leafletMod

import typings.leaflet.mod.LayerEventHandlerFn
import typings.leaflet.mod.LeafletEventHandlerFn
import typings.leafletEditable.leafletEditableStrings.editableColoncreated
import typings.leafletEditable.leafletEditableStrings.editableColondisable
import typings.leafletEditable.leafletEditableStrings.editableColondrag
import typings.leafletEditable.leafletEditableStrings.editableColondragend
import typings.leafletEditable.leafletEditableStrings.editableColondragstart
import typings.leafletEditable.leafletEditableStrings.editableColondrawingColoncancel
import typings.leafletEditable.leafletEditableStrings.editableColondrawingColonclick
import typings.leafletEditable.leafletEditableStrings.editableColondrawingColonclicked
import typings.leafletEditable.leafletEditableStrings.editableColondrawingColoncommit
import typings.leafletEditable.leafletEditableStrings.editableColondrawingColonend
import typings.leafletEditable.leafletEditableStrings.editableColondrawingColonmousedown
import typings.leafletEditable.leafletEditableStrings.editableColondrawingColonmouseup
import typings.leafletEditable.leafletEditableStrings.editableColondrawingColonmove
import typings.leafletEditable.leafletEditableStrings.editableColondrawingColonstart
import typings.leafletEditable.leafletEditableStrings.editableColonediting
import typings.leafletEditable.leafletEditableStrings.editableColonenable
import typings.leafletEditable.leafletEditableStrings.editableColonmiddlemarkerColonmousedown
import typings.leafletEditable.leafletEditableStrings.editableColonshapeColondelete
import typings.leafletEditable.leafletEditableStrings.editableColonshapeColondeleted
import typings.leafletEditable.leafletEditableStrings.editableColonshapeColonnew
import typings.leafletEditable.leafletEditableStrings.editableColonvertexColonaltclick
import typings.leafletEditable.leafletEditableStrings.editableColonvertexColonclick
import typings.leafletEditable.leafletEditableStrings.editableColonvertexColonclicked
import typings.leafletEditable.leafletEditableStrings.editableColonvertexColoncontextmenu
import typings.leafletEditable.leafletEditableStrings.editableColonvertexColonctrlclick
import typings.leafletEditable.leafletEditableStrings.editableColonvertexColondeleted
import typings.leafletEditable.leafletEditableStrings.editableColonvertexColondrag
import typings.leafletEditable.leafletEditableStrings.editableColonvertexColondragend
import typings.leafletEditable.leafletEditableStrings.editableColonvertexColondragstart
import typings.leafletEditable.leafletEditableStrings.editableColonvertexColonmetakeyclick
import typings.leafletEditable.leafletEditableStrings.editableColonvertexColonmousedown
import typings.leafletEditable.leafletEditableStrings.editableColonvertexColonnew
import typings.leafletEditable.leafletEditableStrings.editableColonvertexColonrawclick
import typings.leafletEditable.leafletEditableStrings.editableColonvertexColonshiftclick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * Extend Evented to add new events.
  */
@js.native
trait Evented extends StObject {
  
  def on(
    `type`: editableColondisable | editableColondrag | editableColondragend | editableColondragstart | editableColondrawingColoncancel | editableColondrawingColonclicked | editableColondrawingColoncommit | editableColondrawingColonend | editableColondrawingColonmousedown | editableColondrawingColonmouseup | editableColondrawingColonmove | editableColondrawingColonstart | editableColonediting | editableColonenable | editableColonmiddlemarkerColonmousedown | editableColonshapeColondeleted | editableColonshapeColonnew | editableColonvertexColonaltclick | editableColonvertexColonclick | editableColonvertexColonclicked | editableColonvertexColoncontextmenu | editableColonvertexColonctrlclick | editableColonvertexColondeleted | editableColonvertexColondrag | editableColonvertexColondragend | editableColonvertexColondragstart | editableColonvertexColonmetakeyclick | editableColonvertexColonmousedown | editableColonvertexColonnew | editableColonvertexColonrawclick | editableColonvertexColonshiftclick,
    fn: CancelableVertexEventHandlerFn | LeafletEventHandlerFn | ShapeEventHandlerFn | VertexEventHandlerFn
  ): this.type = js.native
  def on(
    `type`: editableColondisable | editableColondrag | editableColondragend | editableColondragstart | editableColondrawingColoncancel | editableColondrawingColonclicked | editableColondrawingColoncommit | editableColondrawingColonend | editableColondrawingColonmousedown | editableColondrawingColonmouseup | editableColondrawingColonmove | editableColondrawingColonstart | editableColonediting | editableColonenable | editableColonmiddlemarkerColonmousedown | editableColonshapeColondeleted | editableColonshapeColonnew | editableColonvertexColonaltclick | editableColonvertexColonclick | editableColonvertexColonclicked | editableColonvertexColoncontextmenu | editableColonvertexColonctrlclick | editableColonvertexColondeleted | editableColonvertexColondrag | editableColonvertexColondragend | editableColonvertexColondragstart | editableColonvertexColonmetakeyclick | editableColonvertexColonmousedown | editableColonvertexColonnew | editableColonvertexColonrawclick | editableColonvertexColonshiftclick,
    fn: CancelableVertexEventHandlerFn | LeafletEventHandlerFn | ShapeEventHandlerFn | VertexEventHandlerFn,
    context: Any
  ): this.type = js.native
  @JSName("on")
  def on_editablecreated(`type`: editableColoncreated, fn: LayerEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_editablecreated(`type`: editableColoncreated, fn: LayerEventHandlerFn, context: Any): this.type = js.native
  @JSName("on")
  def on_editabledrawingclick(`type`: editableColondrawingColonclick, fn: CancelableEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_editabledrawingclick(`type`: editableColondrawingColonclick, fn: CancelableEventHandlerFn, context: Any): this.type = js.native
  @JSName("on")
  def on_editableshapedelete(`type`: editableColonshapeColondelete, fn: CancelableShapeEventHandlerFn): this.type = js.native
  @JSName("on")
  def on_editableshapedelete(`type`: editableColonshapeColondelete, fn: CancelableShapeEventHandlerFn, context: Any): this.type = js.native
}
