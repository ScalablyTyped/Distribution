package typings.hlsParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hlsParserStrings {
  
  @scala.inline
  def AUDIO: AUDIO = "AUDIO".asInstanceOf[AUDIO]
  
  @scala.inline
  def `CLOSED-CAPTIONS`: `CLOSED-CAPTIONS` = "CLOSED-CAPTIONS".asInstanceOf[`CLOSED-CAPTIONS`]
  
  @scala.inline
  def EVENT: EVENT = "EVENT".asInstanceOf[EVENT]
  
  @scala.inline
  def SUBTITLES: SUBTITLES = "SUBTITLES".asInstanceOf[SUBTITLES]
  
  @scala.inline
  def VIDEO: VIDEO = "VIDEO".asInstanceOf[VIDEO]
  
  @scala.inline
  def VOD: VOD = "VOD".asInstanceOf[VOD]
  
  @scala.inline
  def playlist: playlist = "playlist".asInstanceOf[playlist]
  
  @scala.inline
  def segment: segment = "segment".asInstanceOf[segment]
  
  @js.native
  sealed trait AUDIO extends js.Object
  
  @js.native
  sealed trait `CLOSED-CAPTIONS` extends js.Object
  
  @js.native
  sealed trait EVENT extends js.Object
  
  @js.native
  sealed trait SUBTITLES extends js.Object
  
  @js.native
  sealed trait VIDEO extends js.Object
  
  @js.native
  sealed trait VOD extends js.Object
  
  @js.native
  sealed trait playlist extends js.Object
  
  @js.native
  sealed trait segment extends js.Object
}
