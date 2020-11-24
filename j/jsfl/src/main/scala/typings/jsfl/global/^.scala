package typings.jsfl.global

import typings.jsfl.FlashDocument
import typings.jsfl.FlashElement
import typings.jsfl.FlashFL
import typings.jsfl.FlashFLfile
import typings.jsfl.FlashLibrary
import typings.jsfl.FlashTimeline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object ^ extends js.Object {
  
  var FLfile: FlashFLfile = js.native
  
  // Global variables
  @JSName("$dom")
  var dom: FlashDocument = js.native
  
  var fl: FlashFL = js.native
  
  @JSName("$library")
  var library: FlashLibrary = js.native
  
  @JSName("$selection")
  var selection: js.Array[FlashElement] = js.native
  
  @JSName("$timeline")
  var timeline: FlashTimeline = js.native
  
  var xjsfl: typings.jsfl.xjsfl = js.native
}
