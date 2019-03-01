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

object FlashElement {
  @scala.inline
  def apply(
    accName: java.lang.String,
    actionScript: java.lang.String,
    backgroundColor: java.lang.String,
    beginEdit: js.Function0[scala.Unit],
    bitmapRenderMode: java.lang.String,
    blendMode: java.lang.String,
    buttonTracking: java.lang.String,
    cacheAsBitmap: scala.Boolean,
    closePath: scala.Boolean,
    colorAlphaAmount: scala.Double,
    colorAlphaPercent: scala.Double,
    colorBlueAmount: scala.Double,
    colorBluePercent: scala.Double,
    colorGreenAmount: scala.Double,
    colorGreenPercent: scala.Double,
    colorMode: java.lang.String,
    colorRedAmount: scala.Double,
    colorRedPercent: scala.Double,
    contours: js.Array[FlashContour],
    deleteEdge: js.Function1[scala.Double, scala.Unit],
    depth: scala.Double,
    description: java.lang.String,
    edges: js.Array[FlashEdge],
    elementType: java.lang.String,
    endAngle: scala.Double,
    endEdit: js.Function0[scala.Unit],
    filters: js.Array[FlashFilter],
    firstFrame: scala.Double,
    forceSimple: scala.Boolean,
    getBits: js.Function0[_FlashBitmap],
    getCubicSegmentPoints: js.Function1[scala.Double, js.Array[FlashPoint]],
    getPersistentData: js.Function1[java.lang.String, js.Any],
    getTransformationPoint: js.Function0[FlashPoint],
    hPixels: scala.Double,
    hasPersistentData: js.Function1[java.lang.String, scala.Boolean],
    height: scala.Double,
    innerRadius: scala.Double,
    isDrawingObject: scala.Boolean,
    isGroup: scala.Boolean,
    isOvalObject: scala.Boolean,
    isRectangleObject: scala.Boolean,
    layer: FlashLayer,
    left: scala.Double,
    locked: scala.Boolean,
    loop: java.lang.String,
    matrix: FlashMatrix,
    members: js.Array[FlashShape],
    name: java.lang.String,
    numCubicSegments: scala.Double,
    parameters: js.Array[_],
    removePersistentData: js.Function1[java.lang.String, scala.Unit],
    rotation: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double,
    selected: scala.Boolean,
    setBits: js.Function1[_FlashBitmap, scala.Unit],
    setPersistentData: js.Function3[java.lang.String, java.lang.String, js.Any, scala.Unit],
    setTransformationPoint: js.Function1[FlashPoint, scala.Unit],
    shortcut: java.lang.String,
    silent: scala.Boolean,
    skewX: scala.Double,
    skewY: scala.Double,
    startAngle: scala.Double,
    symbolType: java.lang.String,
    tabIndex: scala.Double,
    top: scala.Double,
    transformX: scala.Double,
    transformY: scala.Double,
    useBackgroundColor: scala.Boolean,
    vPixels: scala.Double,
    vertices: js.Array[FlashVertex],
    visible: scala.Boolean,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double,
    instanceType: java.lang.String = null,
    libraryItem: FlashItem = null
  ): FlashElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accName")(accName)
    __obj.updateDynamic("actionScript")(actionScript)
    __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.updateDynamic("beginEdit")(beginEdit)
    __obj.updateDynamic("bitmapRenderMode")(bitmapRenderMode)
    __obj.updateDynamic("blendMode")(blendMode)
    __obj.updateDynamic("buttonTracking")(buttonTracking)
    __obj.updateDynamic("cacheAsBitmap")(cacheAsBitmap)
    __obj.updateDynamic("closePath")(closePath)
    __obj.updateDynamic("colorAlphaAmount")(colorAlphaAmount)
    __obj.updateDynamic("colorAlphaPercent")(colorAlphaPercent)
    __obj.updateDynamic("colorBlueAmount")(colorBlueAmount)
    __obj.updateDynamic("colorBluePercent")(colorBluePercent)
    __obj.updateDynamic("colorGreenAmount")(colorGreenAmount)
    __obj.updateDynamic("colorGreenPercent")(colorGreenPercent)
    __obj.updateDynamic("colorMode")(colorMode)
    __obj.updateDynamic("colorRedAmount")(colorRedAmount)
    __obj.updateDynamic("colorRedPercent")(colorRedPercent)
    __obj.updateDynamic("contours")(contours)
    __obj.updateDynamic("deleteEdge")(deleteEdge)
    __obj.updateDynamic("depth")(depth)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("edges")(edges)
    __obj.updateDynamic("elementType")(elementType)
    __obj.updateDynamic("endAngle")(endAngle)
    __obj.updateDynamic("endEdit")(endEdit)
    __obj.updateDynamic("filters")(filters)
    __obj.updateDynamic("firstFrame")(firstFrame)
    __obj.updateDynamic("forceSimple")(forceSimple)
    __obj.updateDynamic("getBits")(getBits)
    __obj.updateDynamic("getCubicSegmentPoints")(getCubicSegmentPoints)
    __obj.updateDynamic("getPersistentData")(getPersistentData)
    __obj.updateDynamic("getTransformationPoint")(getTransformationPoint)
    __obj.updateDynamic("hPixels")(hPixels)
    __obj.updateDynamic("hasPersistentData")(hasPersistentData)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("innerRadius")(innerRadius)
    __obj.updateDynamic("isDrawingObject")(isDrawingObject)
    __obj.updateDynamic("isGroup")(isGroup)
    __obj.updateDynamic("isOvalObject")(isOvalObject)
    __obj.updateDynamic("isRectangleObject")(isRectangleObject)
    __obj.updateDynamic("layer")(layer)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("locked")(locked)
    __obj.updateDynamic("loop")(loop)
    __obj.updateDynamic("matrix")(matrix)
    __obj.updateDynamic("members")(members)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("numCubicSegments")(numCubicSegments)
    __obj.updateDynamic("parameters")(parameters)
    __obj.updateDynamic("removePersistentData")(removePersistentData)
    __obj.updateDynamic("rotation")(rotation)
    __obj.updateDynamic("scaleX")(scaleX)
    __obj.updateDynamic("scaleY")(scaleY)
    __obj.updateDynamic("selected")(selected)
    __obj.updateDynamic("setBits")(setBits)
    __obj.updateDynamic("setPersistentData")(setPersistentData)
    __obj.updateDynamic("setTransformationPoint")(setTransformationPoint)
    __obj.updateDynamic("shortcut")(shortcut)
    __obj.updateDynamic("silent")(silent)
    __obj.updateDynamic("skewX")(skewX)
    __obj.updateDynamic("skewY")(skewY)
    __obj.updateDynamic("startAngle")(startAngle)
    __obj.updateDynamic("symbolType")(symbolType)
    __obj.updateDynamic("tabIndex")(tabIndex)
    __obj.updateDynamic("top")(top)
    __obj.updateDynamic("transformX")(transformX)
    __obj.updateDynamic("transformY")(transformY)
    __obj.updateDynamic("useBackgroundColor")(useBackgroundColor)
    __obj.updateDynamic("vPixels")(vPixels)
    __obj.updateDynamic("vertices")(vertices)
    __obj.updateDynamic("visible")(visible)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType)
    if (libraryItem != null) __obj.updateDynamic("libraryItem")(libraryItem)
    __obj.asInstanceOf[FlashElement]
  }
}

