package typings.mapboxMapboxSdk.stylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Style extends js.Object {
  
  /**
    * Date and time the style was created.
    */
  var created: String = js.native
  
  /**
    * Whether the style is a draft or has been published.
    */
  var draft: Boolean = js.native
  
  var glyphs: String = js.native
  
  /**
    * The ID of the style.
    */
  var id: String = js.native
  
  var layers: js.Array[String] = js.native
  
  /**
    * Information about the style that is used in Mapbox Studio.
    */
  var metadata: String = js.native
  
  /**
    * Date and time the style was last modified.
    */
  var modified: String = js.native
  
  var name: String = js.native
  
  /**
    * The username of the style owner.
    */
  var owner: String = js.native
  
  var sources: js.Any = js.native
  
  var sprite: String = js.native
  
  var version: Double = js.native
  
  /**
    * Access control for the style, either  public or  private . Private styles require an access token belonging to the owner,
    * while public styles may be requested with an access token belonging to any user.
    */
  var visibility: String = js.native
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
  
  @scala.inline
  implicit class StyleOps[Self <: Style] (val x: Self) extends AnyVal {
    
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
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraft(value: Boolean): Self = this.set("draft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphs(value: String): Self = this.set("glyphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersVarargs(value: String*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[String]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: String): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModified(value: String): Self = this.set("modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSources(value: js.Any): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSprite(value: String): Self = this.set("sprite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
  }
}
