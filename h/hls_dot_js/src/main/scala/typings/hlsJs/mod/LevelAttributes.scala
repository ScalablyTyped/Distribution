package typings.hlsJs.mod

import typings.hlsJs.hlsJsStrings.HLG
import typings.hlsJs.hlsJsStrings.NONE
import typings.hlsJs.hlsJsStrings.PQ
import typings.hlsJs.hlsJsStrings.SDR
import typings.hlsJs.hlsJsStrings.`TYPE-0`
import typings.hlsJs.hlsJsStrings.`TYPE-1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LevelAttributes extends AttrList {
  
  var `ALLOWED-CPC`: js.UndefOr[String] = js.native
  
  var AUDIO: js.UndefOr[String] = js.native
  
  var `AVERAGE-BANDWIDTH`: js.UndefOr[String] = js.native
  
  var BANDWIDTH: js.UndefOr[String] = js.native
  
  var `CLOSED-CAPTIONS`: js.UndefOr[String] = js.native
  
  var CODECS: js.UndefOr[String] = js.native
  
  var `FRAME-RATE`: js.UndefOr[String] = js.native
  
  var `HDCP-LEVEL`: js.UndefOr[`TYPE-0` | `TYPE-1` | NONE] = js.native
  
  var `PATHWAY-ID`: js.UndefOr[String] = js.native
  
  var RESOLUTION: js.UndefOr[String] = js.native
  
  var SCORE: js.UndefOr[String] = js.native
  
  var `STABLE-VARIANT-ID`: js.UndefOr[String] = js.native
  
  var SUBTITLES: js.UndefOr[String] = js.native
  
  var `SUPPLEMENTAL-CODECS`: js.UndefOr[String] = js.native
  
  var VIDEO: js.UndefOr[String] = js.native
  
  var `VIDEO-RANGE`: js.UndefOr[SDR | HLG | PQ] = js.native
}
