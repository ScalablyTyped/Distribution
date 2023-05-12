package typings.hlsJs.mod

import typings.hlsJs.hlsJsStrings.AUDIO
import typings.hlsJs.hlsJsStrings.NO
import typings.hlsJs.hlsJsStrings.SUBTITLES
import typings.hlsJs.hlsJsStrings.VIDEO
import typings.hlsJs.hlsJsStrings.YES
import typings.hlsJs.hlsJsStrings.`CLOSED-CAPTIONS`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaAttributes extends AttrList {
  
  var `ASSOC-LANGUAGE`: js.UndefOr[String] = js.native
  
  var AUTOSELECT: js.UndefOr[YES | NO] = js.native
  
  var CHANNELS: js.UndefOr[String] = js.native
  
  var CHARACTERISTICS: js.UndefOr[String] = js.native
  
  var DEFAULT: js.UndefOr[YES | NO] = js.native
  
  var FORCED: js.UndefOr[YES | NO] = js.native
  
  var `GROUP-ID`: String = js.native
  
  var `INSTREAM-ID`: js.UndefOr[String] = js.native
  
  var LANGUAGE: js.UndefOr[String] = js.native
  
  var NAME: String = js.native
  
  var `PATHWAY-ID`: js.UndefOr[String] = js.native
  
  var `STABLE-RENDITION-ID`: js.UndefOr[String] = js.native
  
  var TYPE: js.UndefOr[AUDIO | VIDEO | SUBTITLES | `CLOSED-CAPTIONS`] = js.native
  
  var URI: js.UndefOr[String] = js.native
}
