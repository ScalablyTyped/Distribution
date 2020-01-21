package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mapboxGl.mapboxGlStrings.Unknown
  - typings.mapboxGl.mapboxGlStrings.Style
  - typings.mapboxGl.mapboxGlStrings.Source
  - typings.mapboxGl.mapboxGlStrings.Tile
  - typings.mapboxGl.mapboxGlStrings.Glyphs
  - typings.mapboxGl.mapboxGlStrings.SpriteImage
  - typings.mapboxGl.mapboxGlStrings.SpriteJSON
  - typings.mapboxGl.mapboxGlStrings.Image
*/
trait ResourceType extends js.Object

object ResourceType {
  @scala.inline
  def Glyphs: typings.mapboxGl.mapboxGlStrings.Glyphs = this.cast("Glyphs")
  @scala.inline
  def Image: typings.mapboxGl.mapboxGlStrings.Image = this.cast("Image")
  @scala.inline
  def Source: typings.mapboxGl.mapboxGlStrings.Source = this.cast("Source")
  @scala.inline
  def SpriteImage: typings.mapboxGl.mapboxGlStrings.SpriteImage = this.cast("SpriteImage")
  @scala.inline
  def SpriteJSON: typings.mapboxGl.mapboxGlStrings.SpriteJSON = this.cast("SpriteJSON")
  @scala.inline
  def Style: typings.mapboxGl.mapboxGlStrings.Style = this.cast("Style")
  @scala.inline
  def Tile: typings.mapboxGl.mapboxGlStrings.Tile = this.cast("Tile")
  @scala.inline
  def Unknown: typings.mapboxGl.mapboxGlStrings.Unknown = this.cast("Unknown")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

