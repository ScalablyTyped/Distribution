package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CMCDStreamingFormat extends StObject
/**
  * CMCD Streaming Format
  */
@JSImport("hls.js", "CMCDStreamingFormat")
@js.native
object CMCDStreamingFormat extends StObject {
  
  @js.native
  sealed trait DASH
    extends StObject
       with CMCDStreamingFormat
  
  @js.native
  sealed trait HLS
    extends StObject
       with CMCDStreamingFormat
  
  @js.native
  sealed trait OTHER
    extends StObject
       with CMCDStreamingFormat
  
  @js.native
  sealed trait SMOOTH
    extends StObject
       with CMCDStreamingFormat
}
