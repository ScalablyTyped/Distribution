package typings.atMapboxMapboxDashSdk.servicesStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  /**
    * Date and time the style was created.
    */
  var created: String
  /**
    * Whether the style is a draft or has been published.
    */
  var draft: Boolean
  var glyphs: String
  /**
    * The ID of the style.
    */
  var id: String
  var layers: js.Array[String]
  /**
    * Information about the style that is used in Mapbox Studio.
    */
  var metadata: String
  /**
    * Date and time the style was last modified.
    */
  var modified: String
  var name: String
  /**
    * The username of the style owner.
    */
  var owner: String
  var sources: js.Any
  var sprite: String
  var version: Double
  /**
    * Access control for the style, either  public or  private . Private styles require an access token belonging to the owner,
    * while public styles may be requested with an access token belonging to any user.
    */
  var visibility: String
}

object Style {
  @scala.inline
  def apply(
    created: String,
    draft: Boolean,
    glyphs: String,
    id: String,
    layers: js.Array[String],
    metadata: String,
    modified: String,
    name: String,
    owner: String,
    sources: js.Any,
    sprite: String,
    version: Double,
    visibility: String
  ): Style = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], glyphs = glyphs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sprite = sprite.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Style]
  }
}

