package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@maplibre/maplibre-gl-style-spec", "FormattedSection")
@js.native
open class FormattedSection protected () extends StObject {
  def this(text: String) = this()
  def this(text: String, image: ResolvedImage) = this()
  def this(text: String, image: Null, scale: Double) = this()
  def this(text: String, image: ResolvedImage, scale: Double) = this()
  def this(text: String, image: Null, scale: Double, fontStack: String) = this()
  def this(text: String, image: Null, scale: Null, fontStack: String) = this()
  def this(text: String, image: ResolvedImage, scale: Double, fontStack: String) = this()
  def this(text: String, image: ResolvedImage, scale: Null, fontStack: String) = this()
  def this(text: String, image: Null, scale: Double, fontStack: String, textColor: Color) = this()
  def this(text: String, image: Null, scale: Double, fontStack: Null, textColor: Color) = this()
  def this(text: String, image: Null, scale: Null, fontStack: String, textColor: Color) = this()
  def this(text: String, image: Null, scale: Null, fontStack: Null, textColor: Color) = this()
  def this(text: String, image: ResolvedImage, scale: Double, fontStack: String, textColor: Color) = this()
  def this(text: String, image: ResolvedImage, scale: Double, fontStack: Null, textColor: Color) = this()
  def this(text: String, image: ResolvedImage, scale: Null, fontStack: String, textColor: Color) = this()
  def this(text: String, image: ResolvedImage, scale: Null, fontStack: Null, textColor: Color) = this()
  
  var fontStack: String | Null = js.native
  
  var image: ResolvedImage | Null = js.native
  
  var scale: Double | Null = js.native
  
  var text: String = js.native
  
  var textColor: Color | Null = js.native
}
