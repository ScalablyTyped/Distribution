package typings.jsrender.JsViewsNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store[T, TO]
  extends  // Multiple named items
/**
  * var template = $.templates.templateName; // Get compiled named template - or similar for named tags, converters, helpers, viewModels
  */
/* itemName */ StringDictionary[T] {
   // named item
  def apply(namedItems: Hash[TO]): Views = js.native
  def apply(namedItems: Hash[TO], parentTmpl: Template): Views = js.native
  /**
    * Generic store() function to register item, named item, or hash of items
    * Also used as hash to store the registered items
    * Used as implementation of $.templates(), $.views.templates(), $.views.tags(), $.views.helpers() and $.views.converters()
    *
    * @param {string|hash}   name         name - or selector, in case of $.templates(). Or hash of items
    * @param {any}           [item]       (e.g. markup for named template)
    * @param {Template}      [parentTmpl] For item being registered as private resource of template
    * @returns {any|Views}              e.g. compiled template - or $.views in case of registering hash of items
    */
  def apply(name: String): T = js.native
  def apply(name: String, item: TO): T = js.native
  def apply(name: String, item: TO, parentTmpl: Template): T = js.native
}

