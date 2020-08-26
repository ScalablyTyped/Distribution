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

@js.native
trait StylesService extends js.Object {
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
  implicit class StylesServiceOps[Self <: StylesService] (val x: Self) extends AnyVal {
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
    def setCreateStyle(value: typings.mapboxMapboxSdk.anon.Style => MapiRequest): Self = this.set("createStyle", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteStyle(value: typings.mapboxMapboxSdk.anon.Style => MapiRequest): Self = this.set("deleteStyle", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteStyleIcon(value: IconId => Unit): Self = this.set("deleteStyleIcon", js.Any.fromFunction1(value))
    @scala.inline
    def setGetEmbeddableHtml(value: Config => MapiRequest): Self = this.set("getEmbeddableHtml", js.Any.fromFunction1(value))
    @scala.inline
    def setGetFontGlyphRange(value: End => MapiRequest): Self = this.set("getFontGlyphRange", js.Any.fromFunction1(value))
    @scala.inline
    def setGetStyle(value: OwnerId => MapiRequest): Self = this.set("getStyle", js.Any.fromFunction1(value))
    @scala.inline
    def setGetStyleSprite(value: Format => MapiRequest): Self = this.set("getStyleSprite", js.Any.fromFunction1(value))
    @scala.inline
    def setListStyles(value: Start => MapiRequest): Self = this.set("listStyles", js.Any.fromFunction1(value))
    @scala.inline
    def setPutStyleIcon(value: File => MapiRequest): Self = this.set("putStyleIcon", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateStyle(value: LastKnownModification => Unit): Self = this.set("updateStyle", js.Any.fromFunction1(value))
  }
  
}

