package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.anon.Config
import typings.mapboxMapboxSdk.anon.End
import typings.mapboxMapboxSdk.anon.File
import typings.mapboxMapboxSdk.anon.Format
import typings.mapboxMapboxSdk.anon.IconId
import typings.mapboxMapboxSdk.anon.LastKnownModification
import typings.mapboxMapboxSdk.anon.OwnerId
import typings.mapboxMapboxSdk.anon.Start
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import typings.mapboxMapboxSdk.mod.SdkConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/styles", JSImport.Default)
  @js.native
  def default(config: SdkConfig): StylesService = js.native
  @JSImport("@mapbox/mapbox-sdk/services/styles", JSImport.Default)
  @js.native
  def default(config: typings.mapboxMapboxSdk.mod.default): StylesService = js.native
  
  @js.native
  trait Style extends StObject {
    
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
    implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphs(value: String): Self = StObject.set(x, "glyphs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value :_*))
      
      @scala.inline
      def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSources(value: js.Any): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSprite(value: String): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StylesService extends StObject {
    
    /**
      * Create a style.
      * @param style
      * @param ownerId
      */
    def createStyle(config: typings.mapboxMapboxSdk.anon.Style): MapiRequest = js.native
    
    /**
      * Delete a style.
      * @param style
      * @param ownerId
      */
    def deleteStyle(config: typings.mapboxMapboxSdk.anon.Style): MapiRequest = js.native
    
    /**
      * Remove an icon from a style.
      * @param styleId
      * @param iconId
      * @param ownerId
      */
    // implicit any
    def deleteStyleIcon(config: IconId): Unit = js.native
    
    /**
      * Get embeddable HTML displaying a map.
      * @param config
      * @param styleId
      * @param scrollZoom
      * @param title
      * @param ownerId
      */
    def getEmbeddableHtml(config: Config): MapiRequest = js.native
    
    /**
      * Get a font glyph range.
      * @param fonts
      * @param start
      * @param end
      * @param ownerId
      */
    def getFontGlyphRange(config: End): MapiRequest = js.native
    
    /**
      * Get a style.
      * @param styleId
      * @param ownerId
      */
    def getStyle(config: OwnerId): MapiRequest = js.native
    
    /**
      * Get a style sprite's image or JSON document.
      * @param styleId
      * @param format
      * @param highRes
      * @param ownerId
      */
    def getStyleSprite(config: Format): MapiRequest = js.native
    
    /**
      * List styles in your account.
      * @param start
      * @param ownerId
      */
    def listStyles(config: Start): MapiRequest = js.native
    
    /**
      * Add an icon to a style, or update an existing one.
      * @param styleId
      * @param iconId
      * @param file
      * @param ownerId
      */
    def putStyleIcon(config: File): MapiRequest = js.native
    
    /**
      * Update a style.
      * @param styleId
      * @param style
      * @param lastKnownModification
      * @param ownerId
      */
    // implicit any
    def updateStyle(config: LastKnownModification): Unit = js.native
  }
  object StylesService {
    
    @scala.inline
    def apply(
      createStyle: typings.mapboxMapboxSdk.anon.Style => MapiRequest,
      deleteStyle: typings.mapboxMapboxSdk.anon.Style => MapiRequest,
      deleteStyleIcon: IconId => Unit,
      getEmbeddableHtml: Config => MapiRequest,
      getFontGlyphRange: End => MapiRequest,
      getStyle: OwnerId => MapiRequest,
      getStyleSprite: Format => MapiRequest,
      listStyles: Start => MapiRequest,
      putStyleIcon: File => MapiRequest,
      updateStyle: LastKnownModification => Unit
    ): StylesService = {
      val __obj = js.Dynamic.literal(createStyle = js.Any.fromFunction1(createStyle), deleteStyle = js.Any.fromFunction1(deleteStyle), deleteStyleIcon = js.Any.fromFunction1(deleteStyleIcon), getEmbeddableHtml = js.Any.fromFunction1(getEmbeddableHtml), getFontGlyphRange = js.Any.fromFunction1(getFontGlyphRange), getStyle = js.Any.fromFunction1(getStyle), getStyleSprite = js.Any.fromFunction1(getStyleSprite), listStyles = js.Any.fromFunction1(listStyles), putStyleIcon = js.Any.fromFunction1(putStyleIcon), updateStyle = js.Any.fromFunction1(updateStyle))
      __obj.asInstanceOf[StylesService]
    }
    
    @scala.inline
    implicit class StylesServiceMutableBuilder[Self <: StylesService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateStyle(value: typings.mapboxMapboxSdk.anon.Style => MapiRequest): Self = StObject.set(x, "createStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeleteStyle(value: typings.mapboxMapboxSdk.anon.Style => MapiRequest): Self = StObject.set(x, "deleteStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeleteStyleIcon(value: IconId => Unit): Self = StObject.set(x, "deleteStyleIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetEmbeddableHtml(value: Config => MapiRequest): Self = StObject.set(x, "getEmbeddableHtml", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFontGlyphRange(value: End => MapiRequest): Self = StObject.set(x, "getFontGlyphRange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetStyle(value: OwnerId => MapiRequest): Self = StObject.set(x, "getStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetStyleSprite(value: Format => MapiRequest): Self = StObject.set(x, "getStyleSprite", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListStyles(value: Start => MapiRequest): Self = StObject.set(x, "listStyles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPutStyleIcon(value: File => MapiRequest): Self = StObject.set(x, "putStyleIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateStyle(value: LastKnownModification => Unit): Self = StObject.set(x, "updateStyle", js.Any.fromFunction1(value))
    }
  }
}
