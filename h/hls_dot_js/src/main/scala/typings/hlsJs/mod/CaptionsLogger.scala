package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionsLogger extends StObject {
  
  def log(severity: VerboseLevel, msg: String): Unit = js.native
  def log(severity: VerboseLevel, msg: js.Function0[String]): Unit = js.native
  
  var time: Double | Null = js.native
  
  var verboseLevel: VerboseLevel = js.native
}
