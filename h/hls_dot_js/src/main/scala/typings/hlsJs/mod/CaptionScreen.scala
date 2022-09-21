package typings.hlsJs.mod

import typings.hlsJs.anon.PartialPenStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Keep a CEA-608 screen of 32x15 styled characters
  * @constructor
  */
@js.native
trait CaptionScreen extends StObject {
  
  def backSpace(): Unit = js.native
  
  def clearToEndOfRow(): Unit = js.native
  
  def copy(other: CaptionScreen): Unit = js.native
  
  var currRow: Double = js.native
  
  def equals(other: CaptionScreen): Boolean = js.native
  
  /**
    * Get all non-empty rows with as unicode text.
    */
  def getDisplayText(): String = js.native
  def getDisplayText(asOneRow: Boolean): String = js.native
  
  def getTextAndFormat(): js.Array[Row] = js.native
  
  /**
    * Insert a character (without styling) in the current row.
    */
  def insertChar(char: Double): Unit = js.native
  
  def isEmpty(): Boolean = js.native
  
  var lastOutputScreen: CaptionScreen | Null = js.native
  
  var logger: CaptionsLogger = js.native
  
  def moveCursor(relPos: Double): Unit = js.native
  
  var nrRollUpRows: Double | Null = js.native
  
  def reset(): Unit = js.native
  
  def rollUp(): Unit = js.native
  
  var rows: js.Array[Row] = js.native
  
  /**
    * Set background/extra foreground, but first do back_space, and then insert space (backwards compatibility).
    */
  def setBkgData(bkgData: PartialPenStyles): Unit = js.native
  
  def setCursor(absPos: Double): Unit = js.native
  
  def setPAC(pacData: PACData): Unit = js.native
  
  def setPen(styles: PartialPenStyles): Unit = js.native
  
  def setRollUpRows(): Unit = js.native
  def setRollUpRows(nrRows: Double): Unit = js.native
}
