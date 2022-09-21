package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "Part")
@js.native
open class Part protected () extends BaseSegment {
  def this(partAttrs: AttrList, frag: Fragment, baseurl: String, index: Double) = this()
  def this(partAttrs: AttrList, frag: Fragment, baseurl: String, index: Double, previous: Part) = this()
  
  val duration: Double = js.native
  
  def end: Double = js.native
  
  val fragOffset: Double = js.native
  
  val fragment: Fragment = js.native
  
  val gap: Boolean = js.native
  
  val independent: Boolean = js.native
  
  val index: Double = js.native
  
  def loaded: Boolean = js.native
  
  @JSName("relurl")
  val relurl_Part: String = js.native
  
  def start: Double = js.native
  
  var stats: LoadStats = js.native
}
