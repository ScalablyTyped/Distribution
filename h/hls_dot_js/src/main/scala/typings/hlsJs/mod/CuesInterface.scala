package typings.hlsJs.mod

import typings.std.TextTrack
import typings.std.VTTCue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CuesInterface extends StObject {
  
  def newCue(track: Null, startTime: Double, endTime: Double, captionScreen: CaptionScreen): js.Array[VTTCue] = js.native
  def newCue(track: TextTrack, startTime: Double, endTime: Double, captionScreen: CaptionScreen): js.Array[VTTCue] = js.native
}
