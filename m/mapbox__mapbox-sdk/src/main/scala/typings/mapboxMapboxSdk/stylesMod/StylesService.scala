package typings.mapboxMapboxSdk.stylesMod

import typings.mapboxMapboxSdk.anon.Config
import typings.mapboxMapboxSdk.anon.End
import typings.mapboxMapboxSdk.anon.File
import typings.mapboxMapboxSdk.anon.Format
import typings.mapboxMapboxSdk.anon.IconId
import typings.mapboxMapboxSdk.anon.LastKnownModification
import typings.mapboxMapboxSdk.anon.OwnerId
import typings.mapboxMapboxSdk.anon.Start
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
  def createStyle(config: typings.mapboxMapboxSdk.anon.Style): MapiRequest
  /**
    * Delete a style.
    * @param style
    * @param ownerId
    */
  def deleteStyle(config: typings.mapboxMapboxSdk.anon.Style): MapiRequest
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
  def getEmbeddableHtml(config: Config): MapiRequest
  /**
    * Get a font glyph range.
    * @param fonts
    * @param start
    * @param end
    * @param ownerId
    */
  def getFontGlyphRange(config: End): MapiRequest
  /**
    * Get a style.
    * @param styleId
    * @param ownerId
    */
  def getStyle(config: OwnerId): MapiRequest
  /**
    * Get a style sprite's image or JSON document.
    * @param styleId
    * @param format
    * @param highRes
    * @param ownerId
    */
  def getStyleSprite(config: Format): MapiRequest
  /**
    * List styles in your account.
    * @param start
    * @param ownerId
    */
  def listStyles(config: Start): MapiRequest
  /**
    * Add an icon to a style, or update an existing one.
    * @param styleId
    * @param iconId
    * @param file
    * @param ownerId
    */
  def putStyleIcon(config: File): MapiRequest
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
}

