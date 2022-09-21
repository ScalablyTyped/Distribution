package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.anon.Config
import typings.mapboxMapboxSdk.anon.Draft
import typings.mapboxMapboxSdk.anon.End
import typings.mapboxMapboxSdk.anon.File
import typings.mapboxMapboxSdk.anon.Format
import typings.mapboxMapboxSdk.anon.Fresh
import typings.mapboxMapboxSdk.anon.IconId
import typings.mapboxMapboxSdk.anon.LastKnownModification
import typings.mapboxMapboxSdk.anon.OwnerId
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import typings.mapboxMapboxSdk.mod.SdkConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: SdkConfig): StylesService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[StylesService]
  inline def default(config: typings.mapboxMapboxSdk.mod.default): StylesService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[StylesService]
  
  trait Style extends StObject {
    
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
    
    var sources: Any
    
    var sprite: String
    
    var version: Double
    
    /**
      * Access control for the style, either  public or  private . Private styles require an access token belonging to the owner,
      * while public styles may be requested with an access token belonging to any user.
      */
    var visibility: String
  }
  object Style {
    
    inline def apply(
      created: String,
      draft: Boolean,
      glyphs: String,
      id: String,
      layers: js.Array[String],
      metadata: String,
      modified: String,
      name: String,
      owner: String,
      sources: Any,
      sprite: String,
      version: Double,
      visibility: String
    ): Style = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], glyphs = glyphs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sprite = sprite.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
      __obj.asInstanceOf[Style]
    }
    
    extension [Self <: Style](x: Self) {
      
      inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
      
      inline def setGlyphs(value: String): Self = StObject.set(x, "glyphs", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setSources(value: Any): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSprite(value: String): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    }
  }
  
  trait StylesService extends StObject {
    
    /**
      * Create a style.
      * @param style
      * @param ownerId
      */
    def createStyle(config: OwnerId): MapiRequest[Any]
    
    /**
      * Delete a style.
      * @param style
      * @param ownerId
      */
    def deleteStyle(config: OwnerId): MapiRequest[Any]
    
    /**
      * Remove an icon from a style.
      * @param styleId
      * @param iconId
      * @param ownerId
      */
    // implicit any
    def deleteStyleIcon(config: IconId): Unit
    
    /**
      * Get embeddable HTML displaying a map.
      * @param config
      * @param styleId
      * @param scrollZoom
      * @param title
      * @param ownerId
      */
    def getEmbeddableHtml(config: Config): MapiRequest[Any]
    
    /**
      * Get a font glyph range.
      * @param fonts
      * @param start
      * @param end
      * @param ownerId
      */
    def getFontGlyphRange(config: End): MapiRequest[Any]
    
    /**
      * Get a style.
      * @param styleId
      * @param ownerId
      */
    def getStyle(config: Draft): MapiRequest[Any]
    
    /**
      * Get a style sprite's image or JSON document.
      * @param styleId
      * @param format
      * @param highRes
      * @param ownerId
      */
    def getStyleSprite(config: Format): MapiRequest[Any]
    
    /**
      * List styles in your account.
      * @param start
      * @param ownerId
      */
    def listStyles(config: Fresh): MapiRequest[Any]
    
    /**
      * Add an icon to a style, or update an existing one.
      * @param styleId
      * @param iconId
      * @param file
      * @param ownerId
      */
    def putStyleIcon(config: File): MapiRequest[Any]
    
    /**
      * Update a style.
      * @param styleId
      * @param style
      * @param lastKnownModification
      * @param ownerId
      */
    // implicit any
    def updateStyle(config: LastKnownModification): Unit
  }
  object StylesService {
    
    inline def apply(
      createStyle: OwnerId => MapiRequest[Any],
      deleteStyle: OwnerId => MapiRequest[Any],
      deleteStyleIcon: IconId => Unit,
      getEmbeddableHtml: Config => MapiRequest[Any],
      getFontGlyphRange: End => MapiRequest[Any],
      getStyle: Draft => MapiRequest[Any],
      getStyleSprite: Format => MapiRequest[Any],
      listStyles: Fresh => MapiRequest[Any],
      putStyleIcon: File => MapiRequest[Any],
      updateStyle: LastKnownModification => Unit
    ): StylesService = {
      val __obj = js.Dynamic.literal(createStyle = js.Any.fromFunction1(createStyle), deleteStyle = js.Any.fromFunction1(deleteStyle), deleteStyleIcon = js.Any.fromFunction1(deleteStyleIcon), getEmbeddableHtml = js.Any.fromFunction1(getEmbeddableHtml), getFontGlyphRange = js.Any.fromFunction1(getFontGlyphRange), getStyle = js.Any.fromFunction1(getStyle), getStyleSprite = js.Any.fromFunction1(getStyleSprite), listStyles = js.Any.fromFunction1(listStyles), putStyleIcon = js.Any.fromFunction1(putStyleIcon), updateStyle = js.Any.fromFunction1(updateStyle))
      __obj.asInstanceOf[StylesService]
    }
    
    extension [Self <: StylesService](x: Self) {
      
      inline def setCreateStyle(value: OwnerId => MapiRequest[Any]): Self = StObject.set(x, "createStyle", js.Any.fromFunction1(value))
      
      inline def setDeleteStyle(value: OwnerId => MapiRequest[Any]): Self = StObject.set(x, "deleteStyle", js.Any.fromFunction1(value))
      
      inline def setDeleteStyleIcon(value: IconId => Unit): Self = StObject.set(x, "deleteStyleIcon", js.Any.fromFunction1(value))
      
      inline def setGetEmbeddableHtml(value: Config => MapiRequest[Any]): Self = StObject.set(x, "getEmbeddableHtml", js.Any.fromFunction1(value))
      
      inline def setGetFontGlyphRange(value: End => MapiRequest[Any]): Self = StObject.set(x, "getFontGlyphRange", js.Any.fromFunction1(value))
      
      inline def setGetStyle(value: Draft => MapiRequest[Any]): Self = StObject.set(x, "getStyle", js.Any.fromFunction1(value))
      
      inline def setGetStyleSprite(value: Format => MapiRequest[Any]): Self = StObject.set(x, "getStyleSprite", js.Any.fromFunction1(value))
      
      inline def setListStyles(value: Fresh => MapiRequest[Any]): Self = StObject.set(x, "listStyles", js.Any.fromFunction1(value))
      
      inline def setPutStyleIcon(value: File => MapiRequest[Any]): Self = StObject.set(x, "putStyleIcon", js.Any.fromFunction1(value))
      
      inline def setUpdateStyle(value: LastKnownModification => Unit): Self = StObject.set(x, "updateStyle", js.Any.fromFunction1(value))
    }
  }
}
