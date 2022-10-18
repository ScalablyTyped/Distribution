package typings.jupyterlabSharedModels.libApiMod

import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISharedText
  extends StObject
     with ISharedBase {
  
  /**
    * The changed signal.
    */
  val changed: ISignal[this.type, TextChange] = js.native
  
  /**
    * Gets cell's source.
    *
    * @returns Cell's source.
    */
  def getSource(): String = js.native
  
  /**
    * Sets cell's source.
    *
    * @param value: New source.
    */
  def setSource(value: String): Unit = js.native
  
  /**
    * Replace content from `start' to `end` with `value`.
    *
    * @param start: The start index of the range to replace (inclusive).
    *
    * @param end: The end index of the range to replace (exclusive).
    *
    * @param value: New source (optional).
    */
  def updateSource(start: Double, end: Double): Unit = js.native
  def updateSource(start: Double, end: Double, value: String): Unit = js.native
}
