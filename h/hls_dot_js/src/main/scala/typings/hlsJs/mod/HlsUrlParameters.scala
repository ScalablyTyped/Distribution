package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "HlsUrlParameters")
@js.native
open class HlsUrlParameters () extends StObject {
  def this(msn: Double) = this()
  def this(msn: Double, part: Double) = this()
  def this(msn: Unit, part: Double) = this()
  def this(msn: Double, part: Double, skip: HlsSkip) = this()
  def this(msn: Double, part: Unit, skip: HlsSkip) = this()
  def this(msn: Unit, part: Double, skip: HlsSkip) = this()
  def this(msn: Unit, part: Unit, skip: HlsSkip) = this()
  
  def addDirectives(uri: String): String | scala.Nothing = js.native
  
  var msn: js.UndefOr[Double] = js.native
  
  var part: js.UndefOr[Double] = js.native
  
  var skip: js.UndefOr[HlsSkip] = js.native
}
