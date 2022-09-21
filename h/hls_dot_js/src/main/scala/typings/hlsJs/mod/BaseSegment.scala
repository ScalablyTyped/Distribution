package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "BaseSegment")
@js.native
open class BaseSegment protected () extends StObject {
  def this(baseurl: String) = this()
  
  /* private */ var _byteRange: Any = js.native
  
  /* private */ var _url: Any = js.native
  
  val baseurl: String = js.native
  
  def byteRange: js.Array[Double] = js.native
  
  def byteRangeEndOffset: Double = js.native
  
  def byteRangeStartOffset: Double = js.native
  
  var elementaryStreams: ElementaryStreams = js.native
  
  var relurl: js.UndefOr[String] = js.native
  
  def setByteRange(value: String): Unit = js.native
  def setByteRange(value: String, previous: BaseSegment): Unit = js.native
  
  def url: String = js.native
  def url_=(value: String): Unit = js.native
}
