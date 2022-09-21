package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CMCDObjectType extends StObject
/**
  * CMCD Object Type
  */
@JSImport("hls.js", "CMCDObjectType")
@js.native
object CMCDObjectType extends StObject {
  
  @js.native
  sealed trait AUDIO
    extends StObject
       with CMCDObjectType
  
  @js.native
  sealed trait CAPTION
    extends StObject
       with CMCDObjectType
  
  @js.native
  sealed trait INIT
    extends StObject
       with CMCDObjectType
  
  @js.native
  sealed trait KEY
    extends StObject
       with CMCDObjectType
  
  @js.native
  sealed trait MANIFEST
    extends StObject
       with CMCDObjectType
  
  @js.native
  sealed trait MUXED
    extends StObject
       with CMCDObjectType
  
  @js.native
  sealed trait OTHER
    extends StObject
       with CMCDObjectType
  
  @js.native
  sealed trait TIMED_TEXT
    extends StObject
       with CMCDObjectType
  
  @js.native
  sealed trait VIDEO
    extends StObject
       with CMCDObjectType
}
