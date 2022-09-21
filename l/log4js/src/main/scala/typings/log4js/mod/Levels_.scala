package typings.log4js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Levels_ extends StObject {
  
  var ALL: Level = js.native
  
  var DEBUG: Level = js.native
  
  var ERROR: Level = js.native
  
  var FATAL: Level = js.native
  
  var INFO: Level = js.native
  
  var MARK: Level = js.native
  
  var OFF: Level = js.native
  
  var TRACE: Level = js.native
  
  var WARN: Level = js.native
  
  def addLevels(customLevels: js.Object): Unit = js.native
  
  def getLevel(level: String): Level = js.native
  def getLevel(level: String, defaultLevel: Level): Level = js.native
  def getLevel(level: Level): Level = js.native
  def getLevel(level: Level, defaultLevel: Level): Level = js.native
  
  var levels: js.Array[Level] = js.native
}
