package typings.leafletDotIconDotGlyph.leafletMod.Icon

import typings.leaflet.leafletMod.IconOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Icon.Glyph")
@js.native
class Glyph ()
  extends typings.leaflet.leafletMod.Icon[IconOptions] {
  def this(options: GlyphIconOptions) = this()
  def this(options: GlyphOptions) = this()
  @JSName("options")
  var options_Glyph: GlyphIconOptions = js.native
}

