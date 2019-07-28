package typings.imagemapster.imagemapsterMod.Global

import typings.imagemapster.imagemapsterMod.Global.ImageMapsterNs.AreaRenderingOptions
import typings.imagemapster.imagemapsterMod.Global.ImageMapsterNs.Deselect
import typings.imagemapster.imagemapsterMod.Global.ImageMapsterNs.Get
import typings.imagemapster.imagemapsterMod.Global.ImageMapsterNs.GetOptions
import typings.imagemapster.imagemapsterMod.Global.ImageMapsterNs.Highlight
import typings.imagemapster.imagemapsterMod.Global.ImageMapsterNs.Keys
import typings.imagemapster.imagemapsterMod.Global.ImageMapsterNs.Options
import typings.imagemapster.imagemapsterMod.Global.ImageMapsterNs.Rebind
import typings.imagemapster.imagemapsterMod.Global.ImageMapsterNs.RenderingOptions
import typings.imagemapster.imagemapsterMod.Global.ImageMapsterNs.Resize
import typings.imagemapster.imagemapsterMod.Global.ImageMapsterNs.Select
import typings.imagemapster.imagemapsterMod.Global.ImageMapsterNs.Set
import typings.imagemapster.imagemapsterMod.Global.ImageMapsterNs.SetOptions
import typings.imagemapster.imagemapsterMod.Global.ImageMapsterNs.Snapshot
import typings.imagemapster.imagemapsterMod.Global.ImageMapsterNs.Tooltip
import typings.imagemapster.imagemapsterMod.Global.ImageMapsterNs.Unbind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    *
    * All images in the jQuery object will be bound. The specific example
    * above will attempt to bind to all images present on the page. Each image
    * must be bound to an image map identified with the usemap attribute. If
    * there is no usemap attribute, or it does not refer to a valid map, then
    * the image will be ignored. Therefore you can use this syntax to activate
    * all imagemaps on a page. Because pages often contain many images,
    * though, it will be faster to select just the image you are targeting
    * using a more specific selector.
    *
    * Images are often not completely loaded when script execution begins.
    * ImageMapster will ensure that all images are loaded before it permits
    * interaction from the client. If an alternate image is specified, this
    * will also be preloaded.
    *
    * Because images are loaded asynchronously, code execution will often
    * return to your script before the ImageMapster is available. If you apply
    * other methods to it (such as selecting or deselecting areas), these
    * commands will be queued until the image has been loaded, and then
    * executed automatically. So you don't need to worry about using callbacks
    * for initial configuration. You can assign a function to a callback when
    * configuration is complete if needed to perform other setup activities on
    * the page.
    */
  def mapster(): JQuery = js.native
  /**
    * deselect: Cause an area to become deselected
    *
    * The opposite of select, this causes an area to become deselected. If it
    * was not previously selected, nothing changes.
    */
  def mapster(method: Deselect): Unit = js.native
  /**
    * get: get keys for all selected areas
    *
    * When no "key" parameter is included, returns a comma-separated list of
    * keys representing the areas currently selected. If specified, returns
    * true or false indicating whether the area specified is selected.
    */
  def mapster(method: Get): String | Boolean = js.native
  /**
    * get_options: get active options
    *
    * When called with no parameters, returns the options that the mapster was
    * configured using. When called with a single key it returns the
    * area-specific options assigned to that area. The final parameter
    * effective determines whether the actual options in effect for this area,
    * or the specific options assigned are returned.
    *
    * Areas inherit the global options assigned, but can be overridden by
    * area-specific options. The "effective" options contain all options
    * including those that are inherited, as well as any specifically assigned
    * to the area.
    */
  def mapster(method: GetOptions): Options | AreaRenderingOptions = js.native
  def mapster(method: GetOptions, key: String): Options | AreaRenderingOptions = js.native
  def mapster(method: GetOptions, key: String, effective: Boolean): Options | AreaRenderingOptions = js.native
  def mapster(method: Get, key: String): String | Boolean = js.native
  /**
    * highlight: highlight, clear, or return highlight state
    *
    * This method is used to control or obtain the current highlight state.
    * Setting the highlight does not mimic a mouseover, rather, it only sets
    * the highlight. Events and tooltips will not be activated. Even using
    * these methods, it is not possible to highlight more than one area at a
    * time. If another area is highlighted programatically, any existing
    * highlight will be removed.
    *
    * Once set this way, the highlight will be removed when any user-event
    * that would normally cause a highlight to be removed occurs (e.g. moving
    * the mouse into any area), or it is removed programatically.
    */
  def mapster(method: Highlight): Unit = js.native
  def mapster(method: Highlight, flag: String): Unit = js.native
  def mapster(method: Highlight, flag: Boolean): Unit = js.native
  def mapster(method: Keys, all: Boolean): String | js.Array[String] = js.native
  /**
    * keys: get the primary mapKey (or comma-separated list of keys) for an
    * area, set of areas, or key group. Version 1.2.4.050
    *
    * This method allows you to obtain the primary mapKey (or keys) associated
    * with another key, or one or more areas. If the all parameter is true,
    * the method returns all keys or groups that include the area.
    *
    * When using area groups, it is possible for more than one key to be
    * associated with a map area. It's also possible for an area to be
    * highlighted from code as part of a group, but be inaccessible to the
    * end-user. This is because area groups are separate physical entities
    * from the areas defined by their primary key. They can have different
    * options, and are highlighted independently. Note: the way area groups
    * work is not well documented here yet. I am working on a more
    * comprehensive tutorial for the site. In the meantime please see this
    * example which describes area groups in detail, and shows how they work
    * through an active demonstration.
    *
    * There are reasons you may want to be able to access the primary keys
    * that make up an area group directly. Perhaps you want to select a group
    * of areas using the options from a group - but not as a separate group.
    * Perhaps you want to be able to compare the area clicked against a group
    * you have defined to take some action if the area is a member of a
    * certain group. This method provides access to that information.
    *
    * This method allows working with groups in a variety of ways by providing
    * access to a complete list of primary keys in any group, or all keys
    * which contain a given primary key.
    */
  def mapster(method: Keys, key: String): String | js.Array[String] = js.native
  def mapster(method: Keys, key: String, all: Boolean): String | js.Array[String] = js.native
  /**
    * rebind: rebind ImageMapster with new options
    *
    * This method is similar to set_options, in that its purpose is to change
    * options for an existing bound map. However, unlike set_options rebind
    * will immediately apply all the new options to the existing map. This
    * means that rendering options will change areas that are already selected
    * to be rendered with the new options. If you pass area-specific options,
    * these will also be applied, e.g. you could cause new areas to be
    * selected by passing selected: true in an area specific options.
    *
    * set_options, in contrast only changes the options, and does not apply
    * them to any existing data. When using set_options the new options only
    * apply to future actions.
    */
  def mapster(method: Rebind, options: Options): JQuery = js.native
  /**
    * resize: change the size of the image and map
    *
    * This will resize the image map to the dimensions specified. Note that
    * either width or height should be passed, and the other will be
    * calculated in the same aspect ratio as the original image. If you pass
    * both, only the width will be used to calculate the new dimensions: the
    * proportions must remain the same as the original image. (Though I intend
    * to allow scaling without constraining proportions, it will be difficult
    * to make work for certain shapes -- e.g. circles, which would have to
    * become ovals).
    *
    * This method will recalculate and re-render the entire imagemap, so it
    * will work exactly the same under the new sizing scheme. When the image
    * is unbound, the imagemap will be restored to its original condition.
    *
    * When using HTML5 canvases, any existing selections, etc. will be
    * preserved during the animation. VML data cannot be resized dynamically,
    * however, so in IE<9 the selections will be erased, then redrawn when the
    * animation is complete.
    */
  def mapster(method: Resize, width: Double, height: Double): JQuery = js.native
  def mapster(method: Resize, width: Double, height: Double, duration: Double): JQuery = js.native
  /**
    * select: Cause an area to become selected. This is similar to a user
    * click, but will not cause a click event to be fired.
    *
    * Programatically select elements from the image map. The programmatic
    * selection/deselection methods will not honor the staticState property.
    */
  def mapster(method: Select): Unit = js.native
  /**
    * set_options: set active options
    *
    * When called without the "options" parameter, returns an object with all
    * active options. When the parameter is included, the active options are
    * updated for the imagemap, and any area options are merged with existing
    * area options. Unlike "rebind", this will not rebind or reapply any
    * options, but only update the state. This may affect future actions, but
    * it will not change any existing state information.
    */
  def mapster(method: SetOptions): JQuery = js.native
  def mapster(method: SetOptions, options: Options): JQuery = js.native
  def mapster(method: Set, options: RenderingOptions): JQuery = js.native
  /**
    * set: select or deselect an area
    *
    * Select or deselect elements from jQuery objects wrapping "area" tags on
    * the map based on truthiness of selected. If the area represents a bound
    * area on the imagemap, it will be selected or deselected. The method can
    * be called from an AREA, or from a bound image, passing a specific key as
    * a 2nd parameter
    *
    * If the selected parameter is omitted (or anything other than "true" or
    * "false") then the state of each area will be toggled.
    *
    * You can include an object containing rendering options as the last
    * parameter. When present, these will supercede the default and
    * area-specific rendering options.
    */
  def mapster(method: Set, selected: Boolean, options: RenderingOptions): JQuery = js.native
  /**
    * snapshot: take a "snapshot" of the current selection state, and reset
    * ImageMapster
    *
    * This option is similar to unbind with preserveState. After a snapshot,
    * any active selections will still appear as they did at the time of the
    * snapshot, but they are no longer part of the ImageMapster. This is
    * useful for configuring an initial state, or creating complex
    * representations that may not be easily accomplished with area
    * configuration options.
    *
    * For example, you could bind in image with a specific set of options;
    * programatically select some areas; and take a snapshot; then set new
    * options that cause a different rendering mode. This way you could have
    * certain areas appear differently from the selection highlight, but be
    * "highlighted again" using the new rendering options. Any effects in
    * place at the time of the snapshot essentially become part of the image
    * and are not affected by future operations.
    */
  def mapster(method: Snapshot): JQuery = js.native
  /**
    * tooltip: show/hide tooltips from code
    *
    * See the tooltip options section below for options to control how
    * tooltips appear and are dismissed.
    *
    * This method can be used to manipulate tooltips from code. If the global
    * showToolTip option is false, these methods will still work, so you have
    * the ability to control tooltips bound to areas completely using your own
    * logic, if desired. These methods can also be used to have better control
    * over events needed to close the tooltip, e.g. you could have no tooltip
    * closing event, but add a "close" button to your contianer that will
    * cause the tooltip to close when clicked.
    */
  def mapster(method: Tooltip): JQuery = js.native
  def mapster(method: Tooltip, key: String): JQuery = js.native
  /**
    * unbind: unbind ImageMapster from an image
    *
    * Removes the ImageMapster binding from an image and restores it to its
    * original state. All visible elements (selections, tooltips) will be
    * removed.
    *
    * If the optional "preserveState" parameter is true, the selection overlay
    * and any active tooltips will be preserved. Tooltips can still be
    * dismissed by a user click, but once unbound, the selection states can no
    * longer be controlled either by the user or programatically. To remove
    * them, the actual DOM elements must be removed.
    *
    * Notes: When a mapster is first bound, several things happen. A div
    * element is created which wraps the image. A copy is made of the original
    * image, and the original image is set be transparent. This allows
    * creating visible elements for the selections & highlights without
    * interfering with the image map. Additionally, canvas elements are
    * created (for HTML5 browsers), or a VML elements are created for Internet
    * Explorer, to render the effects. Profile information about each bound
    * image map is stored in memory, and finally, event handlers are bound to
    * the image map.
    *
    * The "unbind" method cleans up these resources: it removes the wrapper,
    * restores the image to its original visibility state, and releases
    * internal resources. When using 'preserveState', the internal resources
    * are cleaned up and event handling is disabled, but HTML elements are not
    * removed. Each element created by ImageMapster is assigned a class of
    * "mapster_el", which can be used to target them for later removal, though
    * it is not easy to complete this process manually because of the wrapper
    * and styles applied during configuration, which will be left intact when
    * using "preserveState."
    */
  def mapster(method: Unbind): JQuery = js.native
  def mapster(method: Unbind, preserveState: Boolean): JQuery = js.native
  def mapster(options: Options): JQuery = js.native
}

