package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CMCDStreamType extends StObject
/**
  * CMCD Streaming Type
  */
@JSImport("hls.js", "CMCDStreamType")
@js.native
object CMCDStreamType extends StObject {
  
  @js.native
  sealed trait LIVE
    extends StObject
       with CMCDStreamType
  
  @js.native
  sealed trait VOD
    extends StObject
       with CMCDStreamType
}
