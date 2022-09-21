package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.maplibreGl.anon.Width
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "LineAtlas")
@js.native
open class LineAtlas protected () extends StObject {
  def this(width: Double, height: Double) = this()
  
  def addDash(dasharray: js.Array[Double], round: Boolean): Width = js.native
  
  def addRegularDash(ranges: Any): scala.Unit = js.native
  
  def addRoundDash(ranges: Any, stretch: Double, n: Double): scala.Unit = js.native
  
  def bind(context: Context): scala.Unit = js.native
  
  var bytes: Double = js.native
  
  var dashEntry: StringDictionary[Any] = js.native
  
  var data: js.typedarray.Uint8Array = js.native
  
  var dirty: Boolean = js.native
  
  /**
  	 * Get or create a dash line pattern.
  	 *
  	 * @param {Array<number>} dasharray
  	 * @param {boolean} round whether to add circle caps in between dash segments
  	 * @returns {Object} position of dash texture in { y, height, width }
  	 * @private
  	 */
  def getDash(dasharray: js.Array[Double], round: Boolean): Any = js.native
  
  def getDashRanges(dasharray: js.Array[Double], lineAtlasWidth: Double, stretch: Double): js.Array[Any] = js.native
  
  var height: Double = js.native
  
  var nextRow: Double = js.native
  
  var texture: WebGLTexture = js.native
  
  var width: Double = js.native
}
