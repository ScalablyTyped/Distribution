package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(jsflLib.FlashSymbolInstance because Would inherit conflicting mutable fields List(accName, actionScript, description, forceSimple, shortcut, silent, tabIndex))*/
trait FlashElement
  extends FlashShape
     with FlashInstance
     with FlashBitmapInstance
     with FlashCompiledClipInstance
     with FlashComponentInstance {
  var depth: scala.Double
  /**
  	 * Read-only property; a string that represents the type of the specified element.
  	 * The value is one of the following: "shape", "text", "instance", or "shapeObj".
  	 * A "shapeObj" is created with an extensible tool.
  	 */
  var elementType: java.lang.String
  var height: scala.Double
  var layer: FlashLayer
  var left: scala.Double
  var locked: scala.Boolean
  var matrix: FlashMatrix
  var name: java.lang.String
  var rotation: scala.Double
  var scaleX: scala.Double
  var scaleY: scala.Double
  var selected: scala.Boolean
  var skewX: scala.Double
  var skewY: scala.Double
  var top: scala.Double
  var transformX: scala.Double
  var transformY: scala.Double
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
  def getPersistentData(name: java.lang.String): js.Any
  def getTransformationPoint(): FlashPoint
  def hasPersistentData(name: java.lang.String): scala.Boolean
  def removePersistentData(name: java.lang.String): scala.Unit
  def setPersistentData(name: java.lang.String, `type`: java.lang.String, value: js.Any): scala.Unit
  def setTransformationPoint(transformationPoint: FlashPoint): scala.Unit
}

