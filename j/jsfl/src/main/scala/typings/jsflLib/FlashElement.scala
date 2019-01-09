package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- jsflLib.FlashSymbolInstance because var conflicts: accName, actionScript, description, forceSimple, shortcut, silent, tabIndex. Inlined backgroundColor, bitmapRenderMode, blendMode, buttonTracking, cacheAsBitmap, colorAlphaAmount, colorAlphaPercent, colorBlueAmount, colorBluePercent, colorGreenAmount, colorGreenPercent, colorMode, colorRedAmount, colorRedPercent, filters, firstFrame, loop, symbolType, useBackgroundColor, visible */ trait FlashElement
  extends FlashShape
     with FlashInstance
     with FlashBitmapInstance
     with FlashCompiledClipInstance
     with FlashComponentInstance {
  var backgroundColor: java.lang.String
  var bitmapRenderMode: java.lang.String
  var blendMode: java.lang.String
  var buttonTracking: java.lang.String
  var cacheAsBitmap: scala.Boolean
  var colorAlphaAmount: scala.Double
  var colorAlphaPercent: scala.Double
  var colorBlueAmount: scala.Double
  var colorBluePercent: scala.Double
  var colorGreenAmount: scala.Double
  var colorGreenPercent: scala.Double
  var colorMode: java.lang.String
  var colorRedAmount: scala.Double
  var colorRedPercent: scala.Double
  var depth: scala.Double
  /**
  	 * Read-only property; a string that represents the type of the specified element.
  	 * The value is one of the following: "shape", "text", "instance", or "shapeObj".
  	 * A "shapeObj" is created with an extensible tool.
  	 */
  var elementType: java.lang.String
  var filters: js.Array[FlashFilter]
  var firstFrame: scala.Double
  var height: scala.Double
  var layer: FlashLayer
  var left: scala.Double
  var locked: scala.Boolean
  var loop: java.lang.String
  var matrix: FlashMatrix
  var name: java.lang.String
  var rotation: scala.Double
  var scaleX: scala.Double
  var scaleY: scala.Double
  var selected: scala.Boolean
  var skewX: scala.Double
  var skewY: scala.Double
  var symbolType: java.lang.String
  var top: scala.Double
  var transformX: scala.Double
  var transformY: scala.Double
  var useBackgroundColor: scala.Boolean
  var visible: scala.Boolean
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

