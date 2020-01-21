package typings.mapboxMapboxSdk.stylesMod

import typings.mapboxMapboxSdk.AnonConfig
import typings.mapboxMapboxSdk.AnonEnd
import typings.mapboxMapboxSdk.AnonFile
import typings.mapboxMapboxSdk.AnonFormat
import typings.mapboxMapboxSdk.AnonIconId
import typings.mapboxMapboxSdk.AnonLastKnownModification
import typings.mapboxMapboxSdk.AnonOwnerId
import typings.mapboxMapboxSdk.AnonOwnerIdStart
import typings.mapboxMapboxSdk.AnonOwnerIdStyle
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylesService extends js.Object {
  /**
    * Create a style.
    * @param style
    * @param ownerId
    */
  def createStyle(config: AnonOwnerIdStyle): MapiRequest
  /**
    * Delete a style.
    * @param style
    * @param ownerId
    */
  def deleteStyle(config: AnonOwnerIdStyle): MapiRequest
  /**
    * Remove an icon from a style.
    * @param styleId
    * @param iconId
    * @param ownerId
    */
  // implicit any
  def deleteStyleIcon(config: AnonIconId): Unit
  /**
    * Get embeddable HTML displaying a map.
    * @param config
    * @param styleId
    * @param scrollZoom
    * @param title
    * @param ownerId
    */
  def getEmbeddableHtml(config: AnonConfig): MapiRequest
  /**
    * Get a font glyph range.
    * @param fonts
    * @param start
    * @param end
    * @param ownerId
    */
  def getFontGlyphRange(config: AnonEnd): MapiRequest
  /**
    * Get a style.
    * @param styleId
    * @param ownerId
    */
  def getStyle(config: AnonOwnerId): MapiRequest
  /**
    * Get a style sprite's image or JSON document.
    * @param styleId
    * @param format
    * @param highRes
    * @param ownerId
    */
  def getStyleSprite(config: AnonFormat): MapiRequest
  /**
    * List styles in your account.
    * @param start
    * @param ownerId
    */
  def listStyles(config: AnonOwnerIdStart): MapiRequest
  /**
    * Add an icon to a style, or update an existing one.
    * @param styleId
    * @param iconId
    * @param file
    * @param ownerId
    */
  def putStyleIcon(config: AnonFile): MapiRequest
  /**
    * Update a style.
    * @param styleId
    * @param style
    * @param lastKnownModification
    * @param ownerId
    */
  // implicit any
  def updateStyle(config: AnonLastKnownModification): Unit
}

object StylesService {
  @scala.inline
  def apply(
    createStyle: AnonOwnerIdStyle => MapiRequest,
    deleteStyle: AnonOwnerIdStyle => MapiRequest,
    deleteStyleIcon: AnonIconId => Unit,
    getEmbeddableHtml: AnonConfig => MapiRequest,
    getFontGlyphRange: AnonEnd => MapiRequest,
    getStyle: AnonOwnerId => MapiRequest,
    getStyleSprite: AnonFormat => MapiRequest,
    listStyles: AnonOwnerIdStart => MapiRequest,
    putStyleIcon: AnonFile => MapiRequest,
    updateStyle: AnonLastKnownModification => Unit
  ): StylesService = {
    val __obj = js.Dynamic.literal(createStyle = js.Any.fromFunction1(createStyle), deleteStyle = js.Any.fromFunction1(deleteStyle), deleteStyleIcon = js.Any.fromFunction1(deleteStyleIcon), getEmbeddableHtml = js.Any.fromFunction1(getEmbeddableHtml), getFontGlyphRange = js.Any.fromFunction1(getFontGlyphRange), getStyle = js.Any.fromFunction1(getStyle), getStyleSprite = js.Any.fromFunction1(getStyleSprite), listStyles = js.Any.fromFunction1(listStyles), putStyleIcon = js.Any.fromFunction1(putStyleIcon), updateStyle = js.Any.fromFunction1(updateStyle))
  
    __obj.asInstanceOf[StylesService]
  }
}

