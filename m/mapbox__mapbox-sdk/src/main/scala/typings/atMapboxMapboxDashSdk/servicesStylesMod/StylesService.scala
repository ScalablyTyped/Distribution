package typings.atMapboxMapboxDashSdk.servicesStylesMod

import typings.atMapboxMapboxDashSdk.Anon_Config
import typings.atMapboxMapboxDashSdk.Anon_End
import typings.atMapboxMapboxDashSdk.Anon_File
import typings.atMapboxMapboxDashSdk.Anon_Format
import typings.atMapboxMapboxDashSdk.Anon_IconId
import typings.atMapboxMapboxDashSdk.Anon_LastKnownModification
import typings.atMapboxMapboxDashSdk.Anon_OwnerId
import typings.atMapboxMapboxDashSdk.Anon_OwnerIdStart
import typings.atMapboxMapboxDashSdk.Anon_OwnerIdStyle
import typings.atMapboxMapboxDashSdk.libClassesMapiDashRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylesService extends js.Object {
  /**
    * Create a style.
    * @param style
    * @param ownerId
    */
  def createStyle(config: Anon_OwnerIdStyle): MapiRequest
  /**
    * Delete a style.
    * @param style
    * @param ownerId
    */
  def deleteStyle(config: Anon_OwnerIdStyle): MapiRequest
  /**
    * Remove an icon from a style.
    * @param styleId
    * @param iconId
    * @param ownerId
    */
  // implicit any
  def deleteStyleIcon(config: Anon_IconId): Unit
  /**
    * Get embeddable HTML displaying a map.
    * @param config
    * @param styleId
    * @param scrollZoom
    * @param title
    * @param ownerId
    */
  def getEmbeddableHtml(config: Anon_Config): MapiRequest
  /**
    * Get a font glyph range.
    * @param fonts
    * @param start
    * @param end
    * @param ownerId
    */
  def getFontGlyphRange(config: Anon_End): MapiRequest
  /**
    * Get a style.
    * @param styleId
    * @param ownerId
    */
  def getStyle(config: Anon_OwnerId): MapiRequest
  /**
    * Get a style sprite's image or JSON document.
    * @param styleId
    * @param format
    * @param highRes
    * @param ownerId
    */
  def getStyleSprite(config: Anon_Format): MapiRequest
  /**
    * List styles in your account.
    * @param start
    * @param ownerId
    */
  def listStyles(config: Anon_OwnerIdStart): MapiRequest
  /**
    * Add an icon to a style, or update an existing one.
    * @param styleId
    * @param iconId
    * @param file
    * @param ownerId
    */
  def putStyleIcon(config: Anon_File): MapiRequest
  /**
    * Update a style.
    * @param styleId
    * @param style
    * @param lastKnownModification
    * @param ownerId
    */
  // implicit any
  def updateStyle(config: Anon_LastKnownModification): Unit
}

object StylesService {
  @scala.inline
  def apply(
    createStyle: Anon_OwnerIdStyle => MapiRequest,
    deleteStyle: Anon_OwnerIdStyle => MapiRequest,
    deleteStyleIcon: Anon_IconId => Unit,
    getEmbeddableHtml: Anon_Config => MapiRequest,
    getFontGlyphRange: Anon_End => MapiRequest,
    getStyle: Anon_OwnerId => MapiRequest,
    getStyleSprite: Anon_Format => MapiRequest,
    listStyles: Anon_OwnerIdStart => MapiRequest,
    putStyleIcon: Anon_File => MapiRequest,
    updateStyle: Anon_LastKnownModification => Unit
  ): StylesService = {
    val __obj = js.Dynamic.literal(createStyle = js.Any.fromFunction1(createStyle), deleteStyle = js.Any.fromFunction1(deleteStyle), deleteStyleIcon = js.Any.fromFunction1(deleteStyleIcon), getEmbeddableHtml = js.Any.fromFunction1(getEmbeddableHtml), getFontGlyphRange = js.Any.fromFunction1(getFontGlyphRange), getStyle = js.Any.fromFunction1(getStyle), getStyleSprite = js.Any.fromFunction1(getStyleSprite), listStyles = js.Any.fromFunction1(listStyles), putStyleIcon = js.Any.fromFunction1(putStyleIcon), updateStyle = js.Any.fromFunction1(updateStyle))
  
    __obj.asInstanceOf[StylesService]
  }
}

