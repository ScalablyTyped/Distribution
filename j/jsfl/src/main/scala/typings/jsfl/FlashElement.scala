package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.jsfl.FlashSymbolInstance because var conflicts: accName, actionScript, description, forceSimple, shortcut, silent, tabIndex. Inlined backgroundColor, bitmapRenderMode, blendMode, buttonTracking, cacheAsBitmap, colorAlphaAmount, colorAlphaPercent, colorBlueAmount, colorBluePercent, colorGreenAmount, colorGreenPercent, colorMode, colorRedAmount, colorRedPercent, filters, firstFrame, loop, symbolType, useBackgroundColor, visible */ trait FlashElement
  extends FlashShape
     with FlashInstance
     with FlashBitmapInstance
     with FlashCompiledClipInstance
     with FlashComponentInstance {
  var backgroundColor: String
  var bitmapRenderMode: String
  var blendMode: String
  var buttonTracking: String
  var cacheAsBitmap: Boolean
  var colorAlphaAmount: Double
  var colorAlphaPercent: Double
  var colorBlueAmount: Double
  var colorBluePercent: Double
  var colorGreenAmount: Double
  var colorGreenPercent: Double
  var colorMode: String
  var colorRedAmount: Double
  var colorRedPercent: Double
  var depth: Double
  /**
  	 * Read-only property; a string that represents the type of the specified element.
  	 * The value is one of the following: "shape", "text", "instance", or "shapeObj".
  	 * A "shapeObj" is created with an extensible tool.
  	 */
  var elementType: String
  var filters: js.Array[FlashFilter]
  var firstFrame: Double
  var height: Double
  var layer: FlashLayer
  var left: Double
  var locked: Boolean
  var loop: String
  var matrix: FlashMatrix
  var name: String
  var rotation: Double
  var scaleX: Double
  var scaleY: Double
  var selected: Boolean
  var skewX: Double
  var skewY: Double
  var symbolType: String
  var top: Double
  var transformX: Double
  var transformY: Double
  var useBackgroundColor: Boolean
  var visible: Boolean
  var width: Double
  var x: Double
  var y: Double
  def getPersistentData(name: String): js.Any
  def getTransformationPoint(): FlashPoint
  def hasPersistentData(name: String): Boolean
  def removePersistentData(name: String): Unit
  def setPersistentData(name: String, `type`: String, value: js.Any): Unit
  def setTransformationPoint(transformationPoint: FlashPoint): Unit
}

object FlashElement {
  @scala.inline
  def apply(
    accName: String,
    actionScript: String,
    backgroundColor: String,
    beginEdit: () => Unit,
    bitmapRenderMode: String,
    blendMode: String,
    buttonTracking: String,
    cacheAsBitmap: Boolean,
    closePath: Boolean,
    colorAlphaAmount: Double,
    colorAlphaPercent: Double,
    colorBlueAmount: Double,
    colorBluePercent: Double,
    colorGreenAmount: Double,
    colorGreenPercent: Double,
    colorMode: String,
    colorRedAmount: Double,
    colorRedPercent: Double,
    contours: js.Array[FlashContour],
    deleteEdge: Double => Unit,
    depth: Double,
    description: String,
    edges: js.Array[FlashEdge],
    elementType: String,
    endAngle: Double,
    endEdit: () => Unit,
    filters: js.Array[FlashFilter],
    firstFrame: Double,
    forceSimple: Boolean,
    getBits: () => _FlashBitmap,
    getCubicSegmentPoints: Double => js.Array[FlashPoint],
    getPersistentData: String => js.Any,
    getTransformationPoint: () => FlashPoint,
    hPixels: Double,
    hasPersistentData: String => Boolean,
    height: Double,
    innerRadius: Double,
    isDrawingObject: Boolean,
    isGroup: Boolean,
    isOvalObject: Boolean,
    isRectangleObject: Boolean,
    layer: FlashLayer,
    left: Double,
    locked: Boolean,
    loop: String,
    matrix: FlashMatrix,
    members: js.Array[FlashShape],
    name: String,
    numCubicSegments: Double,
    parameters: js.Array[_],
    removePersistentData: String => Unit,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    selected: Boolean,
    setBits: _FlashBitmap => Unit,
    setPersistentData: (String, String, js.Any) => Unit,
    setTransformationPoint: FlashPoint => Unit,
    shortcut: String,
    silent: Boolean,
    skewX: Double,
    skewY: Double,
    startAngle: Double,
    symbolType: String,
    tabIndex: Double,
    top: Double,
    transformX: Double,
    transformY: Double,
    useBackgroundColor: Boolean,
    vPixels: Double,
    vertices: js.Array[FlashVertex],
    visible: Boolean,
    width: Double,
    x: Double,
    y: Double,
    instanceType: String = null,
    libraryItem: FlashItem = null
  ): FlashElement = {
    val __obj = js.Dynamic.literal(accName = accName.asInstanceOf[js.Any], actionScript = actionScript.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], beginEdit = js.Any.fromFunction0(beginEdit), bitmapRenderMode = bitmapRenderMode.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], buttonTracking = buttonTracking.asInstanceOf[js.Any], cacheAsBitmap = cacheAsBitmap.asInstanceOf[js.Any], closePath = closePath.asInstanceOf[js.Any], colorAlphaAmount = colorAlphaAmount.asInstanceOf[js.Any], colorAlphaPercent = colorAlphaPercent.asInstanceOf[js.Any], colorBlueAmount = colorBlueAmount.asInstanceOf[js.Any], colorBluePercent = colorBluePercent.asInstanceOf[js.Any], colorGreenAmount = colorGreenAmount.asInstanceOf[js.Any], colorGreenPercent = colorGreenPercent.asInstanceOf[js.Any], colorMode = colorMode.asInstanceOf[js.Any], colorRedAmount = colorRedAmount.asInstanceOf[js.Any], colorRedPercent = colorRedPercent.asInstanceOf[js.Any], contours = contours.asInstanceOf[js.Any], deleteEdge = js.Any.fromFunction1(deleteEdge), depth = depth.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], elementType = elementType.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], endEdit = js.Any.fromFunction0(endEdit), filters = filters.asInstanceOf[js.Any], firstFrame = firstFrame.asInstanceOf[js.Any], forceSimple = forceSimple.asInstanceOf[js.Any], getBits = js.Any.fromFunction0(getBits), getCubicSegmentPoints = js.Any.fromFunction1(getCubicSegmentPoints), getPersistentData = js.Any.fromFunction1(getPersistentData), getTransformationPoint = js.Any.fromFunction0(getTransformationPoint), hPixels = hPixels.asInstanceOf[js.Any], hasPersistentData = js.Any.fromFunction1(hasPersistentData), height = height.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], isDrawingObject = isDrawingObject.asInstanceOf[js.Any], isGroup = isGroup.asInstanceOf[js.Any], isOvalObject = isOvalObject.asInstanceOf[js.Any], isRectangleObject = isRectangleObject.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], numCubicSegments = numCubicSegments.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], removePersistentData = js.Any.fromFunction1(removePersistentData), rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], setBits = js.Any.fromFunction1(setBits), setPersistentData = js.Any.fromFunction3(setPersistentData), setTransformationPoint = js.Any.fromFunction1(setTransformationPoint), shortcut = shortcut.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], skewX = skewX.asInstanceOf[js.Any], skewY = skewY.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transformX = transformX.asInstanceOf[js.Any], transformY = transformY.asInstanceOf[js.Any], useBackgroundColor = useBackgroundColor.asInstanceOf[js.Any], vPixels = vPixels.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (libraryItem != null) __obj.updateDynamic("libraryItem")(libraryItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashElement]
  }
}

